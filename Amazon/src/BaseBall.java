import java.util.*;

public class BaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"5", "+", "Z"};
		int total = 0;
		Stack<Integer> stack = new Stack<>();
		
		for (String val : s) {
			if(!val.equals("X") && !val.equals("Z") && !val.equals("+")) {
				int tmp = Integer.parseInt(val);
				total += tmp;
				stack.push(tmp);
				continue;
			}
			
			if (val.equals("X") && !stack.isEmpty()) {
				int x = stack.peek() * 2;
				total += x;
				stack.push(x);
				continue;
			}
			
			if (val.equals("Z") && !stack.isEmpty()) {
				int z = stack.pop();
				total -= z;
				continue;
			}

			if (val.equals("+")) {
				if (!stack.isEmpty()) {
					int v1 = stack.pop();
					if (!stack.isEmpty()) {
						int v2 = stack.pop();
						total += v1 + v2;
						stack.push(v2);
						stack.push(v1);
						stack.push(v1 + v2);
					}
					else {
						total += v1;
						stack.push(v1);
						stack.push(v1);
					}
				}
				continue;
			}
			
		}
		System.out.println(total);


	}

}

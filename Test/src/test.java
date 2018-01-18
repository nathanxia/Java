import java.util.*;

public class test {

	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> res = new PriorityQueue<>();
		int N = 100000;
		
		for (int i = 0; Math.pow(2, i) < N; i++) {
			for (int j = 0; Math.pow(5, j) < N; j++) {
				int tmp = (int)(Math.pow(2, i) * Math.pow(5, j));
				if (tmp > N) break;
				res.add(tmp);
			}
		}
		
		while (!res.isEmpty()) {
			System.out.println(res.poll());
		}
	}
}

package google;
import java.util.*;

public class backSpaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde<f<f";
		String s2 = "abcde<e<f";
		
		System.out.println(backSpace(s1).equals(backSpace(s2)));

	}
	
	public static String backSpace(String s) {
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '<') {
				stack.pop();
				continue;
			}
			stack.push(s.charAt(i));
		}
		
		StringBuilder res = new StringBuilder();
		while(!stack.isEmpty()) {
			res.append(stack.pop());
		}
		return res.toString();
		
	}

}

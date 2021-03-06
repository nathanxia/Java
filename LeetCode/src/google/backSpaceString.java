package google;
import java.util.*;

public class backSpaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde<<<<f";
		String s2 = "face<<f";
		
		System.out.println(backSpace(s1).equals(backSpace(s2)));
		System.out.println(backSpace2(s1, s2));

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
	
	public static boolean backSpace2(String s1, String s2) {
		char[] a = s1.toCharArray();
		char[] b= s2.toCharArray();
		
		int i = a.length - 1;
		int j = b.length - 1;
		int backA = 0;
		int backB = 0;
		
		while (i >= 0 && j >= 0) {
			//System.out.println(a[i] + " : " + b[j]);
		
			if (a[i] == '<') {
				backA++;
				i--;
				continue;
			}
			else if (b[j] == '<') {
				backB++;
				j--;
				continue;
			}
			else if (backA > 0 && a[i] != '<') {
				backA--;
				i--;
				continue;
			}
			else if (backB > 0 && b[j] != '<') {
				backB--;
				j--;
				continue;
			}
			
			if (a[i] != b[j]) {
				return false;
			}
			else {
				i--;
				j--;
			}
			
			
		}
		
		
		return (i == -1 && j == -1) ? true : false;
	}

}

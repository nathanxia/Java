package google;

public class wordSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "converse";
		String s2 = "conserve";
		
		boolean res = swap2(s1, s2);
		System.out.println(res);

	}
	
	public static boolean swap2(String s1, String s2) {
		
		if (s1 == null || s2 == null || s1.length() != s2.length()) return false;
		
		char c1 = '*';
		char c2 = '*';
		for (int i = 0; i < s1.length(); i++) {
			
			if (s1.charAt(i) != s2.charAt(i)) {
				if (c1 == '*' && c2 == '*') {
					c1 = s1.charAt(i);
					c2 = s2.charAt(i);
				}
				else {
					if (c1 != s2.charAt(i) || c2 != s1.charAt(i)) {
						return false;
					}
					else return true;
				}
			}
		}
		
		return true;
		
	}
	
	public static boolean swap(String s1, String s2) {
		char[] s = s1.toCharArray();
		
		for(int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				String ss = swapHelper(s, i, j);
				if (ss.equals(s2)) return true;
			}
		}
		
		return false;
	}
	
	public static String swapHelper(char[] s, int i, int j) {
		
		Character tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
		
		return String.valueOf(s);
	}

}

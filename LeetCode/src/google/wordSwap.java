package google;

public class wordSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcd";
		String s2 = "acbd";
		
		boolean res = swap(s1, s2);
		System.out.println(res);

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

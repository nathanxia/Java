package Amazon;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbaccffggffccafdghy";
		
		String res = longestPalindromicSubstring(s);
		
		System.out.println(res);
	}
	
	public static String longestPalindromicSubstring(String s) {
		
		int start = 0;
		int end = 0;
		
		for (int i = 0; i < s.length(); i++) {
			//System.out.println(i);
			int l1 = expandAroundCenter(s, i, i);
			//System.out.println(i + " - " + l1);
			int l2 = expandAroundCenter(s, i, i + 1);
			//System.out.println(i + " - " + l2);
			//System.out.println("===================");
			
			int len = Math.max(l1, l2);
			System.out.println(len);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
			
		}
		System.out.println(start);
		System.out.println(end);
		
		return s.substring(start, end + 1);
	}
	
	public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

}

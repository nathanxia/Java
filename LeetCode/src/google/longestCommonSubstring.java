package google;

public class longestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = {"bvdasiodjf", "trpqiouriasiodjftporotupi", "novanuanoasiodjf", "asiodjfvuarbufbaiy"};
		
		String res = findCommonSubstring(arr);
		
		System.out.println(res);
	}
	
	public static String findCommonSubstring(String[] arr) {
		
		int n = arr.length;
		
		String s = arr[0];
		int len = s.length();
		String res = "";
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {
				String common = s.substring(i, j);
				int k = 1;
				while (k < n) {
					if (!arr[k].contains(common)) {
						break;
					}
					k++;
				}
				
				if (k == n && res.length() < common.length()) {
					res = common;
				}
			}
		}
		return res;
	}

}

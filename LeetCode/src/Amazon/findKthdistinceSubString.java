package Amazon;
import java.util.*;

public class findKthdistinceSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "awaglknagawunagwkwag";
		int k = 4;
		
		List<String> list = new ArrayList<>();
		
		findSubstring(list, s, k);
		
		System.out.println(list);
		
	}
	
	public static void findSubstring(List<String> list, String s, int k) {
		
		for (int i = 0; i < s.length(); i++) {
			if (i + k > s.length()) break;
			
			int[] c = new int[26];
			String tmp = s.substring(i, i + k);
			boolean check = true;
			for (char v : tmp.toCharArray()) {
				c[v - 'a']++;
				if (c[v- 'a'] > 1) {
					check = false;
					break;
				}
			}
			
			if (check && !list.contains(tmp)) list.add(tmp);
			
		}
	}

}

package google;

import java.util.HashMap;
import java.util.Map;

public class duplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaab";
		
		int res = findFirstNoneDuplicate(s);
		System.out.println(res);
	}
	
	public static int findFirstNoneDuplicate(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		System.out.println(map);
		
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (map.get(c) == 1) {
				return i;
			}	
		}
		
		return -1;
		
	}

}

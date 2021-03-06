package Amazon;

import java.util.*;

public class NumberCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 12121211;
		String s = String.valueOf(input);
		List<String> list = new ArrayList<>();
		
		dfs(list, s, "");
		
		for (String v : list) {
			System.out.println(v);
		}
		
	}
	
	public static void dfs(List<String> list, String input, String pre) {
		
		if(input.equals("")) {
			list.add(pre);
			return;
		}
		
		int num = 0;
		for (int i = 0; i < input.length(); i++) {
			num = num * 10 + (input.charAt(i) - '0');
			
			if (num <= 26) {
				pre = pre + (char)(num - 1 + 'a');
				dfs(list, input.substring(i + 1), pre);
				pre = pre.substring(0, pre.length() - 1);
			}
		}
		
	}

}

package Amazon;
import java.util.*;
public class smallestDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] tagList = {"made", "weather", "forecast", "says", "that", "made", "rain", "in", "spain", "stays"};
		//String[] targetList = {"made", "in", "spain"};
		
		String[] tagList = {"2abc", "bcd", "cab"};
		String[] targetList = {"dbc", "2abc", "cab", "bcd", "bcb"};
		
		int[] res = findSmallestDistance(tagList, targetList);
		
		System.out.println(res[0] + " : " + res[1]);
	}
	
	public static int[] findSmallestDistance(String[] tagList, String[] targetList) {
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String s : targetList) {
			map.put(s, -1);
		}
		
		int count = 0;
		int minLen = tagList.length + 2;
		int[] res = new int[2];
		
		for (int l = 0, r = 0; r < targetList.length; r++) {
			if (map.containsKey(key))
		}
		
		
		return res;
		
	}

}

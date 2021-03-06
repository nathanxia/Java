package Amazon;
import java.util.*;
public class smallestDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] tagList = {"made", "weather", "forecast", "says", "that", "made", "rain", "in", "spain", "stays"};
		//String[] targetList = {"made", "in", "spain"};
		
		String[] tagList = {"dbc", "2abc", "cab", "bcd", "bcb"};
		String[] targetList = {"2abc", "bcd", "cab"};
		
		//String[] tagList = {"the", "spain", "that", "the", "rain", "in", "spain", "stays", "forecast", "in", "the"};
		//String[] targetList = {"in", "the", "spain"};
		
		
		
		int[] res = findSmallestDistance(tagList, targetList);
		
		System.out.println(res[0] + " : " + res[1]);
	}
	
	public static int[] findSmallestDistance(String[] tagList, String[] targetList) {
		
		Map<String, Integer> map = new HashMap<>();
		
		for (String s : targetList) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		int l = 0;
		int r = 0;
		int[] res = new int[2];
		int min = Integer.MAX_VALUE;
		int count = 0;
		
		while (r < tagList.length) {
			System.out.println(map);
			String v = tagList[r];
			if (map.getOrDefault(v, 0) > 0) {
				count++;
			}
			map.put(v, map.getOrDefault(v, 0) - 1);
			r++;
			
			while (count == targetList.length) {
				if (min > r - l) {
					System.out.println(l + " - " + (r - 1));
					min = r - l;
					res[0] = l;
					res[1] = r - 1;
				}
				
				map.put(tagList[l], map.getOrDefault(tagList[l], 0) + 1);
				if (map.get(tagList[l]) > 0) {
					count--;
				}
				l++;
			}
		}
		return res;
	}

}

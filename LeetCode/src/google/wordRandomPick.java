package google;

import java.util.*;

public class wordRandomPick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character, Integer> map = new HashMap<>();
		
		map.put('a', 5);
		map.put('b', 5);
		map.put('d', 2);
		map.put('c', 3);
		map.put('e', 8);
		
		int[] weights =  new int[map.size()];
		char[] keys = new char[map.size()];
		int sum = 0;
		int i = 0;
		for (Character key : map.keySet()) {
			sum += map.get(key);
			weights[i] = sum;
			System.out.println(i + " - " + sum + " - " + key);
			keys[i] = key;
			i++;
		}
		
		Random rmd = new Random();
		int pick = rmd.nextInt(sum);
		System.out.println(pick);
		
		int left = 0;
		int right = weights.length - 1;
		while (left < right && left != right - 1) {
			
			int mid = left + (right - left) / 2;
			if (pick >= weights[mid]) {
				left = mid;
			}
			else {
				right = mid;
			}
		}
		
		System.out.println(left + " - " + right);
		if (pick <= weights[left]) {
			System.out.println("Random pick: " + keys[left]);
		}
		else {
			System.out.println("Random pick: " + keys[right]);
		}
		
	}
	
	

}

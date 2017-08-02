package JavaSetsAlgorithm;

import java.util.*;

/*
 * Count the occurrences of numbers entered
 * write a program that read the unspecified number of integers and finds the one that has the most occurrences
 * the input ends when the input is 0. For example, if you entered 2 3 40 5 4 -3 3 3 2 0,
 * the number 3 occurred most often.
 * For example, since 9 and 3 appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported. 
 */
public class CountTheOccurrenceOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] list1 = new int[] {2, 3, 40, 5, 4, -3, 3, 3, 2, 0};
		int[] list2 = new int[] {9, 30, 3, 9, 3, 2, 4};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int val: list2) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		
		System.out.println(map);
		
		int max = Collections.max(map.values());
		Set<Integer> set = new HashSet<>();
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (max == entry.getValue()) set.add(entry.getKey());
		}
		
		System.out.println(set);
	}

}

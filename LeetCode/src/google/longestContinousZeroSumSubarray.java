package google;
import java.util.*;

public class longestContinousZeroSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1, 0, -2, 2, -1, 5};
		
		//int res = findLongestSumSubArray(nums);
		//System.out.println(res);
		
		int res2 = findLongestSumSubArray2(nums);
		System.out.println(res2);
	}
	
	public static int findLongestSumSubArray(int[] nums) {
		
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int sum = nums[j] - (i > 0 ? nums[i - 1] : 0);
				
				if (sum == 0 && j - i + 1 > max) {
					max = j - i + 1;
				}
			}
			
		}
		
		return max;
		
		
	}
	
	public static int findLongestSumSubArray2(int[] nums) {
		
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int max = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			
			if (num == 0) {
				max = Math.max(i + 1, max);
			}
			else if (map.containsKey(num)) {
				max = Math.max(max, i - map.get(num) + 1);
			}
			else {
				map.put(num, i);
			}
		}
		
		return max;
	}

}

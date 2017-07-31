import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-1, 0, 1, 2, -1, -4};
		
		if (nums.length < 3) {
			System.out.println("Array size is less than 3");
			return;
		}
		
		List<List<Integer>> res = new ArrayList<>();
		
		// Sort array to make sure the right number is always larger than left one;
		Arrays.sort(nums);
		
		// Start from first number;
		for (int i = 0; i < nums.length; i++) {
			// If current index is not 0 and current number is same as previous (left) number
			// We do not need to do it again.
			if(i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			
			// find the other two numbers to make 3 sum to 0;
			// j is the right index of i, and k is the last index of the array. 
			int j = i + 1;
			int k = nums.length - 1;
			
			// Keep checking if j is on the left of k
			while (j < k) {
				
				// To make 3 sum, nums[j] + nums[k] = -nums[i]
				// if nums[j] + nums[k] > -nums[i]. it means nums[j] + nums[k] needs to be smaller, so k--
				if(nums[j] + nums[k] > -nums[i]) {
					k--;
				}
				// if nums[j] + nums[k] < -nums[i]. it means nums[j] + nums[k] needs to be larger, so j++
				else if (nums[j] + nums[k] < -nums[i]) {
					j++;
				}
				// We find the correct index.
				else {
					List<Integer> tmp = new ArrayList<>();
					tmp.add(nums[i]);
					tmp.add(nums[j]);
					tmp.add(nums[k]);
					res.add(tmp);
					
					// Check if there are duplicate nums of j and k
					while(k > j && nums[k] == nums[k - 1]) {
						k--;
					}
					k--;
					while(k > j && nums[j] == nums[j + 1]) {
						j++;
					}
					j++;
					
				}
				
			}
		}
		
		System.out.println("Resutls: ");
		for (List<Integer> val : res) {
			for (Integer v : val) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
		
	}

}

package Apple;
import java.util.*;

public class findIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[1000000];
		Arrays.fill(arr, 5);
		arr[0] = 1;
		arr[999999] = 9;
		int target = 5;
		
		long t1 = System.nanoTime();
		int[] res = findMinAndMaxIndex(arr, target);
		long t2 = System.nanoTime();
		System.out.println(res[0] + " - " + res[1]);
		System.out.println(t2 - t1);
		
	}

	public static int[] findMinAndMaxIndex(int[] arr, int target) {
		
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (arr[mid] == target) break;
			else if (arr[mid] > target) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		
		left = mid - 1;
		while (left >= 0 && arr[left] == target) {
			left--;
		}
		
		right = mid + 1;
		while(right < arr.length && arr[right] == target) {
			right++;
		}
		
		
		return new int[]{left + 1, right - 1};
	}
	
}

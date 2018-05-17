package Apple;

public class increaseDecreaseFindValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,6,7,8,9,8,7,6,5,4};
		int target = 3;
		boolean res = findValue(arr, target);
		
		System.out.println(res);
	}

	public static boolean findValue(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int max = 0;
		while (left <= right) {
			max = left + (right - left) / 2;
			
			if (arr[max - 1] < arr[max] && arr[max] > arr[max + 1]) {
				break;
			}
			if (arr[max - 1] < arr[max] && arr[max] < arr[max + 1]) {
				left = max + 1;
			}
			else {
				right = max - 1;
			}
		}
			
			System.out.println(arr[max]);
			
			left = 0;
			right = max;
			
			while (left <= right) {
				int mid = left + (right - left) / 2;
				if (arr[mid] == target) {
					return true;
				}
				else if (arr[mid] > target) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
			}
			
			left = max;
			right = arr.length - 1;
			
			while (left <= right) {
				int mid = left + (right - left) / 2;
				if (arr[mid] == target) {
					return true;
				}
				else if (arr[mid] < target) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
			}
			
			
		
		
		return false;
	}
}

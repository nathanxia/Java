package Amazon;

public class indexEqualsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-3,-2,-2,-1,0,1,2,3,4,6,10,11};
		
		int res = helper(arr);
		
		System.out.println(res);
	}
	
	public static int helper(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if (mid == arr[mid]) {
				return mid;
			}
			
			if (arr[mid] > mid) {
				right = mid -1;
			}
			else {
				left = mid + 1;
				}
		}
		
		return 0;
	}

}

package google;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 45, 234, 123, 456, 2, 74, 654, 8, 11};
		
		mergeSrt(arr, 0, arr.length - 1);
		
		for (int v : arr) {
			System.out.print(v + " | ");
		}
	}
	
	public static void mergeSrt(int[] arr, int left, int right) {
		if (left >= right) return;
		
		int mid = left + (right - left) / 2;
		mergeSrt(arr, left, mid);
		mergeSrt(arr, mid + 1, right);
		
		merge(arr, left, mid, right);
		
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		int[] tmpArr = new int[arr.length];
		
		for (int m = 0; m < arr.length; m++) {
			tmpArr[m] = arr[m];
		}
		
		int i = left;
		int j = mid + 1;
		int k = left;
		
		while (i <= mid && j <= right) {
			if (tmpArr[i] < tmpArr[j]) {
				arr[k] = tmpArr[i];
				i++;
			}
			else {
				arr[k] = tmpArr[j];
				j++;
			}
			k++;
		}
		
		while (i <= mid) {
			arr[k] = tmpArr[i];
			k++;
			i++;
		}
		while (j <= right) {
			arr[k] = tmpArr[j];
			k++;
			j++;
		}
	}

}

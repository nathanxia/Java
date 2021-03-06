package google;

import java.util.*;

public class quickSort {
	
	/*
	 * O(nlogn) - average case running time.
	 * O(n^2) - worst case running time.
	 * In-place.
 	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 5, 45, 234, 123, 123, 456, 2, 74, 654, 8, 11};
		
		quickSrt(arr, 0, arr.length - 1);
		
		for (int v : arr) {
			System.out.print(v + " | ");
		}
		
	}
	
	public static void quickSrt(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		}

		int idx = partition(arr, left, right);
		quickSrt(arr, left, idx - 1);
		quickSrt(arr, idx + 1, right);
		
	}
	
	public static int partition(int[] arr, int left, int right) {
		
		int pivot = arr[right];
		int idx = left;
		for (int i = left; i < right; i++) {
			if(arr[i] <= pivot) {
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
				idx++;
			}
		}
		arr[right] = arr[idx];
		arr[idx] = pivot;
		
		return idx;
	}
	

}

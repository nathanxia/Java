package JavaAlgorithm;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13, 12, 15, 587, 312, 34, 345, 64, 645, 63, 987, 304, 2, 204, 234, 43, 65, 786, 67, 723, 7869};
		
		display(arr);
		
		mergeSort(arr, 0, arr.length - 1);
		
		display(arr);
	}

	public static void display(int[] arr) {
		System.out.print("| ");
		for (int val : arr) {
			System.out.print(val + " | ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int[] arr, int low, int high) {
		if (low < high) {
			int middle = low + (high - low) / 2;
			
			mergeSort(arr, low, middle);
			mergeSort(arr, middle + 1, high);
			
			System.out.println();
			
			merge(arr, low, middle, high);
		}
	}
	
	public static void merge(int[] arr, int low, int middle, int high) {
		
		int[] tmpArr = new int[arr.length];
				
		for (int m = 0; m < arr.length; m++) {
			tmpArr[m] = arr[m];
		}
				
		System.out.println("Before merge: ");
		display(tmpArr);
		
		int i = low;
		int j = middle + 1;
		int k = low;
		while(i <= middle && j <= high) {
			if(tmpArr[i] > tmpArr[j]) {
				arr[k] = tmpArr[j];
				j++;
			}
			else {
				arr[k] = tmpArr[i];
				i++;
			}
			k++;
		}
		
		while(i <= middle) {
			arr[k] = tmpArr[i];
			k++;
			i++;
		}
		System.out.println("After merge: ");
		display(arr);
	}
}

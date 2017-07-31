package JavaAlgorithm;

public class SortAlgorithm {

	private int[] theArray = new int[50];
	
	private int arraySize = 10;
	
	private void generateRandomArray() {
		for(int i = 0; i < arraySize; i++) {
			theArray[i] = (int)(Math.random() * 10) + 10;
		}
	}
	
	public void printArray() {
		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i + "  ");
			
		}
		System.out.println(" | ");
		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + theArray[i] + " ");
		}
		System.out.println(" | ");
		System.out.println("-------------------------------------------------------");
	}
	
	public String linearSearchForValue (int val) {
		
		String res = "";
		for(int i = 1; i < arraySize; i++) {
			if(val == theArray[i]) {
				res += i + " ";
			}
		}
		return res;
	}
	
	public void binarySearchForValue(int val) {
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		
		while(lowIndex <= highIndex) {
			int middle = (lowIndex + highIndex) / 2;
			if(theArray[middle] < val) {
				lowIndex = middle + 1;
			}
			else if (theArray[middle] > val) {
				highIndex = middle - 1;
				
			}
			else {
				System.out.println("The index is: " + middle);
				break;
			}
		}
	}
	
	public void bubbleSort() {
		
		for (int i = arraySize - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				// Change the > to < will change to DESC;
				if(theArray[j] > theArray[j + 1] ) {
					int tmp = theArray[j];
					theArray[j] = theArray[j + 1];
					theArray[j + 1] = tmp;
				}
			}
		}
	}
	
	public void selectionSort() {
		
		for (int i = 0; i < arraySize; i++) {
			int min = theArray[i];
			int minIndex = i;
			for(int j = i; j < arraySize; j++) {
				// Change the > to < will change to DESC;
				if (theArray[j] < min) {
					min = theArray[j];
					minIndex = j;
				}
			}
			int tmp = theArray[i];
			theArray[i] = min;
			theArray[minIndex] = tmp;
		}
	}
	
	public void insertionSort() {
		
		for(int i = 1; i < arraySize; i++) {
			int j = i;
			int toInsert = theArray[i];
			// Change the > to < will change to DESC;
			while (j > 0 && theArray[j - 1] > toInsert) {
				theArray[j] = theArray[j - 1];
				j--;
			}
			theArray[j] = toInsert;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortAlgorithm arr = new SortAlgorithm();
		arr.generateRandomArray();
		arr.printArray();
		/*
		System.out.println("Bubble Sort: ");
		arr.bubbleSort();
		*/
		
		/*
		System.out.println("Selection Sort: ");
		arr.selectionSort();
		*/
		
		System.out.println("Insertion Sort: ");
		arr.insertionSort();
		arr.printArray();
		
		System.out.println("binarySearchForValue: ");
		arr.binarySearchForValue(16);
		
		
	}

}

package JavaAlgorithm;

import java.util.Arrays;

public class ShellSort {

	private int[] array;
	private int arraySize;
	
	ShellSort(int arraySize) {
		
		array = new int[arraySize];
		this.arraySize = arraySize;
		generateRandomArray();
	}
	
	private void generateRandomArray() {
		for(int i = 1; i < arraySize; i++) {
			array[i] = (int)(Math.random() * 10) + 10;
		}
	}
	
	public void sort() {
		
		int inner, outer, temp;
		int interval = 1;
		
		while(interval <= arraySize / 3) {
			interval = interval * 3 + 1;
		}
		while (interval > 0) {
			for(outer = interval; outer < arraySize; outer++) {
				temp = array[outer];
				System.out.println("Copy " + array[outer] + "into temp");
				inner = outer;
				while(inner > interval - 1 && array[inner - interval] >= temp) {
					array[inner] = array[inner - interval];
					inner -= interval;
				}
				array[inner] = temp;
			}	
			interval = (interval - 1) / 3;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShellSort theSort = new ShellSort(10);
		
		System.out.println(Arrays.toString(theSort.array));
		
		theSort.sort();
		
		System.out.println(Arrays.toString(theSort.array));
		
	}

}

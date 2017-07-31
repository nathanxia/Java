package JavaAlgorithm;

public class ArrayStructures {

	private int[] theArray = new int[50];
	
	private int arraySize = 10;
	
	private void generateRandomArray() {
		for(int i = 1; i < arraySize; i++) {
			theArray[i] = (int)(Math.random() * 10) + 10;
		}
	}
	
	public void printArray() {
		System.out.println("----------");
		for (int i = 1; i < arraySize; i++) {
			System.out.print("| " + i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("----------");
		}
	}
	
	public int getValueAtIndex(int index) {
		if(index < arraySize) return theArray[index];
		return -1;
	}
	
	public boolean getIndexAtValue(int val) {
		for (int i = 0; i < arraySize; i++) {
			if (theArray[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public void deleteIndex(int index) {
		
		if (index < arraySize) {
			for (int i = index; i < arraySize - 1; i++) {
				theArray[index] = theArray[index + 1];
			}
		}
		arraySize--;
		
	}
	
	public void insertValue (int val) {
		
		if (arraySize < 50) {
			theArray[arraySize] = val;
			arraySize++;
		}
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayStructures arr = new ArrayStructures();
		arr.generateRandomArray();
		arr.printArray();
		
		System.out.println(arr.getValueAtIndex(3));
		
		System.out.println(arr.getIndexAtValue(14));
		
		arr.deleteIndex(3);
		arr.printArray();
		
		arr.insertValue(50);
		arr.printArray();
		
		String res = arr.linearSearchForValue(17);
		System.out.println(res);
	}

}

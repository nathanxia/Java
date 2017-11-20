package google;

import java.util.Arrays;

public class hashTableImplement {

	String[] theArray;
	int arraySize;
	int itemsInArray = 0;
	
	hashTableImplement(int size) {
		arraySize = size;
		theArray = new String[arraySize];
		Arrays.fill(theArray, "-1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hashTableImplement theFunc = new hashTableImplement(30);
		String[] elements = {"1", "5", "17", "21", "26", "33", "45", "99", "199", "145", "345", "542"};
		
		
		theFunc.hashFunction2(elements, theFunc.theArray);
		System.out.println(theFunc.findKey2("198"));
		
	}
	
	public void hashFunction1(String[] stringForArray, String[] theArray) {
		
		for(int n = 0; n < stringForArray.length; n++) {
			String newEle = stringForArray[n];
			theArray[Integer.parseInt(newEle)] = newEle;
		}
	}
	
	public void hashFunction2(String[] stringForArray, String[] theArray) {
		
		for(int n = 0; n < stringForArray.length; n++) {
			String newEle = stringForArray[n];
			int arrIndex = Integer.parseInt(newEle) % 29;
			
			while (theArray[arrIndex] != "-1") {
				arrIndex++;
			}
			
			theArray[arrIndex] = newEle;
		}
	}
	
	public String findKey1(String key) {
		
		int index = Integer.parseInt(key);
		if (theArray[index] == key) {
			return key;
		}
		return "No key";
	}
	
	public String findKey2(String key) {
		
		int index = Integer.parseInt(key) % 29;
		while (theArray[index] != "-1") {
			if (theArray[index] == key) {
				return key;
			}
			else {
				index++;
			}
		}
		return "No key";
	}

}

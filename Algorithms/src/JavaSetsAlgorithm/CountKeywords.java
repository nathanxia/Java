package JavaSetsAlgorithm;

import java.util.TreeSet;

/*
 * Count the keywords in Java source code 
 */

public class CountKeywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] key = new String[] {"apple", "orange", "banana"};
		String[] file = new String[] {"apple", "banana", "orange","apple", "watermelon", 
				"banana", "orange","apple", "pear", "banana", "orange", "strawberry"};
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		for (String val : key) {
			treeSet.add(val);
		}
		
		System.out.println(treeSet);
		
		int count = 0;
		for (int i = 0; i < file.length; i++) {
			if (treeSet.contains(file[i])) {
				count++;
			}
		}
		
		System.out.println("Number of keywords: " + count);
	}

}

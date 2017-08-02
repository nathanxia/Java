package JavaSetsAlgorithm;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


/*
 * Display nonduplicate words in asceding order 
 */

public class DispplayNonDuplicateWordsInAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] file = new String[] {"injury", "brave", "expression", "biplane", "appeal", "bottle", 
				"injury", "devastation", "attitude", "expression", "distant", "decay", "brave", "bottle"};
		
		Set<String> set = new HashSet<>();
		
		for (String val : file) {
			set.add(val);
		}
		System.out.println("Display set: ");
		System.out.println(set);
		System.out.println();
		
		System.out.println("Display treeSet in ascending order: ");
		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println(treeSet);
	}

}

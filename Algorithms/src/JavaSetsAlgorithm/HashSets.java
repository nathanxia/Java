package JavaSetsAlgorithm;

import java.util.*;

/*
 * Perform set operations on HashSets
 * Create two linked HashSets {"George", "Jim", "John", "Blake", "Kevin", "Michael"}
 * and {"George", "Katie", "Kevin", "Michelle", "Ryan"}
 * find their union, difference, and intersection.
 */


public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(new String[] {"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		LinkedHashSet<String> set2 = new LinkedHashSet<>(Arrays.asList(new String[] {"George", "Katie", "Kevin", "Michelle", "Ryan"}));
		System.out.println("Set1 contains: ");
		dis(set1);
		System.out.println("Set2 contains: ");
		dis(set2);
		
		
		set1.addAll(set2);
		System.out.println("Find union. After add Set2 to Set1, Set1 contains: ");
		dis(set1);
		
		set1 = new LinkedHashSet<>(Arrays.asList(new String[] {"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		set1.removeAll(set2);
		System.out.println("Find difference. After remove Set2 to Set1, Set1 contains: ");
		dis(set1);
		
		set1 = new LinkedHashSet<>(Arrays.asList(new String[] {"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		set1.retainAll(set2);
		System.out.println("Find intersection. After retain Set2 to Set1, Set1 contains: ");
		dis(set1);
	}
	
	static void dis(LinkedHashSet<String> set) {
		for (String val : set) {
			System.out.print(val + " | ");
		}
		System.out.println();
		System.out.println();
	}

}

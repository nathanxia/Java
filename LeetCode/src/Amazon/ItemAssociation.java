package Amazon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ItemAssociation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Set<String>> sets = new ArrayList<Set<String>>();
	    sets.add(new LinkedHashSet<String>(Arrays.asList("item1", "item2")));
	    sets.add(new LinkedHashSet<String>(Arrays.asList("item3", "item4")));
	    sets.add(new LinkedHashSet<String>(Arrays.asList("item4", "item5")));
	    sets.add(new LinkedHashSet<String>(Arrays.asList("item1", "item6")));
	    sets.add(new LinkedHashSet<String>(Arrays.asList("item1", "item7")));

	    System.out.println("Input Sets");
	    sets.forEach(set ->{
	        System.out.println(set);
	    });

	    Collection<Set<String>> itemGroups = generateItemGroup(sets);

	    // Find the largest from list of sets
	    System.out.println("Largest item group is : "+findLargestItemGroup(itemGroups));
	}

	/**
	 * Method used to find combine related item
	 * 
	 * @param sets
	 * @return
	 */
	static <T> Collection<Set<T>> generateItemGroup(List<Set<T>> sets) {

	    Map<T, Set<T>> resultMap = new LinkedHashMap<T, Set<T>>();
	    Map<T, Set<T>> tempMap = new LinkedHashMap<T, Set<T>>();

	    for (Set<T> set : sets) {
	        Set<T> combinedSet = new TreeSet<T>(set);
	        for (T element : set) {
	            Set<T> innerSet = tempMap.get(element);
	            if (innerSet != null && !innerSet.isEmpty()) {
	                T first = innerSet.iterator().next();
	                resultMap.remove(first);
	                combinedSet.addAll(innerSet);
	            }
	        }
	        if (!combinedSet.isEmpty()) {
	            // take the first element as key and put this in resultMap
	            T first = combinedSet.iterator().next();
	            resultMap.put(first, combinedSet);
	            // Putting each elements relation to temp map
	            for (T element : combinedSet) {
	                tempMap.put(element, combinedSet);
	            }
	        }
	    }
	    return resultMap.values();

	}

	/**
	 * Method used to find the largest item group
	 * @param itemGroups
	 * @return Set<T> largestSet
	 */
	static <T> Set<T> findLargestItemGroup(Collection<Set<T>> itemGroups) {

	    int largestSetCount = 0;
	    Set<T> largestSet = null;
	    for (Set<T> set : itemGroups) {
	        if (set.size() > largestSetCount) {
	            largestSetCount = set.size();
	            largestSet = set;
	        }
	    }
	    return largestSet;
	}

}

package google;
import java.util.*;

public class subIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = {1,3,5,4,6,8,5,34,64,67,54,43,56,68,5,87};
		
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(34);
		set.add(87);
		set.add(67);
		
		
		boolean res = isSubInteger(list, set);
		
		System.out.println(res);
		
		
	}
	
	public static boolean isSubInteger(int[] list, Set<Integer> set) {
		
		Set<Integer> tmp = new HashSet<>();
		
		tmp.addAll(set);
		for (int v : list) {
			System.out.println(tmp);
			if (tmp.contains(v)) {
				tmp.remove(v);
				if (tmp.isEmpty()) {
					return true;
				}
			}
			else {
				if (tmp.size() != set.size())
					tmp.addAll(set);
			}

		}
		
		return false;
	}

}
package google;
import java.util.*;

public class commonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] relations = {
				{"apple", "orange"}, {"orange", "banana"}, {"banana", "pear", "grape"}, 
				{"tomato", "potato"}, {"cucumber", "salary"}, {"peper", "onion"}, {"onion", "potato"}, {"onion", "salary"},
				{"pork", "chicken"}, {"pork", "fish"}, {"beef", "pork"}, {"duck", "beef"}};
		
		
		Map<String, Integer> dict = new HashMap<>();
		Map<Integer, Integer> rela = new HashMap<>();
		
		int k = 0;
		for (String[] p : relations) {
			for (String s: p) {
				if (!dict.containsKey(s)) {
					dict.put(s, k);
					rela.put(k, k);
					k++;
				}
			}
		}
		
		for (String[] p : relations) {
			int first = dict.get(p[0]);
			int root = find(rela, first);
			
			for (int i = 1; i < p.length; i++) {
				int second = dict.get(p[i]);
				int root2 = find(rela, second);
				
				if (root != root2) {
					rela.put(root2, root);
				}
			}
		}
		
		boolean res = ifRelated(dict, rela, "fish", "fish");
		System.out.println(res);
		
	}
	
	public static boolean ifRelated(Map<String, Integer> dict, Map<Integer, Integer> rela, String s1, String s2) {
		if (s1.equals(s2)) return true;
		
		if (!dict.containsKey(s1) || !dict.containsKey(s2)) return false;
		
		if (find(rela, dict.get(s1)) != find(rela, dict.get(s2))) return false;
		
		return true;
	}
	
	public static int find(Map<Integer, Integer> rela, int root) {
		while (root != rela.get(root)) {
			root = rela.get(root);
		}
		
		return root;
	}

}

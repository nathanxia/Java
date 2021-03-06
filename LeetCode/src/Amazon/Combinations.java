package Amazon;
import java.util.*;
public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int k = 2;
		
		List<List<Integer>> combs = new ArrayList<List<Integer>>();
		combine(combs, new ArrayList<Integer>(), 1, n, k);
		
	}
	
	public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
		if(k==0) {
			combs.add(new ArrayList<Integer>(comb));
			return;
		}
		for(int i=start;i<=n;i++) {
			comb.add(i);
			
			combine(combs, comb, i+1, n, k-1);
			
			comb.remove(comb.size()-1);
		}
	}
	
	public static void display(List<Integer> comb) {
		
		for (Integer val : comb) {
			System.out.print(val + " | ");
		}
		System.out.println();
	}

}

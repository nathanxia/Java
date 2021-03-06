package Amazon;
import java.util.*;

public class WindowSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		
		display(list);
		
		List<Integer> res = GetSum(list, 6);
		
		display(res);
		
		List<Integer> res2 = windowSum(list, 6);
		
		display(res2);
	}
	
	public static List<Integer> windowSum(List<Integer> A, int k) {
		List<Integer> res = new ArrayList<>();
		int left = 0;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < A.size(); i++) {
			sum += A.get(i);
			count++;
			if (count >= k) {
				res.add(sum);
				sum -= A.get(left);
				left++;
				count--;
			}
			
		}
		
		return res;
	}
	
	public static List<Integer> GetSum(List<Integer> A, int k) {
		ArrayList<Integer> result  = new ArrayList<>();
		if (A == null || A.size() == 0 || k <= 0) return result;
		int count = 0;
		for (int i = 0; i < A.size(); i++) {
		    count++;
		    if (count >= k) {
		        int sum = 0;
		        for (int j = i; j >= i - k + 1; j--) {
		            sum += A.get(j);
		        }
		        result.add(sum);
		    }
		}
		return result;
	}
	
	public static void display(List<Integer> list) {
		for(Integer val : list) {
			System.out.print(val + " | ");
		}
		System.out.println();
	}

}

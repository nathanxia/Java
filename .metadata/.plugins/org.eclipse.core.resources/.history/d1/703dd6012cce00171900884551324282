import java.util.*;


public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = 8;
		System.out.println(getPowerNumber(index));
	}
	
	public static int getPowerNumber(int index) {
		
		int x = 2;
		int y = 2;
		int max = Integer.MAX_VALUE;
		
		PriorityQueue<Integer> list = new PriorityQueue<Integer>();
		
		for (x = 2; (int)Math.pow(x, 2) < max; x++) {
			for (y = 2; (int)Math.pow(x, y) < max; y++) {
				if(!list.contains((int)Math.pow(x, y))) {
					list.add((int)Math.pow(x, y));
				}
			}
		}
		
		int ind = 0;
		while (ind < index) {
			list.poll();
			ind++;
		}
		
		return list.peek();
	}

}

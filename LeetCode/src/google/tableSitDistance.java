package google;

import java.util.*;
public class tableSitDistance implements Comparable<tableSitDistance> {
	
	
	int dist;
	int num;
		
	public tableSitDistance(int dist, int num) {
		this.dist = dist;
		this.num = num;
	}
		
	public int compareTo(tableSitDistance d) {
		if ((double)this.dist / this.num - (double)d.dist/d.num > 0) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PriorityQueue<tableSitDistance> que = new PriorityQueue<>(Collections.reverseOrder());
		
		int[] gas = {1,4,7,12,34,45,78,99};
		
		for (int i = 1; i < gas.length; i++) {
			que.add(new tableSitDistance(gas[i] - gas[i - 1], 1));
			System.out.println(gas[i] - gas[i - 1]);
		}
		
		System.out.println("=======");
		int n = 6;
		int k = 1;
		
		while (k <= 6) {
			System.out.println((double)que.peek().dist / que.peek().num);
			tableSitDistance d = que.poll();
			d.num += 1;
			que.add(d);
			k++;
		}
		
	}

}

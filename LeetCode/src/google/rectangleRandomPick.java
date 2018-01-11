package google;

import java.util.*;

public class rectangleRandomPick {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] rects = {{1,2,3,4}, {5,6,9,10}, {11,13,50,20}, {15,20, 30, 35}};
		
		//pickFromOneRect(rects[3]);
		
		//pickFromMoreRect(rects);
		
		pickFromMoreRectOverlap(rects);
		
	}
	
	public static void pickFromOneRect(int[] rect) {
		Random ran = new Random();
		int newX = rect[0] + ran.nextInt(rect[2] - rect[0] + 1);
		int newY = rect[1] + ran.nextInt(rect[3] - rect[1] + 1);
		System.out.println("point picked: (" + newX + ", " + newY + ")"); 
	}
	
	public static void pickFromMoreRect(int[][] rects) {
		
		int[] weights = new int[rects.length];
		int sum = 0;
		for (int i = 0; i < rects.length; i++) {
			int[] r = rects[i];
			int area = (r[3] - r[1]) * (r[2] - r[0]);
			sum += area;
			weights[i] = sum;
			System.out.println(i + " - " + sum + " - " + i);
		}
		
		Random ran = new Random();
		double pick = ran.nextInt(sum);
		System.out.println("Random pick: " + pick);
		int left = 0;
		int right = weights.length - 1;
		
		while (left < right && left + 1 != right) {
			int mid = left + (right - left) / 2;
			if (pick > weights[mid]) {
				left = mid;
			}
			else {
				right = mid;
			}
		}
		
		if (pick <= left) {
			System.out.println("pick " + left + " rect");
			pickFromOneRect(rects[left]);
		}
		else {
			System.out.println("pick " + right + " rect");
			pickFromOneRect(rects[right]);
		}
	}
	
	public static void pickFromMoreRectOverlap(int[][] rects) {
		
		int maxX = Integer.MIN_VALUE;
		int minX = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		
		for (int[] r : rects) {
			minX = Math.min(r[0], minX);
			minY = Math.min(r[1], minY);
			maxX = Math.max(r[2], maxX);
			maxY = Math.max(r[3], maxY);
		}
		
		Random ran = new Random();
		
		
		boolean check = false;
		int newX = 0;
		int newY = 0;
		while (!check) {
			newX = minX + ran.nextInt(maxX - minX + 1);
			newY = minY + ran.nextInt(maxY - minY + 1);
			for (int[] r : rects) {
				if (r[0] <= newX && newX <= r[2] && r[1] <= newY && newY <= r[3]) {
					check = true;
					break;
				}
			}
		}
		
		System.out.println(newX + ", " + newY);
		
	}
	

}

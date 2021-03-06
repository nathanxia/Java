package google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class boxesSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		arrayFormat();
		
		classFormat();
		
	}
	
	public static void classFormat() {
		System.out.println("Class format");
		//int[][] box = {{4,5,6}, {1,2,3}, {3,4,5}, {4,6,5}, {7,9,8}};
		
		List<int[]> box = new ArrayList<>();
		
		box.add(new int[] {4,5,6});
		box.add(new int[] {3,4,5});
		box.add(new int[] {4,6,5});
		box.add(new int[] {7,9,8});
		box.add(new int[] {1,2,3});
		
		System.out.println("Can not switch edges: ");
		Collections.sort(box, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[0] == b[0]) {
					if (a[1] == b[1]) {
						return a[2] - b[2];
					}
					return a[1] - b[1];
				}
				return a[0] - b[0];
			}
		});
		
		displayList(box);
		
		List<int[]> box2 = new ArrayList<>();
		
		box2.add(new int[] {4,5,6});
		box2.add(new int[] {3,4,5});
		box2.add(new int[] {4,6,5});
		box2.add(new int[] {7,9,8});
		box2.add(new int[] {1,2,3});
		System.out.println("Can switch edges: ");
		for (int i = 0; i < box2.size(); i++) {
			Arrays.sort(box2.get(i));
		}
		displayList(box2);
		Collections.sort(box2, new Comparator<int[]>() {
			public int compare(int[] b, int[] a) {
				if (a[0] == b[0]) {
					if (a[1] == b[1]) {
						return a[2] - b[2];
					}
					return a[1] - b[1];
				}
				return a[0] - b[0];
			}
		});
		displayList(box2);
		
	}
	
	public static void displayList(List<int[]> box) {
		for (int[] b : box) {
			System.out.print("{" + b[0] + b[1] + b[2] + "}");
		}
		
		System.out.println();
	}
	
	public static void arrayFormat() {
		System.out.println("Array format");
		int[][] box = {{4,5,6}, {1,2,3}, {3,4,5}, {4,6,5}, {7,9,8}};
		
		// Cant switch.
		System.out.println("Can not switch edges: ");
		Arrays.sort(box, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[0] == b[0]) {
					if (a[1] == b[1]) {
						return a[2] - b[2];
					}
					return a[1] - b[1];
				}
				return a[0] - b[0];
			}
		});
		
		displayArray(box);
		
		// can switch;
		int[][] box2 = {{4,5,6}, {1,2,3}, {3,4,5}, {4,6,5}, {7,9,8}};
		System.out.println("Can switch edges: ");
		for (int i = 0; i < box2.length; i++) {
			Arrays.sort(box2[i]);
		}
		
		Arrays.sort(box2, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[0] == b[0]) {
					if (a[1] == b[1]) {
						return a[2] - b[2];
					}
					return a[1] - b[1];
				}
				return a[0] - b[0];
			}
		});
		
		displayArray(box2);
	}
	
	public static void displayArray(int[][] box) {
		for (int[] b : box) {
			System.out.print("{"+ b[0] + b[1] + b[2] + "}");
		}
		System.out.println();
	}

}

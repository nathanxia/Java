package google;
import java.util.*;

public class kCloestSlots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] flowers = {1,2,3};
		int k = 1;
		
		int res = findKClosetSlots(flowers, k);
		
		System.out.println("res: " + res);
		
	}
	
	public static int findKClosetSlots(int[] P, int K) {
		
		// write your code in Java SE 8
        int n = P.length;
        
        if (K >= n) return -1;
        
        int[] bloom = new int[n + 1];
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        
        for(int i = 0; i < n; i++) {
            int pos = P[i];
            
            if (left[pos] == 1 || right[pos] == 1) {
                return i + 1;   
            }
            
            bloom[pos] = 1;
            
            boolean leftCheck = true;
            boolean rightCheck = true;
            for (int m = 1; m <= K; m++) {
                if (rightCheck && pos + m < n && bloom[pos + m] != 0) {
                    rightCheck = false;
                }
                if (leftCheck && pos - m > 0 && bloom[pos - m] != 0) {
                    leftCheck = false;
                }
            }
            
            if (rightCheck && right[pos + K] == 1) {
                return i + 1;   
            }
            if (leftCheck && left[pos - K] == 1) {
                return i + 1;
            }
            
            for (int l = 1; l <= K; l++) {
                if (pos + l <= n) {
                    right[pos + l] = -1;
                }  
            }
            
            for (int r = 1; r <= K; r++) {
                if (pos - r > 0) {
                    left[pos - r] = -1;
                }
            }
            
            if (pos + K + 1 <= n && right[pos + K + 1] != -1) {
                right[pos + K + 1] = 1;   
            }
            if (pos - K - 1 > 0 && left[pos - K - 1] != -1) {
                left[pos - K - 1] = 1;   
            }
            
            display(bloom);
            display(left);
            display(right);
            System.out.println();
        }
        
        
        
        return -1;
	}
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i] + "\t|");
		}
		System.out.println();
	}

}

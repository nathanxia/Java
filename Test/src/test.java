import java.util.*;

public class test {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2}, {3, 4}};
		
		int[][] matrix2 = matrix;
		
		for (int[] v : matrix2){
			for (int v2 : v) {
				System.out.println(v2);
			}
		}
			
	}
}


public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{19,23,35,44},{55,67,74,86},{91,10,11,12},{13,14,15,16}};
		
		dis(matrix);
		
		int tmp = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix[0].length; j++) {
				tmp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = tmp;
			}
		}
		
		/*
		// rotate 90 degree clockwise
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length / 2; j++) {
				tmp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
				matrix[i][matrix[0].length - 1 - j] = tmp;
			}
		}
		System.out.println("rotate 90 degree clockwise: ");
		dis(matrix);
		*/
		
		// rotate 90 degree counter clockwise
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				tmp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length - 1 - i][j];
				matrix[matrix.length - 1 - i][j] = tmp;
			}
		}
		System.out.println("rotate 90 degree counter clockwise: ");
		dis(matrix);
		
		
		
		int[][] m2 = {{19,23,35,44},{91,10,11,12},{13,14,15,16}};
		int[][] res = new int[m2[0].length][m2.length];
		
		dis(m2);
		dis(res);
		
		// rotate 90 degree clockwise
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] = m2[m2.length - 1 - j][i];
			}
		}
		System.out.println("rotate 90 degree clockwise: ");
		dis(res);
		
		// rotate 90 degree counter clockwise
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] = m2[j][m2[0].length - 1 - i];
			}
		}
		System.out.println("rotate 90 degree counter clockwise: ");
		dis(res);
		
	}
	
	public static void dis(int[][] matrix) {
		System.out.println("=============");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=============");	
		
	}

}

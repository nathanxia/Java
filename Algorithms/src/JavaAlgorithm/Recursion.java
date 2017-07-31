package JavaAlgorithm;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recursion tool = new Recursion();

		int triangualrNum = tool.getTriangualrNum(4);
		System.out.println("Triangluar number is " + triangualrNum);
		
		int factorialNum = tool.getFactorial(8);
		System.out.println("Factorial number is " + factorialNum);
		
	}
	public int getTriangualrNum(int num) {
		int triangualrNum = num;
		if (num == 1) {
			return 1;
		}
		triangualrNum += getTriangualrNum(num - 1);
		
		return triangualrNum;
	}
	
	public int getFactorial(int num) {
		System.out.println("Method: " + num);
		if (num == 2) {
			return num;
		}
		int res =  num * getFactorial(num - 1);
		System.out.println("Returned: " + (res));
		return res;
		
	}

}

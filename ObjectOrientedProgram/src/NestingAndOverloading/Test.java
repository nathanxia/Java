package NestingAndOverloading;

public class Test {

	public int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
	public int max(int num1, int num2, int num3) {
		int res = max(num1, num2);
		return max(res, num3);
	}
	
	public double max(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
}

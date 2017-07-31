package lesson01;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1 = 10;
		int b1 = 20;
		int resultInt = Add(a1, b1);
		System.out.println(resultInt);
		
		double a2 = 10.3;
		double b2 = 20.2;
		double resultDouble = Add(a2, b2);
		System.out.println(resultDouble);
		
		String a3 = "Hi ";
		String b3 = "there!";
		String resulString = Add(a3, b3);
		System.out.println(resulString);
	}
	
	public static int Add(int a, int b) {
		return (a + b);
	}
	
	public static double Add(double a, double b) {
		return (a + b);
	}
	
	public static String Add(String a, String b) {
		return (a + b);
	}

}

package Lesson05;

public class CatchingAndHandingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		
		System.out.println(a);
		
		
		// try catch function;
		try {
			int b = a / 2;
			System.out.println(b);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		// try catch finally;
		try {
			int b = a / 0;
			System.out.println(b);
		}catch(Exception e) {
			System.out.println("catch called.");
			System.out.println(e);
		} finally {
			System.out.println("Finally called.");
		}
		
		
		
		
		
	}
	

}

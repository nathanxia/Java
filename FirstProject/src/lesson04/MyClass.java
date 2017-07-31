package lesson04;

public class MyClass {

	public static int fact (int x) {
		if (x <= 1) {
			return 1;
		}
		else {
			return (x * fact(x-1));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = fact(5);
		System.out.println(sum);
	}

}

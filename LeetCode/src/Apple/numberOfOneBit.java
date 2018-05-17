package Apple;

public class numberOfOneBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int count = 0;
		while (n != 0) {
			System.out.println(n & (n - 1));
			n = n & (n  - 1);
			count++;
		}
		
		System.out.println(count);
	}

}


public class FindTheMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1,2,3,4,6,7,8,9};
		
		int res = findTheMissingNumber(input);
		
		System.out.println(res);
	}
	
	public static int findTheMissingNumber(int[] input) {
		
		int a = input[0];
		int b = 1;
		
		for (int i = 1; i < input.length; i++) {
			a = a ^ input[i];
		}
		
		for (int j = 2; j <= input.length + 1; j++) {
			b = b ^ j;
		}
		return (a ^ b);
		
	}

}

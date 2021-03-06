package google;

public class twentyOnePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] dp = new double[21];
		dp[0] = 1.0;
		for (int i = 1; i < dp.length; i++) {
			int end = Math.min(16, i - 1);
			int start = Math.max(0, i - 10);
			
			double k = 0;
			while (start <= end) {
				k += dp[start] * 0.1;
				start++;
			}
			dp[i] = k;
		}
		
		double p = 0;
		
		for (int i = 17; i < 21; i++) {
			p += dp[i];
		}
		
		System.out.println(1 - p);

	}

}

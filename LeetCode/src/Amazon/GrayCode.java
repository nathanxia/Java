package Amazon;
import java.util.*;

public class GrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < 1 << n; i++) {
			//System.out.println(Integer.toBinaryString(i));
			int tmp = i ^ i >> 1;
			res.add(tmp);
		}
		
		for(Integer val : res) {
			System.out.println(val);
		}
	}

}

package Lesson05;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> nums = new HashMap<Integer, Integer>();
		int target = 0;
		int[] result = new int[2];
		nums.put(0, 1);
		nums.put(0, 2);
		nums.put(10, 3);
		nums.put(20, 4);
		nums.put(30, 5);
		nums.put(40, 6);
		 
		
		for(Map.Entry<Integer, Integer> entry : nums.entrySet()) {
            
            System.out.println(entry);

    
     }
		
		 for(Map.Entry<Integer, Integer> entry : nums.entrySet()) {
	            
	            if (nums.containsKey(target - entry.getKey())) {
	                int key1 = entry.getKey();
	                int value1 = entry.getValue();
	                System.out.println(entry);
	                result[0] = value1;
	                result[1] = nums.get(target - key1);
	                break;
	                
	                
	            }

	    
	     }
		 for (int i : result) {
			 System.out.println(i);
		 }
	}

}

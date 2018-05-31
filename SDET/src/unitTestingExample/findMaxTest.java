package unitTestingExample;

import org.junit.*;

public class findMaxTest {
	
	
	@Test
	public void testNullArr() {
		int[] arr = null;
		
		int res = findMaxValue.findMax(arr);
		
		Assert.assertEquals(-Integer.MAX_VALUE, res);
	}
	
	@Test
	public void testFindMax() {
		int[] arr = {-1,99,-2,-90, 289,99,999};
			
		Assert.assertEquals(999, findMaxValue.findMax(arr));
	}
	
	@Test 
	public void testOneValueArray() {
		int[] arr = {5};
		
		Assert.assertEquals(5,  findMaxValue.findMax(arr));
	}
	
	@Test 
	public void testZeroValueArray() {
		int[] arr = {0};
		
		Assert.assertEquals(0,  findMaxValue.findMax(arr));
	}
	
	@Test 
	public void testNegValueArray() {
		int[] arr = {-1,-2,-3,-4,-5};
		
		Assert.assertEquals(-1,  findMaxValue.findMax(arr));
	}

}

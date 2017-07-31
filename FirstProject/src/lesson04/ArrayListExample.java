package lesson04;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> MyList = new ArrayList<Integer>(5);
		
		MyList.add(4);
		MyList.add(2);
		MyList.add(8);
		MyList.add(10);
		MyList.add(18);
		MyList.add(6);
		
		for (Integer x : MyList) {
			System.out.println(x);
		}
		
		System.out.println("List Size is " + MyList.size());
		MyList.remove(2);
		MyList.set(0, 100);
		
		for (Integer x : MyList) {
			System.out.println(x);
		}
		System.out.println("List Size is " + MyList.size());
		
		
	}

}

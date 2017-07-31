package lesson04;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(5);
		list.add(4);
		list.add(7);
		list.add(2);
		list.add(9);
		
		for (Integer x : list) {
			System.out.println(x);
		}
		

	}

}

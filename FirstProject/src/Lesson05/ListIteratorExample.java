package Lesson05;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Mark");
		names.add("Tom");
		names.add("Joe");
		names.add("Jean");
		names.add("Tonny");
		
		ListIterator<String> itr = names.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------------");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		
		
	}

}

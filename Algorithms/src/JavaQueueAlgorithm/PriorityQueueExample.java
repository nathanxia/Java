package JavaQueueAlgorithm;


import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq = new PriorityQueue<>();
		
		pq.add("Tom");
		pq.add("Jerry");
		pq.add("Apple");
		pq.add("Zoe");
		pq.add("banana");
		pq.add("app");
		
		System.out.println(pq);
		
		System.out.println("The head element is " + pq.peek());
		
		System.out.println("Remove element: Jerry");
		pq.remove("Jerry");
		System.out.println(pq);
		
		String head = pq.poll();
		System.out.println("Removed first element is " + head);
		System.out.println(pq);
	}

}

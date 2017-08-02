package JavaQueueAlgorithm;

import java.util.*;		

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> que = new LinkedList<>();
		
		for (int i = 0; i < 10; i++) {
			que.add(i);
		}
		
		System.out.println(que);
		
		int head = que.remove();
		System.out.println("Remove first element: " + head);
		
		int head2 = que.peek();
		System.out.println("Current head is " + head2);
		
		int head3 = que.poll();
		System.out.println("Element is " + head3);
		System.out.println("Current head is " + que.peek());
	}

}

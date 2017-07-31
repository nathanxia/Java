package JavaAlgorithm;

import java.util.Arrays;

public class Queue {

	private String[] queue;
	private int queueSize;
	private int front, rear, numberOfItems = 0;
	
	Queue(int size) {
		queueSize = size;
		queue = new String[queueSize];
		Arrays.fill(queue, "-1");
	}
	
	public void displayTheQueue() {
		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < queueSize; i++) {
			System.out.print("| " + i + "  ");
			
		}
		System.out.println(" | ");
		System.out.println("-------------------------------------------------------");
		System.out.print("| ");
		for (String val : queue) {
			if (!val.equals("-1")) System.out.print(val + " | ");
			else System.out.print("  " + " | ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------");
	}
	
	public void insert(String val) {
		if (numberOfItems + 1 <= queueSize) {
			queue[rear] = val;
			rear++;
			numberOfItems++;
			System.out.println("Insert successed");
		} 
		else {
			System.out.println("No room");
		}
	}
	
	public void remove() {
		if (numberOfItems > 0) {
			queue[front] = "-1";
			front++;
			numberOfItems--;
			System.out.println("Remove successed");
		}
		else {
			System.out.println("No data");
		}
	}
	
	public void peek() {
		if(numberOfItems > 0) {
			System.out.println("The first element is " + queue[front]);
		}
	}
	
	public void priorityInsert(String val) {
		int i;
		if (numberOfItems + 1 <= queueSize) {
			for (i = rear - 1; i >= front; i--) {
				if (Integer.parseInt(val) > Integer.parseInt(queue[i])) {
					queue[i + 1] = queue[i];
				}
				else {
					break;
				}
			}
			queue[i + 1] = val;
			rear++;
			numberOfItems++;
			
			System.out.println("Insert successed");
		} 
		else {
			System.out.println("No room");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue que = new Queue(10);
		
		que.priorityInsert("14");
		que.priorityInsert("22");
		que.priorityInsert("15");
		que.priorityInsert("17");
		
		que.displayTheQueue();
		
		que.remove();
		que.remove();
		que.displayTheQueue();
		
		que.peek();
		
		que.priorityInsert("17");
		que.priorityInsert("30");
		que.priorityInsert("13");
		que.priorityInsert("22");
		que.displayTheQueue();
	}

}

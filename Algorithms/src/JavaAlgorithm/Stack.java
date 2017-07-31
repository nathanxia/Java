package JavaAlgorithm;

import java.util.Arrays;

public class Stack {

	private String[] stackArray;
	private int stackSize;
	private int topOfStack = -1;
	
	Stack(int size) {
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}
	
	public void push(String input) {
		
		if(topOfStack + 1 < stackSize) {
			topOfStack++;
			stackArray[topOfStack] = input;
			System.out.println(input + " has been pushed!");
		}
		else {
			System.out.print("No room!");
		}
		
		displayTheStack();
	}
	
	public String pop() {
		
		if (topOfStack >= 0) {
			System.out.println(stackArray[topOfStack] + " has been poped!");
			stackArray[topOfStack] ="-1";
			displayTheStack();
			return stackArray[topOfStack--];
		}
		else {
			displayTheStack();
			return "-1";
		}
	}
	
	public void pushMany(String multiInput) {
		String[] multiValue = multiInput.split(" ");
		
		for (String val : multiValue) {
			push(val);
		}
	}
	
	public String peek () {
		displayTheStack();
		System.out.println("Top of the stack is " + stackArray[topOfStack]);
		
		return stackArray[topOfStack];
	}
	
	
	public void displayTheStack() {
		System.out.print("| ");
		for (String val : stackArray) {
			if (!val.equals("-1")) System.out.print(val + " | ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack(10);
		
		stack.push("Tom");
		stack.push("John");
		stack.push("Jack");
		
		stack.peek();
		stack.pop();
		
		stack.pushMany("Jack Jill Deck Keek");
		
		
		
		
	}

}

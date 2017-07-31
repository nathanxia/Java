package lesson01;

public class Hello extends Student {
	
	public static int age;
	public static String DoSomething (String message) {
		return message;
	}
	
	public String DoSomethingElse (String message) {
		return message;
	}
	
	/*
	 * Final keyword has a numerous ways to use:
	 * 
	 * A final class cannot be subclassed
	 * A final method cannot be overridden by subclasses
	 * A final variable can only be initialized once
	 */
	
	public final int number;
	
	Hello () {
		number = 10;
	}
	
	
}

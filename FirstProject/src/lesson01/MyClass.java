package lesson01;

public class MyClass {
/*
 *  This is my first program.
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hello hello = new Hello();
		//Hello.age = 10;
		//System.out.println(Hello.age);
		//Hello.DoSomething("Hi youtube");
		//hello.DoSomethingElse("Hello world");
		
		
		
		//Hello hello1 = new Hello();
		//Hello.age = 50;
		//System.out.println(Hello.age);
		//Hello hello2 = new Hello();
		
		Hello hel = new Hello();
		//hel.number = 20;
		
		System.out.println(hel.number);
		
		// Examples about Inheritance
		// Use Polygon.java, Rectangle.java, and Triangle.java
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		rec.set_values(10, 20);
		tri.set_values(20, 30);
		
		System.out.println(rec.area());
		System.out.println(tri.area());
		
		
	}
	
	
	
}

package ClassConstructors;

public class Student {
	
	String name;
	int age;
	
	public Student() {
		System.out.println("Constructor with no parameter called.");
		name = "default";
		age = -1;
	}
	
	public Student(String name) {
		System.out.println("Constructor with name parameter called.");
		this.name = name;
		this.age = -1;
	}
	
	public Student(int age) {
		System.out.println("Constructor with age parameter called.");
		this.name = "default";
		this.age = age;
	}
	
	public Student(String name, int age) {
		System.out.println("Constructor with two parameters called.");
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("name is " + name);
		System.out.println("age is " + age);
	}
 }

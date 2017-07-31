package ThisKeyword;

public class Student {

	String name;
	int age;
	
	Student() {
		this.name = "Default";
		this.age = -1;
	}
	
	Student(String name) {
		this.name = name;
	}
	
	Student(int age) {
		this.age = age;
	}
	
	Student(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public void display() {
		
		System.out.println("I'm " + this.name + ", and I'm " + this.age + " years old.");
	}
}

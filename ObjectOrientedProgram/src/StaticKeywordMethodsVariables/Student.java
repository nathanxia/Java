package StaticKeywordMethodsVariables;

public class Student {
	public String name;
	public int age;
	public static int noStudents = 0;

	public Student() {
		noStudents++;
	}
	
	public static void howManyStudents() {
		System.out.println("There are " + noStudents + " students.");
	}
	
	public void display() {
		System.out.println("I'm " + name + ", and I'm " + age + " years old.");
		
	}
}

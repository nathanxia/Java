package PrivateAccessSpecifiers;

public class Student {
	
	private static int noStudents = 0;
	private String name;
	public int age;
	
	public Student() {
		noStudents++;
	}
	
	private static void getNoStudents() {
		System.out.println("There are " + noStudents + " student(s).");
	}
	
	private void added() {
		System.out.println(name + " is added.");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void display() {
		added();
		System.out.println("I'm " + name + ", and I'm " + age + " years old.");
		getNoStudents();
	}
}

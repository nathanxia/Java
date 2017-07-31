package lesson01;

public class MyStudent {

	public static void main(String[] args) {
		// Examples about Class and static instance
		// Use Studet.java

		Student tom = new Student();
		
		tom.setId(01);
		tom.setName("Tom");
		tom.setAge(23);
		tom.setGrade(3.5);
		//output(tom);
		
		
		Student jim = new Student();
		
		jim.setId(02);
		jim.setName("Jim");
		jim.setAge(22);
		jim.setGrade(4.0);
		//output(jim);
		
		
		System.out.println(Student.getNoOfStudents());
		
		//Examples about Public, Private, Protected and this (Java Access Modifiers)
		// Use Student2.java
		
		Student2 stu = new Student2();
		stu.setName("Max");
		System.out.println(stu.getName());
		
		
		
	} // End of main
	
	public static void output(Student student) {
		System.out.println("Student id is: " + student.getId());
		System.out.println("Student name is: " + student.getName());
		System.out.println("Student age is: " + student.getAge());
		System.out.println("Student grade is: " + student.getGrade());
	}
	

}

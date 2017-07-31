package lesson01;

public class Student {
	
	int id;
	String name;
	int age;
	double grade;
	static int NoOfStudents = 0;
	
	Student () {
		NoOfStudents ++;
	}
	
	public static int getNoOfStudents() {
		return NoOfStudents;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}

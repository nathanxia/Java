package ClassesAndObjects;

public class Student {
	
	//Properties & attributes
	private String name = "null";
	private int rollNo = 0;
	private int age = 0;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("Hey, I am " + name);
		System.out.println("My roll number is " + rollNo);
		System.out.println("My roll age is " + age);
	}
	
	public void sayNumbers(int start, int end) {
		int c;
		for (c = start; c <= end; c++) {
			System.out.println(c);
		}
	}
	
	public boolean hasGirlFriend() {
		return true;
	}
}

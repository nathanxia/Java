package DataTypesAndDefaultValues;

public class Student {

	String name;
	int rollNo;
	char sex;
	boolean hasGF;
	
	Student() {
		name = "No name";
		rollNo = 0;
		sex = 'N';
		hasGF = false;
	}
	
	void display() {
		
		System.out.println("Name is " + name);
		System.out.println("Roll number is " + rollNo);
		System.out.println("Sex is " + sex);
		System.out.println("Has girl friend is " + hasGF);
	}
}

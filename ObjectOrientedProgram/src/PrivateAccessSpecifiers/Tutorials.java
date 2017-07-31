package PrivateAccessSpecifiers;

public class Tutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student mark = new Student();
		mark.setName("Mark");
		mark.age = 25;
		
		mark.display();
		
		Student tom = new Student();
		tom.setName("Tom");
		tom.age = 23;
		
		tom.display();
	}

}

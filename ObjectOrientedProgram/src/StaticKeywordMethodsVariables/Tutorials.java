package StaticKeywordMethodsVariables;

public class Tutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student mark = new Student();
		mark.name = "Mark";
		mark.age = 25;
		
		Student tom = new Student();
		tom.name = "Tom";
		tom.age = 16;
		
		mark.display();
		tom.display();
		Student.howManyStudents();
	}

}

package ReferenceAndPrimitiveDataTypes;

public class Tutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student mark;
		mark = new Student();
		
		Student tom = new Student();
		
		mark.rollNo = 11;
		tom.rollNo = 22;
		
		mark = tom;
		
		mark.rollNumberPlease();
		tom.rollNumberPlease();
		
	}

}

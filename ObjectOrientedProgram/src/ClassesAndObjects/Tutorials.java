package ClassesAndObjects;

public class Tutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student mark = new Student();
		mark.setName("Mark");
		mark.setRollNo(1);
		mark.setAge(24);
		mark.introduce();
		
		Student tom = new Student();
		tom.setName("Tom");
		tom.setRollNo(2);
		tom.setAge(27);
		tom.introduce();
		
		//mark.sayNumbers(1, 5);
		
		boolean gf = mark.hasGirlFriend();
		if (gf) {
			System.out.println("yes");
		}
	}

}

package DefaultAccessAndSpecifiers;
import ClassesAndObjects.Student; //import ClassesAndObjects.*;

public class Tutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student mark = new Student();
		mark.setName("Mark");
		mark.setAge(23);
		mark.setRollNo(55);
		mark.introduce();
		
		Person tom = new Person();
		tom.name = "Tom";
		tom.introduct();
	}

}

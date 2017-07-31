package ArrayofObjects;

public class Tutorials {

	public static void main(String[] args) {

		Student na = new Student();
		Student mark = new Student("Mark", 25);
		Student tom = new Student();
		
		na.introduce();
		mark.introduce();
		tom.introduce();
		
		tom.setNameAge("Tom", 19);
		tom.introduce();
		System.out.println("-------------------------------");
		
		Student[] students = new Student[3];

		students[0] = new Student("Joe", 33);
		students[1] = new Student("Mike", 55);
		students[2] = new Student("Anny", 9);
		
		for (Student i : students) {
			i.introduce();
		}
		System.out.println("-------------------------------");
		
		students[0].setClass("Math");
		students[0].setClass("Biology");
		students[0].setClass("Physics");
		students[0].setClass("Chemistry");
		students[0].setGrade("Math", 98);
		students[0].setGrade("Biology", 88);
		students[0].setGrade("Physics", 93);
		students[0].setGrade("Chemistry", 94);
		students[0].displaygrades();
		System.out.println("-------------------------------");
		
		students[0].changeGrade("Math", 100);
		students[0].displaygrades();
		System.out.println("-------------------------------");
		
		students[0].removeClass("Biology");
		students[0].displaygrades();
		System.out.println("-------------------------------");
		
		students[0].changeGrade("aaa", 100);
		students[0].removeClass("bbb");
		students[0].displaygrades();
		System.out.println("-------------------------------");
		
		students[0].setGrade("Biology", 98);
		students[0].setClass("Biology");
		students[0].setGrade("Biology", 20);
		students[0].displaygrades();
		System.out.println("-------------------------------");
		
	}

}

package Lesson01;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2017;
		System.out.println("Hello world " + year + "!");
		
		Person tom = new Person("Tom", 6.1f, 202.5f);
		tom.walks();
		
		Person mark = new Person("Mark", 5.7f, 198.6f);
		mark.walks();
		
		Person matt =  new Person("Matt", 6f, 190.9f);
		matt.eats();
		
		
	}

}

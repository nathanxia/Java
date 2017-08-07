/**
 * 
 */
package Lesson03;

/**
 * @author Nathan
 *
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle myBMW = new SportsUtilityVehicle("White", "BMW", "X5", "2017");
		Truck myFord = new Truck(4, 6, "Black", "Ford", "F-150", "2016", 100);
		
		for (int s = 0; s < 10; s++) {
			myBMW.accelerate();
			myFord.accelerate();
		}
		System.out.println("My vehicle speed: " + myBMW.getSpeed());
		System.out.println("My truck speed: " + myFord.getSpeed());
		
	}

}

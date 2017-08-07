/**
 * 
 */
package Lesson03;

/**
 * @author Nathan
 *
 */
public class SportsUtilityVehicle extends Vehicle {

	/**
	 * @param color
	 * @param make
	 * @param model
	 * @param year
	 */
	public SportsUtilityVehicle(String color, String make, String model, String year) {
		super(color, make, model, year);
		// TODO Auto-generated constructor stub
		this.numDoors = 5;
	}

	/* (non-Javadoc)
	 * @see Lesson03.Vehicle#accelerate()
	 */
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		this.speed += 4;
		if (this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}
	}

	/* (non-Javadoc)
	 * @see Lesson03.Vehicle#decelerate()
	 */
	@Override
	public void decelerate() {
		// TODO Auto-generated method stub
		this.speed -= 6;
		if (this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}
	}

}

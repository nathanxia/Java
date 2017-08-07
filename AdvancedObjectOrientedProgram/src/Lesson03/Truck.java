package Lesson03;

public class Truck extends Vehicle {

	private int load = 0;
	
	// Constructor
	public Truck(int wheels, int doors, String color, String make, String model, String year, int load) {
		super(wheels, doors, color, make, model, year);
		// TODO Auto-generated constructor stub
		
		this.load = load;
		checkNumDoors();
	}
	
	// Getters
	public int getLoad() {
		return this.load;
	}
	
	
	// Private methods
	private void checkNumDoors() {
		if (this.numDoors < 3) {
			this.numDoors = 3;
		}
	}
	
	//OVerridden public methods
	@Override 
	public void accelerate() {
		this.speed += 2;
		if (this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}
	}
	
	@Override
	public void decelerate() {
		this.speed -= 3;
		if (this.speed < 0) {
			this.speed = 0;
		}
	}

}

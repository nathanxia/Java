package Lesson03;

public abstract class Vehicle {

	protected int numWheels = 4;
	protected int numDoors = 2;
	protected String color = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	protected float speed = 0;
	protected final int MAX_SPEED = 40;
	
	// Getters
	public int getNumWheels() {
		return this.numWheels;
	}

	public int getNumDoors() {
		return this.numDoors;
	}

	public String getColor() {
		return this.color;
	}

	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return this.model;
	}

	public String getYear() {
		return this.year;
	}
	
	public float getSpeed() {
		return this.speed;
	}
	
	// Constructor
	public Vehicle(int wheels, int doors, String color, String make, String model, String year) {
		this.numWheels = wheels;
		this.numDoors = doors;
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	public Vehicle(String color, String make, String model, String year) {
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	
	// Public abstract methods
	// Must be overridden
	public abstract void accelerate();
	public abstract void decelerate();
	
	
	// Public methods
	public void turnLeft() {
		System.out.println("Turning Left");
	}
	
	public void turnRight() {
		System.out.println("Turning Right");
	}


	
	
	
}

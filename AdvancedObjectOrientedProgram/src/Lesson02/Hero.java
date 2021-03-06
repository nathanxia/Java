package Lesson02;

public class Hero extends Entity {
	
	// Entity class contains all the variables.
	/*
	public String name;
	protected int strength;
	protected int speed;
	private int health;
	*/
	
	
	// Getters
	public int getStrength() {
		return strength;
	}

	public int getSpeed() {
		return speed;
	}

	public int getHealth() {
		return health;
	}
	
	// Constructor
	public Hero(String name) {
		this.name = name;
		generateAbilities();
	}
	
	public void showAbilities() {
		System.out.println("Hero abilities:");
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println();
	}
	
	// Private methods
	private void generateAbilities() {
		this.strength = (int) (Math.random() * 100 + 1);
		this.speed = (int) (Math.random() * 100 + 1);
		this.health = (int) (Math.random() * 100 + 1);
	}
	
	// Public  methods
	public void fight() {
		System.out.println(this.name + " is fighting");
	}
	
	public void run() {
		System.out.println(this.name + " is running");
	}
}

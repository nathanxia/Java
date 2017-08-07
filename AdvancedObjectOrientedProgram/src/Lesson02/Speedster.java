package Lesson02;

public class Speedster extends Hero {

	public Speedster(String name) {
		super(name);
		boostSpeed();
	}
	
	// Private methods;
	private void boostSpeed() {
		this.speed += 50;
		if (this.speed > 100) {
			this.speed = 100;
		}
	}

}

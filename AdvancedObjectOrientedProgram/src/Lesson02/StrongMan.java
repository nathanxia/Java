package Lesson02;

public class StrongMan extends Hero {

	public StrongMan(String name) {
		super(name);
		boostStrength();
	}
	
	public void boostStrength() {
		this.strength += 50;
		if (this.strength > 100) {
			this.strength = 100;
		}
	}

}

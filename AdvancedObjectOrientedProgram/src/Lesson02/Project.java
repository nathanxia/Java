package Lesson02;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StrongMan superman = new StrongMan("Superman");
		superman.showAbilities();
		
		Villain villain = new Villain("Sly Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
		
		Vigilante vigilante = new Vigilante("Arrow");
		vigilante.steals();
		vigilante.kills();
		vigilante.dealsJustice();
		vigilante.showAbilities();
		
	}

}
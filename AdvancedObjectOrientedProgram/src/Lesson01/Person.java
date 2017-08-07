package Lesson01;

public class Person {

	private String name;
	private float height;
	private float weight;
	private int IQ;
	
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void walks() {
		this.weight *= 0.9;
		System.out.println(this.name + " lose weight");
		System.out.println(this.name + " weighs: " + this.weight + "lbs");
	}
	
	
	public void eats() {
		this.weight *= 1.2;
		System.out.println(this.name + " gain weight");
		System.out.println(this.name + " weighs: " + this.weight + "lbs");
	}
	
}

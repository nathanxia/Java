package lesson01;

/*
 *  Access Levels
 * Modifier			Class		Package		Subclass		World
 * Public			Y			Y			Y				Y
 * Protected		Y			Y			Y				N
 * no modifier		Y			Y			N				N
 * Private			Y			N			N				N
 */

public class Student2 {
	//Examples about Public, Private, Protected and this (Java Access Modifiers)

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

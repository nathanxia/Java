package ArrayofObjects;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private ArrayList<String> classes;
	private ArrayList<Integer> grades;
	
	Student() {
		name = "No name";
		age = -1;
		classes = new ArrayList<String>();
		grades = new ArrayList<Integer>();
	}
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.classes = new ArrayList<String>();
		this.grades = new ArrayList<Integer>();
	}
	
	void setNameAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void setClass(String clas) {
		if (this.classes.indexOf(clas) != -1) {
			System.out.println("Class \"" + clas + "\" is already in system." );
		}
		else {
			this.classes.add(clas);
			this.grades.add(0);
		}
	}
	
	void setGrade(String clas, int grade) {
		
		if (this.classes.indexOf(clas) == -1) {
			System.out.println("Class \"" + clas + "\" is not found." );
		}
		else {
			this.grades.set(this.classes.indexOf(clas), grade);
		}
	}
	
	void removeClass(String clas) {
		try {
			int index = this.classes.indexOf(clas);
			this.classes.remove(index);
			this.grades.remove(index);
		}catch(Exception e) {
			System.out.println("Error: " + e);
			System.out.println("Class \"" + clas + "\" is not found." );
			
		}
	}
	
	void changeGrade(String clas, int grade) {
		try {
			int index = this.classes.indexOf(clas);
			this.grades.set(index, grade);
		}catch(Exception e) {
			System.out.println("Error: " + e);
			System.out.println("Class \"" + clas + "\" is not found." );
			
		}
	}
	
	void removeAllClassesGrades() {
		this.classes.clear();
		this.grades.clear();
	}
	
	void introduce() {
		System.out.println("Name is " + this.name + ", and age is " + this.age +".");
	}
	
	void displaygrades() {
		
		for (int i = 0; i < this.classes.size(); i++) {
			System.out.println("Class is " + this.classes.get(i) + " , and grade is " +this.grades.get(i) + "." );
		}
	}

}

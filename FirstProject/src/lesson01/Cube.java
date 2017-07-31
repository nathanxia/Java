package lesson01;

public class Cube {
	int length;
	int height;
	int bredth;
	
	public int getCubeVolume() {
		return (length * bredth * height);
	}
	
	Cube() {
		//System.out.println("We are in contructor!");
		length = 10;
		height = 20;
		bredth = 30;
	}
	
	Cube(int l, int h, int b) {
		//System.out.println("We are in contructor!");
		length = l;
		height = h;
		bredth = b;
	}
}

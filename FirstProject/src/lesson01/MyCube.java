package lesson01;

public class MyCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cube cube1 = new Cube();
		System.out.println(cube1.getCubeVolume());
		
		Cube cube2 = new Cube(20, 20, 20);
		System.out.println(cube2.getCubeVolume());
		
	}

}

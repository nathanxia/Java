package PassingObjectsToMethods;

public class Tutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1 = new Box(10, 20);
		Box b2 = new Box(20, 30);
		Box b3 = new Box(b1);
		
		Box b4 = b2.duplicate();
		
		b3.display();
		b4.display();
		
		System.out.println(b1.isEqual(b3));
		System.out.println(Box.isTwoObjectsEqual(b1, b2));
		
	}

}

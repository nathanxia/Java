package PassingObjectsToMethods;

public class Box {

	int width;
	int height;
	
	Box(int w, int h) {
		width = w;
		height = h;
	}
	
	Box(Box b) {
		this.width = b.width;
		this.height = b.height;
	}
	
	boolean isEqual(Box b) {
		if(this.height == b.height && this.width == b.width) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	static boolean isTwoObjectsEqual(Box b1, Box b2) {
		if(b1.height == b2.height && b1.width == b2.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	Box duplicate() {
		Box tmp = new Box(this);
		return tmp;
	}
	
	void display() {
		System.out.println("Width is " + this.width + ", and height is " + this.height + ".");
	}
}

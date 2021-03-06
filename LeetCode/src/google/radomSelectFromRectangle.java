package google;

import java.util.Random;

public class radomSelectFromRectangle {

	public static class Rectangle {
		int x1, x2, y1, y2;
		public Rectangle(int x1, int x2, int y1, int y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}
	}
	
	public static class Point {
		int x, y;
		public Point(int a, int b) {
			x = a;
			y = b;
		}
	}
	final static Random rand = new Random();
	
	public static Point randomSelectFrom(Rectangle rect) {
		int a = rect.x1 + rand.nextInt(rect.x2 - rect.x1 + 1);
		int b = rect.y1 + rand.nextInt(rect.y2 - rect.y1 + 1);
		Point p = new Point(a, b);
		return p;
	}
	
	public Point randomSelectFrom2(Rectangle[] rects) {
		int selected = -1, total = 0;
		
		for (int i = 0; i < rects.length; i++) {
			int area = (rects[i].x2 - rects[i].x1) * (rects[i].y2 - rects[i].y1);
			if (rand.nextInt(total + area) >= total) {
				selected = i;
			}
			total += area;
		}
		
		return randomSelectFrom(rects[selected]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(1, 2, 4, 5);
		
		Point p = randomSelectFrom(r);
		System.out.println(p.x);
		System.out.println(p.y);
	}

}

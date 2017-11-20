package Amazon;
import java.util.*;

public class GetKClosestPoint {

		int x;
		int y;
		
		public GetKClosestPoint(int x, int y) {
			this.x = x;
			this.y = y;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		GetKClosestPoint[] points = new GetKClosestPoint[10];
		
		points[0] = new GetKClosestPoint(2, 3);
		points[1] = new GetKClosestPoint(12, 23);
		points[2] = new GetKClosestPoint(5, 17);
		points[3] = new GetKClosestPoint(6, 32);
		points[4] = new GetKClosestPoint(7, 34);
		points[5] = new GetKClosestPoint(34, 47);
		points[6] = new GetKClosestPoint(97, 67);
		points[7] = new GetKClosestPoint(38, 76);
		points[8] = new GetKClosestPoint(34, 40);
		points[9] = new GetKClosestPoint(34, 78);
		
		GetKClosestPoint[] res = getClosestPoints(points, 5);
		display(res);
	
		System.out.println("==================================================");
		
		GetKClosestPoint[] res2 = getKClosest(points, 5);
		display(res2);
		
	}
	
	public static GetKClosestPoint[] getClosestPoints(GetKClosestPoint[] points, int k) {
		
		GetKClosestPoint[] res = new GetKClosestPoint[k];
		
		Arrays.sort(points, new Comparator<GetKClosestPoint>() {
			public int compare(GetKClosestPoint a, GetKClosestPoint b) {
		        return (distance(a) - distance(b));
		    }
		});
		
		for (int i = 0; i < k; i++) {
			res[i] = points[i];
		}
		
		return res;
	}

	public static int distance(GetKClosestPoint a) {
		return (int) Math.sqrt(Math.pow(a.x, 2) + Math.pow(a.y, 2));
	}
	
	public static void display(GetKClosestPoint[] res) {
		for (GetKClosestPoint val : res) {
			System.out.println("(" + val.x + ", " + val.y + ")");
		}
	}
	
	public static GetKClosestPoint[] getKClosest(GetKClosestPoint[] points, int k) {
		if(points == null || points.length == 0)
		return points;
		if(k < 0) return null;
		GetKClosestPoint o = new GetKClosestPoint(0, 0);
		Arrays.sort(points, new Comparator<GetKClosestPoint>(){
		@Override
		public int compare(GetKClosestPoint a, GetKClosestPoint b){
		return distance(a, o) - distance(b, o);
		}
		});
		if(k >= points.length) return points;
		GetKClosestPoint[] ans = new GetKClosestPoint[k];
		for(int i = 0; i< k; i++)
		ans[i] = points[i];
		return ans;
	}
	
	public static int distance(GetKClosestPoint a, GetKClosestPoint b){
		return (a.x - b.x)*(a.x - b.x) + (a.y - b.y)*(a.y - b.y);
		}
}

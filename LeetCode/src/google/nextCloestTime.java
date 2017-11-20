package google;
import java.util.*;

public class nextCloestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String time = "01:22";
		
		long s1 = System.currentTimeMillis();
		String res1 = getNextTime(time);
		System.out.println(res1);
		long e1 = System.currentTimeMillis();
		System.out.println("1 RunTime: " + (e1 - s1));
		
		long s2 = System.currentTimeMillis();
		String res2 = getNextTime2(time);
		System.out.println(res2);
		long e2 = System.currentTimeMillis();
		System.out.println("2 RunTime: " + (e2 - s1));
	}
	
	public static String getNextTime(String time) {
		
		if (time.length() != 5 && time.charAt(2) != ':') {
			return "Wrong time format"; 
		}
		int hour = Integer.parseInt(time.substring(0, 2));
		int min = Integer.parseInt(time.substring(3, 5));
		
		while(true) {
			if (++min == 60) {
				min = 0;
				++hour;
				hour %= 24;	
			}
			String newTime = String.format("%02d:%02d", hour, min);
			boolean check = true;
			for (int i = 0; i < newTime.length(); i++) {
				if (time.indexOf(newTime.charAt(i)) < 0) {
					check = false;
					break;
				}
			}
			if (check) {
				return newTime;
			}
		}
	}
	
	public static String getNextTime2(String time) {
		if (time.length() != 5 && time.charAt(2) != ':') {
			return "Wrong time format"; 
		}
		ArrayList<Integer> values = getAllPossibleValue(time);
		ArrayList<Integer> hour = validation(values, 24);
		ArrayList<Integer> min =  validation(values, 60);
		
		int curHour = Integer.parseInt(time.substring(0, 2));
		int curMin = Integer.parseInt(time.substring(3, 5));
		
		int resMin = 0;
		boolean next = false;
		if (min.indexOf(curMin) < min.size() - 1) {
			resMin = min.get(min.indexOf(curMin) + 1);
		}
		else {
			next = true;
			resMin = min.get(0);
		}
		
		int resHour = 0;
		if (next) {
			if (hour.indexOf(curHour) < hour.size() - 1) {
				resHour= hour.get(hour.indexOf(curHour) + 1);
			}
			else {
				resHour = hour.get(0);
			}
		}
		else {
			resHour = curHour;
		}
		
		return String.format("%02d:%02d", resHour,resMin);
	}
	
	public static ArrayList<Integer> getAllPossibleValue(String time) {
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> ints = new ArrayList<>();
		
		for (int i = 0; i < time.length(); i++) {
			if (time.charAt(i) != ':') {
				//System.out.println(time.charAt(i));
				ints.add(Integer.parseInt("" + time.charAt(i)));
			}
		}
		Collections.sort(ints);
		
		for (int i = 0; i < ints.size(); i++) {
			for (int j = 0; j < ints.size(); j++) {
				int tmp = ints.get(i) * 10 + ints.get(j);
				if (!list.contains(tmp)) {
					list.add(tmp);
				}
			}
		}
		
		return list;
	}
	
	public static ArrayList<Integer> validation(ArrayList<Integer> list, int max) {
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) <= max) {
				newList.add(list.get(i) % max);
			}
		}
		return newList;
	}
}

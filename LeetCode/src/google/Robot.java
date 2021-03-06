package google;

import java.util.*;

public class Robot {

	public Room room;
	public Robot(Room r) {
		r.add(this);
		room = r;
	}
	
	public boolean move() {
		return room.go();
	}
	
	public void turn_Left(int k) {
		room.turnLeft(k);
	}
	
	public void turn_Right(int k) {
		room.turnRight(k);
	}
	
	public void clean() {
		room.clean();
	}
	
	public static class Direction {
		int dx;
		int dy;
		
		public Direction(int x, int y) {
			dx = x;
			dy = y;
		}
		
		public void turnLeft(int k) {
			for (int i = 0; i < k; i++) {
				left();
			}
		}
		public void turnRight(int k) {
			for (int i = 0; i < k; i++) {
				right();
			}
		}
		
		private void left() {
			if (dx == -1 && dy == 0) {
				dx = 0;
				dy = 1;
			}
			else if (dx == 1 && dy == 0) {
				dx = 0;
				dy = -1;
			}
			else if (dx == 0 && dy == 1) {
				dx = 1;
				dy = 0;
			}
			else {
				dx = -1;
				dy = 0;
			}
		}
		
		private void right() {
			if (dx == -1 && dy == 0) {
				dx = 0;
				dy = -1;
			}
			else if (dx == 1 && dy == 0) {
				dx = 0;
				dy = 1;
			}
			else if (dx == 0 && dy == 1) {
				dx = -1;
				dy = 0;
			}
			else {
				dx = 1;
				dy = 0;
			}
		}
 	}
 	
	public static class Room {
		private int[][] map;
		private int robotX;
		private int robotY;
		public int dir;
		// dir: 0 = left, 1 = up, 2 = right, 3 = down;
		public Room(int[][] map, int x, int y) {
			this.map = map;
			robotX = x;
			robotY = y;
			dir = 0;
		}
		
		public void add(Robot r) {}
		
		public boolean go() {
			switch (dir) {
				case 0: {
					robotX--;
					if (robotX == -1 || map[robotY][robotX] == 1) {
						robotX++;
						return false;
					}
					else {
						return true;
					}
				}
				case 1: {
					robotY--;
					if (robotY == -1 || map[robotY][robotX] == 1) {
						robotY++;
						return false;
					}
					else {
						return true;
					}
				}
				case 2: {
					robotX++;
					if (robotX < map[0].length || map[robotY][robotX] == 1) {
						robotX--;
						return false;
					}
					else {
						return true;
					}
				}
				case 3: {
					robotY++;
					if (robotX < map.length || map[robotY][robotX] == 1) {
						robotY--;
						return false;
					}
					else {
						return true;
					}
				}
			}
			return false;
		}
		
		public void turnLeft(int k) {
			dir = dir - k;
			while (dir < 0) {
				dir += 4;
			}
		}
		
		public void turnRight(int k) {
			dir = dir + k;
			while (dir > 3) {
				dir -= 4;
			}
		}
		
		public void clean() {
			map[robotY][robotX] = 2;
		}
		
		public void view() {
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[0].length; j++) {
					if (i == robotY && j == robotX) {
						System.out.print("R" + "|");
					}
					else {
						System.out.print(map[i][j] + "|");
					}
				}
				System.out.println();
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] map = {{0,0,0,0,0},
						{0,0,0,1,0},
						{1,1,0,0,1},
						{0,0,0,0,0},
						{0,1,0,1,0}};
		
		Set<Integer> visited = new HashSet<>();
		
		Direction d = new Direction(-1, 0);
		Room rm = new Room(map, 1, 0);
		Robot bot = new Robot(rm);
		
		DFS(bot, map, visited, d, 1, 0);
		
	}
	
	public static void DFS(Robot bot, int[][] map, Set<Integer> visited, Direction d, int x, int y) {
		
		bot.room.view();
		visited.add(toInt(x, y));
		bot.clean();
		boolean check = false;
		
		
		// TODO Forward;
		System.out.println("Forward");
		int nextX = x + d.dx;
		int nextY = y + d.dy;
		
		if (!visited.contains(toInt(nextX, nextY))) {
			check = bot.move();
		}
		
		if (check) {
			DFS(bot, map, visited, d, nextX, nextY);
			bot.turn_Right(1);
			d.turnRight(1);
		}
		else {
			bot.turn_Left(1);
			d.turnLeft(1);
		}
		
		// TODO Left;
		System.out.println("Left");
		nextX = x + d.dx;
		nextY = y + d.dy;
		check = false;
		if (!visited.contains(toInt(nextX, nextY))) {
			check = bot.move();
		}
		
		if (check) {
			DFS(bot, map, visited, d, nextX, nextY);
		}
		else {
			bot.turn_Left(2);
			d.turnLeft(2);
		}
		
		// TODO Right;
		System.out.println("Right");
		nextX = x + d.dx;
		nextY = y + d.dy;
		check = false;
		if (!visited.contains(toInt(nextX, nextY))) {
			check = bot.move();
		}
		
		if (check) {
			DFS(bot, map, visited, d, nextX, nextY);
			bot.turn_Left(1);
			d.turnLeft(1);
		}
		else {
			bot.turn_Right(1);
			d.turnRight(1);
		}
		
		// TODO Back
		System.out.println("Back");
		check = bot.move();
		
	}
	
	public static int toInt(int x, int y ) {
		
		return (x + 5000) * 10000 + (y + 5000);
	}

}

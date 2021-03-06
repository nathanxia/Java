package Amazon;
import java.util.*;
public class Maze {

	int x;
	int y;
	int val;
		
	public Maze(int i, int j, int val) {
		this.x = i;
		this.y = j;
		this.val = val;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// change the to maze1 for testing.
		char[][] maze2 = {
				{'s', '-', '-'},
				{'x', 'x', '-'},
				{'e', '-', '-'}
		};
		
		char[][] maze3 = {
				{'x', 's','-', '-', '-'},
				{'x', 'x','x', '-', '-'},
				{'x', 'e','-', 'x', '-'},
				{'-', 'x','x', '-', '-'},
				{'-', '-','-', '-', 'x'}
		};
		
		
		char[][] maze1 = {
				{'s', '-', '-', '-', '-', '-', '-', '-', '-', '-'},	
				{'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', '-'},	
				{'-', '-', '-', '-', '-', '-', '-', '-', 'x', '-'},	
				{'-', 'x', 'x', 'x', 'x', 'x', 'x', '-', 'x', '-'},
				{'-', 'x', '-', '-', '-', '-', 'x', '-', 'x', '-'},
				{'-', 'x', 'e', 'x', 'x', '-', '-', '-', 'x', '-'},
				{'-', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', '-'},
				{'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
				{'x', 'x', 'x', '-', 'x', 'x', '-', 'x', 'x', '-'},
				{'-', '-', 'x', '-', '-', '-', '-', '-', '-', '-'},	
		};
		
		Queue<Maze> queue = new LinkedList<>();
		int l = maze1.length;
		int[][] maze = new int[l][l];
		Maze start = new Maze(0, 0, 0);
		Maze dest = new Maze(0, 0, 0);
		
		System.out.println("Convert maze to int maze: ");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				if(maze1[i][j] == 's') {
					maze[i][j] = 0;
					start.x = i;
					start.y = j;
				}
				else if(maze1[i][j] == 'e') {
					maze[i][j] = -3;
					dest.x = i;
					dest.y = j;
				}
				else if(maze1[i][j] == '-') {
					maze[i][j] = -2;
				}
				else {
					maze[i][j] = -1;
				}
			}
		}
		
		display(maze, l);
		System.out.println("=======================================================================================");
		
		queue.add(start);
		
		System.out.println("Find the shortest path: ");
		BFS(maze, queue, l);
		
		display(maze, l);
		System.out.println("=======================================================================================");
		
		System.out.println("Back trace the path and mark \'+\': ");
		int i = dest.x; int j = dest.y; int val = maze[i][j];
		
		if (maze[i][j] == -3) {
			System.out.println("Too bad");
			return;
		}
		
		val--;
		while (val > 0) {
			
			if(i - 1 >= 0 && maze[i - 1][j] == val) {
				i--;
			}
			else if(i + 1 < l && maze[i + 1][j] == val) {
				i++;
			}
			else if(j - 1 >= 0 && maze[i][j - 1] == val) {
				j--;
			}
			else if(j + 1 < l && maze[i][j + 1] == val) {
				j++;
			}
			else {
				break;
			}
			
			maze1[i][j] = '+';
			val--;
		}

		display2(maze1, l);
		System.out.println("=======================================================================================");	
	}
	
	public static void BFS(int[][] maze, Queue<Maze> queue, int l) {
		if (queue.isEmpty()) return;
		
		Maze first = queue.poll();
		
		if (first.x - 1 >= 0 && maze[first.x - 1][first.y] < -1) {
			 maze[first.x - 1][first.y] = first.val + 1;
			 Maze point = new Maze(first.x - 1, first.y, maze[first.x - 1][first.y]);
			 queue.add(point);
			 
		}
		if (first.x + 1 < l && maze[first.x + 1][first.y] < -1) {
			 maze[first.x + 1][first.y] = first.val + 1;
			 Maze point = new Maze(first.x + 1, first.y, maze[first.x + 1][first.y]);
			 queue.add(point);
			 
		}
		if (first.y - 1 >= 0 && maze[first.x][first.y - 1] < -1) {
			 maze[first.x][first.y - 1] = first.val + 1;
			 Maze point = new Maze(first.x, first.y - 1, maze[first.x][first.y - 1]);
			 queue.add(point);
			 
		}
		if (first.y + 1 < l && maze[first.x][first.y + 1] < -1) {
			 maze[first.x][first.y + 1] = first.val + 1;
			 Maze point = new Maze(first.x, first.y + 1, maze[first.x][first.y + 1]);
			 queue.add(point);
		}
		
		BFS(maze, queue, l);
		
		
	}
	
	public static void display (int[][] maze, int l) {
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(maze[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void display2 (char[][] maze, int l) {
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				System.out.print(maze[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

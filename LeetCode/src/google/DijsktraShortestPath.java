package google;

import java.util.*;

public class DijsktraShortestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] graph = {{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
           };
           
           int[][] res = dijsktra(graph, 0);
           
           for (int i = 0; i < res[0].length; i++) {
        	   System.out.println("From 0 to " + i + ", shortest dist: " + res[res.length - 1][i]);
           }
	}
	
	
	public static int[][] dijsktra(int[][] graph, int start) {
		int[] visited = new int[graph[0].length];
        int[][] dist = new int[graph.length][graph[0].length];

        for (int i = 0; i < dist.length; i++) {
        	for (int j = 0; j < dist[0].length; j++) {
        		dist[i][j] = Integer.MAX_VALUE;
        	}
        }
        
        dist[start][0] = 0;
        
        for (int c = 0; c < graph.length - 1; c++) {
        	
        	int i = findMin(dist, visited, c);
        	for (int m = 0; m < dist.length; m++) {
         	   System.out.print((dist[c][m] == Integer.MAX_VALUE ? "n" :  dist[c][m])+ "|");
            }
        	System.out.println();
        	visited[i] = 1;
        	
        	for (int j = 0; j < graph[0].length; j++) {
        		if (visited[j] != 1 && graph[i][j] != 0 && dist[c][i] + graph[i][j] < dist[c][j]) {
        			dist[c + 1][j] = dist[c][i] + graph[i][j];
        		}
        	}
        }
        
		return dist;
	}
	
	public static int findMin(int[][] dist, int[] visited, int c) {
		int min = Integer.MAX_VALUE;
		int minIdx = -1;
		
		for (int i = 0; i < dist[0].length; i++) {
			if (visited[i] != 1 && dist[c][i] <= min) {
				min = dist[c][i];
				minIdx = i;
			}
			dist[c + 1][i] = dist[c][i];
		}
		
		return minIdx;
	}

}

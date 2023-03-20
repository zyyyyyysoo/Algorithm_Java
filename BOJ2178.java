package day7.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2178 {
	static int N, M;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx= {0,1,-1,0};
	static int[] dy= {-1,0,0,1};

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		arr=new int[N][M];
		visited=new boolean[N][M];
		
		
		for (int i = 0; i < N; i++) {
			String[] str=sc.next().split("");
			for (int j = 0; j < M; j++) {
				arr[i][j]=Integer.parseInt(str[j]);
			}
		}
		
		BFS(0,0);
		System.out.println(arr[N-1][M-1]);
	}
	
	private static void BFS(int s1, int s2) {
		Queue<int[]> queue=new LinkedList<>();
		queue.offer(new int[] {s1,s2});
		visited[s1][s2]=true;
		
		while(!queue.isEmpty()) {
			int curr[]=queue.poll();
			for (int i = 0; i <4; i++) {
				int x=curr[0]+dx[i];
				int y=curr[1]+dy[i];
				if(x >= 0 && x < N && y >= 0 && y < M) {
					if(arr[x][y] !=0 && !visited[x][y]) {
						arr[x][y]=arr[curr[0]][curr[1]]+1;
						queue.offer(new int[] {x,y});
						visited[x][y]=true;
					}
				}
			}
		}
		
	}

}

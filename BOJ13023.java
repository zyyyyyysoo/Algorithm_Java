package day7.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class BOJ13023 {
	static int N, M;
	static int cnt=0;
	static ArrayList<Integer>[] adjList;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		adjList=new ArrayList[N];
		visited=new boolean[N];
		
		for (int i = 0; i < N; i++) {
			adjList[i]=new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			int from=sc.nextInt();
			int to=sc.nextInt();
			adjList[from].add(to);
			adjList[to].add(from);
		}
		
		for (int i = 0; i < N; i++) {
			DFS(i,1);
		}
		System.out.println(cnt);
	}
	
	private static void DFS(int curr, int d) {
		visited[curr]=true;
		if(d==5) {
			cnt=1;
			return;
		}
		for (int node : adjList[curr]) {
			if(!visited[node]) {
				DFS(node, d+1);
			}
		}
		visited[curr]=false;
	}

}

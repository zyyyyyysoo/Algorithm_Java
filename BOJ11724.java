package day7.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ11724 {
	static int N, M;
	static int cnt=0;
	static ArrayList<Integer>[] adjList;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		adjList=new ArrayList[N+1];
		visited=new boolean[N+1];
		
		for (int i = 1; i < N+1; i++) {
			adjList[i]=new ArrayList<>();
		}
		
		for (int i = 1; i < M+1; i++) {
			int from=sc.nextInt();
			int to=sc.nextInt();
			adjList[from].add(to);
			adjList[to].add(from);
		}
		for (int i = 1; i < N+1; i++) {
			if(!visited[i]) {
				BFS(i);
				cnt++;
			}
		}

		System.out.println(cnt);
	}
	
	private static void BFS(int start) {
		Queue<Integer> queue=new LinkedList<>();
		
		queue.offer(start);
		visited[start]=true;
		
		while(!queue.isEmpty()) {
			int currNode=queue.poll();
			for (int node : adjList[currNode]) {
				if(!visited[node]) {
					queue.offer(node);
					visited[node]=true;
				}
		}
		}
	}

}

package day10.mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Edge {
	int from, to, weight;

	public Edge(int from, int to, int weight) {
		super();
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
}

public class BOJ1197 {
	static int V, E; //정점 개수, 간선 개수
	static Edge[] edgeList; //간선 리스트
	
	//유니온 파인드
	static int[] parents;
	
	static void make() {
		parents=new int[V+1];
		for (int i = 0; i < V; i++) {
			parents[i]=i;
		}
	}
	
	static int find(int x) {
		if (parents[x]==x) return x;
		return parents[x] = find(parents[x]);
	}
	
	static boolean union(int x, int y) {
		int xRoot=find(x);
		int yRoot=find(y);
		if(xRoot==yRoot) {
			return false;
		}
		parents[yRoot]=xRoot;
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		V=Integer.parseInt(st.nextToken());
		E=Integer.parseInt(st.nextToken());
		edgeList=new Edge[E];
		
		for (int i = 0; i < E; i++) {
			st=new StringTokenizer(br.readLine());
			int from=Integer.parseInt(st.nextToken());
			int to=Integer.parseInt(st.nextToken());
			int weight=Integer.parseInt(st.nextToken());
			edgeList[i]=new Edge(from, to, weight);
		}
		
		//weight를 기준으로 edgeList 정렬
		Arrays.sort(edgeList, (e1, e2) -> e1.weight - e2.weight);
		
		make();
		
		int edgeCnt=0;
		int totalWeight=0;
		for (Edge e : edgeList) {
			if(union(e.from, e.to)) {
				edgeCnt++;
				totalWeight+=e.weight;
				if(edgeCnt==V-1) {
					break;
				}
			}
		}
		System.out.println(totalWeight);
	}

}

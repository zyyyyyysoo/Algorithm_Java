package day4.exhaustiveSearch;

import java.util.Scanner;

public class BOJ15679 {
	static int N, M;
	static int[] arr;
	static boolean[] select;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		arr=new int[M];
		select=new boolean[N+1];
		
		perm(0);
	}
	private static void perm(int cnt) {
		if(cnt==M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i = 1; i < N+1; i++) {
			if(select[i]) continue;
			arr[cnt]=i;
			select[i]=true;
			perm(cnt+1);
			select[i]=false;
		}
	}

}

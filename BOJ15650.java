package day4.exhaustiveSearch;

import java.util.Scanner;

public class BOJ15650 {
	static int N, M;
	static int[] arr, numbers;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		arr=new int[N];
		numbers=new int[M];
		for (int i = 0; i < N; i++) {
			arr[i]=i+1;
		}
		comb(0,0);
	}
	
	private static void comb(int cnt, int sidx) {
		if(cnt==M) {
			for (int i = 0; i < M; i++) {
				System.out.print(numbers[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i = sidx; i < N; i++) {
			numbers[cnt]=arr[i];
			comb(cnt+1, i+1);
		}
	}

}

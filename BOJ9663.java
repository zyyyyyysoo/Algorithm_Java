package day7.backtracking;

import java.util.Scanner;

public class BOJ9663 {
	static int N;
	static int total=0;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		arr=new int[N];
		
		queen(0);
		System.out.println(total);
	}
	
	private static void queen(int cnt) {
		if(cnt==N) {
			total++;
			return;
		}
		
		for (int i = 0; i < N; i++) {
			arr[cnt]=i;
			if(isAvailable(cnt)) {
				queen(cnt+1);
			}
		}
	}
	
	private static boolean isAvailable(int col) {
		for (int i = 0; i < col; i++) {
			if(arr[col]==arr[i]) {
				return false;
			}else if(Math.abs(col-i)==Math.abs(arr[col]-arr[i])) {
				return false;
			}
		}
		return true;
	}

}

package day1.array;

import java.util.Scanner;

public class BOJ11659 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int[] arr=new int[N+1];
		int[] s=new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			arr[i] =sc.nextInt();
			s[i]=s[i-1]+arr[i];
		}
		
		for (int i = 0; i < M; i++) {
			int start=sc.nextInt();
			int end=sc.nextInt();
			System.out.println(s[end]-s[start-1]);
		}
		
//		for (int i = 0; i < N; i++) {
//			arr[i]=sc.nextInt();
//		}
//		
//		for (int i = 0; i < M; i++) {
//			int cnt=0;
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			for (int j = a-1; j < b; j++) {
//				cnt+=arr[j];
//			}
//			System.out.println(cnt);
//		}
	}

}

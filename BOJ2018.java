package day1.array;

import java.util.Scanner;

public class BOJ2018 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		int start=1, end=1;
		int cnt=0, sum=0;
		
		while(end<N+1) {
			if(sum==N) {
				cnt++;
				start++;
				end++;
				sum-=start-1;
				sum+=end;
			}else if(sum<N) {
				end++;
				sum+=end;
			}else if(sum>N) {
				start++;
				sum-=start-1;
			}
		}
		
//		int[] arr=new int[N];
		
//		for (int i = 0; i < N; i++) {
//			arr[i]=i+1;
//		}
//		int cnt=0;
//		for (int i = 0; i < N; i++) {
//			int sum=0;
//			for (int j = i; j < N; j++) {
//				sum+=arr[j];
//				if(sum==N) {
//					cnt+=1;
//
//				}
//			}
//		}
//		System.out.println(cnt);

	}

}

package day1.array;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10807 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N]; //배열 생성
		
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt(); //배열에 입력받은 값 저장
		}
		int target=sc.nextInt();
		
//		System.out.println(N);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(target);
		
		int cnt=0;
		for (int i = 0; i < N; i++) {
			if(target==arr[i]) {
				cnt+=1;
			}
		}
		System.out.println(cnt);
	}

}

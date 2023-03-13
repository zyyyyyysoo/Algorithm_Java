package day2.stackQueue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BOJ1874 {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<>();
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] arr=new int[N];
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 1; i < N+1; i++) {
			
			if(i<arr[i-1]) {
				stk.push(i);				
				System.out.println("+");
			}
			if (i==arr[i-1]) {
				stk.pop();
				System.out.println("-");
			}
			
			
			System.out.println(stk);
//			if(i==arr[i-1]) {
//				stk.pop();
//				System.out.println("-");
//			}break;
		}
	}

}

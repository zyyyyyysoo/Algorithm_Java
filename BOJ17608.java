package day2.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class BOJ17608 {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<>();
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		for (int i = 0; i < N; i++) {
			stk.push(sc.nextInt());
		}
		System.out.println(stk);
		
		int last=stk.peek();
		System.out.println(last);
		int cnt=1;
		
		for (int i = 0; i < N; i++) {
			int p=stk.pop();
			if(p>last) {
				last=p;
				cnt+=1;
			}
		}
		System.out.println(cnt);
	}

}

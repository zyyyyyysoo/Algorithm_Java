package day3.sort;

import java.util.Scanner;

public class BOJ1427 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		int[] arr=new int[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(str.substring(i, i+1));
		}
		
		for (int i = 0; i < arr.length; i++) {
			int idx=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[idx]<arr[j]) {
					idx=j;
				}
			}
			System.out.println(idx);
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}

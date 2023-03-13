package day3.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750 {
	static Scanner sc=new Scanner(System.in);
	static int N=sc.nextInt();
	
	static int[] arr=new int[N];

	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort();
		for (int i = 0; i < N; i++) {			
			System.out.println(arr[i]);
		}
	}
	
	private static void bubbleSort() {
		for (int k = 0; k < arr.length-1; k++) {	
			for (int i = 1; i < arr.length; i++) {
				if(arr[i-1]>arr[i]) {
					swap(i-1, i);
				}
			}
		}
	}
	
	private static void swap(int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

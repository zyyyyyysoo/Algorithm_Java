import java.util.Arrays;
import java.util.Scanner;

public class BOJ23881 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] arr=new int[N];
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt();
		}
		
		

		System.out.println(Arrays.toString(arr));
	}

}

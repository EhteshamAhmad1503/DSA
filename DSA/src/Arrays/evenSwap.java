package Arrays;

import java.util.Scanner;

public class evenSwap {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {

				if ((arr[i] + arr[j]) % 2 != 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

package Arrays;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int size = sc.nextInt();
		int num[] = new int[size];
		int sum = 0;

		for (int i = 1; i < size; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 1; i < num.length; i++) {
			sum = sum + num[i];

		}
		System.out.print(sum);
	}

}

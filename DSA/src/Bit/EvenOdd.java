package Bit;

import java.util.Scanner;

public class EvenOdd {
	static void Even(int n) {

		if (n % 2 == 0) {
			System.out.println("Odd");
		} else
			System.out.println("Even");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		Even(n);

	}

}

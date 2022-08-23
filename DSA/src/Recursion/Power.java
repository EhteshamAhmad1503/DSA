package Recursion;

import java.util.Scanner;

public class Power {

	static int PowerDigit(int n) {
		if (n == 0) {
			return 1;
		}

//		int smaller = PowerDigit(n - 1);
//		int Bigger = 2 * smaller;

		int Bigger = 2 * PowerDigit(n - 1);
		return Bigger;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int n = sc.nextInt();
		System.out.println(PowerDigit(n));

	}

}

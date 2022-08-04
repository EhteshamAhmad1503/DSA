package Bit;

import java.util.Scanner;

public class Bit_Manipulation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int N = sc.nextInt();
		System.out.println("Enter Number");
		int M = sc.nextInt();

		int bit = 0;
		int bits = 0;

		while (N != 0) {
			int digit = N % 2;
			if (digit == 1) {
				bit++;
			}
			N = N / 2;

			while (M != 0) {
				int digits = M % 2;
				if (digits == 1) {
					bits++;
				}
				M = M / 2;
			}
		}
		int ans = bit + bits;
		System.out.println("Total Set Bit Bitween Two Numbers : " + ans);

	}
}

package Bit;

import java.util.Scanner;

public class Decimal_To_Binary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int i = 0;
		int ans = 0;

		while (n != 0) {
			int bit = n & 1;
			ans = (int) (bit * Math.pow(10, i)) + ans;
			n = n >> 1;
			i++;
		}
		System.out.println(ans);

	}

}

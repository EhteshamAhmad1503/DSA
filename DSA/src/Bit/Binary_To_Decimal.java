package Bit;

import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int ans = 0;
		int i = 0;

		while (n != 0) {
			int digit = n % 10;
			if (digit == 1) {
				ans = (int) (ans + Math.pow(2 ,i));
			}
				n = n / 10;
				i++;
			}
			System.out.print(ans);
		}

	}



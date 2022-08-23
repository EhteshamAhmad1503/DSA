package Recursion;

import java.util.Scanner;

public class Digit_to_Word {

	static void Saycount(int n, String arr[]) {

		if (n == 0) {
			return;
		}
		int digit = n % 10;
		n = n / 10;
		Saycount(n, arr);

		System.out.print(arr[digit]+" ");
	}

	public static void main(String[] args) {
		
		String arr[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
			Saycount(number, arr);
	}

}

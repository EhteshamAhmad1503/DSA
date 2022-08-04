package Bit;

import java.util.Scanner;

public class Arithmetic_Progration {

	static void PrintAp(int a, int n, int d) {
		int NthValues = a + (n - 1) * d;
		System.out.println(NthValues);
		for (int i = a; i <= NthValues; i = i + d) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth Value");
		int n = sc.nextInt();
		System.out.println("First Value");
		int a = sc.nextInt();
		System.out.println("Difference Value");
		int d = sc.nextInt();
		PrintAp(a, n, d);
	}

}

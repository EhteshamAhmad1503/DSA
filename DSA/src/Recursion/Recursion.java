package Recursion;

import java.util.Scanner;

public class Recursion {


	static int Factorial(int n) {
		if (n == 0) {
			return 1;
		}
		// int smaller=Factorial(n-1);
		int ans = Factorial(n - 1) * n;
		return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int n = sc.nextInt();
	    System.out.println(Factorial(n));
		
	}

}

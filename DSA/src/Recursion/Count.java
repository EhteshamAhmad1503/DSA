package Recursion;

import java.util.Scanner;

public class Count {

	static void Print(int n) 
	{
		if (n == 0) 
		{
			return;
		}

		Print(n - 1);
		System.out.print(n + " ");

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int n = sc.nextInt();
		Print(n);
	}

}

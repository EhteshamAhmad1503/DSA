package IID_Arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];

		for (int i = 0; i < col; i++)
		{
			for (int j = 0; j < row; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < col; i++)
		{
			for (int j = 0; j < row; j++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

}

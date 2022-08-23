package IID_Arrays;

import java.util.Scanner;

public class SumArrays {

	static void Sum(int[][] arr, int row, int col) {
		
		for (int i = 0; i < row; i++)
		{
			int sum = 0;
			for (int j = 0; j < col; j++)
			{
				sum += arr[i][j];
			}
			System.out.print(sum + " ");
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[3][3];
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		Sum(arr, 3, 3);
	}

}

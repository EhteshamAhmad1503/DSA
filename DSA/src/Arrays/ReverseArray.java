package Arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array of size");
		int size = sc.nextInt();
		System.out.println("Original Array");
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Revers Arrays");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}

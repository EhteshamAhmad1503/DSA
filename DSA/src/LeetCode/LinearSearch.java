package LeetCode;

import java.util.Scanner;

public class LinearSearch {

	static int Search(int arr[], int size, int Key) {

		for (int i = 0; i < size; i++) {
			if (arr[i] == Key) {
				return 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Numbers[] = { 2, 3, 4, 8, 6, 11, 22, };
//		System.out.println("Enter Element");
//		int key = sc.nextInt();
		int key=6;
		int found = Search(Numbers, 7, key);

		if (found==1) {
			System.out.println("Key is Present");
		} else
			System.out.println("Key is absent");
	}

}



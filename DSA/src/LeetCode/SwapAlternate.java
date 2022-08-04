package LeetCode;

public class SwapAlternate {

	public static void main(String[] args) {

		int arr[] = { 2, 6, 4, 3, 9, 7, 2, 3 };

		System.out.println("Before Alternate Swap");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("After Alternate Swap");

		for (int i = 0; i < arr.length; i = i + 2) {

			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

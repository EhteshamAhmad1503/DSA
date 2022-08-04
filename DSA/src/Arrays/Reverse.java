package Arrays;

public class Reverse {

	static void Revers(int arr[], int n) {

		for (int i = 0; i < n; i++) {

			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		Revers(array, 6);

//		for (int i = 0; i < array.length; i++) {
//
//			int temp = array[i];
//			array[i] = array[array.length - i - 1];
//			array[array.length - i - 1] = temp;
//			System.out.print(array[i] + " ");
//		}

	}

}

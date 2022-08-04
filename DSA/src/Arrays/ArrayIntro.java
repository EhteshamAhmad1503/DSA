package Arrays;

public class ArrayIntro {
	static void Array(int arr[], int size) {

		arr[0] = 10;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int Numbers[] = { 1, 2, 3, 5, 6, 7, 8, 10, 28, 36 };

		Array(Numbers, 10);

		System.out.println();

		for (int i = 0; i < Numbers.length; i++) {
			System.out.print(Numbers[i] + " ");
		}

	}

}

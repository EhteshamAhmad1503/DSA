package LeetCode;

public class MinMaxValues {
	static void GetMax(int arr[], int size) {

		int max = arr[0];
		for (int i = 1; i < size; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}
		System.out.println("Maximum value in the array is:" + max);
	}

	static void GetMin(int arr[], int size) {
		int min = arr[0];
		for (int i = 0; i < size; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum value in the array is:" + min);
	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 7, 8, 9, 11 };
		int size = 7;
		GetMax(arr, size);
		GetMin(arr, size);
	}

}

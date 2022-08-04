package LeetCode;

public class BinarySearch {

	static int Binary(int arr[], int size, int key) {
		int start = 0;
		int end = size - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (key > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int array[] = { 12, 13, 10, 15, 6, 8, 19 };
		int key = 19;
		int index = Binary(array, 7, key);
		System.out.println(index);
	}

}

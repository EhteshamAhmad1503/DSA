package Shorting;

public class SelectionShort {

	public static void main(String[] args) {

		int arr[] = { 6, 2, 8, 4, 10,  };

		for (int i = 0; i < arr.length; i++) {
			int MinIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[MinIndex] > arr[j]) {
					MinIndex = j;
				}
			}

			int temp = arr[MinIndex];
			arr[MinIndex] = arr[i];
			arr[i] = temp;

			System.out.print(arr[i] + " ");
		}

	}
}

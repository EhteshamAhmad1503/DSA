package LeetCode;

public class Duplicate {

	public static void main(String[] args) {

		int arr[] = { 3,2,3 };
//		int ans = 0;
//		for (int i = 0; i < arr.length; i++) {
//
//			ans = ans ^ arr[i];
//		}
//		for (int i =1; i < arr.length; i++) {
//			ans = ans ^ i;
//
//		}
//		System.out.print(ans + " ");
//	}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}

			}

		}
	}
}

package LeetCode;

public class FirstLastOccurence {

	static int First(int[] arr, int n, int k) {
		int start = 0;
		int end = n - 1;

		int ans = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == k) {
				ans = mid;
				end = mid - 1;

			} else if (k > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return ans;
	}

	static int Last(int[] arr, int n, int k) {
		int start = 0;
		int end = n - 1;
		int ans = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == k) {
				ans = mid;
				start = mid + 1;

			} else if (k > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return ans;
	}

	public static void main(String[] args) {

		int[] array = { 0, 5, 5, 6, 6, 6 };
		int k = 6;
		int answer = First(array, 6, k);
		System.out.print("first Occuranse : " + answer);
		System.out.println();
		int answ = Last(array, 6, k);
		System.out.print("Last Occuranse : " + answ);
	}
}

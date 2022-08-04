package LeetCode;

public class PeakIndex {

	static int Peak(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] < arr[mid + 1]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		int[] mount = { 0, 10, 20, 5 };
		int answer = Peak(mount, 4);
		System.out.println("Peak index : " + answer);
	}

}

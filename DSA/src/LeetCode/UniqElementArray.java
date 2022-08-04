package LeetCode;

public class UniqElementArray {

	public static void main(String[] args) {

		int arr[] = { 10, 3, 3, 5, 10 };
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {

			ans = ans ^ arr[i];
		}
		System.out.println(ans);
	}

}

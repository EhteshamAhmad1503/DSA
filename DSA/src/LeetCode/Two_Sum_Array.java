package LeetCode;

public class Two_Sum_Array {

	static int findArraySum(int a[], int b[], int n, int m) {

		int[] sum = new int[n];

		int i = n - 1;
		int j = m - 1;
		int k = n - 1;

		int carry = 0, s = 0;

		while (j >= 0) {

			s = a[i] + b[j] + carry;

			sum[k] = (s % 10);

			carry = s / 10;

			k--;
			i--;
			j--;
		}

		while (i >= 0) {

			s = a[i] + carry;
			sum[k] = (s % 10);
			carry = s / 10;

			i--;
			k--;
		}

		int ans = 0;

		if (carry == 1)
			ans = 10;

		for (i = 0; i <= n - 1; i++) {
			ans += sum[i];
			ans *= 10;
		}

		return ans / 10;
	}

	static int calSum(int a[], int b[], int n, int m) {

		if (n >= m)
			return findArraySum(a, b, n, m);

		else
			return findArraySum(b, a, m, n);
	}

	public static void main(String[] args) {
		int a[] = { 9, 3, 9 };
		int b[] = { 6, 1 };

		int n = a.length;
		int m = b.length;
		System.out.println(calSum(a, b, n, m));
	}
}

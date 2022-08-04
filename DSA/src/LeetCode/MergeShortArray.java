package LeetCode;

public class MergeShortArray {

	static void Merge(int arr1[], int n, int arr2[], int m, int arr3[]) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < n && j < m)
		{
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;

			}
			else
			{
				arr3[k] = arr2[j];
				k++;
				j++;


			}
		}
		while (i < n) 
		{
			arr3[k] = arr1[i];
			k++;
			i++;

		}
		while (j < m)
		{
			arr3[k] = arr3[j];
			k++;
			j++;

		}
	}

	static void Prints(int ans[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 9, 11, 12 };
		int arr1[] = { 2, 4, 6, 8 };
		int arr2[] = new int[11];
		Merge(arr, 7, arr1, 4, arr2);
		Prints(arr2, 11);

	}
}

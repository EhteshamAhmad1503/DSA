package LeetCode;

import java.util.Arrays;

public class CODE {

	public static void sort012(int[] a) {
		int low = 0;
		int mid = 0;
		int high = a.length - 1;

		while (mid <= high)
		{
			int ele = a[mid];
			if (ele == 0) 
			{
				int temp = a[low];
				a[low] = a[mid];
				a[mid] = temp; // int[] a = { 1, 2, 1, 0, 1, 0, 2, 2, 0, 1 };
				low++;
				mid++;
			} 
			else if (ele == 1)
			{
				mid++;

			} 
			else if (ele == 2)
			{
				int temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
			}
		}

		System.out.print(Arrays.toString(a));

	}

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 1, 0, 1, 0, 2, 2, 0, 1 };
		System.out.println("START............");
		sort012(a);
		System.out.println();
		System.out.println("End.............");
	}

}

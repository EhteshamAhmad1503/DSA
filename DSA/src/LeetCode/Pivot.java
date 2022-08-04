package LeetCode;

public class Pivot {

	static int getPivote(int[] arr, int n)
	{

		int start = 0;
		int end = n - 1;

		while (start < end)
		{
			int mid = start + (end - start) / 2;
			if (arr[mid] >= arr[0])
			{
				start = mid + 1;
			} 
			else
			{
				end = mid;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		int array[] = {4,5,6,1,2,3 };
		int index = getPivote(array, 5);
		System.out.println("Pivot index : " + index);
	}

}

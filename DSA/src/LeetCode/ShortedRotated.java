package LeetCode;

public class ShortedRotated {

	static boolean Rotate(int arr[]) {
		int count = 0;
		int n = arr.length;
		for (int i = 1; i < arr.length; i++) 
		{
			if (arr[i - 1] > arr[i]) 
			{
				count++;

			}
		}

		if (arr[n - 1] > arr[0])
		{
			count++;

		}

		return count <= 1;
	}

	public static void main(String[] args)
	{

		int arr[] = { 1, 2, 3, 7, 4, 5 };
		Rotate(arr);
		System.out.println(Rotate(arr));
	}

}

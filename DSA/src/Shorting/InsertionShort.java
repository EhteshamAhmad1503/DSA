package Shorting;

public class InsertionShort {

	public static void main(String[] args) {

		int arr[] = { 10, 2, 3, 7, 1, 0 };

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			for (; j >= 0; j--)
			{
				if (arr[j] > temp)
				{
					arr[j + 1] = arr[j];
				} 
				else
				{
					break;
				}
			}
			arr[j + 1] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

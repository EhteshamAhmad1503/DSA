package Shorting;

public class BubbleShort {

	public static void main(String[] args) {

		int nums[] = { 2, 8, 3, 9, 10, 1 };

		for (int i = 0; i < nums.length - 1; i++) // for round 1 to n-1;
		{
			boolean swapped = false;
			for (int j = 0; j < nums.length - i - 1; j++) { // process element til n-i th index

				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) // already shorted
			{

				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}

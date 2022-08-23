package LeetCode;

public class RotatedArray {

	static void Rotate(int[] nums, int k)
	{
		int temp[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++)
		{
			temp[(i + k) % nums.length] = nums[i];
		}

		for (int i = 0; i < temp.length; i++)
		{
			nums[i] = temp[i];
		}
		for (int item : nums)
		{
			System.out.print(item + " ");
		}
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotate(nums, k);

	}

}

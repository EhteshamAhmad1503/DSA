package LeetCode;

import java.util.Arrays;

public class RemovingMinimum {
	static int minimumDeletions(int[] nums)
	{
		int ans=0;
		if (nums.length == 1)
		{
			return nums.length;
		}
		
		for (int i =2; i < nums.length - 1; i++)
		{
			System.out.print(i+" ");
		}
		return nums.length;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 10, 7, 5, 4, 1, 8, 6 };
		Arrays.sort(nums);
		System.out.println(minimumDeletions(nums));

	}

}

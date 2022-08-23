package LeetCode;

public class TwoSum {

	static int[] twoSum(int[] nums, int target) {

		int ans[] = new int[2];

		for (int i = 0; i < nums.length; i++)
		{
			for (int j = 0; j < nums.length; j++)
			{
				if (i != j && nums[i] + nums[j] == target)
				{
					ans[0] = j;
					ans[1] = i;
				}
			}
		}
		for (int item : ans) {
			System.out.print(item + " ");
		}
		return ans;
	}

	public static void main(String[] args) {

		int nums[] = { 2, 3, 11, 6, 15 };
		int target = 9;
		twoSum(nums, target);

	}

}

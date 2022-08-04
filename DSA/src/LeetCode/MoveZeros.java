package LeetCode;

import java.util.*;

public class MoveZeros {
	static void moveZeroes(int[] nums) {

		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
			}
		}
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 0, 1, 0, 3, 12 };
		moveZeroes(arr);

	}

}

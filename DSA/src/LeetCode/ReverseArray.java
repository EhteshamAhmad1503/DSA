package LeetCode;

import java.util.*;

public class ReverseArray {

	static List<Integer> Reverse(List<Integer> num) {

		int start = 0;
		int end = num.size() - 1;

		while (start <= end) {
			Collections.swap(num, start, end);
			start++;
			end--;
		}

		return num;
	}

	void Print(List<Integer> num) {
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();

		num.add(11);
		num.add(7);
		num.add(3);
		num.add(12);
		num.add(4);

		int nums = 2;
		List<Integer> ans = Reverse(num);
		System.out.println(ans);

	}

}

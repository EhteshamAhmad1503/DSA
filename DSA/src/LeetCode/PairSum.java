package LeetCode;

public class PairSum {

	public static void main(String[] args) {

		int tr[] = { 1, 2, 3, 4, 5 };
		int target = 9;
		for (int i = 0; i < tr.length; i++) {

			for (int j = i + 1; j < tr.length; j++) {

				if ((tr[i] + tr[j]) == target) {

					System.out.println(i + " " + j);
				}
			}
		}
	}

}

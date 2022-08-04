package LeetCode;

public class lengthOfLastWord {

	static int GetLength(String s) {
		int length = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				length++;
			} else {

				if (length > 0) {
					return length;
				}

			}
		}
		return length;

	}

	public static void main(String[] args) {

		String s = "   fly me   to   the moon  ";
		int index = GetLength(s);
		System.out.println(index);

	}

}

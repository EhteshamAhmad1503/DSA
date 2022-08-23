package String;

import java.util.Scanner;

public class StringPellindrome {

	static int FindPelindrome(char[] Str, char n) {
		int s = 0;
		int e = n - 1;

		while (s < e) {
			if (Str[s] !=Str[e])
			{
				return 0;
			}
			else if (Str[s] == Str[e])
			{
				s++;
				e--;
			}

		}
		return 1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name");
		char str[] = sc.next().toCharArray();
		int len = str.length;
		System.out.println(FindPelindrome(str, (char) len));

	}

}

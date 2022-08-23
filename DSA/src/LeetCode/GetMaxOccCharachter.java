package LeetCode;

import java.util.Scanner;

public class GetMaxOccCharachter {

	static char getMax(char str[]) 
	{
		int freq[] = new int[26];
		int max = -1;
		char result = 0;
		int len = str.length;
		for (int i = 0; i < len; i++) 
		{
			if (str[i] != ' ')
			{
				freq[str[i] - 'a']++;
			}
		}

		for (int i = 0; i < 26; i++)
		{
			if (max < freq[i])
			{
				max = freq[i];
				result = (char) (i + 'a');
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char str[] = "output".toCharArray();
		System.out.println("Maximum occurring character = " + getMax(str));

	}

}

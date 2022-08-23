package LeetCode;

public class Valid_Palindrome {
	private static boolean isValid(char ch)
	{
		if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z')) 
		{
			return true;
		} 
		else
		{
			return false;
		}
	}

	private static boolean checkPalindrome(String str)
	{
		int start = 0;
		int end = str.length() - 1;
		while (start <= end)
		{
			if (str.charAt(start) == str.charAt(end))
			{
				start++;
				end--;
			} 
			else
			{
				return false;
			}
		}

		return true;
	}

	public static  boolean isPalindrome(String str)
	{
		int start = 0, end = str.length() - 1;
		StringBuilder temp = new StringBuilder();

		for (int i = 0; i < str.length(); i++)
		{
			if (isValid(str.charAt(i)))
			{
				temp.append(str.charAt(i));
			}
		}

		String output = temp.toString();

		output = output.toLowerCase();

		return checkPalindrome(output);
	}

	public static void main(String[] args) {

			String str= "A man, a plan, a canal: Panama";
			System.out.println(isPalindrome(str));
	}

}

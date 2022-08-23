package LeetCode;

public class String_Compression
{
	static int Compression(char[] chars)
	{
		int index = 0;
		int start = 0;
		while (start < chars.length)
		{
			int end = start + 1;
			while (end < chars.length && chars[start] == chars[end])
			{
				end++;
			}
			chars[index++] = chars[start];
			int CharCount = end - start;
			if (CharCount > 1)
			{
				String strStartCharCount = CharCount + "";
				for (char c : strStartCharCount.toCharArray())
				{
					chars[index++] = c;
				}
			}
			start = end;
		}
		return index;
	}

	public static void main(String[] args)
	{
		char[] str = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
		System.out.println(Compression(str));
	}
}

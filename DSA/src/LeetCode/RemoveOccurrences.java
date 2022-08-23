package LeetCode;

public class RemoveOccurrences {

	static String Remove(String s, String part)
	{

		while (s.contains(part))
		{
			s = s.replaceAll(part, "");
		}

		return s;
	}

	public static void main(String[] args)
	{
		String str = "daabcbaabcbc";
		String part = "abc";
		System.out.println(Remove(str, part));

	}

}

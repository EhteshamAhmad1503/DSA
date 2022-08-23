package LeetCode;

public class RemoveAllAdjecent {

	static String removeDuplicates(String s) {
		int i = 0;
		int j = 1;
		while (j < s.length() - 1)
		{
			String st = "";
			if (s.charAt(i) == s.charAt(j))
			{
				st = st + s.charAt(i) + s.charAt(j);
				s = s.replaceAll(st, "");
				i = 0;
				j = 1;
			} 
			else
			{
				i++;
				j++;
			}

		}
		return s;
	}

	public static void main(String[] args) {
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}

}

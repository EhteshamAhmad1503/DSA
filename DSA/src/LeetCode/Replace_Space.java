package LeetCode;

public class Replace_Space {

	static StringBuilder Replce(StringBuilder str) {

		StringBuilder result = new StringBuilder("");
		String[] res = str.toString().split(" ");
		for (int i = 0; i < res.length; i++)
		{
			if (i == res.length - 1)
			{
				result.append(res[i]);
			}
			else
			{
				result.append(res[i] + "@40");
			}

		}
		return result;
	}

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Leet Code is a Coding Platefrom");
		System.out.println(Replce(str));
	}

}

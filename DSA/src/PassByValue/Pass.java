package PassByValue;

public class Pass {
	int a = 10;

	void call(Pass n)
	{
		n.a = n.a + 10;
	}

	public static void main(String[] args) {

		Pass var = new Pass();
		System.out.println("Before call-by-reference: " + var.a);

		var.call(var);
		System.out.println("After call-by-reference: " + var.a);

	}
}
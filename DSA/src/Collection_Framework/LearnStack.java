package Collection_Framework;

import java.util.*;

public class LearnStack {
	static void Stacks() {

		Stack<String> name = new Stack<>();

		name.push("Ehtesham");
		name.push("Gulam");
		name.push("Abid");
		name.push("Irfan");
		name.push("Jamshed");

		System.out.println(name + " ");
		System.out.println(name.search("Ehtesham") + " ");
		System.out.println(name.peek());
//		name.pop(); // remove element the last element
//		System.out.println(name + " ");
		System.out.println(name.peek());

		
	}

	public static void main(String[] args) {

		Stacks();
	}

}

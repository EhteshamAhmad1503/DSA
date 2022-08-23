package Arrays;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {

		char name[] = new char[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
//		char[] n = sc.next().toCharArray();
		char[] str = sc.next().toCharArray();
		int len=str.length;
		
		System.out.println(len);
	}

}

package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass obj = new BaseClass();
		obj.palndromByVignesh();
		obj.palindromeByRamya();

		obj.palindromeByVicky();
	}

	public void palndromByVignesh() {

	}

	public void palindromeByRamya() {
		int len;
		String str, rev = "";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		str = sc.nextLine();
		len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("This's polindrome string");
		} else {
			System.out.println("This's not polindrome string");
		}
	}

	public void palindromeByVicky() {
		String v = "madam";
		String reverse = "";
		for (int i = v.length() - 1; i >= 0; i--) {
			reverse += v.charAt(i);
			if (reverse.equalsIgnoreCase(v)) {
				System.out.println(v + "palindrome");
			} else {
				System.out.println(v + "not a palindrome");

			}
		}

	}
}

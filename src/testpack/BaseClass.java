package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass obj = new BaseClass();
		obj.palndromByVignesh();
		obj.palindromeByRamya();
		obj.sivasankarPalindrome();
		obj.ajithkumarPalindrome();
		obj.liviyaPalindrome();
		obj.nisha();
		obj.stingpaljoy();
		obj.vicky();

	}

	public void palndromByVignesh() {

	}
	@SuppressWarnings("resource")
	public void palindromeByRamya()
	{  
		//Polindrome using immutable string
		String str,rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("This's polindrome string");
		} else {
			System.out.println("This's not polindrome string");
		}
	}

	public void sivasankarPalindrome() {
		String s = "amma";
		String r = null;
		System.out.println(s);
		int l = s.length();
		for (int i = l - 1; i >= 0; i--) {
			System.out.println(i);
			r = r + s.charAt(l);

		}
		if (s.equals(r)) {
			System.out.println(r + "is Palindrome");

		}

	}

	public void ajithkumarPalindrome() {
		String s = "MALAYALAM";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
			if (reverse.equalsIgnoreCase(s)) {
				System.out.println(s + "palindrome");
			} else {
				System.out.println(s + "not a palindrome");

			}
		}

	}

	public void liviyaPalindrome() {
		int r, sum = 0, temp;
		int n = 454;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

	public void nisha() {
		int r, sum = 0, temp;
		int n = 454;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

	public void stingpaljoy() {
		String em1, rev = "";
		System.out.println("Enter any String");
		Scanner em = new Scanner(System.in);
		em1 = em.nextLine();
		int l = em1.length();
		System.out.println(em1);
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + em1.charAt(i);
		}
		if (em1.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

	public void vicky() {
		int r, sum = 0, temp;
		int n = 454;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}


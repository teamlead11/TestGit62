package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass obj = new BaseClass();
		obj.palndromByVignesh();
    obj.palindromeByRamya();
		obj.sivasankarPalindrome();

		

	}

	public void palndromByVignesh() {

	}


	public void palindromeByRamya()
	{   int len;
		String str,rev="";
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		str=sc.nextLine();
		len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("This's polindrome string");
		}else{
			System.out.println("This's not polindrome string");
		}
		}
  	public void sivasankarPalindrome() {
		String s = "amma";
		String r = null;
		System.out.println(s);
		int l=s.length();
		for (int i = l-1; i >=0; i--) {
			System.out.println(i);
			r=r+s.charAt(l);
		
		}
		if(s.equals(r)){
			System.out.println(r +"is Palindrome");
			
		}

	}



}

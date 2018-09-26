package testpack;

import java.util.Scanner;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass obj = new BaseClass();
		obj.palndromByVignesh();
		obj.palindromeByRamya();
	}

	public void palndromByVignesh() {

	}
	public void palindromeByRamya()
	{  
		//Polindrome using immutable string
		String str,rev="";
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
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
	}



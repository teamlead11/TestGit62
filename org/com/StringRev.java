package org.com;
import java.util.Scanner;
public class StringRev {
	public void stingpal() {
		String em1,rev="";
		System.out.println("Enter any String");
		Scanner em=new Scanner(System.in);
		em1=em.nextLine();
		int l=em1.length();
		System.out.println(em1);
		for(int i=l-1;i>=0;i--)
		{
			rev=rev + em1.charAt(i);
		}
		if(em1.equals(rev))
		{
		System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
		public static void main(String[] args) {
			StringRev s=new StringRev();
			s.stingpal();
		}
		
			
		
	}
	



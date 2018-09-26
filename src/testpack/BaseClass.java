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

  	public void ajithkumarPalindrome() {
      String s = "MALAYALAM";
      String reverse = "";
      for (int i =s.length()-1; i >=0; i--) {
		reverse += s.charAt(i);
		if(reverse.equalsIgnoreCase(s)) {
			System.out.println(s+ "palindrome");
		}else {
			System.out.println(s+ "not a palindrome");
		
		}
	}




}


public void liviyaPalindrome() {
int r,sum=0,temp;    
		  int n=454; 
		   temp=n;    
		  while(n>0){    
		   r=n%10;    
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
}

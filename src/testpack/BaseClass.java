package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseClass obj = new BaseClass();
		obj.palndromByVignesh();
		obj.sivasankarPalindrome();
	}

	public void palndromByVignesh() {

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

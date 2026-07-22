package org.Wenses;

public class Vikash {

	public static void main(String[] args) {
		
		String a = "Wenses";
		String b = "";
		
		for(int i = a.length()-1; i>=0; i-- ) {
			
			char ch = a.charAt(i);
			b = b+ch;
			
		}
		System.out.println(b);
		if(b.equals(a)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}
}

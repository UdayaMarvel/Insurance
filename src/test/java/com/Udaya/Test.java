package com.Udaya;

public class Test {

	public static void main(String[] args) {

		String string = "kayak";
		String output = "";
		for(int i = string.length()-1;i>=0;i--) {
			char ch = string.charAt(i);
			output = output+ch;
		}
		System.out.println(output);
		if(output.equals(string)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
//new branch created

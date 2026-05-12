package org.Vikash;

import java.util.Scanner;

public class Vikash {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first value");
		int a = sc.nextInt();
		
		System.out.println("enter the second value");
		int b = sc.nextInt();
		
		System.out.println("specify the operator");
		String d = sc.next();
		
		switch(d)
		{
		case "+" :
			
			int c = a+b;
			System.out.println(c);
			break;
		
		case "-" :
			
			int c1 = a-b;
			System.out.println(c1);
			
		}
		
		
		
		
		
		
	}
}

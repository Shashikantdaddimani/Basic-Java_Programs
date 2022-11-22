package com.java.day2;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number to check Palindrome");
		int n = s.nextInt();
		int rev = 0; 
		int rem ;
		int temp = n;
		System.out.println("Actual Number: "+ n+"");
		for(int i=n ; i > 0; )
		{
			rem = i % 10 ;
			rev = rev * 10 + rem;
			i = i / 10;
			
		}	
		System.out.println("Reversed Number is: "+ rev+"\n");
		if(temp == rev)
		{
			System.out.println(" Is a Palindrome");
		}
		else
		{
			System.out.println(" Is Not a Palindrome");
		} 
	}

}

/**
 * Write a Program to find Palindrome Number
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class Palindrome 
{
	//main method
	public static void main(String[] args) 
	{
		//Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number to check Palindrome");
		int number = input.nextInt();
		int reverse = 0; 
		int remainder ;
		int temp = number;
		System.out.println("Actual Number: "+ number+"");
		
		//logic to find the Palindrome.
		for(int i=number ; i > 0; )
		{
			remainder = i % 10 ;
			reverse = reverse * 10 + remainder;
			i = i / 10;
			
		}	
		System.out.println("Reversed Number is: "+ reverse+"\number");
		
		//Logic to finding the true or false
		if(temp == reverse)
		{
			System.out.println(" Is a Palindrome");
		}
		else
		{
			System.out.println(" Is Not a Palindrome");
		} 
	}

}

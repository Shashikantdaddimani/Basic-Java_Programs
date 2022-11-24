package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class ReverceNumber 
{

	//main method
	public static void main(String[] args) 
	{
		//Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = input.nextInt();
		int remainder;
		int reverse=0;
		
		//logic to finding reverse number
		while(number!=0)
		{
			remainder= number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}
		System.out.println("The reverse of the given number is: " +  reverse); 
	}

}

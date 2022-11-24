/**
 * Write a Program to reverse the integer number eg. Input n=231 reverse is 132
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class ReverceNumber2 
{
	//main method
	public static void main(String[] args) 
	{
		//Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt(); 
		int remainder;
		int reverse = 0;  
		
		//logic to finding reverse number
		for(int i = number; i >0;)
		{  
		remainder = i % 10;  
		reverse = reverse * 10 + remainder;  
		i=i/10;
		}  
		System.out.println("The reverse of the given number is: " + reverse); 
	}
	}



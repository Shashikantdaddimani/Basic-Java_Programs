/**
 *  Read a single Digit Number and write in word
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class Displayunit 
{
	//main method
	public static void main(String[] args) 
	{
		//Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Emter the Number(1,10,100.....)");
		int n = input.nextInt();
		
		//logic to Read a single Digit Number and write in word
		if (n==1)
			System.out.println("One");
		else if(n==10)
			System.out.println("Ten");
		else if(n==100)
			System.out.println("Hundred");
		else if(n==1000)
			System.out.println("Thousand");
		else
			System.out.println("Try again");
		
	}

}

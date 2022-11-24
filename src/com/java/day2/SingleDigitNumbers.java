/**
 * Read a single Digit Number and write in word
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class SingleDigitNumbers 
{

	//main method
	public static void main(String[] args) 
	{
		//Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Single Digit Number");
		int number = input.nextInt();
		
		if (number==0)
			System.out.println("Zero");
		else if (number==1)
			System.out.println("One");
		else if (number==2)
			System.out.println("Two");
		else if (number==3)
			System.out.println("Three");
		else if (number==4)
			System.out.println("Four");
		else if (number==5)
			System.out.println("Five");
		else if (number==6)
			System.out.println("Six");
		else if (number==7)
			System.out.println("Seven");
		else if (number==8)
			System.out.println("Eight");
		else if (number==9)
			System.out.println("Nine");
		else
			System.out.println("This is Not a Single Digit Number");
	}

}

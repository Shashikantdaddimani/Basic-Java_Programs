/**
 * Write a Program to print the month name for the given number
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class Months 
{
	//main method
	public static void main(String[] args) 
	{
		//Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 12");
		int month =input.nextInt();
		
		//logic to finding the months using switch case
		switch(month)
		{
			case 1: System.out.println("January");
				break;
			case 2: System.out.println("February");
				break;
			case 3: System.out.println("March");
				break;
			case 4: System.out.println("April");
				break;
			case 5: System.out.println("May");
				break;
			case 6: System.out.println("June");
				break;
			case 7: System.out.println("July");
				break;
			case 8: System.out.println("August");
				break;
			case 9: System.out.println("September");
				break;
			case 10: System.out.println("October");
				break;
			case 11: System.out.println("November");
				break;
			case 12: System.out.println("December");
				break;
			default:System.out.println("Invalid Choice");

		}
	}
	}



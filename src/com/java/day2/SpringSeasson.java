/**
 * Write a program SpringSeason.java that takes two int values m and d from the command line and prints 
 * true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class SpringSeasson 
{
	//main method
	public static void main(String[] args) {
		//Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Month: ");
		int month = input.nextInt();
		System.out.println("Enter Date: ");
		int date = input.nextInt();
		
		if(date<=20)
		{
			for(int i=1; i<=date; i++)
			{
				if(month >=3 && month <= 6)
				{
					System.out.println("True");
					break;
				}
				else
				{
					System.out.println("False");
					break;
				}
			}
		}
		else
			System.out.println("False:");

	}
}

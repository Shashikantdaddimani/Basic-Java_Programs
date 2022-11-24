/**
 * Added logic to find the Sum of natural numbers using for loop
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class SumOfNaturalNumbers2 
{
	//main method
	public static void main(String[] args) 
	{
		//Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number= input.nextInt(); 
		int sum = 0;
				
		System.out.print("First " + number + " Numbers = ");
		for (int i=1;i<=number;i++) 
		{
			sum=sum+i;
			
			System.out.print(i + " + ");

	    }
		System.out.println();
	System.out.println("Sum of natural numbers using for loop is:"+" "+sum);

     }

}



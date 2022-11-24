/**
 * Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class SumOfNaturalNumbers 
{
	//main method
	public static void main(String[] args) 
	{
		//Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Natural Number:");
		int number = input.nextInt();
		int sum=0;
		//logic to find sum of natural number
		while(number != 0)
		{
			sum = sum + number;
			number--;
			//System.out.println("sum of N Natural Number: "+sum);
		}
		System.out.println("sum of N Natural Number: "+sum);

	}
	}



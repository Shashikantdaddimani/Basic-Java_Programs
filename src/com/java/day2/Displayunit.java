/**
 *  Read a Number 1,10,100,1000 and display unit, ten hundred
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
		int number = input.nextInt();
		
		//logic to  Read a Number 1,10,100,1000 and display unit, ten hundred
		if (number==1)
			System.out.println("One");
		else if(number==10)
			System.out.println("Ten");
		else if(number==100)
			System.out.println("Hundred");
		else if(number==1000)
			System.out.println("Thousand");
		else
			System.out.println("Try again");
		
	}

}

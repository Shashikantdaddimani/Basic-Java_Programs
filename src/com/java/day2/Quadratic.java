/**
 *  Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
     Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
              Root 1 of x = (-b + sqrt(delta))/(2*a)
              Root 2 of x = (-b - sqrt(delta))/(2*a)
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class Quadratic 
{
	//main method
	public static void main(String[] args) 
	{
		//	Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = input.nextDouble();
		
		System.out.println("Enter the value of b");
		double b = input.nextDouble();
		
		System.out.println("Enter the value of c");
		double c = input.nextDouble();
		
		double d= b * b - 4.0 * a * c; 
		
		if (d> 0.0)   
		{  
		double root1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
		double root2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
		System.out.println("The roots are " + root1 + " and " + root2);  
		}   
		else if (d == 0.0)   
		{  
		double r1 = -b / (2.0 * a);  
		System.out.println("The root is " + r1);  
		}   
		else   
		{  
		System.out.println("Roots are not real.");  
		}  
	}  
		

}



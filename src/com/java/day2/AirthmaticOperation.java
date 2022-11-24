/**
 * Enter two numbers and do the following arithmetic Operations find max and min.
      i) a+b*c ii) c+a/b
      iii) a%b+c iV) a*b+c
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class AirthmaticOperation {
	//main method
	public static void main(String[] args) {
		
		// Taking user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 3 number");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		// calculating values using given equation
		System.out.println("calculating a+b*c: ");
		int result1 = a+b*c;
		System.out.println("result: "+result1);
		
		System.out.println("calculating c+a/b:");
		int result2  = c+a/b;
		System.out.println("result: "+result2);
		
		System.out.println("calculating a%b+c:");
		int result3 = a%b+c;
		System.out.println("result: "+result3);
		
		System.out.println("calculating a*b+c:");
		int result4 = a*b+c;
		System.out.println("result: "+result4);
		
		//logic to find the greater or smaller
		
		if((result1<result2) && (result1<result3) && (result1<result4))
			System.out.println(result1+" is smaller");
		else if((result2<result3) && (result2<result4)) 
			System.out.println(result2+" is smaller");
		else if((result3<result4)) 
			System.out.println(result3+" is smaller");
		else 
			System.out.println(result4+" is smaller");
		
		
		if((result1>result2) && (result1>result3) && (result1>result4))
		{
			System.out.println(result1+" is Greater");
		}
		else if((result2>result3) && (result2<result4)) 
		{
			System.out.println(result2+" is Greater");
		}
		else if((result3>result4)) {
			System.out.println(result3+" is Greater");
		}
		else 
		{
			System.out.println(result4+" is Greater");
		}
		
 }

}

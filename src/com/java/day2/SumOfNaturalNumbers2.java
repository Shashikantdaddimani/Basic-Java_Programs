package com.java.day2;

import java.util.Scanner;

public class SumOfNaturalNumbers2 {

	public static void main(String[] args) {
		//Taking user input
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number= Sc.nextInt(); 
		int sum = 0;
				
		System.out.print("First " + number + " Numbers = ");
		for (int i=1;i<=number;i++) {
			sum=sum+i;
			
			System.out.print(i + " + ");

	}
		System.out.println();
	System.out.println("Sum of natural numbers using for loop is:"+" "+sum);

      }

}



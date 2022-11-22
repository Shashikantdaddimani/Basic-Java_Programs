package com.java.day2;

import java.util.Scanner;

public class SumOfNaturalNumbers2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= Sc.nextInt(); 
		int sum = 0;
				
		System.out.print("First " + n + " Numbers = ");
		for (int i=1;i<=n;i++) {
			sum=sum+i;
			
			System.out.print(i + " + ");

	}
		System.out.println();
	System.out.println("Sum of natural numbers using for loop is:"+" "+sum);

      }

}



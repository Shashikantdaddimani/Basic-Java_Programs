package com.java.day2;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		//Taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Natural Number:");
		int number = sc.nextInt();
		int sum=0;
		while(number != 0)
		{
			sum = sum + number;
			number--;
			//System.out.println("sum of N Natural Number: "+sum);
		}
		System.out.println("sum of N Natural Number: "+sum);

	}
	}



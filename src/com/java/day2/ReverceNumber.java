package com.java.day2;

import java.util.Scanner;

public class ReverceNumber {

	public static void main(String[] args) {
		//Taking user input
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = Sc.nextInt();
		int remainder;
		int reverse=0;
		
		while(number!=0)
		{
			remainder= number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}
		System.out.println("The reverse of the given number is: " +  reverse); 
	}

}

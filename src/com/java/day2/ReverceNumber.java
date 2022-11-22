package com.java.day2;

import java.util.Scanner;

public class ReverceNumber {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = Sc.nextInt();
		int remainder;
		int reverce=0;
		
		while(number!=0)
		{
			remainder= number%10;
			reverce=reverce*10+remainder;
			number=number/10;
			
		}
		System.out.println("The reverse of the given number is: " +  reverce); 
	}

}

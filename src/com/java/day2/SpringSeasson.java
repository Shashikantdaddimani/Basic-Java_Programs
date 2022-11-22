package com.java.day2;

import java.util.Scanner;

public class SpringSeasson {
	public static void main(String[] args) {
		//Taking user input
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Month: ");
		int month = Sc.nextInt();
		System.out.println("Enter Date: ");
		int date = Sc.nextInt();
		if(date<=20)
		{
			for(int i=1; i<=date; i++)
			{
				if(month >=3 && month <= 6)
				{
					System.out.println("True");
					break;
				}
				else
				{
					System.out.println("False");
					break;
				}
			}
		}
		else
			System.out.println("False:");

	}
}

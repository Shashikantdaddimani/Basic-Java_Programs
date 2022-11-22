package com.java.day2;

import java.util.Scanner;

public class Displayunit {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Emter the Number(1,10,100.....)");
		int n = Sc.nextInt();
		
		if (n==1)
			System.out.println("One");
		else if(n==10)
			System.out.println("Ten");
		else if(n==100)
			System.out.println("Hundred");
		else if(n==1000)
			System.out.println("Thousand");
		else
			System.out.println("Try again");
		
	}

}

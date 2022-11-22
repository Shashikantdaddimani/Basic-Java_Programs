package com.java.day2;

import java.util.Scanner;

public class VowelsOrConsonants {

	public static void main(String[] args) {
		//Taking user input 
		System.out.println("Enter The Alpabates");
	Scanner Sc = new Scanner(System.in);
	char Char=Sc.next().charAt(0);
	
	switch(Char) {
	case 'A' : 
		System.out.println("Is Vowel");
		break;
	case 'E':
		System.out.println("Is Vowel");
		break;
	case 'I':
		System.out.println("Is Vowel");
		break;
	case 'O':
		System.out.println("Is vowel");
		break;
	case 'U':
		System.out.println("is Vowel");
		break;
	case 'a':
		System.out.println("Is Vowel");
		break;
	case 'e':
		System.out.println("Is Vowel");
		break;
	case 'i':
		System.out.println("is Vowel");
		break;
	case 'o':
		System.out.println("Is Vowel");
		break;
	case 'u':
		System.out.println("Is Vowel");
		break;
	default :
		System.out.println("is Consanant");
		
	}

	}

}

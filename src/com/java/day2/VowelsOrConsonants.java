/**
 * Added logic to find Vowels or consanants using switch cases
 */
package com.java.day2;

//imports the scanner class of the java.utill package
import java.util.Scanner;

//class definition
public class VowelsOrConsonants 
{
	//main method
	public static void main(String[] args) 
	{
		//Taking user input 
	System.out.println("Enter The Alpabates");
	Scanner input = new Scanner(System.in);
	char Char=input.next().charAt(0);
	
	//logic to finding vowel or consonants
	switch(Char) 
	{
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

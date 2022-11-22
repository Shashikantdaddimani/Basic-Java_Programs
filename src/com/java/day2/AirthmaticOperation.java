package com.java.day2;

import java.util.Scanner;

public class AirthmaticOperation {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
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
		
		if((result1<result2) && (result1<result3) && (result1<result4))
			System.out.println(result1+" is smaller");
		else if((result2<result3) && (result2<result4)) 
			System.out.println(result2+" is smaller");
		else if((result3<result4)) 
			System.out.println(result3+" is smaller");
		else 
			System.out.println(result4+" is smaller");
		
		
		if((result1>result2) && (result1>result3) && (result1>result4)){
			System.out.println(result1+" is Greater");
		}else if((result2>result3) && (result2<result4)) {
			System.out.println(result2+" is Greater");
		}else if((result3>result4)) {
			System.out.println(result3+" is Greater");
		}else {
			System.out.println(result4+" is Greater");
		}
		
 }

}

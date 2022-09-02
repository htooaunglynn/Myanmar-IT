package com.mmit.day7;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var sc = new Scanner(System.in);
		
		System.out.println("Enter number1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number2 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		int result = num1 / num2;
		
		System.out.println("Result : " + result);
		
		sc.close();
	}

}

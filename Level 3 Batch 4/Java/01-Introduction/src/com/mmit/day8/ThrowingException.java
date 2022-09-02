package com.mmit.day8;

import java.util.Scanner;

public class ThrowingException {
	
	private static void checkMark (int mark) throws ArithmeticException {
		
		if (mark < 0 || mark > 100)
			throw new ArithmeticException();
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			
			checkMark(1000);
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
			
		}
		
	}
	
	private static void range() {
		
		try (Scanner sc = new Scanner(System.in)) {
			
		int[] numbers = {100, 200, 300};
			
		System.out.println("Enter position : ");
		var index = sc.nextInt();
			
		if (index >= numbers.length)
			throw new IndexOutOfBoundsException();
			
		System.out.println("Value : " + numbers[index]);
			
		} catch (Exception e) {
			
			System.out.println("Your input value is out of rage");
			
		}
	}
}

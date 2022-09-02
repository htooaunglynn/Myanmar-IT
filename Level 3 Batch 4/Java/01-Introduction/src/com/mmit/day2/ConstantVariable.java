package com.mmit.day2;

import java.util.Scanner;

import com.mmit.day1.hello;

public class ConstantVariable {
	
	static final float RATE = 1.5f;
	static final int MIN_PRICE = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter price : " );
		int price = sc.nextInt();
		
		sc.close();
		
		if (price < MIN_PRICE)
			price = MIN_PRICE;
		
		System.out.println("Price : " + price);
		System.out.println("Expense : " + (price * RATE));
		
		hello obj = new hello();
		obj.display();
	}

}

package com.mmit.day2;

import java.util.Scanner;
import com.mmit.Hello;

public class ConstantVariable {
	
	static final float RATE = 1.5f;
	static final int MIN_PRICE = 1000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter price: ");
		int price = sc.nextInt();
		
		sc.close();
		
		if(price < MIN_PRICE) {
			price = MIN_PRICE;
		}
		
		Hello hw = new Hello();
		hw.display();
		
		
		System.out.println("\nExpense: " + (price * RATE));
		//RATE = 0.5f;
	}

}

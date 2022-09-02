package com.mmit.day3;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter food name : ");
		String name = sc.nextLine().toLowerCase();
		
		String category = null;
		
		//category = s

	}
	
	private static void switch_statement(String name) {
		
		String category;
		
		switch (name) {
		
		case "burger", "pizza", "sandwich":
			category = "Fast Food";
			break;
		
		case "yogurt", "milk tea":
			category = "Dessert";
			break;
			
		case "monhinga":
			category = "Burmese Food";
			break;
			
		case "sushi":
			category = "Japanese Food";
			break;
			
		default:
			category = "unknown";
		}
		
		System.out.println(name + " is " + category);
	}
}

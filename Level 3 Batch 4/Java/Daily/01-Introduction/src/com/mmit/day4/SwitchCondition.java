package com.mmit.day4;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter food name : ");
		String name = sc.nextLine().toLowerCase();

		String category = null;

		category = switch(name) {
		case "burger", "pizza", "sandwich" -> {
			if("pizza".equals(name))
				System.out.println(name + " is an Italian Food");
			yield "Fast Food";
		}
		case "yogurt", "milk tea" -> {yield "Dessert";}
		case "mohinga" -> "Burmese Food";
		case "sushi" -> "Japanese Food";
		default -> "unknown";
		};

		sc.close();
	}
	
	public static void ja_12switch() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter food name : ");
		String name = sc.nextLine().toLowerCase();

		String category = null;
		
		category = switch (name) {
		case "burger", "pizza", "sandwich" -> "Fast Food";
		case "yogurt", "milk tea" -> "Dessert";
		case "moginga" -> "Burmese Food";
		case "sushi" -> "Japanese Food";
		default -> "unknown";
		};
		
		sc.close();
	}
}

package com.mmit.day3;

import java.util.Scanner;

public class ConditionalStatement {
	
	enum Role {
		
		Admin, Staff, Customer, Merchant
		
	};
	
	private static Role role;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Student obj = new Student();
		obj.name = "Mg Mg";
		obj.gender = Gender.valueOf("abc"); 
		
		System.out.println("Name : " + obj.name);
		System.out.println("Gender : " + obj.gender);
		
		sc.close();
	}
	
	private static void if_elseif(Scanner sc) {
		
		System.out.print("Enter you bmi value : ");
		var bmi = Float.parseFloat(sc.nextLine());
		
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi >= 18.5 && bmi <= 24.9)
			System.out.println("Normal weight");
		else if (bmi >= 25 && bmi <= 29.9)
			System.out.println("Overweight");
		else
			System.out.println("Obesity");
		
	}
	
	private static void if_else(Scanner sc) {
		
		System.out.print("Enter email : ");
		var email = sc.nextLine();
		
		System.out.print("Enter password : ");
		var pwd = sc.nextLine();
		
		if ("admin@gmail.com".equals(email) && "123".equals(pwd))
			System.out.println("Login success");
		else
			System.out.println("Login fail");
	}
	
	private static void if_statement (Scanner sc) {
		
		System.out.println("Enter lanuage name : ");
		String name = sc.nextLine();
		
		if (name.equalsIgnoreCase("Java"))
			System.out.println("Java is a compiled language.");
		else 
			System.out.println("Other");
	}

}

class Student {
	
	Gender gender;
	String name;
}

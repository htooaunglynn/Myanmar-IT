package com.mmit.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//readWithScanner();
		readWithBufferReader();
		
	}
	
	private static void readWithScanner() {
		
		//open
		Scanner sc = new Scanner(System.in);
		//operate
		System.out.print("Enter your name : ");
		var name = sc.nextLine();
		
		System.out.print("Enter your age : ");
		var age = sc.nextInt();
		
		System.out.print("Enter your salary : ");
		var salary = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Enter your city : ");
		String city = sc.nextLine();
		
		//close
		sc.close();
		
		System.out.println("---------- Information ----------");
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
		System.out.println("City : " + city);
	}
	
	private static void readWithBufferReader() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//operate
		System.out.print("Enter name : ");
		String name = reader.readLine();
		
		System.out.println("Enter salary : ");
		double salary = Double.parseDouble(reader.readLine());
		
		System.out.print("Enter age : ");
		int age = Integer.parseInt(reader.readLine());
		
		System.out.print("Enter bonus: ");
		float bonus = Float.parseFloat(reader.readLine());
		
		reader.close();
		
		System.out.println("---------- Information ----------");
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
		System.out.println("Bonus : " + bonus);
		
	}

}

package com.mmit.day2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class testing {

	public static void main(String[] args) {
		//
		
	}
	
	public static void Joption_test() {
		String name = JOptionPane.showInputDialog("Enter your name ");
		JOptionPane.showMessageDialog(null, name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, height);
	}
	
	public static void Scanner_test() {
		
		System.out.println("Hello Java!");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = scan.nextLine();
		
		System.out.print("Enter your age : ");
		int age = scan.nextInt();
		scan.nextLine()	;
		
		System.out.print("What is your fav food : ");
		String food = scan.nextLine();
		
		System.out.println("Name : " + name + "\nAge : " + age);
		System.out.println("Food : " + food);
		
		scan.close();
	}
}

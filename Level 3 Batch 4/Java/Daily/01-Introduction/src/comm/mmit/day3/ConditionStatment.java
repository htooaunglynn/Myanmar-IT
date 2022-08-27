package comm.mmit.day3;

import java.util.Scanner;

public class ConditionStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	public static void bmi_testing() {
				//create scanner
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter your bmi value : ");
				float bmi = sc.nextFloat();
				
				if(bmi < 18.5) {
					System.out.println("Underweight");
				}
				else if(bmi >= 18.5 && bmi <= 24.9) {
					System.out.println("Normal Weight");
				}
				else if(bmi >= 25 && bmi <=29.9) {
					System.out.println("Overweight");
				}
				else {
					System.out.println("Obesity");
				}
				
				sc.close();

	}
	
	public static void if_test() {
				//create scanner
				Scanner sc = new Scanner(System.in);
				
				//input
				System.out.println("Enter language name : ");
				String name = sc.nextLine();
				
				//condition
				if(name.equalsIgnoreCase("Java")) {
					System.out.println("Java is a compiled language");
				} else {
					System.out.println("other");
				}
				
				sc.close();
	}
	
	public static void ifElTest() {
		//create scanner
		Scanner sc = new Scanner(System.in);
		
		//login
				System.out.println("=================");
				
				System.out.print("Enter email : ");
				String email = sc.nextLine();
				
				System.out.print("Enter password : ");
				String pass = sc.nextLine();
				
				if(email.equals("admin@gmail.com") && pass.equals("admin123")) {
					System.out.println("login success");
				} else {
					System.err.println("Login fail");
				}
		
		sc.close();
	}

}

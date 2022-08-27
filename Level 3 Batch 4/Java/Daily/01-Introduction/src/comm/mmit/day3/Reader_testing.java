package comm.mmit.day3;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class Reader_testing {

	public static void main(String[] args) throws IOException {

		read_Scanner();
	}

	private static void read_Scanner() {

		// open
		Scanner sc = new Scanner(System.in);

		// operate
		System.out.print("Enter your name : ");
		String name = sc.nextLine();

		System.out.print("Enter your age : ");
		int age = sc.nextInt();

		System.out.print("Enter your salary : ");
		double salary = sc.nextDouble();

		sc.nextLine();

		System.out.print("Enter your city : ");
		String city = sc.nextLine();

		// close
		sc.close();

		// output
		System.out.println("\n\n----- Information Output -----");
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
		System.out.println("City : " + city);
	}

	public static void read_BufferReader() throws IOException {
		// create or open
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// operate
		System.out.print("Enter your name : ");
		String name = reader.readLine();

		System.out.print("Enter salary : ");
		double salary = Double.parseDouble(reader.readLine());

		System.out.print("Enter age : ");
		int age = Integer.parseInt(reader.readLine());

		System.out.print("Enter bonus : ");
		float bonus = Float.parseFloat(reader.readLine());

		// close
		reader.close();

		System.out.print("----- Information Output -----");
		System.out.print("Name : " + name);
		System.out.print("Salary : " + salary);
		System.out.print("Age : " + age);
		System.out.print("Bonus : " + bonus);
	}
}

package introduction;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;  

public class Assignment5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		order(sc);
		sc.close();

	} // end of main
	
	public static String menu(Scanner sc) {

		String result = null;	
		
		System.out.println("***** Available Menu *****");
		System.out.println("\t1. Pizza");
		System.out.println("\t2. Burger");
		System.out.println("\t3. Milk Tea");
		System.out.println("\t4. Spicy Noodle");
			
		System.out.print("Please choose item : ");
		int item = sc.nextInt();
		
		sc.nextLine();
		
		if (item == 1) 
			result = "Pizza";
		else if (item == 2) 
			result = "Burger";
		else if (item == 3)
			result = "Milk Tea";
		else if (item == 4)
			result = "Spicy Noodle";
		else 
			result = "null";
		
		return result;
		
	} // end of menu
	
	public static int orderTime(Scanner sc) {
		
		System.out.println("***** Order Time *****");
		System.out.println("\t1. Order Now? ");
		System.out.println("\t2. Preorder? ");
		
		System.out.print("Please choose : ");
		int result = sc.nextInt();
		
		sc.nextLine();
		
		return result;
		
	} // end of orderTime
	
	public static String[] township(Scanner sc) {
		
		String[] result = {null, null};
	
		System.out.println("***** Deliverable Townshop *****");
		System.out.println("\t1. AA (15 mins) ");
		System.out.println("\t2. BB (30 mins) ");
		System.out.println("\t3. CC (10 mins) ");
		System.out.println("\t4. DD (45 mins) ");
		
		System.out.print("Please choose townshiop : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		if (number == 1) {
			result[0] = "AA";
			result[1] = "15";
		} 
		else if (number == 2) {
			result[0] = "BB";
			result[1] = "30";
		}
		else if (number == 3) {
			result[0] = "CC";
			result[1] = "10";
		}
		else if (number == 4) {
			result[0] = "DD";
			result[1] = "45";
		} 
		else {
			result[0] = "null";
			result[1] = "0";
		}
		
		return result;
		
	} // end of township
	
	public static void order(Scanner sc) {
		
		String[] timeAndAdr = {null, null};
		String item = null, location = null;
		int minute = 0, type = 0;
		
		do {
			item = menu(sc);
			
			if ("null".equals(item))
				System.out.println("\n\nInput Error! \nPlease input (1, 2, 3, 4, 5)\n\n");
		} while ("null".equals(item));
		
		do {
			timeAndAdr = township(sc);
			location = timeAndAdr[0];
			minute = Integer.parseInt(timeAndAdr[1]);
			
			if ("null".equals(location))
				System.out.println("\n\nInput Error! \nPlease input (1, 2, 3, 4, 5)\n\n");
		} while ("null".equals(location));
		
		do {
			type = orderTime(sc);
			
			if (type != 1 && type != 2)
				System.out.println("\n\nInput Error! \nPlease input (1, 2)\n\n");
		} while (type != 1 && type != 2);
		
		if (type == 1) {
			LocalTime ima = LocalTime.now();
			DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
			
			System.out.println("\n\n*********** Your Order Information **********");
			System.out.println("Item Name\t:\t" + item);
			System.out.println("Your Address\t:\t" + location);
			System.out.println("Duration\t:\t" + minute + " mins");
			System.out.println("Arrival Time\t:\t" + ima.plusMinutes(minute).format(f1));
			System.out.println("******** Thank you for your ordering ********");
		}
		else {
			LocalDate now = LocalDate.now();		
			DateTimeFormatter f2 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy");
			
			System.out.print("Enter deliver date (dd): ");
			int dd = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("\n\n************ Your Order Information ***********");
			System.out.println("Item Name\t:\t" + item);
			System.out.println("Your Address\t:\t" + location);
			System.out.println("Arrival Time\t:\t" + now.plusDays(dd).format(f2));
			System.out.println("********* Thank you for your ordering *********");
		}
		
	} // end of order
	
} // end of class

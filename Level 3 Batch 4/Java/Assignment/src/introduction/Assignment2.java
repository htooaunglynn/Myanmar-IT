package introduction;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		String ask = null;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			sleepTime(sc);
			
			System.out.print("Continue (y/n)? : ");
			ask = sc.nextLine().toLowerCase();
			
		} while("y".equals(ask));
		
		sc.close();
		
	}
	
	
	public static void sleepTime(Scanner scanner) {
		
		int resultHour, startHour, endHour, halfHour = 12;			
		
		System.out.print("When do you go bed : ");
		startHour = scanner.nextInt();
		
		System.out.print("When do you get up : ");
		endHour = scanner.nextInt();
		
		scanner.nextLine();
		
		resultHour = (halfHour - startHour) + endHour;
		
		if (resultHour < 5)
			System.out.println("You are very hardworking");
		else if (resultHour >= 5 && resultHour <= 8)
			System.out.println("You take care your healthy well!!!");
		else
			System.out.println("You are abnormal");
	}
	
	
}
package introduction;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		int positiveNum = 0, negativeNum = 0, zeroNum = 0;
		
		//declare array and allocate memory
		int[] number = new int[5];
		
		//open scanner
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Enter " + (i+1) + " number : " );
			number[i] = scanner.nextInt();
			
			scanner.nextLine();
		}
		
		//close scanner
		scanner.close();
	
		for (int j = 0; j < 5; j++) {
			
			if(number[j] == 0) 
				zeroNum++;
			else if(number[j] > 0 ) 
				positiveNum++;
			else 
				negativeNum++;
			
		}
		
		System.out.println("---------------------------------");
		System.out.println("Number of zero : " + zeroNum);
		System.out.println("Number of positive : " + positiveNum);
		System.out.println("Number of negative : " + negativeNum);
	}

}

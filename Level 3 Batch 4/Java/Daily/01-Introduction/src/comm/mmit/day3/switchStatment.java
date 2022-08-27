package comm.mmit.day3;

import java.util.Scanner;

public class switchStatment {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter fav food : ");
		String name = sc.nextLine().toLowerCase();
		
		String category;
		
		switch(name) {
			case"burger": category = "Fast Food"; break;
			case"pizza": category = "Fast Food"; break;
			case"sandwich": category = "Fast Food"; break;
			case"yogurt": category = "Dessert"; break;
			case"milk tea": category = "Dessert"; break;
			case"moginga": category = "Burmese Food"; break;
			case"sushi": category = "Japanse Food"; break;
			default: category = "unknown";
		}
		
		System.out.println(name + " is " + category);
		
		sc.close();
	}
}

package introduction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Assignment4 {
	
	public static void main(String[] args) {
		
		boolean weekend = false;		
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
		
		LocalDate now = LocalDate.now();
		String checkDay = now.getDayOfWeek().toString();
		
		
		if (checkDay.equals("SUNDAY") || checkDay.equals("SATURDAY"))
			weekend = true;
		else
			weekend = false;
		
		System.out.println(now.format(f));
		System.out.println("*******************");
		
		if (weekend == false)
			System.out.println("I have no time. \nI am studying Programming Language.");
		else 
			System.out.println("Today is my holiday!");
		
	}
	
}

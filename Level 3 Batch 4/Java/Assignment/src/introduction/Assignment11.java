package introduction;

import java.util.Scanner;

public class Assignment11 {
	
	private static void mark(int a) throws Exception {
		if (a < 0 || a >100)
			throw new Exception("Invalid mark.");
	}
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your mark : ");
		int mm = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		try {
			mark(mm);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

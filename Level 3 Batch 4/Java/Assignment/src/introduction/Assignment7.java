package introduction;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		
		boolean question = false, whQ = false;
		int charCount = 0;
		String[] whQuestion = {"how", "why", "what", "where", "when"};
		
		
		System.out.println("Please enter a sentence.");
		
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine().toLowerCase();
		sc.close();
		
		char[] characterArray = sentence.toCharArray();
		charCount = characterArray.length;
		
		
		if (characterArray[--charCount] == '?') {
			System.out.println("This is question sentence.");
			question = true;
		}
		else {
			System.out.println("This is not question sentence");
			question = false;
		}
		
		String[] inputArray = sentence.split(" ");
		
		if (question == true) {
			for (int i = 0; i < whQuestion.length; i++) {
				if (whQuestion[i].equals(inputArray[0]) ) 
					whQ = true;	
			}
			
			if (whQ == true)
				System.out.print("This is wh-question type.");
			else
				System.out.println("This is simple sentence question.");
		}
		
	}

}

package introduction;

public class Assignment6 {
	
	public static void main(String[] args) {
		
		String paragraph = "NLP techniques are becoming widely popular scientific research areas as well as Information Technology industry. Language technology together with Information Technology can enhance the lives of people with different capabilities. This system implements voice command mobile phone dialer application. The strength of the system is that it can make phone call to the contact name written in either English scripts or Myanmar scripts.";
		
		int senCount = 0, wordCount = 0;
		
		char[] characterArray = paragraph.toCharArray();
		
		for (int i = 0; i < characterArray.length; i++) {
			
			if (characterArray[i] == '.')
				senCount++;
			
		}
		
		String[] wordArray = paragraph.split(" ");
		wordCount = wordArray.length;
		
		System.out.println("Number of sentence : " + senCount);
		System.out.println("Number of word : " + ++wordCount);
	}
}

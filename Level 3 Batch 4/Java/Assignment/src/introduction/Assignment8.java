package introduction;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		
		int charCount = 0, regionNo = 0;
		String[] region = {"Kachin State", "Kayah State", "Kayin State", "Chin State", "Sagaing Region", "Tanintharyi Region", "Bago Region", "Magway Region", "Mandalay Region", "Mon State", "Rakhine State", "Yangon Region", "Shan State", "Ayeyawady Region", "Nay Pyi Taw"};
		
		System.out.println("What is your NRC number?");
		
		Scanner sc = new Scanner(System.in);
		String nrc = sc.nextLine().toLowerCase();
		sc.close();
		
		char[] characterArray = nrc.toCharArray();
		charCount = characterArray.length;
		
		String[] searchRegion = nrc.split("/");
		regionNo = Integer.parseInt(searchRegion[0]);
		System.out.println("Township : " + region[(--regionNo)]);
		
		System.out.print("Number : ");
		for (int i = (charCount-6); i < charCount; i++) {
			System.out.print(characterArray[i]); 
		}
		
		
		
	}

}

package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchDemo {

	public static void main(String[] args) {
		try {
			var reader = new FileReader("file.txt");
//			System.out.println("File opend.");
			var girl = reader.read();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not read data.");
		}

	}

}

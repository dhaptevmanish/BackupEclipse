package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritetoClass {
	
	public static void main(String[] args) {
		
		try {
			FileWriter mywriter = new FileWriter("C:\\Users\\Manish\\OneDrive\\Documents\\WriteText.txt");
			mywriter.write("I fucking hate my job and i wanna quit");
			mywriter.close();
			System.out.println("Data entered");
			
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

}

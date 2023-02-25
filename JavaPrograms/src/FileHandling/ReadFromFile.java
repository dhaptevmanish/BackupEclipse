package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
	
	public static void main(String[] args) {
		
		File myFile = new File("C:\\Users\\Manish\\OneDrive\\Documents\\WriteText.txt");
		// here we arre using scanner since we are getting the input from the user/file
		try {
			Scanner reader = new Scanner (myFile);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
				
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
			e.printStackTrace();
		} 
		
		
		
	}

}

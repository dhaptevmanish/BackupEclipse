package FileHandling;
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		File myFile = new File("C:\\Users\\Manish\\OneDrive\\Documents\\WriteText.txt");

		try {
			if (myFile.createNewFile()) {
				System.out.println("File is created");
			} else {
				System.out.println("File already exists");
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			System.out.println("Error occured");
		}

		
	}

}

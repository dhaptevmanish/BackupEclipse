package FileHandling;

import java.io.File;

public class FileInformation {
	
	public static void main(String[] args) {
		
		File myFile = new File("C:\\Users\\Manish\\OneDrive\\Documents\\TestFile.txt");
		
		if (myFile.exists()) {
			
			System.out.println("File name" + myFile.getName());
			System.out.println("Absolute path" + myFile.getAbsolutePath());
			System.out.println("Writeable" + myFile.canWrite());
			System.out.println("Readable"+ myFile.canRead());
			System.out.println("FileSize in Bytes"+ myFile.length());
		}
		else System.out.println("Files doesnt exist");
		
	}

}

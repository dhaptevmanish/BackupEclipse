package TestPrograms;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Times {

	public static void main(String[] args) {
		// Get and print the complete current date in default format

//	      Date d = new Date();
//	      System.out.println("Date: " +d);
//	  
//	 

		// Get and print the current date, in specified format
	//	System.out.println(LocalDateTime.now());

		// Print Only Date in Specified Format in Java

		Date d = new Date();
	      SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
	      System.out.println("Date: " +a.format(d));
		
		
	}
}

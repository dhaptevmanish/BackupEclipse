package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import freemarker.template.SimpleDate;

public class Helper extends BaseClass {

	WebDriver driver;
	public static String captureScreenshot(WebDriver driver) throws IOException, InterruptedException {
	driver = Browser.startdriver(driver, "Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String screenshotpath = System.getProperty("C:\\Users\\Manish\\eclipse-workspace\\New_Framework\\Screenshots");

		File scrnshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrnshot, new File("./Screenshots/.png")); // if we just give the extension it will automatically get a name for each pic taken
		return screenshotpath;
	}
	
	public static String getCurrentDateTime()
	{
		
		DateFormat customformat= new SimpleDateFormat();
		Date currentDate= new Date();
		return customformat.format(currentDate);
		 
	}
	

}

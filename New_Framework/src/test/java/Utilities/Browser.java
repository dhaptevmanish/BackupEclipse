package Utilities;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public WebDriver driver;
	
	
	public static WebDriver startdriver(WebDriver driver, String browsername, String appURL) throws InterruptedException
	// here we are passing the return type of each and every element that is being passed here
	// while calling the method in case we have to give values for these paramters to run the test case 
	{
		
		
		if (browsername.equals("Chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\eclipse-workspace\\New_Framework\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 Thread.sleep(6000);
		}
		
		driver.manage().window().maximize();
		driver.get(appURL);
		Thread.sleep(6000);
		 return driver; 
	}
	
	public static void quitbrowser(WebDriver driver) {
		driver.quit();
	}

}

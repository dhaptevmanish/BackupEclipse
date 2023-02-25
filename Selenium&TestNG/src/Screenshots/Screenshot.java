package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	static WebDriver driver;

	@Test
	public static void Screenshot() throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Copy the file to a location and use try catch block to handle exception

	FileUtils.copyFile(screenshotFile,new File("C:\\Users\\Manish\\eclipse-workspace\\Selenium&TestNG\\src\\Screenshots\\GoogleScreenshot.png"));
	
	Thread.sleep(3000);
	
	driver.quit();
	
	}

}

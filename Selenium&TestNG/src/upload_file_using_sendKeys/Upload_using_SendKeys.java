package upload_file_using_sendKeys;

import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_using_SendKeys {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://smallseotools.com/plagiarism-checker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN);
		a.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(3000);
		WebElement uploadButton = driver.findElement(By.id("file_upload_status"));
		uploadButton.click();
		uploadButton.sendKeys("C:\\Users\\Manish\\OneDrive\\Documents\\Background Pic.jpg"); 
		
		Thread.sleep(3000);
		driver.close();
		
	}

}

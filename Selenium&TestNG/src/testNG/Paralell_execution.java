package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paralell_execution {
	WebDriver driver;
	
	@BeforeSuite
	public void launchbrowser() {
		WebDriver driver = null;
		
		
	}

	@Test
	public void openGoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Inside test1");
		driver.get("https://www.google.com/");
		System.out.println("opened google");
		Thread.sleep(2000);
		driver.close();
		
	}

	@Test
	public void openyoutube() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println("opened youtube");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
		
	}

}

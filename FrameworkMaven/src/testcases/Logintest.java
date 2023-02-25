package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, null);		
		
	}

	@Test (priority=1) 
	public void clicklogo() {
		WebElement click = driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/div[1]/div/a"));
		click.click();
	}
	
	@AfterTest 
	public void Teardown() {
		driver.quit();
	}
	
}

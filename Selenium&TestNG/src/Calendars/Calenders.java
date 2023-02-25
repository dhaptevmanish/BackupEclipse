package Calendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/pages/Calendar.html");

		WebElement calender = driver.findElement(By.id("datepicker"));
		calender.click();

		// selecting the next button in the calender dropdown
		WebElement nextbutton = driver.findElement(By.xpath("//a[@title= 'Next']"));
		// this xpath slcts the element with title as 'Next' in a[] tag
		nextbutton.click();

		// selecting the date

		WebElement datetobegiven = driver.findElement(By.xpath("//a[contains(text(),'12')]"));
		datetobegiven.click();

		driver.quit();
	}

}

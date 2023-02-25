package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");
		// driver.findElement(By.linkText("Go to Home Page")).click(); // used when
		// there are hyperlinks

		driver.findElement(By.partialLinkText("Find where am supposed to go")).click();
		// can be used if there are some common text in a link that will be the same
		// most of the time

	}

}

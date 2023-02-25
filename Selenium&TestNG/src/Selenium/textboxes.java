package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");

		// driver.findElement(By.id("email")).sendKeys("hello@gmail.com"); -- we can
		// also write this by passing the above action
		// to a paramterts and sending values to it.

		WebElement appendbox = driver.findElement(By.id("email"));
		appendbox.sendKeys("hello@gmail.com");

		WebElement append = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		append.sendKeys("append	");

		String value = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(value);

		WebElement clear = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clear.clear();

		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = disabledbox.isEnabled();
		System.out.println(enabled);

	}

}

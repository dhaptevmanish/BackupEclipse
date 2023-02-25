package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Alert.html");

		WebElement alertbutton = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		alertbutton.click();

		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000); // but thread.sleep is not recommended in production, we must use wait concept
							// here
		alert.accept(); // this is equavalent to clicking OK

		WebElement confirmbutton = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmbutton.click();

		Alert Confirmalert = driver.switchTo().alert();
		Thread.sleep(3000);
		// Confirmalert.accept(); // to acceppt the alert
		Confirmalert.dismiss();

		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptbox.click();
		Alert promptalert = driver.switchTo().alert();
		Thread.sleep(3000);
		promptalert.sendKeys("Hello");
		promptalert.accept();

	}

}

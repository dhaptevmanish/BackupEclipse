package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/radio.html");

		WebElement firstradio = driver.findElement(By.xpath("//*[@id=\"no\"]"));
		firstradio.click();

		WebElement unchecked = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[1]"));
		WebElement checked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input[2]"));

		boolean status1 = unchecked.isSelected();
		boolean status2 = checked.isSelected();

		System.out.println(status1);
		System.out.println(status2);
	}

}

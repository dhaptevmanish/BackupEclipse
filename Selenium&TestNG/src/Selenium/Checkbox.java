package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize(); // to maximize the window
		// to select first checkboxes
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[5]")).click();
		Thread.sleep(2000);
		// cnfrm if the checkbox is checked

		WebElement SeleniumChecked = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		boolean seleniumselected = SeleniumChecked.isSelected();
		System.out.println("The checkbox status is " + seleniumselected);// this returns a boolean value
		Thread.sleep(2000);

		// DeSelect only checked

		WebElement firstbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		if (firstbox.isSelected()) {
			firstbox.click();
		}
		Thread.sleep(2000);
		WebElement secondbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[1]"));
		if (secondbox.isSelected()) {
			secondbox.click();
		}
		Thread.sleep(2000);

	}

}

package Selenium;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");

		WebElement getposition = driver.findElement(By.id("position"));

		org.openqa.selenium.Point xypoint = getposition.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		System.out.println(xvalue + yvalue);

		WebElement getcolor = driver.findElement(By.id("color"));
		String color = getcolor.getCssValue("background-color");
		System.out.println("color is" + color);

		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println(height + width);

	}

}

package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Dropdown.html");

		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		// Select is a class that is defined in the framework that is used for these
		// sort of selection operations

		Select slct = new Select(dropdown1);
		slct.selectByIndex(1);
		slct.selectByValue("2");
		slct.selectByVisibleText("Selenium");

		List<WebElement> listofoptions = slct.getOptions();

		int size = listofoptions.size();
		System.out.println("elements present is" + size);

		// sendkeys to dropdown
		dropdown1.sendKeys("Loadrunner");

		// multiselect

		WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multislct = new Select(multiselect);
		multislct.selectByIndex(0);
		multislct.selectByIndex(1);
		multislct.selectByIndex(2);

	}

}

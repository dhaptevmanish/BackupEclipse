package XPaths;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement searchtext = driver.findElement(By.name("q"));
		searchtext.sendKeys("GeeksforGeeks");
		searchtext.sendKeys(Keys.RETURN);

		Thread.sleep(3000);

		driver.findElement(By.partialLinkText("GeeksforGeeks")).click();
		String ParentWindow = driver.getWindowHandle();
		WebElement search = driver.findElement(By.xpath("//*[@id=\"gcse-form\"]/button"));
		search.click();

		WebElement searchvalue = driver.findElement(By.xpath("//input[@id='gcse-search-input']"));
		searchvalue.sendKeys("Java inheritance");
		searchvalue.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);

		String oldWindow = driver.getWindowHandle(); // this is hold the value of the parent window

		Set<String> handles = driver.getWindowHandles(); // This will returns the number of windows that are opened at
		// that time
// handles la value irka varaikum it will iterate the loop like if there are 2
// handles it will iterate 2 time

		for (String newWindow : handles) {
			driver.switchTo().window(newWindow); // this will switch the focus to the new window that is opened
		}

		WebElement searchresult = driver.findElement(By.partialLinkText("Inheritance"));
		searchresult.click();
		
		WebElement Copybutton = driver.findElement(By.id("copy-code-button"));
		js.executeScript("arguments[0].scrollIntoView();", Copybutton);
		Copybutton.click();
		

	}

}

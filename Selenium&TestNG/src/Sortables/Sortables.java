package Sortables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/pages/sortable.html");

		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		WebElement fromelement = elements.get(6);
		WebElement tolement = elements.get(0);

		Actions actions = new Actions(driver);

//		actions.clickAndHold(fromelement);
//		actions.moveToElement(tolement);
//		actions.release(); 
//		actions.build().perform();

		// another method to do the above operation

		actions.dragAndDrop(fromelement, tolement).build().perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.quit();

	}

}

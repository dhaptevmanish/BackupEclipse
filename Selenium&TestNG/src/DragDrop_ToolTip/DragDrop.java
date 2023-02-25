package DragDrop_ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();

		WebElement From = driver.findElement(By.id("draggable"));
		WebElement To = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);

		action.clickAndHold(From).moveToElement(To).release(To).build().perform();
		Thread.sleep(2000);
		// after every mouse action we need to put the build().perform() to execute the
		// action
		// without the build.perform the action wont he executed.

		action.dragAndDrop(From, To).build().perform(); // another method to perform
		// drag and drop
		Thread.sleep(3000);
		driver.quit();

	}

}

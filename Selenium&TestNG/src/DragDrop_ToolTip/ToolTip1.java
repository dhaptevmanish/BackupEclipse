package DragDrop_ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();

		WebElement tooltip = driver.findElement(By.id("//*[@id=\"ember29\"]/svg"));

		Actions action = new Actions(driver);

		action.moveToElement(tooltip).perform(); // used to hover the text to the element

	}
}
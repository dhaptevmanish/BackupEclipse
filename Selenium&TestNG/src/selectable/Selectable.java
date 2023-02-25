package selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();

		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));

		// we are putting li in the list to get the elements/list with that are

		int listsize = selectable.size();
		System.out.println(listsize);

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build()
				.perform();

		// this will hold the ctrl button and select the 0th value in the selectable
		// list
		// all the elements of the selectable list is store in the selectable list so we
		// are using that

		driver.quit();

	}
}
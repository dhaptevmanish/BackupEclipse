package AutoComplete;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/autoComplete.html");

		WebElement input = driver.findElement(By.id("tags")); // this is to find the element using the ID tags
		input.sendKeys("s"); // we are sending s in order to populate the auto suggestions
		// Since there are multiple values in the list we have to pass all the value in
		// a list and then we have iterate
		// using for loop till we find that value.
		Thread.sleep(2000);

		List<WebElement> ListOptions = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));

		// here we are using /li in order to get the focus into the values that is in
		// the list that is after the xpath

		for (WebElement webElement : ListOptions) // this loop will execute until we find the Webservices text in the
													// list
		// once its found the loop will exit
		{
			if (webElement.getText().equals("Selenium")) {
				webElement.click(); // this will slct the selenium value into the box
			}
			break; // this will break the for loop once the desired condition is met.

		}
		Thread.sleep(3000);

		driver.close();
	}

}

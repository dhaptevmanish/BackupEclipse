package LinksAdvanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Link.html#");
		// this is an alternate to the driver.get function

		WebElement homelink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a"));
		homelink.click();

		driver.navigate().back(); // to navigate back to the previous page
		driver.manage().wait(2000);

		WebElement Secondlink = driver.findElement(By.partialLinkText("Find where am supposed to go"));
		String second = Secondlink.getAttribute("href"); // here we are using the href attribute to find where the page
															// is going to
		System.out.println("This page is going to " + second);

		WebElement brokenlink = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/a"));
		brokenlink.click();
		String broken = driver.getTitle();

		if (broken.contains("404")) {
			System.out.println("page is broken");
		}

		driver.navigate().back();
		homelink.click();
		driver.navigate().back();

		List<WebElement> totallinks = driver.findElements(By.tagName("a"));

		int linkcount = totallinks.size();

		System.out.println("the total links available are" + linkcount);

		Thread.sleep(3000);

		driver.quit();

	}

}

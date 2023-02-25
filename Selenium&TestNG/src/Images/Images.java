package Images;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Images {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Image.html");

		WebElement FirstImage = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		FirstImage.click();

		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[4]/a/img")).click();
		Thread.sleep(2000);

		WebElement BrokenImage = driver.findElement(By.xpath("//*[@id=\"alttext-container\"]")); // this brpken image
		// is unable to be found please chck it

		if (BrokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
		} else {
			System.out.println("image is not broken");
		}

		Thread.sleep(3000);

		driver.quit();
	}

}

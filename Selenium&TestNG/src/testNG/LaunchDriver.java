package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LaunchDriver {
	WebDriver driver;

	@BeforeSuite
	public void launchbrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {
		driver.get("https://www.google.com/");
		System.out.println("opened google");
	}

	@Test
	public void openyoutube() {
		driver.get("https://www.youtube.com/");
		System.out.println("opened youtube");
	}

	@AfterSuite

	public void closedriver() {
		driver.quit();
	}

}

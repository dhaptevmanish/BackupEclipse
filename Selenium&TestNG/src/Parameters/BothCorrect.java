package Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothCorrect {

	@Test
	@Parameters({ "username", "password" })
	public void loginwithBothCorrect(String username, String password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement Usrname = driver.findElement(By.id("txtUsername"));
		Usrname.sendKeys(username);
		WebElement passwrd = driver.findElement(By.id("txtPassword"));
		passwrd.sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(4000);

		driver.quit();
	}

}

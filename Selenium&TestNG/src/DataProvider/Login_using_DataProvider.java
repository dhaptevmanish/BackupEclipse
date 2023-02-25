package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// here we are just running one class with different combinations of test data. WWW
// we are using this instead of parameters which requires individual class to enter each data into the website 
// we are using data provider to pass all the combinations of the data into a string and mapping it to dataprovider
// that will take turn to run each test case again and again in the same class with different tst data this saves us from creating multiple classes

public class Login_using_DataProvider {

	// here we r creating a 2d string value to add the different combinations to the
	// string

	String[][] data = { { "admin", "admin123" }, { "Adm", "admin1" }, { "Ad", "admin123" }, { "Admin", "admin123" } };

	@DataProvider(name = "logindata") // here we r giving a name for the data provider just like we give name for any
										// test case or suite in xml
	public String[][] logindataprovider() {
		return data; // here we are returning the data which holds the string values of the different
						// combinations
	}

	@Test(dataProvider = "logindata") // this is to connect the data provider and test annotations
	public void loginwithBothCorrect(String username, String password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		WebElement Usrname = driver.findElement(By.id("txtUsername"));
		Usrname.sendKeys(username);
		WebElement passwrd = driver.findElement(By.id("txtPassword"));
		passwrd.sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		Thread.sleep(8000);

		driver.quit();
	}

}

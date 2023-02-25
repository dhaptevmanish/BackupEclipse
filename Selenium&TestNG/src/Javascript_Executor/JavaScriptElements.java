package Javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptElements {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
// we are converting webdriver into javascript interface by typecasting
// These execute scripts will just act like a script and perform the action like alerts popup, text box etc which can't be done in java		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('Welcome to selenium')");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		js.executeScript("prompt('Please enter your name')");
		driver.switchTo().alert().sendKeys("Name is manish");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		js.executeScript("confirm('Hi there please cnfrm')");
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		driver.quit();
		
	}

}

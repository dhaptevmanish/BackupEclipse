package testNG;

/* Assertions are validation points used to verify certain outcomes
Assert is a separate class in testNG which will allow u to compare values 

*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Assert {

	//String name = "hello";

	@Test
	public void checkequals() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("opened google");
		
		Assert.this.checkequals();
		

	}
	

}

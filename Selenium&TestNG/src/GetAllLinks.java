import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinks {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		 //Launching sample website
		 driver.get("https://artoftesting.com/sampleSiteForSelenium");
		 driver.manage().window().maximize();
		 List <WebElement> alllinks = driver.findElements(By.tagName("a"));
		 
		 for (WebElement links: alllinks) {
			 System.out.println(links.getText()+ links.getAttribute("href"));
		 }
		

	}

}

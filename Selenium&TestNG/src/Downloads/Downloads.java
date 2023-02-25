package Downloads;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloads {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://testingbot.com/enterprise/security");
		WebElement dwnloadFile = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/a"));
		dwnloadFile.click();

		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		File filelocation = new File("C:\\Users\\Manish\\Downloads");
		File[] totalfiles = filelocation.listFiles();

		for (File filename : totalfiles)// this searches directory for ther file name till the file name is found
		{
			if (filename.getName().equals("testingbot_security_whitepaper.pdf")) {
				System.out.println(" file is presentin" + filelocation);
			}
		}

	}

}

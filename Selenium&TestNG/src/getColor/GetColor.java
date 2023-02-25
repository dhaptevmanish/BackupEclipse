package getColor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetColor {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement element = driver.findElement(By.xpath("//*[@name=\'login']"));

		String rgbavalue = element.getCssValue("background-color");
		System.out.println(rgbavalue);

		String hexcolorvalue = Color.fromString(rgbavalue).asHex();
		System.out.println(hexcolorvalue);

	}
}

package DragDrop_ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();

		WebElement tooltip = driver.findElement(By.id("age"));

		String Tooltiptext = tooltip.getAttribute("title"); // because all the tooltips will have a attribute named
															// title
		// hence we can use that to get that to print the value thats available
		System.out.println(Tooltiptext);
	}
}
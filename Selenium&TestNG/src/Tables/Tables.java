package Tables;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://leafground.com/pages/table.html");

		List<WebElement> coloumns = driver.findElements(By.tagName("th"));
		int coloumnsize = coloumns.size();
		System.out.println("There are" + coloumnsize + "coloumns");

		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowsize = rows.size();
		System.out.println("There are" + rowsize + "rows");

		// xpath tutorial - https://www.guru99.com/xpath-selenium.html

		WebElement getpercent = driver
				.findElement(By.xpath("//td[normalize-space()= 'Learn to interact with Elements']//following::tr[1]"));
		String percent = getpercent.getText();
		System.out.println("% value is" + " " + percent);

		List<WebElement> allProgress = driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberlist = new ArrayList<Integer>();

		for (WebElement webelement : allProgress) {
			String individualValue = webelement.getText().replace("%", ""); // this is to replace the % with the space
																			// inorder
			// inorder to get the final list
			numberlist.add(Integer.parseInt(individualValue));
		}

		System.out.println("final list" + numberlist);

	}
}

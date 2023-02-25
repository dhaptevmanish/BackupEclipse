package iFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();

		driver.switchTo().frame(0); // using this to switch to the first frame i.e frame 0 since we dont have a
									// frame name
		// we are using frame(n) option
		WebElement button1 = driver.findElement(By.id("Click"));
		button1.click();

		String text = button1.getText(); // we are printing the text that is observed after clicking the button
		System.out.println(text);

		driver.switchTo().defaultContent(); // we have to give this to return back to the default/main frame
		// we have to give this after shifting the focus to to any frame.

		// we are using nested switch to frame here because the button is inside a frame
		// which is inside a frame like nested frame

		driver.switchTo().frame(1); // this is the first frame
		driver.switchTo().frame("frame2"); // this is the second frame that is inside a frame

		WebElement button2 = driver.findElement(By.id("Click1")); // here we are clicking the next frame
		button2.click();

		driver.switchTo().defaultContent(); // we have to give this to return back to the default/main frame
		// we have to give this after shifting the focus to to any frame.

		List<WebElement> totalNoofFrames = driver.findElements(By.tagName("iframe")); // creating a list to store the
																						// element size
		int size = totalNoofFrames.size();
		System.out.println("The total no of frames are" + size);

		driver.quit();

	}
}
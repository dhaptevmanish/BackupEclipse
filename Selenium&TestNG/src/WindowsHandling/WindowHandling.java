package WindowsHandling;

import java.sql.DriverManager;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();

		// first operation Click button to open home page in New Window

		String ParentWindow = driver.getWindowHandle(); // this is hold the value of the parent window

		WebElement firstbutton = driver.findElement(By.id("home"));
		firstbutton.click();// Click button to open home page in New Window

		Set<String> handles = driver.getWindowHandles(); // This will returns the number of windows that are opened at
															// that time
		// handles la value irka varaikum it will iterate the loop like if there are 2
		// handles it will iterate 2 time

		for (String newWindow : handles) {
			driver.switchTo().window(newWindow); // this will switch the focus to the new window that is opened
		}

		WebElement editboxnewWindow = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editboxnewWindow.click(); // this will click the edit button in the new window

		WebElement newwindowtextbox = driver.findElement(By.id("email"));
		newwindowtextbox.sendKeys("Hello@gmail.com"); // this will fill the values in the email textbox

		driver.close(); // this will close the child window that was opened

		driver.switchTo().window(ParentWindow); // this will bring back the focus to the parent window the default
												// window that was opened initially

		// Find number of OpenMultiple windowsBoxes
		WebElement Multiple = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		Multiple.click();
		int noOfWindows = driver.getWindowHandles().size(); // to find the no of open windows

		System.out.println("no.of windows opened is" + noOfWindows);

		// close everything apart from parentwindow

		WebElement dontCloseParent = driver.findElement(By.id("color"));
		dontCloseParent.click();
		Set<String> newWindowhandles = driver.getWindowHandles(); // This will returns the number of windows that are
																	// opened at
		// that time
		for (String allopenWindows : newWindowhandles) {
			if (!allopenWindows.equals(ParentWindow)) // this will check if the window is not equal to tha parent window
			{
				driver.switchTo().window(allopenWindows); // if the window open is not a parent window the focus will
															// switch to that window
				driver.close(); // this will close the opened child window

			}

		}
	}

}

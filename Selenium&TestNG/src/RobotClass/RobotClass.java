package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;

import org.apache.batik.w3c.dom.events.KeyboardEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.appium.java_client.android.nativekey.KeyEvent;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	public static void main(String args[]) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.edureka.co/");
		driver.findElement(By.linkText("Courses")).click();
		Robot robot = new Robot();
		Thread.sleep(4000);
		robot.keyPress(java.awt.event.KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(java.awt.event.KeyEvent.VK_TAB);
		robot.mouseMove(30, 100);

		driver.close();

	}

}

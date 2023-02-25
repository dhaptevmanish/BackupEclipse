package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.Browser;
import Utilities.ExcelDataProvider;
import Utilities.Helper;

public class Screenshot {
	WebDriver driver;
	
	@Test 
	public void login() throws InterruptedException, IOException {
		
		
		BaseClass.setup();
		Helper.captureScreenshot(driver);
		Helper.getCurrentDateTime();
	}

}

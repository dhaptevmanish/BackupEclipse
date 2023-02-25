package TestCases;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import TestPages.LoginPage;
import Utilities.BaseClass;
import Utilities.Browser;
import Utilities.ExcelDataProvider;

public class NavigateToWebPage extends BaseClass {
	WebDriver driver;
	public ExcelDataProvider excel;

	@Test
	public void navigate() throws InterruptedException, IOException {

		BaseClass.setupSuite();

		logger = report.createTest("login");

		LoginPage lpage = PageFactory.initElements(driver, LoginPage.class);
// this is like creating a page object model 
		logger.info("Starting application");

		lpage.logginginPage(excel.getStringData("Sheet1", 0, 0), excel.getStringData("Sheet2", 0, 1));
		logger.pass("pass");

	}

}

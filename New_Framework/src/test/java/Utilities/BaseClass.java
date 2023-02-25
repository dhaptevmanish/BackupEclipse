package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ExtentReports report;
	public static ExtentTest logger;

	@BeforeSuite
	public static void setupSuite() throws IOException {
		Reporter.log("Setting up reports and test is getting ready", true);

		excel = new ExcelDataProvider();
		ExtentSparkReporter extent = new ExtentSparkReporter(new File(System.getProperty("user.dir") + "/Reports/Report.html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		
		Reporter.log("Setting Done-Test can be started", true);

	}

	@BeforeClass
	public static void setup() throws InterruptedException {
		Reporter.log("Trying to start a browser", true);

		driver = Browser.startdriver(driver, "Chrome",
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	public void teardown() {
		Browser.quitbrowser(driver);
	}

	@AfterMethod
	public static void teardownMethod(ITestResult result) throws IOException, InterruptedException {
		if (result.getStatus() == ITestResult.FAILURE) {
			// Helper.captureScreenshot(driver);
			logger.fail("Test failed",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.pass("Test passed",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());

		}
		report.flush();
	}

}

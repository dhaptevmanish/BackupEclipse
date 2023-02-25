package Getting_data_from_excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelData_using_JXL {

	String[][] data = null;

	@DataProvider(name = "logindata") // here we r giving a name for the data provider just like we give name for any
										// test case or suite in xml
	public String[][] logindataprovider() throws BiffException, IOException {
		data = getExcelData();
		return data; // here we are returning the data which holds the string values of the different
						// combinations
	}

	public String[][] getExcelData() throws BiffException, IOException {
		// FileInputStream is used to read and get a file
		FileInputStream excel = new FileInputStream("C:\\Testdata\\TestData_for_JXLjar.xls");
		Workbook wrkbookname = Workbook.getWorkbook(excel); // to perfrm operation inside the wrkbook we need a class
															// workbook, so we are using this
		Sheet sheet = wrkbookname.getSheet(0); // using this we can get the focus into the sheet1 of the excel workbook
		// we can also give the sheet name (i.e sheet1, sheet2 etc in the getsheet
		// value)
		// now the focus will come into the sheet

		int NoOfRows = sheet.getRows();
		int NoOfColoumns = sheet.getColumns();
		// we are creating a 2D string to get the values from the excel sheet
		String testdata[][] = new String[NoOfRows - 1][NoOfColoumns];
		// here we r putting no.ofrows -1 bcoz the first row has the heading and we
		// don't want that so we are putting -1

		for (int i = 1; i < NoOfRows; i++) { // we are putting i value as 1 bcoz the first row has the heading and we
												// dont want it so we r using 1

			for (int j = 0; j < NoOfColoumns; j++) {
				// using j here to iterate the no.of coloums
				testdata[i - 1][j] = sheet.getCell(j, i).getContents(); // this is to get the values in that cell
				// testdata [i-1] [j] we r using this to cnvrt the excel data into the 2d array
				// structure format
			}
		}
		return testdata;
	}

	@Test(dataProvider = "logindata") // this is to connect the data provider and test annotations
	public void loginwithBothCorrect(String username, String password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();

		WebElement Usrname = driver.findElement(By.id("txtUsername"));
		Usrname.sendKeys(username);
		WebElement passwrd = driver.findElement(By.id("txtPassword"));
		passwrd.sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		Thread.sleep(8000);

		driver.quit();
	}

}

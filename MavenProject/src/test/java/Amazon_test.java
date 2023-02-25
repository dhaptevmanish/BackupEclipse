import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_test {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-main']/div[1]/a[1]/i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Kindle")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'All Kindle eBooks')]")).click();
		Thread.sleep(2000);

		// getting data from excel

		File src = new File("C:\\Testdata\\Amazon.xlsx"); // this is like
		// creating a objct for the file path and assigning it in inputstream

		FileInputStream excel = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook(excel); // this is used to load excel workbook
		XSSFSheet sheet1 = workbook.getSheetAt(0);// this is to specify the sheet in which the data is

		String data = sheet1.getRow(1).getCell(0).getStringCellValue();

		Thread.sleep(5000);

		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		searchbox.sendKeys(data);
		searchbox.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//span[contains(text(),'Effective Java: A Programming Language Guide (Java')]")).click();

		Thread.sleep(4000);

		driver.quit();

	}
}

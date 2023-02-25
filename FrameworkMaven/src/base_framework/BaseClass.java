package base_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ConstantsFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// we are creating objects here so that we can call it in code that needs this, we can just call the objct
	// it will infer back to the base class and fetch the values there
	
	 // we are intialising variable as static because in order to have a method to access a variable the variable
	// must also be static
	
	// static method can only access a static variable 
	static File file;
	public static Properties prop;
	static FileInputStream fileinput;
	public static WebDriver driver;
	public Logger logging = Logger.getLogger("TestScripts");
	
	
	public static void intializePropertiesFile(String filepath) throws IOException {
		
		file = new File(filepath);
		fileinput = new FileInputStream(file);
		prop = new Properties();
		prop.load(fileinput);
	}
	
	public static String readproperty(String Property) {
		
		return prop.getProperty(Property);
	}
	
	public  void launchBrowser () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(readproperty(ConstantsFile.Application)); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, null);
		driver.quit();
		
// we r using this since we already have a method to read the data from the property file, we just have to mention which attribute we have to read from the property file
		
	}
	
	
}

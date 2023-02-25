package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver localdriver) // this constructor will help us to intialize the webdriver
	{
		this.driver = localdriver; // this local driver come frm the main test case whatever reference we pass into
									// test case will pass into this
// reference as driver

	}
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
	static WebElement uname;
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
	static WebElement pword; 
	
	@FindBy(name = "loginbutton") WebElement LoginButton;
	
	static WebElement loginbutton;
	

	public void logginginPage (String username, String password) throws InterruptedException 
	{
		
		Thread.sleep(5000);
		uname.sendKeys(username);
		pword.sendKeys(password);
		loginbutton.click();
	}
}

package pages;

import org.openqa.selenium.By;

import base_framework.BaseClass;

public class Homepage extends BaseClass{
	
	By SeleniumButton = By.xpath("//a[contains(text(),'Selenium')]");
	
	public void Click () {
		driver.findElement(SeleniumButton).click();
		System.out.println("The page title is" + driver.getTitle());
	}

}

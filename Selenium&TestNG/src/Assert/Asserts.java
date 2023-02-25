package Assert;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testNG.Assert;

public class Asserts {

	@Test

	public void SOftAssert() {

		SoftAssert softAssert = new SoftAssert();
		System.out.println("Test1 has started");
		softAssert.assertEquals(12, 13);
		System.out.println("Test1 completed");

	}
	
	
	@Test 
	public void Hardassert() {
		

		System.out.println("Test2 has started");
		// Assert.assertEquals(12, 13); // this is the cindition for hard assert
		System.out.println("Test2 completed");
		
		
	}

}

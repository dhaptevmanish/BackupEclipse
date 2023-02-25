package testNG;

import org.testng.annotations.Test;

public class dependencies {

	@Test (dependsOnMethods = "secondcase") 

	public void firstcase() {
		System.out.println("first case");
	}

	@Test
	public void secondcase() {
		System.out.println("secondcase");
	}

	@Test(enabled = true)
	public void thirdcase() {
		System.out.println("thirdcase");
	}

}

// since the firstcase method is dependent on the secondcase 
// method the secondcase method will be executed first
// enabled = false is used to skip a test case 
// by default enabled is true 
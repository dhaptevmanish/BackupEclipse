package testcases;

import java.io.IOException;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_framework.BaseClass;
import pages.Homepage;

public class TestScripts extends BaseClass {

	BaseClass basecls = new BaseClass();
	Homepage homepg = new Homepage();
	String filepath = System.getProperty("user.dir") + "//src//config//config.properties";

	// since the clickyoutube method is not a static one we have to create a object
	// to access that method

	/*
	 * public static void main(String[] args) throws IOException { String filepath =
	 * System.getProperty("user.dir")+"//src//config//config.properties";
	 * BaseClass.intializePropertiesFile(filepath);
	 * System.out.println("PropertyRead:"+BaseClass.readproperty("applicationurl"));
	 * 
	 * }
	 */

	// @ test is just like main function in java program once we put annotations the
	// compiler will look for annotations just like main

	@Test
	public void readpropertytest() throws IOException {
		System.out.println("Test started");
		intializePropertiesFile(filepath);
		PropertyConfigurator.configure(System.getProperty("user.dir") + prop.getProperty("log4jRelativeFilePath"));
		logging.info("INFO: In test Method:readPropertyTest");

		System.out.println("PropertyRead:" + BaseClass.readproperty("applicationurl"));

	}
//	
//	@Test  
//	public void POMTest () throws IOException {
//		System.out.println("PropertyRead:"+BaseClass.readproperty("applicationurl"));
//
//		launchBrowser();
//		homepg.Click();
//	}

}

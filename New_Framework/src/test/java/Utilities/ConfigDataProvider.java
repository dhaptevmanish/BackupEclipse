package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws FileNotFoundException {
	
	
	File src = new File("./Configuration/config.properties");
	
	FileInputStream fis = new FileInputStream(src);
}
	public String getdatafromconfig(String keytoSearch) {
		return keytoSearch; 
		
	}
	public String getbrowser() {
		return pro.getProperty("Browser");
	}
	public String getURL() {
		return pro.getProperty("testURL");
	}
	
}

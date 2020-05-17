package com.soumi.compediumautomation.basepages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.soumi.compediumautomation.utils.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
    
	public static PropertyFileUtility propertiesFile = new PropertyFileUtility();
	//Using Singleton design pattern using Lazy initialization
	private static WebDriver driver = null;
	
	// 1. Creating private constructor
	private Driver() {
		try {
			String browserName = propertiesFile.getPropertyValue("browser");
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("IE")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try {
			driver.get(propertiesFile.getPropertyValue("URL"));
		} catch (Exception e) {
			e.printStackTrace();
		}
        
		DriverManager.setWebdriver(driver);
	}
	//Creating a public static method and return the driver Object
	public static WebDriver intialize() {
		if(DriverManager.getDriver()==null)
			try {
				 new Driver();
			} 
		    catch (Exception e) {
				e.printStackTrace();
			}
		return driver;
	}
	
	public static void tearDown() {
		 driver.quit();
	}
	public static String pageTitle() {
		return driver.getTitle();
	}

	

	
}

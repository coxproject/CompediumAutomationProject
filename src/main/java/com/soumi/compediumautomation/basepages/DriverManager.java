package com.soumi.compediumautomation.basepages;

import org.openqa.selenium.WebDriver;

public class DriverManager {
   public static ThreadLocal<WebDriver> thread = new ThreadLocal<WebDriver>();
   
   public static WebDriver getDriver() {
	   return thread.get();
   }
   
   public static void setWebdriver(WebDriver driver) {
	    thread.set(driver);
   }
}

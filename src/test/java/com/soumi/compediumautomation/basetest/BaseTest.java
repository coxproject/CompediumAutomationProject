package com.soumi.compediumautomation.basetest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.soumi.compediumautomation.basepages.BasePage;
import com.soumi.compediumautomation.basepages.Driver;
import com.soumi.compediumautomation.pagecomponents.CompediumPageComponents;

//All Testng annotation @Before Class, @Before Method, @After Class, @After Method goes here

public class BaseTest extends BasePage{
    protected CompediumPageComponents com;
	
	@BeforeTest
	public void launchBrowser() {
		Driver.intialize();
	    com = new CompediumPageComponents();
	}
	@AfterTest
	public void closeBrowser() {
		Driver.tearDown();
	}

	
}
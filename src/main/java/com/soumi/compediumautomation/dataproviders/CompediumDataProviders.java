package com.soumi.compediumautomation.dataproviders;

import org.testng.annotations.DataProvider;

//All data providers we will keep in this file
public class CompediumDataProviders extends CompediumTestDataExcelUtils{

	@DataProvider(name = "userdetails")
	public Object[][] getData() {
		Object[][] data = { { "test", "password1", "welcome", }, { "test123", "password2", "Onboard" },
				{ "test456", "password3", "Welcome" } };
		return data;

	}

	@DataProvider(name = "userData")
	public Object[][] getUserData(){
		Object data[][] = CompediumTestDataExcelUtils.getTestData("Sheet1");
		return data;
	}
	
	
}

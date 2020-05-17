package com.soumi.compediumautomation.ui.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.soumi.compediumautomation.basepages.BasePage;
import com.soumi.compediumautomation.basepages.Driver;
import com.soumi.compediumautomation.basetest.BaseTest;
import com.soumi.compediumautomation.dataproviders.CompediumDataProviders;

//All Tests will go in this file
public class CompediumTests extends BaseTest {

	//@Test(dataProvider="userdetails", dataProviderClass=CompediumDataProviders.class)
	@Test(priority =1, dataProvider="userdetails", dataProviderClass=CompediumDataProviders.class)
	public void submitForm(String username,String password,String comments) {
		com.enterUsername().sendKeys(username);
		com.enterPassword().sendKeys(password);
		com.enterComments().clear();
		com.enterComments().sendKeys(comments);
		//com.fileUpload().sendKeys(propertiesFile.getPropertyValue("filepath"));
	    com.selectedCheckboxItems();
	    com.selectedRadioButtons();
	    com.selectedDropdownItems();
	    com.dropdownSelect();
	    com.OnSubmit().click();
	}
	
	@Test(priority=1)
	public void resetAllFields() {
		com.enterUsername().clear();
		com.enterPassword().clear();
		com.enterComments().clear();
		com.fileUpload().clear();
		com.selectCheckoxes();
		com.elementRadiobutton().clear();
		com.deSelectedMultipleItems();
		com.deSelectdropdown();
		//com.saveFailureScreenShot(driver)
	}
	
	@Test(priority=3)
	public void verifyPageTitle() {
		String expected = "HTML Form Elements";
		String actual = Driver.pageTitle();
		Assert.assertEquals(actual, expected);
	}

}
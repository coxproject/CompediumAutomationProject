package com.soumi.compediumautomation.pagelocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.soumi.compediumautomation.basepages.BasePage;
import com.soumi.compediumautomation.basepages.DriverManager;

//All Locators for that page we will keep it here
public class CompediumPageLocators extends BasePage {

	@FindBy(how = How.NAME, using = "username")
	public static WebElement username;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;

	@FindBy(how = How.NAME, using = "comments")
	public static WebElement comments;

	@FindBy(how = How.NAME, using = "filename")
	public static WebElement fileName;

	@FindBy(how=How.NAME, using = "checkboxes[]")
	public static List<WebElement> checkboxes;
	
    @FindBy(how = How.NAME, using = "radioval")
    public static List<WebElement> radioButton;

    @FindBy(how = How.NAME, using = "multipleselect[]")
    public static WebElement selectDropdown;
    
    @FindBy(how = How.NAME, using = "dropdown")
    public static WebElement dropDown;
    
    @FindBy(how = How.NAME, using="submitbutton")
    public static WebElement submitButton;
    
	public CompediumPageLocators() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	
}

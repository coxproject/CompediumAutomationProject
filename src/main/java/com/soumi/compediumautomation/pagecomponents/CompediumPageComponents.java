package com.soumi.compediumautomation.pagecomponents;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.soumi.compediumautomation.pagelocators.CompediumPageLocators;

//All actions in the page for example Dropdown, click, send keys, frames,window handles if any in the page we will keep it here
public class CompediumPageComponents extends CompediumPageLocators {

	public WebElement enterUsername() {
		return username;
	}

	public WebElement enterPassword() {
		return password;
	}

	public WebElement enterComments() {
		return comments;
	}

	public WebElement fileUpload() {
		return fileName;
	}

	public List<WebElement> selectCheckoxes() {
		return checkboxes;
	}

	public void selectedCheckboxItems() {
		List<WebElement> items = checkboxes;
		for (int i = 0; i < items.size(); i++) {
			items.get(i).click();
		}
	}

	public List<WebElement> elementRadiobutton() {
		return radioButton;
	}

	public void selectedRadioButtons() {
		List<WebElement> radioButton = elementRadiobutton();
		radioButton.get(2).click();
	}

	public static WebElement selectDropdown() {
		return selectDropdown;
	}

	public void selectedDropdownItems() {
		Select select = new Select(selectDropdown());
		select.selectByValue("ms1");
		select.selectByVisibleText("Selection Item 3");
	}
	
	public void deSelectedMultipleItems() {
		Select select = new Select(selectDropdown());
		select.deselectByValue("ms1");
		select.deselectByVisibleText("Selection Item 3");
	}

	public void dropdownSelect() {
		Select select = new Select(dropDown);
		List<WebElement> allOptions = select.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			//System.out.println(allOptions.get(i).getText());
			if (allOptions.get(i).getText().trim().equals("Drop Down Item 6")) {
				allOptions.get(i).click();
				break;
			}
		}
	}
	
	public void deSelectdropdown() {
		Select select = new Select(dropDown);
		List<WebElement> allOptions = select.getOptions();
		for (int i = 0; i < allOptions.size(); i++) {
			//System.out.println(allOptions.get(i).getText());
			if (allOptions.get(i).isSelected()) {
				allOptions.clear();
				break;
			}
		}
	}
	public WebElement OnSubmit() {
		return submitButton;
	}
	

	/*public void onTestFailure(ITestResult result) {
		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
		System.out.println(result.getMethod().getMethodName() + " failed!");

		ITestContext context = result.getTestContext();
		driver = (WebDriver) context.getAttribute("driver");

		// attach screenshots to report
		saveFailureScreenShot(driver);
	}
	
	@Attachment(value = "Web Page Screenshot", type = "image/png")
	public byte[] saveFailureScreenShot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}*/

}
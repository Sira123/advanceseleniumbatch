package com.actitime.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actitime.Helperclass.Baseclass;

public class AddNewProjectPage {
	
	@FindBy(name="customerId")
	private WebElement customerDropdown;
	
	@FindBy(name="name")
	private WebElement projectNameTextField;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;
	
	public AddNewProjectPage()
	{
		PageFactory.initElements(Baseclass.driver,this);
	}
	
	public void selectCustomerFromDropdown(String customerName)
	{
		Select s1=new Select(customerDropdown);
		s1.selectByVisibleText(customerName);
		
	}
	
	public void enterProjectName(String projectName) 
	{
		projectNameTextField.sendKeys(projectName);
		
	}
	
	
	public void clickOnCreateProjectButton()
	{
		createProjectButton.click();
	}
	

}

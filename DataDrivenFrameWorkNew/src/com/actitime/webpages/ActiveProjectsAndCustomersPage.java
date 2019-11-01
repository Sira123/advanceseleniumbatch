package com.actitime.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.Helperclass.Baseclass;

public class ActiveProjectsAndCustomersPage {
	
	
     @FindBy(xpath="//input[@value='Add New Customer']")	
	 private WebElement addNewCustomerButton;
	 
	 @FindBy(className="successmsg")
	 private WebElement successMessage;
	 
	 @FindBy(xpath="//input[@value='Add New Project']")
	 private WebElement addNewProjectButton;
	 
	 public ActiveProjectsAndCustomersPage()
	 {
		 PageFactory.initElements(Baseclass.driver,this);
		 
	 }
	 
	 public void clickOnAddNewCustomerButton()
	 {
		 addNewCustomerButton.click();
		 
		 
	 }
	 
	 public String retriveSuccessMessage()
	 {
		 
		   String s=successMessage.getText();
		 return s;
	 }
	
	public void selectACustomerfromTheList(String customerName)
	{
		
		Baseclass.driver.findElement(By.linkText(customerName)).click();
	}
public void clickOnAddNewProjectButton()
{
	
	addNewProjectButton.click();
}

}

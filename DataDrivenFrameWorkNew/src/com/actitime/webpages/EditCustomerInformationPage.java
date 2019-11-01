package com.actitime.webpages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.Helperclass.Baseclass;

public class EditCustomerInformationPage 
{
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private WebElement deleteThisCustomerButton;
	
	public EditCustomerInformationPage()
	{
		
		PageFactory.initElements(Baseclass.driver,this);
	}
	
	public void deleteThisCustomer()
	{
		deleteThisCustomerButton.click();
		Baseclass.driver.switchTo().alert().accept();
		
		
	}

}

package com.actitime.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.Helperclass.Baseclass;

public class OpenTaskPage {

	
	@FindBy(linkText="Projects & Customers")
	private  WebElement projectsAndCustomersLink;
	
	public OpenTaskPage()
	{
		
		PageFactory.initElements(Baseclass.driver,this);
	}
	
	
	public void clickOnProjectsAndCustomersLink()
	{
		projectsAndCustomersLink.click();
	
	}
	
	
	
}

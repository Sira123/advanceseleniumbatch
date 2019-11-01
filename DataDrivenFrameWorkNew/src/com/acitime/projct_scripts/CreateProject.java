package com.acitime.projct_scripts;

import org.testng.annotations.Test;

import com.actitime.Helperclass.Baseclass;
import com.actitime.webpages.ActiveProjectsAndCustomersPage;
import com.actitime.webpages.AddNewProjectPage;
import com.actitime.webpages.OpenTaskPage;

public class CreateProject extends Baseclass {
	
	
	@Test
	public void testCreateProject()
	{
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomersLink();
		
		ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
		apcp.clickOnAddNewProjectButton();
		
		AddNewProjectPage anpp=new AddNewProjectPage();
		anpp.selectCustomerFromDropdown("lenovo");
		
		anpp.enterProjectName("qspiders12");
		anpp.clickOnCreateProjectButton();
		String actual = apcp.retriveSuccessMessage();
		System.out.println(actual);
		
	}

}

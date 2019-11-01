package com.actitime.customer_scripts;

import org.testng.annotations.Test;

import com.actitime.Helperclass.Baseclass;
import com.actitime.webpages.ActiveProjectsAndCustomersPage;
import com.actitime.webpages.EditCustomerInformationPage;
import com.actitime.webpages.OpenTaskPage;

public class DeleteCustomer extends Baseclass {

@Test
public void testDeleteCustomer()
{
	
	
	OpenTaskPage otp=new OpenTaskPage();
	otp.clickOnProjectsAndCustomersLink();
	
	ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
	apcp.selectACustomerfromTheList("savithri");
	
	
	EditCustomerInformationPage etp=new EditCustomerInformationPage();
	etp.deleteThisCustomer();
	String actual=apcp.retriveSuccessMessage();
	System.out.println(actual);
}
	
	
}

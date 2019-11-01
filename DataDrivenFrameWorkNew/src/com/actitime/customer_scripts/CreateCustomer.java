package com.actitime.customer_scripts;
import org.testng.annotations.Test;

import com.actitime.Helperclass.Baseclass;
import com.actitime.webpages.ActiveProjectsAndCustomersPage;
import com.actitime.webpages.AddNewCustomerPage;
import com.actitime.webpages.OpenTaskPage;
public class CreateCustomer extends Baseclass
{

	@Test
	public void testCreateCustomer()
	{
		//Step 1 fetch neccessary data from excel
		
	//Step 2Convert TC into TS	
		
		OpenTaskPage otp=new  OpenTaskPage();
		otp.clickOnProjectsAndCustomersLink();
		
		ActiveProjectsAndCustomersPage apcp=new ActiveProjectsAndCustomersPage();
		 apcp.clickOnAddNewCustomerButton();
		 
		 
		 AddNewCustomerPage ancp=new AddNewCustomerPage();
		 ancp.enterCustomerName("qsi4ryhh");
		 
		 ancp.clickOnCreateCustomerButton();
		 String actual = apcp.retriveSuccessMessage();
		 System.out.println(actual);
	//step 3 compare exp and actual resut
		 
		 //step 4 write act and status in excel
		
		
	}
}

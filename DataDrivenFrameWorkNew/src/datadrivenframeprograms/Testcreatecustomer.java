package datadrivenframeprograms;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.Helperclass.Baseclass;
import com.actitime.Helperclass.Exceloperation;

public class Testcreatecustomer extends Baseclass
{
	@Test
	public void createcustomer() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.cssSelector("input[value='Add New Customer']")).click();
		 String CUSTOMER=Exceloperation.Readdata("customerdata", 1, 3);
      driver.findElement(By.name("name")).sendKeys(CUSTOMER);
		driver.findElement(By.name("createCustomerSubmit")).click();
		 
  }
}

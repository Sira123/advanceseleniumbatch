package datadrivenframeprograms;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.Helperclass.Baseclass;
import com.actitime.Helperclass.Exceloperation;

public class Testcreateproject extends Baseclass
{

	@Test
	public void createcustomer() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.cssSelector("input[value='Add New Project']")).click();
		WebElement d1=driver.findElement(By.name("customerId"));
		Select s1=new Select(d1);
		int i=s1.getOptions().size();
		System.out.println("no of options="+i);
		s1.selectByIndex(2);
		 String PROJECT=Exceloperation.Readdata("customerdata", 1, 4);
      driver.findElement(By.name("name")).sendKeys(PROJECT);
		driver.findElement(By.name("createProjectSubmit")).click();
		 
  }


}

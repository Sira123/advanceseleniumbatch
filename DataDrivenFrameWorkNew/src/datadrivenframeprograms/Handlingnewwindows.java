package datadrivenframeprograms;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.Helperclass.Baseclass;

public class Handlingnewwindows extends Baseclass
{
	@Test
	public void createcustomer() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		driver.findElement(By.linkText("Reports")).click();
		String currentwindow = driver.getWindowHandle();
        driver.findElement(By.cssSelector("img[alt='Click Here to Pick up the date']")).click();
		Set<String> rv1 = driver.getWindowHandles();
		for(String s1:rv1)
	        {
        	if(!currentwindow.equals(s1))
        	{
	        		driver.switchTo().window(s1);
	               break;
	        	}
	          }
		System.out.println(driver.getTitle());
	 driver.findElement(By.xpath("//span[text()='15']")).click();
	 
     		driver.switchTo().window(currentwindow);
         

}
}

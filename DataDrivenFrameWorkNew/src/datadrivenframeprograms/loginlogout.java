package datadrivenframeprograms;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.Helperclass.Exceloperation;

public class loginlogout {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        ChromeDriver c1=new ChromeDriver();
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String URL=Exceloperation.Readdata("Exceldata", 1, 0);
		String UN=Exceloperation.Readdata("Exceldata", 1, 1);
       String PSWD=Exceloperation.Readdata("Exceldata", 1, 2);
       String EXPECTEDRESULTS=Exceloperation.Readdata("Exceldata", 1, 3);
       c1.get(URL);
	  c1.findElement(By.name("username")).sendKeys(UN);
      c1.findElement(By.name("pwd")).sendKeys(PSWD);
		c1.findElement(By.cssSelector("input[type='submit']")).click();
		String Actual=c1.getTitle();
		System.out.println(Actual);
		
		Exceloperation.writedata("Exceldata", 1, 4,Actual);
		if(EXPECTEDRESULTS.equals(Actual))
		{
			Exceloperation.writedata("Exceldata", 1, 5,"True");

			}
		else
		{
			Exceloperation.writedata("Exceldata", 1, 5,"False");

		}
		c1.findElement(By.className("logoutImg")).click();

}

}
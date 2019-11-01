package com.actitime.Helperclass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
@Listeners(Frameworklistner.class)
public class Baseclass 
{   
	public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
        String browser="Chrome";
        String URL="http://dilireddy:81/login.do";
       if(browser.equals("Firefox"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
            driver=new FirefoxDriver();
        }
        else if(browser.equals("Chrome"))
        {
        	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else
        {
        	System.out.println("Invalid browser");
        }
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

        }
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	@BeforeClass
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		 String UN="admin";//Exceloperation.Readdata("Exceldata", 1, 2);
	     String PSWD="manager";//Exceloperation.Readdata("Exceldata", 1, 3);
		driver.findElement(By.name("username")).sendKeys(UN);
		driver.findElement(By.name("pwd")).sendKeys(PSWD);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
      }
	@AfterClass
	public void logout()
	{
		driver.findElement(By.className("logoutImg")).click();

	}
}
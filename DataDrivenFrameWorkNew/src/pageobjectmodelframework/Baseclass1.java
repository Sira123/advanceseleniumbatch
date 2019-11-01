package pageobjectmodelframework;
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

public class Baseclass1 
{
public static WebDriver driver;
	
	@BeforeTest
	public void openBrowser() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
        String BROWSER=Exceloperation1.Readdata("vtigerslogindata", 1, 0);
        String URL=Exceloperation1.Readdata("vtigerslogindata", 1, 1);
       if(BROWSER.equals("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
            driver=new FirefoxDriver();
        }
        else if(BROWSER.equals("Chrome"))
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
		 String UN=Exceloperation1.Readdata("vtigerslogindata", 1, 2);
	     String PSWD=Exceloperation1.Readdata("vtigerslogindata", 1, 3);
		driver.findElement(By.name("user_name")).sendKeys(UN);
		driver.findElement(By.name("user_password")).sendKeys(PSWD);
		driver.findElement(By.id("submitButton")).click();
      }
	@AfterClass
	public void logout()
	{
		driver.findElement(By.linkText("Sign Out")).click();

	}
}



package datadrivenframeprograms;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingnewtabs {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		ChromeDriver f1=new ChromeDriver();
		f1.get("file:///C:/HTML%20programs/newtabs.html");
		f1.findElement(By.linkText("actiTIME")).click();
		ArrayList<String> a=new ArrayList<String>(f1.getWindowHandles());
		f1.switchTo().window(a.get(1));
	    f1.findElement(By.name("username")).sendKeys("admin");
	    f1.findElement(By.name("pwd")).sendKeys("manager");
		f1.findElement(By.cssSelector("input[type='submit']")).click();
		}

}

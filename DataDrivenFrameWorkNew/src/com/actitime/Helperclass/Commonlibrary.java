package com.actitime.Helperclass;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Commonlibrary 
{
	public static void selectfromIndex(WebElement dropdown,int index)
	{
		Select s1=new Select(dropdown);
		s1.selectByIndex(index);
	}
	public static void selectfronoption(WebElement dropdown,String option)
	{
		Select s1=new Select(dropdown);
		s1.deselectByVisibleText(option);
	}
	public static void selectfromvalue(WebElement dropdown,String value )
	{
		Select s1=new Select(dropdown);
		s1.selectByValue(value);
	}
	public static void takescreenshot(String name) throws IOException
	{
		EventFiringWebDriver rv1=new EventFiringWebDriver(Baseclass.driver);
		File f1=rv1.getScreenshotAs(OutputType.FILE);
		File f2=new File("D:\\ScreenShot//"+name+".jpg");
		FileUtils.moveFile(f1, f2);
		}
	}


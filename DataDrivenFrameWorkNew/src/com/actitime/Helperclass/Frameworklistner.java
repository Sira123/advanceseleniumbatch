package com.actitime.Helperclass;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Frameworklistner implements ITestListener
{
	
	public void onTestFailure(ITestResult rv) 
	{
		String s=rv.getName();
		try {
			Commonlibrary.takescreenshot(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		

}

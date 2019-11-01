package com.actitime.webpages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addcustomerprogram {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        ChromeDriver c1=new ChromeDriver();
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        FileInputStream e1 =new FileInputStream("D:\\testdata\\userdata.xlsx");
		Workbook w1 = WorkbookFactory.create(e1);
		String s=w1.getSheet("customerdata").getRow(1).getCell(0).getStringCellValue();
	    c1.get(s);
		String s1=w1.getSheet("customerdata").getRow(1).getCell(1).getStringCellValue();
		c1.findElement(By.name("username")).sendKeys(s1);
		String s3=w1.getSheet("customerdata").getRow(1).getCell(2).getStringCellValue();
        c1.findElement(By.name("pwd")).sendKeys(s3);
		c1.findElement(By.cssSelector("input[type='submit']")).click();
		c1.findElement(By.linkText("Projects & Customers")).click();
		c1.findElement(By.cssSelector("input[value='Add New Customer']")).click();
		String s4=w1.getSheet("customerdata").getRow(1).getCell(3).getStringCellValue();
        c1.findElement(By.name("name")).sendKeys(s4);
		c1.findElement(By.name("createCustomerSubmit")).click();
		String s5=w1.getSheet("customerdata").getRow(1).getCell(5).getStringCellValue();
        System.out.println(s5);
		String s6=c1.findElement(By.className("successmsg")).getText();
		System.out.println(s6);
		w1.getSheet("customerdata").getRow(1).createCell(5).setCellValue(s6);
        FileOutputStream e2=new FileOutputStream("D:\\testdata\\userdata.xlsx");       
	    w1.write(e2);
	    boolean res = s5.equals(s6);
       System.out.println(res);
       w1.getSheet("customerdata").getRow(1).createCell(6).setCellValue(res);
       FileOutputStream e3=new FileOutputStream("D:\\testdata\\userdata.xlsx");       
	    w1.write(e3);
		c1.findElement(By.className("logoutImg")).click();
	

	}

}

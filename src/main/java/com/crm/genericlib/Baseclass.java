package com.crm.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public WebDriver driver=null;
	
	FileUtility flib=new FileUtility();
	ExcelUtility elib=new ExcelUtility();
	
	@BeforeSuite
	public void configBS()
	{
		System.out.println("Connec to database");
	}
	@BeforeClass
	public void configBC() throws Throwable
	{
		String BROWSER = flib.getpropertydata("browser");
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
	}
	@BeforeMethod
	public void configBM()
	{
		System.out.println("Login");
	}
	@AfterMethod
	public void configAM()
	{
		System.out.println("logout");
	}
	@AfterClass
	public void configAC()
	{
		driver.close();
	}
	@AfterSuite
	public void configAS()
	{
		System.out.println("Close databser");
	}

}

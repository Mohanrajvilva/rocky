package com.crm.genericlib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImp implements ITestListener{
	
	public void onTestFailure(ITestResult result)
	{
		String screenname = result.getMethod().getMethodName();
		//TakesScreenshot driver;
		EventFiringWebDriver sdriver=new EventFiringWebDriver(null);
		File src = sdriver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Photo"+screenname+".PNG");
		try {
			FileUtils.copyFile(src, dest);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}

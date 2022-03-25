package com.crm.genericlib;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver driver=null;
	
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void implicitwait(WebDriver driver)
	{
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	public void explicitwait(WebElement ele,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public void elementtobeclickable(WebElement ele,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public void dropdown(WebElement ele,int index)
	{
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	public void dropdown(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	public void dropdown(String text,WebElement ele)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	public void customwait(WebElement ele) throws Throwable
	{
		int count=0;
		while(count<20)
		{
			try {
			ele.click();
			}
			catch (Exception e) {
				// TODO: handle exception
				Thread.sleep(2000);
				count++;
			}
			
		}
	}
	public void doubleclick(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.doubleClick().perform();
		
	}
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void moushover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void draganddrop(WebDriver driver,WebElement src,WebElement dest)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest);
	}
	public void acceptalert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void dissmissalert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void switchtoframe(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	public void swithtoframe(WebDriver driver,String name)
	{
		driver.switchTo().frame(name);
	}
	public void switchtoframe(WebDriver driver,WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	public void switchtoparent(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	public void switchtodefault(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void screenshot(WebDriver driver,String Screenshotname) throws Throwable
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./photo/"+Screenshotname+".PNG");
		FileUtils.copyFile(src, dest);
	}
	public void switchtowindow(WebDriver driver,String partialtitle)
	{
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String winid = it.next();
			driver.switchTo().window(winid);
			String wintitle = driver.getTitle();
			if(wintitle.equals(partialtitle))
			{
				break;
			}
			
		}
	}

}

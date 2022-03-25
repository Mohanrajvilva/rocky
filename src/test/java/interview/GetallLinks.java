package interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetallLinks {
	
	@Test
	public void getlinks()
	{
		System.setProperty("webdriver.chrome.driver","D:\\TEST YANTRA\\APPIUM\\TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
//		List<WebElement> link = driver.findElements(By.tagName("a"));
//		
//		System.out.println("The link count is"+link.size());
//		
//		for(WebElement ele:link)
//		{
//			System.out.println(ele.getText()+"---->"+ele.getAttribute("href"));
//		}
		
		List<WebElement> listling = driver.findElements(By.xpath("//body//a"));
		System.out.println(listling.size());
		for(WebElement ele:listling)
		{
			String linnks = ele.getAttribute("href");
			System.out.println(linnks);
		}
	}

}

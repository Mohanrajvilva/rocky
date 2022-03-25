package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithoutSendkeys {
	
	@Test
	public void withoutsendkeys() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","D:\\TEST YANTRA\\APPIUM\\TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Thread.sleep(2000);
		js.executeScript("document.getElementById('email').value='7598565740'");
		driver.close();
	}

}

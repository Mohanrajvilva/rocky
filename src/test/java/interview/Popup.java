package interview;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popup {
	@Test
	public void popuphandle()
	{
				System.setProperty("webdriver.chrome.driver","D:\\TEST YANTRA\\APPIUM\\TOOLS\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.naukri.com/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				String parent = driver.getWindowHandle();
				System.out.println(parent);
				
				Set<String> child = driver.getWindowHandles();
				 
				System.out.println(child);
				
				driver.quit();

	}

}

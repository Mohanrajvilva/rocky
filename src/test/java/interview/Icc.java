package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icc {
	
		public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\TEST YANTRA\\APPIUM\\TOOLS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		Thread.sleep(2000);
		
		String matches = driver.findElement(By.xpath("//table[@class='table']/tbody/tr[contains(.,' New Zealand')]/td[3]")).getText();
		
		System.out.println(matches);
		driver.close();
		
			

	}

}

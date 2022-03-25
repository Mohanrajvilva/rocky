package interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Autosuggestion {
	
	@Test
	public void auto() {
	System.setProperty("webdriver.chrome.driver","D:\\TEST YANTRA\\APPIUM\\TOOLS\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Mohan");
	List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
//	for(WebElement eleq:ele)
//	{
//		if(eleq.getText().equals("mohanlal age"))
//		{
//			eleq.click();
//		}
//	}
	for(int i=0;i<5;i++)
	{
		System.out.println(ele.get(i).getText());
	}
	driver.close();

}
}

package singletonpattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		DriverInit instanceDriver = DriverInit.getInstance();
		driver = instanceDriver.openBrowser();
		System.out.println("setupped driver");
		
	}
	@Test
	public void testMethod() throws InterruptedException {
		System.out.println("opening url");
		Thread.sleep(3000);
	
		driver.get("http://www.google.com"); //if http or https not givem then it throws invalid argument exception
		
		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}

package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Bases;

public class Tests 
{
	WebDriver driver;
	@BeforeMethod()
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/login");
	}
	
	@Test()
	public void test()
	{
		Bases b=new Bases(driver);
		b.login("Ichyan", "Aleena");
	}
	
	
	
}

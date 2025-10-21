package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Bases;
import Base.Registration;

public class Tests 
{
	WebDriver driver;
	@BeforeMethod()
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test()
	public void test()
	{
		//Bases b=new Bases(driver);
	//	b.login("Ichyan", "Aleena");
		Registration r=new Registration(driver);
		r.Registration("Anu", "anu@gmail.com");
		
	}
	
	
	
}

package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Contactus;
import Base.Delete;
import Base.Login;
import Base.Registration;
import Base.accountInfo;

public class Tests 
{
	WebDriver driver;
	
	@BeforeMethod()
	public void before()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(priority=1)
	public void newusersignup() throws AWTException
	{
		Registration r=new Registration(driver);
		r.Regitration("Anu", "anuq@gmail.com");
		accountInfo a=new accountInfo(driver);
		a.accountdetails("74BELqibHi@dGt6","24","July" ,"2020");
		a.addressinfo("anna","pk","kgf company","cyberpark","infopark","India","Kerala","Kozhikkode","987678","987654321");
		
		Login l=new Login(driver);
		l.login("anuq@gmail.com", "74BELqibHi@dGt6");
		l.InUnamepass("invaliduser@gmail.com","74BELqibHi@dGt6");
		l.UnameInpass("anna","invalidpassword");
		
		Delete d=new Delete(driver);
		d.delt();
		
	//	l.login("anuq@gmail.com", "74BELqibHi@dGt6");
		Contactus c=new Contactus(driver);
		c.contact("Anu", "anuq@gmail.com", "resume", "hi hope ou fine");
		
	}	
	}
//	@AfterMethod()
//	public void after()
//	{
//		driver.close();
//	}
	
	


package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Bases 
{

	WebDriver driver;
	
	@BeforeMethod()
	public void before()
	{
		By email=By.id("//*[@id=\"email\"]");
		By pas=By.id("//*[@id=\"password\"]");
	}
	
	
}

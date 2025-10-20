package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Bases 
{

	WebDriver driver;
	
		By email=By.id("email");
		By pas=By.id("password");
	
		public Bases(WebDriver driver)
		{
			this.driver = driver;

		}
	public void login(String mail,String pswd)
	{
		driver.findElement(email).sendKeys(mail);
		driver.findElement(pas).sendKeys(pswd);
	}
	
	
}

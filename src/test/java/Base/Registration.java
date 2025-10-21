package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration 
{
	WebDriver driver;
	
	
	By name=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
	By email=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	By signup=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	By title=By.xpath("//*[@id=\"id_gender2\"]");
	By pswd=By.xpath("//*[@id=\"password\"]");

	public Registration(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Registration(String nam,String mail,String pswrd)
	{
		driver.findElement(name).sendKeys(nam);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(signup).click();
		driver.findElement(title).click();
		driver.findElement(pswd).sendKeys(pswrd);
		

	}
	
}

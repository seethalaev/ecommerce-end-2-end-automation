package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class accountInfo {

	WebDriver driver;
	By title=By.xpath("//*[@id=\"id_gender2\"]");
	By pswd=By.xpath("//*[@id=\"password\"]");
	
	By day=By.xpath("//*[@id=\"days\"]");
	By month=By.xpath("//*[@id=\"months\"]");
	By year=By.xpath("//*[@id=\"years\"]");
	By newsletter=By.xpath("//*[@id=\"newsletter\"]");
	public accountInfo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void accountdetails(String pswrd,String dayvalue,String monthvalue,String yearelement)
	{
		driver.findElement(title).click();
		driver.findElement(pswd).sendKeys(pswrd);
		
		Select dayselect=new Select(driver.findElement(day));
		dayselect.selectByValue(dayvalue);
		
		Select monthselect=new Select(driver.findElement(month));
		monthselect.selectByVisibleText(monthvalue);
		
		
		Select yearselect=new Select(driver.findElement(year));
		yearselect.selectByValue(yearelement);
		
		driver.findElement(newsletter).click();
	
	}
}

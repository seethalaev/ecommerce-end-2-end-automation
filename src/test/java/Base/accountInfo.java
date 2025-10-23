package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class accountInfo 
{

	WebDriver driver;
	
	By title=By.xpath("//*[@id=\"id_gender2\"]");
	By pswd=By.xpath("//*[@id=\"password\"]");
	
	By day=By.xpath("//*[@id=\"days\"]");
	By month=By.xpath("//*[@id=\"months\"]");
	By year=By.xpath("//*[@id=\"years\"]");
	By newsletter=By.xpath("//*[@id=\"newsletter\"]");
	
	By fname=By.xpath("//*[@id=\"first_name\"]");
    By lname=By.xpath("//*[@id=\"last_name\"]");
    By cmpny=By.xpath("//*[@id=\"company\"]");
    By adrs=By.xpath("//*[@id=\"address1\"]");
    By adrs2=By.xpath("//*[@id=\"address2\"]");
    By country=By.xpath("//*[@id=\"country\"]");
    By state=By.xpath("//*[@id=\"state\"]");
    By city=By.xpath("//*[@id=\"city\"]");
    By zip=By.xpath("//*[@id=\"zipcode\"]");
    By mobile=By.xpath("//*[@id=\"mobile_number\"]");
    By login=By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
	By conti=By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
    By logout=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    
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
	public void addressinfo(String frname,String lsname,String com,String adr,String adr2,String county,String ste,String cit,String zipcod,String mob)
	{
		driver.findElement(fname).sendKeys(frname);
		driver.findElement(lname).sendKeys(lsname);
		driver.findElement(cmpny).sendKeys(com);
		driver.findElement(adrs).sendKeys(adr);
		driver.findElement(adrs2).sendKeys(adr2);
		
		Select countryset=new Select(driver.findElement(country));
		countryset.selectByVisibleText(county);
		driver.findElement(state).sendKeys(ste);
		driver.findElement(city).sendKeys(cit);
		driver.findElement(zip).sendKeys(String.valueOf(zipcod));
		driver.findElement(mobile).sendKeys(String.valueOf(mob));
		driver.findElement(login).click();
		driver.findElement(conti).click();
		driver.findElement(logout).click();
		System.out.println(driver.getTitle());

		
	}
}

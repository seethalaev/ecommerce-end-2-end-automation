package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete
{
	WebDriver driver;
	By delete=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a/i");
	
	public Delete(WebDriver driver)
	{
		this.driver=driver;
	}
	public void delt()
	{
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(delete)).click();
	  
	    




package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Delete
{
	WebDriver driver;
	
	
	public Delete(WebDriver driver)
	{
		this.driver=driver;
	}
	public void delt()
	{
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.elementToBeClickable(delete)).click();
	        String url = driver.getCurrentUrl();
	        System.out.println("After delete, current URL: " + url);
	    }
	
	}
	
	    



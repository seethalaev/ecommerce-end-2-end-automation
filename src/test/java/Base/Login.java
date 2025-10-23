package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

   public class Login 

   {

		WebDriver driver;
		WebDriverWait wait;
		By email=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
		By pas=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
		By login=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	    By logout=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

	
		public Login(WebDriver driver)
		{
			this.driver = driver;
			wait=new WebDriverWait(driver,Duration.ofSeconds(10));

		}
	public void login(String mail,String pswd)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(mail);
        wait.until(ExpectedConditions.visibilityOfElementLocated(pas)).sendKeys(pswd);
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
        wait.until(ExpectedConditions.elementToBeClickable(logout)).click();
        String actual=driver.getTitle();
        if(actual.equalsIgnoreCase("automationexercise.com"))
        {
        	System.out.println("passed");
        }
        else
        {
        	System.out.println("not passed");
        }
	
	}
	public void InUnamepass(String mil,String paswd)
 	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(mil);
        wait.until(ExpectedConditions.visibilityOfElementLocated(pas)).sendKeys(paswd);
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
        String actual=driver.getTitle();
        if(actual.equalsIgnoreCase("automationexercise.com"))
        {
        	System.out.println("passed");
        }
        else
        {
        	System.out.println("not passed");
        }
	}
}

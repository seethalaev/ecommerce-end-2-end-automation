package Base;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

   public class Login 

   {

		WebDriver driver;
		WebDriverWait wait;
		By email=By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]");
		By pas=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
		By login=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	    By logout=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

	
	    package Base;

	    import java.io.IOException;
	    import java.net.HttpURLConnection;
	    import java.net.MalformedURLException;
	    import java.net.URL;
	    import java.time.Duration;
	    import java.util.List;

	    import org.openqa.selenium.By;
	    import org.openqa.selenium.WebDriver;
	    import org.openqa.selenium.WebElement;
	    import org.openqa.selenium.support.ui.ExpectedConditions;
	    import org.openqa.selenium.support.ui.WebDriverWait;

	       public class Login 

	       {

	    		WebDriver driver;
	    		WebDriverWait wait;
	    		By email=By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]");
	    		By pas=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
	    		By login=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	    	    By logout=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

	    	
	    		public Login(WebDriver driver)
	    		{
	    			this.driver = driver;
	    			wait=new WebDriverWait(driver,Duration.ofSeconds(10));

	    		}
	    		package Base;

	    		import java.io.IOException;
	    		import java.net.HttpURLConnection;
	    		import java.net.MalformedURLException;
	    		import java.net.URL;
	    		import java.time.Duration;
	    		import java.util.List;

	    		import org.openqa.selenium.By;
	    		import org.openqa.selenium.WebDriver;
	    		import org.openqa.selenium.WebElement;
	    		import org.openqa.selenium.support.ui.ExpectedConditions;
	    		import org.openqa.selenium.support.ui.WebDriverWait;

	    		   public class Login 

	    		   {

	    				WebDriver driver;
	    				WebDriverWait wait;
	    				By email=By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]");
	    				By pas=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
	    				By login=By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	    			    By logout=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");

	    			
	    				public Login(WebDriver driver)
	    				{
	    					this.driver = driver;
	    					wait=new WebDriverWait(driver,Duration.ofSeconds(10));

	    				}
	    			public void login(String mail,String pswd) throws IOException
	    			{
	    				String actuapgsrc=driver.getPageSource();
	    				if(actuapgsrc.contains(" Video Tutorials"))
	    				{
	    					System.out.println("video editor is in as content");
	    				}
	    				else
	    				{
	    					System.out.println("content not present");
	    				}
	    				wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(mail);
	    		        wait.until(ExpectedConditions.visibilityOfElementLocated(pas)).sendKeys(pswd);
	    		        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	    		        wait.until(ExpectedConditions.elementToBeClickable(logout)).click();
	    		        String base=driver.getCurrentUrl();
	    		        String actual=driver.getTitle();
	    		        System.out.println("title "+actual);
	    		       
	    		     
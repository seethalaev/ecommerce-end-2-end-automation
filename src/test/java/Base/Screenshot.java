package Base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	WebDriver driver;
	By testcas=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
	
	public Screenshot(WebDriver driver)
	{
		this.driver=driver;
	}
	public void scr() throws IOException
	{
		driver.findElement(testcas).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		File sreen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D://E4u.png");
		FileHandler.copy(sreen, dest);
		driver.navigate().back();
			}
}

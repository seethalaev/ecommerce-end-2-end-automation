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
	By img=By.xpath("//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
	
	public Screenshot(WebDriver driver)
	{
		this.driver=driver;
	}
	
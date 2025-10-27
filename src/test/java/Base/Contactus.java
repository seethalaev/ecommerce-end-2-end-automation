package Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contactus {

	WebDriver driver;
	By contactus=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
	By name=By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input");
	By email=By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input");
	By sub=By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
	By message=By.xpath("//*[@id=\"message\"]");
	By choosefile=By.name("upload_file");
	By submit=By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");
	
	public Contactus(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void contact(String nam,String emil,String subjct,String msg) throws AWTException
	{
		driver.findElement(contactus).click();
		driver.findElement(name).sendKeys(nam);
		driver.findElement(email).sendKeys(emil);
		driver.findElement(sub).sendKeys(subjct);
		driver.findElement(message).sendKeys(msg);
		driver.findElement(choosefile).click();
		uploadfile("D:\\picturess\\Pictures\\amazon");
		driver.findElement(submit).click();
	 	
		
		
	}

	
}

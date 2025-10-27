package Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
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
	By subit=By.name("submit");
	
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
		driver.findElement(choosefile).sendKeys("D:\\picturess\\Pictures\\amazon");
		driver.findElement(subit).click();
	 	
	}

	public void allert()
	{
		Alert aler=driver.switchTo().alert();
		System.out.println(aler.getText());
		aler.accept();
	}
	

//	private void uploadfile(String string) throws AWTException {
//		// TODO Auto-generated method stub
//		 StringSelection str=new StringSelection("D:\\picturess\\Pictures\\amazon");
//			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//			Robot robot=new Robot();
//			robot.delay(3000);
//			
//			robot.keyPress(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_V);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_CONTROL);
//	}
}


package Base;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Aa {
	
	ChromeDriver driver;
	@BeforeMethod()
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@org.testng.annotations.Test()
	public void tst()
	{
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button")).click();

		driver.findElement(By.xpath("//*[@id='nav-xshop']/ul/li[5]/div")).click();

	}
	
}

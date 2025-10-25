package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Delete
{
	WebDriver driver;
	By delete=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
	
	public Delete(WebDriver driver)
	{
		this.driver=driver;
	}
	public void delt()
	{
		driver.findElement(delete).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
}

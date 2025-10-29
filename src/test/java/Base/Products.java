package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Products
{
	WebDriver driver;
	By product=By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
	By target = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a");
	By cont=By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
	By view=By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[2]/ul/li/a/i");
	By arrowmark=By.xpath("//*[@id=\"quantity\"]");
	By addcart=By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
	By viewc=By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u");
	By itemdeselect=By.xpath("//*[@id=\"product-2\"]/td[6]/a/i");
	By procheckout=By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");
	By concart=By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[3]/button");
	By login=By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u");
	public Products(WebDriver driver)
	{
		this.driver=driver;	
	}
	public void acton()
	{
		driver.findElement(product).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)","");
		driver.findElement(target).click();
		driver.findElement(cont).click();
		driver.findElement(view).click();
		driver.findElement(arrowmark);
		driver.findElement(addcart).click();
		driver.findElement(viewc).click();
		driver.findElement(itemdeselect).click();
		driver.findElement(procheckout).click();
		driver.findElement(concart).click();
		driver.findElement(procheckout).click();
		driver.findElement(login).click();
		
			}
	
}

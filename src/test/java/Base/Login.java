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

	
	
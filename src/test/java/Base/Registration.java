package Base;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration 
{
	WebDriver driver;
	
	
	By name=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
	By email=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	By signup=By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	
	
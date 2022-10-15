package Org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {
	ChromeDriver driver; 
	Properties pr;
	
	public LogoutPage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	
	public void signout() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("Image_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("LogOut_button"))).click();
		Thread.sleep(1000);
		driver.close();
	}
}

package Org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
   ChromeDriver driver;
   Properties pr;
	 
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	
	public void logindetails(String username, String Password) throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("Login_Button"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("Username"))).sendKeys(username);
		driver.findElement(By.xpath(pr.getProperty("NextButton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pr.getProperty("Pasword"))).sendKeys(Password);
		driver.findElement(By.xpath(pr.getProperty("NexButton"))).click();
		Thread.sleep(2000);
	}
}

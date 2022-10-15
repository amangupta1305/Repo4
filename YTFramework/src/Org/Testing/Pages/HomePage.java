package Org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	ChromeDriver driver;
	Properties pr;
	
	public HomePage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void trendingpage() throws InterruptedException
	{
	            driver.findElement(By.xpath(pr.getProperty("Explore_button"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(pr.getProperty("Trending_button"))).click();
				Thread.sleep(2000);
				
	}
	
	
	public void historypage() throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("History_button"))).click();
		Thread.sleep(2000);
        System.out.println("TC2 completed");
				
	}
	public void Subscriptionpage() throws InterruptedException
	{
	driver.findElement(By.xpath(pr.getProperty("Subscription_button"))).click();
	Thread.sleep(2000);
	}
	
	public void WatchLaterpage() throws InterruptedException
	{
	driver.findElement(By.xpath(pr.getProperty("WatchLater_button"))).click();
	Thread.sleep(3000);
	}
	
	public void Librarypage() throws InterruptedException
	{
	driver.findElement(By.xpath(pr.getProperty("Library_button"))).click();
	Thread.sleep(3000);
	}
	public void newpage() throws InterruptedException
	{
	 driver.findElement(By.xpath("(//*[@id='video-title'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='subscribe-button'])[2]")).click();
		Thread.sleep(2000);
	}
}

package Org.Testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VideoPlaypage {
	ChromeDriver driver;
	Properties pr;
	
	public VideoPlaypage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void Commentonvideo() throws InterruptedException
	{
		 List<WebElement>list=driver.findElements(By.xpath("(//*[@id='video-title']"));
		    for(WebElement w:list)
		    {
		    	w.click();
		    	System.out.println(w.getText());
		    	break;
		    }
		Actions ac=new Actions(driver);
	    ac.sendKeys(Keys.PAGE_DOWN).perform();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//img[@alt='aman mittal']")).click();
	    Thread.sleep(1000);
	    ac.sendKeys(Keys.TAB).perform();
	    Thread.sleep(2000);
	    ac.sendKeys("happy to all").perform();
	    Thread.sleep(3000);
	}
}

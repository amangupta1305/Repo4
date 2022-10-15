package Org.Testing.Utlilities;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {
	static WebDriver driver;
	
	
	public void uploadfile(String filepath) throws AWTException
	{
		Robot ro=new Robot();
		System.setProperty("webdriver.chrome.driver","../YTFramework/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://resume.naukri.com/resume-quality-score");
		
		
		driver.findElement(By.xpath("//span[@class='browse']")).click();

		
		ro.setAutoDelay(2000);
		
		StringSelection st= new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, null);
		
		
		ro.setAutoDelay(1000);
		
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_V);
		
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyRelease(KeyEvent.VK_V);
		
		ro.setAutoDelay(1000);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);	
	}

}

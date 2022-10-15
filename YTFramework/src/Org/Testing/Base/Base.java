package Org.Testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v102.page.Page;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
  public ChromeDriver driver;
  public Properties pr;
	@BeforeMethod
	public void init() throws InterruptedException, IOException
	{
		
		File f=new File("../YTFramework/Object.properties");
		FileInputStream fr=new FileInputStream(f);
		pr=new Properties();
		pr.load(fr);
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","../YTFramework/chromedriver.exe");
		 driver=new ChromeDriver(option);
		 driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}

package Org.Testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Org.Testing.Base.Base;
import Org.Testing.Pages.Login;
import Org.Testing.Pages.LogoutPage;
import Org.Testing.Pages.VideoPlaypage;

public class TC6 extends Base{
	
	@Test
	public void testcase() throws InterruptedException 
	{
		Login logbut= new Login(driver, pr);
		logbut.logindetails("cawevo9520@pahed.com", "Ama@9871#");
	    Thread.sleep(2000);
	    VideoPlaypage comm= new VideoPlaypage(driver, pr);
	    comm.Commentonvideo();
	    LogoutPage lo=new LogoutPage(driver, pr);
		lo.signout();
		System.out.println("TC6 completed");
	}
	
}

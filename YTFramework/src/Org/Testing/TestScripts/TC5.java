package Org.Testing.TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Org.Testing.Base.Base;
import Org.Testing.Pages.HomePage;
import Org.Testing.Pages.Login;
import Org.Testing.Pages.LogoutPage;

public class TC5 extends Base{
	
	@Test
	public void testcase() throws InterruptedException 
	{
		Login logbut= new Login(driver, pr);
		logbut.logindetails("cawevo9520@pahed.com", "Ama@9871#");Thread.sleep(2000);
		HomePage hm=new HomePage(driver, pr);
		hm.newpage();
		LogoutPage lo=new LogoutPage(driver, pr);
		lo.signout();
		System.out.println("TC5 completed");
		
	}
	
	
	
}

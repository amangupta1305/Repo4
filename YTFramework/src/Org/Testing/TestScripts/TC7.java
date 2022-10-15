package Org.Testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Org.Testing.Base.Base;
import Org.Testing.Pages.HomePage;
import Org.Testing.Pages.Login;
import Org.Testing.Pages.LogoutPage;

public class TC7 extends Base{
	
	@Test
	public void testcase() throws InterruptedException 
	{
		Login logbut= new Login(driver, pr);
		logbut.logindetails("cawevo9520@pahed.com", "Ama@9871#");
		HomePage hm=new HomePage(driver, pr);
		hm.WatchLaterpage();
		LogoutPage lo=new LogoutPage(driver, pr);
		lo.signout();
		
	}
	
	
}

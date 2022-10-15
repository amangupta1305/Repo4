package Org.Testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Org.Testing.Base.Base;
import Org.Testing.Pages.HomePage;
import Org.Testing.Pages.Login;
import Org.Testing.Pages.LogoutPage;
import Org.Testing.Utlilities.LogsCapture;
import Org.Testings.Assertio.Aserti;

public class TC1 extends Base{
		
		@Test
		public void testcase() throws InterruptedException 
		{
			String ExpectedUrl="https://www.youtube.com/";
			Login logbut= new Login(driver, pr);
			
			Aserti.assertions(ExpectedUrl, driver.getCurrentUrl());
			logbut.logindetails("cawevo9520@pahed.com", "Ama@9871#");
			HomePage hm=new HomePage(driver, pr);
			hm.trendingpage();
			Aserti.Verifytitle("Trending - YouTube", driver.getTitle());
			LogoutPage lo=new LogoutPage(driver, pr);
			lo.signout();
			LogsCapture.takelog("TC1", "Test case successfully");
		}
		
		
		
}

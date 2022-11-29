package com.projectautomate.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.projectautomate.pom.HomePage;
import com.projectautomate.pom.Loginpage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("open browser",true);
		driver=new ChromeDriver();
		driver.get("http://192.168.254.128:8080/crm/HomePage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close Browser",true);
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException  
	{
		Reporter.log("login",true);
		Filelib f=new Filelib();
		String url = f.getPropertyData("url");
		String username = f.getPropertyData("username");
		String password = f.getPropertyData("password");
		driver.get(url);
		Loginpage p=new Loginpage(driver);
		p.setLogin(username,password);	
	}
	
	@AfterMethod
	public void Logout()
	{
		Reporter.log("logout",true);
		HomePage h=new HomePage(driver);
		h.setLogout();
		
		
	}

}

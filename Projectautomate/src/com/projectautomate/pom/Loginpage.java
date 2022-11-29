package com.projectautomate.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement untbx;
	
	@FindBy(xpath="//input[@id='passWord']")
	private WebElement pwdtbx;
	
	@FindBy(xpath="//input[@alt='Sign In']")
	private WebElement logintbx;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setLogin(String un,String pwd)
	{
		untbx.sendKeys(un);
		pwdtbx.sendKeys(pwd);
		logintbx.click();
	}
		
	
	

}

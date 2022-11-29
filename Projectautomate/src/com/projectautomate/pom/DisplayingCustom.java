package com.projectautomate.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustom {
	
	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newcampaigntbx;
	
	public DisplayingCustom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setnewcampaign()
	{
		newcampaigntbx.click();
	}

}

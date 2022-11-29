package com.projectautomate.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Logout [rashmi@dell.com]']")
	private WebElement logouttbx;
	
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement campaigntbx;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setLogout() {
	    logouttbx.click();
	}

	public void setCampaigntbx() {
		campaigntbx.click();
	}
	
	
	

}

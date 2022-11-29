package com.projectautomate.pom;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCampaign {
	
	@FindBy(xpath="//input[@name='property(Campaign Name)']")
	private WebElement campaignnametbx;
	
	 @FindBy(xpath="//select[@name='property(Type)']")
	 private WebElement typetbx;
	 
	 @FindBy(xpath="//select[@name='property(Status)']")
	 private WebElement statustbx;
	 
	 @FindBy(xpath="(//img[@title='Calendar'])[2]")
	 private WebElement enddatetbx;
	 
	 @FindBy(xpath="(//input[@type='submit'])[3]")
	 private WebElement savetbx;
	 
	 WebDriver driver;
	 
	 public CreateCampaign(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }

	public void setCampaignnametbx() {
		campaignnametbx.sendKeys("Dell Laptop1");
	}

	public void setTypetbx() {
		typetbx.click();
		Select s=new Select(typetbx);
		s.selectByIndex(2);
	}

	public void setStatustbx() {
		statustbx.click();
		Select s=new Select(statustbx);
		s.selectByIndex(2);
	}

	public void setEnddatetbx() throws InterruptedException {
		String pw = driver.getWindowHandle();
		enddatetbx.click();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			if(pw!=wh) {
				Thread.sleep(3000);
			driver.switchTo().window(wh);
		
		driver.findElement(By.xpath("//a[text()='15']")).click();
			}
		}
		
	}
		public void setSavetbx()
		{
			savetbx.click();
			
		}
	     
	

	 
}

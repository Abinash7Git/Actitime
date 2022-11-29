package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class taskListPage1 {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewtbx;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newprojecttbx;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @tabindex='1']")
	private WebElement projnametbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement dropdowntbx;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigbangtbx;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement prodesctbx;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement tasknametbx;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createprojtbx;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualtbx;
	
	public taskListPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddnewtbx() {
		return addnewtbx;
	}

	public WebElement getNewprojecttbx() {
		return newprojecttbx;
	}

	public WebElement getProjnametbx() {
		return projnametbx;
	}

	public WebElement getDropdowntbx() {
		return dropdowntbx;
	}

	public WebElement getBigbangtbx() {
		return bigbangtbx;
	}

	public WebElement getProdesctbx() {
		return prodesctbx;
	}

	public WebElement getTasknametbx() {
		return tasknametbx;
	}

	public WebElement getCreateprojtbx() {
		return createprojtbx;
	}
	public WebElement getactualtbx() {
		return actualtbx;
	}
	

}

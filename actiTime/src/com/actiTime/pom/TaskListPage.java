package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;

	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newCustbtn;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustdest;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectcust;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourcomptx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcusttx;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualcustcreated;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewCustbtn() {
		return newCustbtn;
	}

	public WebElement getEntercustname() {
		return entercustname;
	}

	public WebElement getEntercustdest() {
		return entercustdest;
	}

	public WebElement getSelectcust() {
		return selectcust;
	}

	public WebElement getOurcomptx() {
		return ourcomptx;
	}

	public WebElement getCreatecusttx() {
		return createcusttx;
	}
	
	public WebElement getactualcustcreated() {
		return actualcustcreated;
	}
	
	
}

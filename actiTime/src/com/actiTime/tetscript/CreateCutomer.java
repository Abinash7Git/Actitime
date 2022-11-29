package com.actiTime.tetscript;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.Filelib;
import com.actiTime.pom.EnterTimeTrackPage;
import com.actiTime.pom.TaskListPage;

@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class CreateCutomer extends BaseClass {
	
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("create customer",true);
		Filelib f=new Filelib();
		String expcustname = f.getExcelData("Create Cutomer",1,2);
		String expdescp=f.getExcelData("Create cutomer",1,3);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	    e.setTaskTab();
	    TaskListPage t=new TaskListPage(driver);
	    t.getAddnewbtn().click();
	    t.getNewCustbtn().click();
	    t.getEntercustname().sendKeys(expcustname);
	    t.getEntercustdest().sendKeys(expdescp);
	    t.getSelectcust().click();
	    t.getOurcomptx().click();
	    t.getCreatecusttx().click();
	    Thread.sleep(3000);
	    String actualcust=t.getactualcustcreated().getText();
	    Assert.assertEquals(actualcust,expcustname);
	    
	}

}

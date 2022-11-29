package com.actiTime.tetscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.Filelib;
import com.actiTime.pom.EnterTimeTrackPage;
import com.actiTime.pom.taskListPage1;

@Listeners(com.actiTime.generic.ListenerImplementation.class)

public class CreateProject extends BaseClass {
	
	@Test
	public void createProject() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("Create Project",true);
		Filelib f=new Filelib();
		String projname = f.getExcelData1("Create Project",1,2);
		String prodesc = f.getExcelData1("Create project",1,3);
		String taskname = f.getExcelData1("Create project",1,4);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setTaskTab();
		taskListPage1 e1=new taskListPage1(driver);
		e1.getAddnewtbx().click();
		e1.getNewprojecttbx().click();
		e1.getProjnametbx().sendKeys(projname);
		e1.getDropdowntbx().click();
		e1.getBigbangtbx().click();
		e1.getProdesctbx().sendKeys(prodesc);
		e1.getTasknametbx().sendKeys(taskname);
		e1.getCreateprojtbx().click();
		Thread.sleep(5000);
		String actualdata = e1.getactualtbx().getText();
		Assert.assertEquals(projname,actualdata);
		
		
		
		
	}

}

package com.projectautomate.testscript;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.projectautomate.generic.BaseClass;
import com.projectautomate.generic.Filelib;
import com.projectautomate.pom.CreateCampaign;
import com.projectautomate.pom.DisplayingCustom;
import com.projectautomate.pom.HomePage;

@Listeners(com.projectautomate.generic.ListenerImplementation.class)
public class Campaign extends BaseClass {
	
	@Test
	public void campaign() throws InterruptedException
	{
		Filelib f=new Filelib();
		//String expname=f.getExcelData("Campaign",1,3);
		HomePage h=new HomePage(driver);
		h.setCampaigntbx();
		DisplayingCustom dis=new DisplayingCustom(driver);
		dis.setnewcampaign();
		CreateCampaign cam=new CreateCampaign(driver);
	    cam.setCampaignnametbx();
	    Thread.sleep(5000);
	    cam.setStatustbx();
	    Thread.sleep(5000);
	    cam.setTypetbx();
	    Thread.sleep(5000);
	   cam.setEnddatetbx();
	    Thread.sleep(10000);
	    cam.setSavetbx();
	    Thread.sleep(5000);
	}

}

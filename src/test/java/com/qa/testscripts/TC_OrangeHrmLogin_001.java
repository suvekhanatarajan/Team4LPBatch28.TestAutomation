package com.qa.testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_OrangeHrmLogin_001 extends TestBase 
{
	  @Test(priority=1)
	  public void Login() throws InterruptedException, IOException
	    {
	    	OrangeHrmOR.getUsername().sendKeys(prop.getProperty("OrangeHrmUname"));
	    	OrangeHrmOR.getPwd().sendKeys(prop.getProperty("OrangeHrmPwd"));	
	    	OrangeHrmOR.getLoginBtn().click();
	    	Thread.sleep(2000);
	    	String Title=driver.getCurrentUrl();
	    	
	    	if(Title.contains("dashboard"))
	    	{
	    		sAssert.assertTrue(true);
	    	    Reporter.log("Login is Successful and the Dashboard option is selected",true);
	    	}
	    	else
	    	{
	    		sAssert.assertTrue(false);
	    		captureScreenshot(driver,"Login");
	    	}
	        sAssert.assertAll();
	    } 
}

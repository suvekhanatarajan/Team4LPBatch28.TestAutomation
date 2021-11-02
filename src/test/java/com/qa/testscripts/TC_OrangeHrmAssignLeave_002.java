package com.qa.testscripts;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_OrangeHrmAssignLeave_002 extends TC_OrangeHrmLogin_001{
    @Test(priority=2)
	public void assignLeave() throws InterruptedException, IOException
	{
    	OrangeHrmOR.getAssignLeaveBtn().click();
    	Thread.sleep(2000);
    	if(driver.getCurrentUrl().contains("assignLeave")) {
	       Reporter.log("Assign Leave Button is clicked",true);
    	}
    	else
    	{
    	  Reporter.log("Assign Leave Button is not clicked",true);
    	}
    	OrangeHrmOR.getEmpNmae().sendKeys(prop.getProperty("EmployeeName"));
    	OrangeHrmOR.getLeaveType().selectByVisibleText("US - Personal");
    	OrangeHrmOR.getCalender().click();
    	OrangeHrmOR.getMonth().selectByVisibleText("Aug");
    	OrangeHrmOR.getYear().selectByVisibleText("2022");
    	Thread.sleep(1000);
    	List<WebElement> Date=OrangeHrmOR.getDate();
    	for(WebElement num:Date)
    	{
    		if(num.getText().contains("31"))
    		{
    			num.click();
    			Reporter.log("The leave date is selected",true);
    		}
    	}
    	Thread.sleep(1000);
    	OrangeHrmOR.getAssignBtn().click();
    	Thread.sleep(1000);
    	
        if(driver.getPageSource().contains("Overlapping"))
    	{
    	 Reporter.log("Leave is not assigned",true);
    	 sAssert.assertTrue(false);
    	 captureScreenshot(driver, "assignLeave");
    	}
        else
        {
    	Reporter.log("Leave is assigned",true);
        }
    	Thread.sleep(1000);
    	sAssert.assertAll();
	}
}

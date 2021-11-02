package com.qa.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_OrangeHrmLeaveList_003 extends TC_OrangeHrmAssignLeave_002{
	
	@Test(priority=3)
      public void LeaveList() throws InterruptedException
      {
    	  OrangeHrmOR.getDashBoard().click();
    	  Thread.sleep(1000);
    	  OrangeHrmOR.getLeaveListBtn().click();
    	  Thread.sleep(1000);
    	  OrangeHrmOR.getAllLeaveStatus().click();
    	  OrangeHrmOR.getEmpname().sendKeys(prop.getProperty("EmployeeName"));
    	  OrangeHrmOR.getSearchBtn().click();
    	  Reporter.log("The leave list is displayed",true);
    	  Thread.sleep(2000);
    	  OrangeHrmOR.getResetBtn().click();
    	  Thread.sleep(1000);
      }
}

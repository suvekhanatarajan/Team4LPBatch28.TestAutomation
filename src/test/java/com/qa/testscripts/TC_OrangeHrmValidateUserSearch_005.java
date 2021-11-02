package com.qa.testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_OrangeHrmValidateUserSearch_005 extends TC_OrangeHrmTimeSheet_004 {
		@Test(dataProvider="getUserData",priority=6)
		public void ValidateUserSearch(String userName,String userRoll,String employeeName,String status) throws InterruptedException, IOException {
		    OrangeHrmOR.getAdminBtn().click();
		    OrangeHrmOR.getUserManagementBtn().click();
			OrangeHrmOR.getUser().click();
			OrangeHrmOR.getSearchUserName().sendKeys(userName);
			OrangeHrmOR.getSearchUserRoll().selectByVisibleText(userRoll);
			OrangeHrmOR.getSearchEmployeeName().sendKeys(employeeName);
			OrangeHrmOR.getSearchStatus().selectByVisibleText(status);
			OrangeHrmOR.getSearchButton().click();
			if(driver.getPageSource().contains("No Records Found")) {
				Reporter.log("Employee details are not found",true);
				sAssert.assertTrue(false);
	    		captureScreenshot(driver,"ValidateUserSearch");
	    		Thread.sleep(1000);
			}
			else {
				Reporter.log("Employee details are found",true);
			}
			sAssert.assertAll(); 
	    }
	    @DataProvider
	    public String[][] getUserData() throws IOException {
			 String xfile="C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
			 String xsheet="Sheet2";
			 int rowCount=ExcelUtility.getRowCount(xfile, xsheet);
			 int cellCount=ExcelUtility.getCellCount(xfile, xsheet, rowCount);
			 String data[][]=new String[rowCount][cellCount];
			 for(int i=1;i<=rowCount;i++) {
				for(int j=0;j<cellCount;j++) {
					data[i-1][j]=ExcelUtility.getCellData(xfile, xsheet, i, j);
				}
			}
			return data;
		 }
	
}

package com.qa.testscripts;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qa.utility.ExcelUtility;

public class TC_OrangeHrmTimeSheet_004 extends TC_OrangeHrmLeaveList_003{
    @Test(dataProvider="getData",priority=4)   
	public void TimeSheetView(String Name) throws InterruptedException, IOException
          {
        	  OrangeHrmOR.getDashBoard().click();
        	  OrangeHrmOR.getTimeSheetBtn().click();
        	  Thread.sleep(1000);
        	  OrangeHrmOR.getTSEmpname().clear();
        	  OrangeHrmOR.getTSEmpname().sendKeys(Name);
        	  OrangeHrmOR.getViewBtn().click();
        	  driver.navigate().back();
        	  if(driver.getPageSource().contains("Timesheets"))
        	  {
        		  Reporter.log("The Time Sheet of "+Name+" is not displayed",true);
        		  sAssert.assertTrue(false);
  	    		  captureScreenshot(driver,"TimeSheetView");
  	    		  Thread.sleep(1000);
  	    		
        	  }
        	  else
        	  {
        		  Reporter.log("The Time Sheet of "+Name+" is displayed",true);
        	  }
        	  Thread.sleep(2000);
        	sAssert.assertAll(); 
          }
    @Test(priority=5)
    public void MyTimeSheet() throws InterruptedException
    {
    	OrangeHrmOR.getDashBoard().click();
    	OrangeHrmOR.getMyTimeSheetBtn().click();
    	OrangeHrmOR.getEditBtn().click();
    	Thread.sleep(1500);
    	OrangeHrmOR.getPrjctNameField().click();
    	OrangeHrmOR.getPrjctNameField().clear();
    	OrangeHrmOR.getPrjctNameField().sendKeys("Internal - Training");
    	Thread.sleep(2000);
    	OrangeHrmOR.getPrjctName().click();
    	Thread.sleep(2000);
    	OrangeHrmOR.getActivityName().selectByVisibleText("Training Program Creation");
    	OrangeHrmOR.getDays().clear();
    	OrangeHrmOR.getDays().sendKeys("9");
    	Thread.sleep(2000);
    	OrangeHrmOR.getSaveBtn().click();
    	Thread.sleep(2000);
    }
    
    @DataProvider
    public String[][] getData() throws IOException{
  	 String xFile="C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
  	 String xSheet="Sheet1";
  	 int rowCount=ExcelUtility.getRowCount(xFile,xSheet);
  	 int cellCount=ExcelUtility.getCellCount(xFile, xSheet, rowCount);
  	 
  	 String[][] data=new String[rowCount][cellCount];
  	 for(int i=1;i<=rowCount;i++)
  	 {
  		 for(int j=0;j<cellCount;j++)
  		 {
  			data[i-1][j]=ExcelUtility.getCellData(xFile, xSheet, i, j); 
  		 }
  			 
  	 }
  	 return data;
  	  
    }
}

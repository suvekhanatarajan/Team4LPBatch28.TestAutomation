package com.qa.testscripts;


	import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

	public class TC_OrangeHrmValidateQualification_006 extends TC_OrangeHrmValidateUserSearch_005 {
		@Test(priority=7,dataProvider="getData1")
		public void ValidateSkills(String Skill) throws InterruptedException, IOException {
			OrangeHrmOR.getAdminBtn().click();
	    	OrangeHrmOR.getQualificationButton().click();
	    	OrangeHrmOR.getSkillsButton().click();
	        Reporter.log("Skill page is displayed",true);
	    	OrangeHrmOR.getAddButton().click();
	        Reporter.log("AddSkill page is displayed",true);
	    	OrangeHrmOR.getSkillsTextBox().sendKeys(Skill);
	    	OrangeHrmOR.getSkillsDescriptiontBox().sendKeys("Beginner");
	    	if(driver.getPageSource().contains(Skill)) {
		    	Reporter.log("Skill name is already exists",true);
		    	sAssert.assertTrue(false);
	    		captureScreenshot(driver,"ValidateSkills");
	    		Thread.sleep(2000);
		    }
		    else {
		        Reporter.log("Skill name is added successfully",true);
		    }
	        OrangeHrmOR.getSaveButton().click();
	        Thread.sleep(2000);
	        sAssert.assertAll(); 
		}
	   @Test(priority=8,dataProvider="getData2")
		public void ValidateEducation(String Education) throws InterruptedException, IOException {
			OrangeHrmOR.getAdminBtn().click();
			OrangeHrmOR.getQualificationButton().click();
		    OrangeHrmOR.getEducationButton().click();
		    Reporter.log("Education page is displayed",true);
		    OrangeHrmOR.getAddButton().click();
		    Reporter.log("AddEducation page is displayed",true);
		    OrangeHrmOR.getEducationTextBox().sendKeys(Education);
		    if(driver.getPageSource().contains(Education)) {
		    	Reporter.log("Education level is already exists",true);
		    	sAssert.assertTrue(false);
	    		captureScreenshot(driver,"ValidateEducation");
	    		Thread.sleep(2000);
		    }
		    else {
		    Reporter.log("Education level is added successfully",true);
		    }
		    OrangeHrmOR.getSaveButton().click();
		    Thread.sleep(2000);
		    sAssert.assertAll(); 
		}
		
		@Test(priority=9,dataProvider="getData3")
		public void ValidateLicenses(String license) throws InterruptedException, IOException {
			OrangeHrmOR.getAdminBtn().click();
			OrangeHrmOR.getQualificationButton().click();
			OrangeHrmOR.getLicensesButton().click();
			Reporter.log("License page is displayed",true);
			OrangeHrmOR.getAddButton().click();
			Reporter.log("AddLicense page is displayed",true);
			OrangeHrmOR.getLicensesNameTextBox().sendKeys(license);
			if(driver.getPageSource().contains(license)) {
		    	Reporter.log("License name is already exists",true);
		    	sAssert.assertTrue(false);
	    		captureScreenshot(driver,"ValidateLicenses");
	    		Thread.sleep(2000);
		    }
		    else {
			Reporter.log("License name is added successfully",true);
		    }
			OrangeHrmOR.getSaveButton().click();
		    Thread.sleep(2000);
		    sAssert.assertAll(); 
		}
	   @Test(priority=10,dataProvider="getData4")
		public void ValidateLanguages(String language) throws InterruptedException, IOException {
			OrangeHrmOR.getAdminBtn().click();
			OrangeHrmOR.getQualificationButton().click();
			OrangeHrmOR.getLanguagesButton().click();
			Reporter.log("Language page is displayed",true);
			OrangeHrmOR.getAddButton().click();
			Reporter.log("AddLanguage page is displayed",true);
			OrangeHrmOR.getLanguagesNameTextBox().sendKeys(language);
			if(driver.getPageSource().contains(language)) {
				//sAssert.assertTrue(driver.getPageSource().contains(language));
		    	Reporter.log("language name is already exists",true);
		    	sAssert.assertTrue(false);
	    		captureScreenshot(driver,"ValidateLanguages");
	    		Thread.sleep(2000);
		    }
		    else {
			Reporter.log("Language name is added successfully",true);
		    }
			OrangeHrmOR.getSaveButton().click();
		    Thread.sleep(2000);
		    sAssert.assertAll(); 
		}
		@Test(priority=11,dataProvider="getData5")
		public void ValidateMembership(String membership) throws InterruptedException, IOException {
			OrangeHrmOR.getAdminBtn().click();
			OrangeHrmOR.getQualificationButton().click();
			OrangeHrmOR.getMembershipsButton().click();
			Reporter.log("Membership page is displayed",true);
			OrangeHrmOR.getAddButton().click();
			Reporter.log("AddMembership page is displayed",true);
			OrangeHrmOR.getMembershipNameTextBox().sendKeys(membership);
			if(driver.getPageSource().contains(membership)) {
		    	Reporter.log("Membership name is already exists",true);
		    	sAssert.assertTrue(false);
	    		captureScreenshot(driver,"ValidateMembership");
	    		Thread.sleep(2000);
		    }
		    else {
			Reporter.log("Membership name is added successfully",true);
		    }
			OrangeHrmOR.getSaveButton().click();
			Thread.sleep(2000);
			sAssert.assertAll(); 
			
		}
		@DataProvider
	    public String[][] getData1() throws IOException {
			 String xfile="C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
			 String xsheet="Sheet3";
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
		@DataProvider
	    public String[][] getData2() throws IOException {
			 String xfile="C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
			 String xsheet="Sheet4";
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
		@DataProvider
	    public String[][] getData3() throws IOException {
			 String xfile="C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
			 String xsheet="Sheet5";
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
		@DataProvider
	    public String[][] getData4() throws IOException {
			 String xfile="C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
			 String xsheet="Sheet6";
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
		@DataProvider
	    public String[][] getData5() throws IOException {
			 String xfile="C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
			 String xsheet="Sheet7";
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

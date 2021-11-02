package com.qa.testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_OrangeHrmValidateQualificationdetails_010 extends TC_OrangeHrmValidateEmergencyContactsDependents_009 {
	@Test(priority=15)
	public void validateQualificationdetails() throws InterruptedException {
		OrangeHrmOR.getMyinfo().click();
		Thread.sleep(3000);
		Reporter.log("Myinfo");
		OrangeHrmOR.getQualification().click();
		Reporter.log("Qualification page should be displayed",true);
		
		OrangeHrmOR.getAddWorkExpBtn().click();
		Reporter.log("AddWorkExperience page should be displayed",true);
		
		OrangeHrmOR.getCompany().sendKeys(prop.getProperty("Company"));
		Reporter.log("Company is added",true);
		
		OrangeHrmOR.getJobTitle().sendKeys(prop.getProperty("JobTitle"));
		Reporter.log("JobTitle is added",true);
		
		OrangeHrmOR.getSaveWorkExpBtn().click();
		Reporter.log("AddWorkExperience page should be displayed",true);
		
		OrangeHrmOR.getAddEducationBtn().click();
		Reporter.log("AddEducation page should be displayed",true);
		
		OrangeHrmOR.getEducationlevel().selectByVisibleText("Bachelor's Degree");
		Reporter.log("Education is selected from dropdown",true);
		
		OrangeHrmOR.getInstitute().sendKeys(prop.getProperty("Institute"));
		Reporter.log("Institute name is added",true);
		
		OrangeHrmOR.getSpecialization().sendKeys(prop.getProperty("Specialization"));
		Reporter.log("Specialization is added",true);
		
		OrangeHrmOR.getEducationYear().sendKeys(prop.getProperty("Year"));
		Reporter.log("EducationYear is added",true);
		
		OrangeHrmOR.getEducationGPA().sendKeys(prop.getProperty("GPA"));
		Reporter.log("Education GPA is added",true);
		
		OrangeHrmOR.getEducationSrtDate().clear();
		OrangeHrmOR.getEducationSrtDate().sendKeys(prop.getProperty("StartDate"));
		Reporter.log("Education start date is added",true);
		
		OrangeHrmOR.getEducationEndDate().clear();
		OrangeHrmOR.getEducationEndDate().sendKeys(prop.getProperty("EndDate"));
		Reporter.log("Education End date is added",true);
		
		OrangeHrmOR.getSaveEdBtn().click();
		Reporter.log("Education details added successfully",true);
		
		Thread.sleep(2000);
	}
		
		@Test(dataProvider="getSkillData",priority=16)
		public void Skills(String Skill) throws InterruptedException  {
		Reporter.log("Add Skills page should be displayed",true);
		if(driver.getPageSource().contains(Skill))
		{
			Reporter.log(Skill +"is already Present",true);
		}
		else
		{
		Reporter.log("Skill is not present",true);
		}
}
	
	@Test(dataProvider="getLanguageData",priority=17)
	public void Language(String Languages, String Fluency, String Competency) throws InterruptedException  {
		//OrangeHrmOR.getAddLanguageBtn().click();
		Reporter.log("Add language page is displayed ",true);
		if(driver.getPageSource().contains(Languages))
		{
			Reporter.log(Languages +"is already Present",true);
		}
		else
		{
			Reporter.log("Language is not present" );
		}
		
		if(driver.getPageSource().contains(Fluency))
		{
			Reporter.log(Fluency +"is already Present",true);
		}
		else
		{
			Reporter.log("Fluency is not present" );
		}
		

		if(driver.getPageSource().contains(Competency))
		{
			Reporter.log(Competency +"is already Present",true);
		}
		else
		{
			Reporter.log("Competency is not present",true);
		}
		
	}
		@DataProvider
		public String[][] getSkillData() throws IOException{
			String xFile="C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
			String xSheet="Sheet8";
			
			int rowCount=ExcelUtility.getRowCount(xFile, xSheet);
			int cellCount=ExcelUtility.getCellCount(xFile, xSheet, rowCount);
			
			String [][] data=new String[rowCount][cellCount];
			for(int i=1;i<=rowCount;i++) {
				for(int j=0;j<cellCount;j++) {
					//ExcelUtility.getCellData(xFile, xSheet, i, j);
					data[i-1][j]=ExcelUtility.getCellData(xFile, xSheet, i, j);
				}
			}
			return data;			
		}
		
		@DataProvider
		public String[][] getLanguageData() throws IOException{
			String xFile="C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
			String xSheet="Sheet9";
	
			int rowCount=ExcelUtility.getRowCount(xFile, xSheet);
			int cellCount=ExcelUtility.getCellCount(xFile, xSheet, rowCount);
	
			String [][] LanguageData=new String[rowCount][cellCount];
			for(int i=1;i<=rowCount;i++) {
				for(int j=0;j<cellCount;j++) {
			//ExcelUtility.getCellData(xFile, xSheet, i, j);
			LanguageData[i-1][j]=ExcelUtility.getCellData(xFile, xSheet, i, j);
		}
	}
	return LanguageData;			
}

		
}



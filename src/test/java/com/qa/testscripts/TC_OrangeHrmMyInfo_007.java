package com.qa.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_OrangeHrmMyInfo_007 extends TC_OrangeHrmValidateQualification_006{
		@Test(priority=12)
		
		public void Myinfo() throws InterruptedException  {
			
			OrangeHrmOR.getMyinfo().click();
			Thread.sleep(3000);
			Reporter.log("Myinfo");
			OrangeHrmOR.getEmpPic().click();
			Thread.sleep(3000);

			OrangeHrmOR.getAttach().sendKeys("C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\Flower.jpg");
			OrangeHrmOR.getPersonalinfoSaveBtn().click();
			Reporter.log("Photograph update Successfully",true);
			OrangeHrmOR.getPersonaldetails().click();
			Reporter.log("Personal details page should be displayed",true);
	
			OrangeHrmOR.getMyInfoEditBtn().click();
			OrangeHrmOR.getFirstnameTxtField().clear();
			OrangeHrmOR.getFirstnameTxtField().sendKeys(prop.getProperty("Firstname"));
			OrangeHrmOR.getMiddlenameTxtField().clear();
			OrangeHrmOR.getLastnameTxtField().clear();
			OrangeHrmOR.getLastnameTxtField().sendKeys(prop.getProperty("Lastname"));
			
			OrangeHrmOR.getMaleRadioBtn().click();
			
			OrangeHrmOR.getMaleRadioBtn().click();
			Reporter.log("Male Radio Button is selected ",true);
			Thread.sleep(1000);
			
			
			OrangeHrmOR.getEmployeeId().clear();
			OrangeHrmOR.getEmployeeId().sendKeys(prop.getProperty("EmployeeId"));
			Thread.sleep(1000);
			
			OrangeHrmOR.getStatus().selectByVisibleText("Single");
			Reporter.log("Single is Selected from dropdown",true);
			
			OrangeHrmOR.getCountry().selectByVisibleText("Indian");
			Reporter.log("Indian is Selected from dropdown",true);
			
			OrangeHrmOR.getDOB().clear();
			OrangeHrmOR.getDOB().sendKeys(prop.getProperty("DOB"));
			Reporter.log("Dateof birth Added Successfully",true);
			
			OrangeHrmOR.getPersonalinfoSaveBtn().click();
			Reporter.log("Personal details are added successfully",true);
			
		}
			
	}


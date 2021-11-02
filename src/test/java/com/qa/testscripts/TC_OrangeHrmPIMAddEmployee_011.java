package com.qa.testscripts;

import org.testng.annotations.Test;

public class TC_OrangeHrmPIMAddEmployee_011 extends TC_OrangeHrmValidateQualificationdetails_010 {
	
		@Test(priority=18)
		public void AddEmp() throws InterruptedException {
			OrangeHrmOR.getPIMBtn().click();
			OrangeHrmOR.getPIMAddBtn().click();
			OrangeHrmOR.getFNameTxtField().sendKeys(prop.getProperty("FName"));
			Thread.sleep(2000);
			OrangeHrmOR.getMNameTxtField().sendKeys(prop.getProperty("MName"));
			Thread.sleep(2000);
			OrangeHrmOR.getLNameTxtField().sendKeys(prop.getProperty("LName"));
			Thread.sleep(2000);
			OrangeHrmOR.getEmpID().clear();
			OrangeHrmOR.getEmpID().sendKeys(prop.getProperty("EmpID"));
			Thread.sleep(2000);
			OrangeHrmOR.getChsFile().sendKeys("C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\Flower.jpg");
			OrangeHrmOR.getRadioBtn().click();
			OrangeHrmOR.getUserName().sendKeys(prop.getProperty("UserName"));
			OrangeHrmOR.getPassword().sendKeys(prop.getProperty("Passwrd"));
			OrangeHrmOR.getCnfrmPwd().sendKeys(prop.getProperty("CnfrmPwd"));
			OrangeHrmOR.getDropDown1().selectByVisibleText("Enabled");
			Thread.sleep(2000);
			OrangeHrmOR.getPIMSaveBtn().click();
			Thread.sleep(2000);
			
		}

}

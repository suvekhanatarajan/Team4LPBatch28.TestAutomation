package com.qa.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_OrangeHrmValidateEmergencyContactsDependents_009 extends TC_OrangeHrmValidateContactdetails_008{
	@Test(priority=14)
	public void validateContactdetails() throws InterruptedException {
		OrangeHrmOR.getMyinfo().click();
		Thread.sleep(3000);
		Reporter.log("Myinfo Page is displayed",true);
		
		OrangeHrmOR.getEmergencyContacts().click();
		Reporter.log("Emergency contact page should be displayed",true);
		
		OrangeHrmOR.getAddContactBtn().click();
		
		OrangeHrmOR.getEmgname().sendKeys(prop.getProperty("EMgName"));
		Reporter.log("Energency contact name is added",true);
		
		OrangeHrmOR.getEmgRelationship().sendKeys(prop.getProperty("EmgRelationship"));
		Reporter.log("Emergency contact Relationship is added",true);
		
		OrangeHrmOR.getEmgHomephone().sendKeys(prop.getProperty("Homephone"));
		Reporter.log("Emergency contact Home phonenumber is added",true);
		
		OrangeHrmOR.getEmgMobilenmbr().sendKeys(prop.getProperty("EmgMobile"));
		Reporter.log("Emergency contact mobile number is added",true);
		
		OrangeHrmOR.getWorkphone().sendKeys(prop.getProperty("Workphone"));
		Reporter.log("Emergency contact Work phonenumber is added",true);
		
		OrangeHrmOR.getContactSaveBtn().click();
		Reporter.log("Emergency contact details Added Successfully",true);
		
		Thread.sleep(2000);
		OrangeHrmOR.getMyinfo().click();
		Thread.sleep(3000);
		Reporter.log("Myinfo Page is displayed",true);
		
		OrangeHrmOR.getDependents().click();
		Reporter.log("Dependents page should be displayed",true);
		
		OrangeHrmOR.getAddDTBtn().click();
		
		OrangeHrmOR.getDtname().sendKeys(prop.getProperty("DependentName"));
		Reporter.log("Dependent name is added",true);
		
		OrangeHrmOR.getDTRelationship().selectByVisibleText("Child");
		Reporter.log("Relationship is added from dropdown",true);
		
		OrangeHrmOR.getDTDOB().clear();
		OrangeHrmOR.getDTDOB().sendKeys(prop.getProperty("DTDOB"));
		Reporter.log("Dependent Date of birth is added",true);
		
		OrangeHrmOR.getDTsaveBtn().click();
		Reporter.log("Dependent Details added successfully",true);
		
		Thread.sleep(2000);
		OrangeHrmOR.getMyinfo().click();
		Thread.sleep(3000);
		Reporter.log("Myinfo Page is displayed",true);
		
		OrangeHrmOR.getImmigration().click();
		Reporter.log("Immigration page is displayed",true);
		
		OrangeHrmOR.getAddImmigrationBtn().click();
		Reporter.log("Add Immigrations Details page is displayed",true);
		
		OrangeHrmOR.getAddPassportNmbr().sendKeys(prop.getProperty("PassportNmbr"));
		Reporter.log("Passportnumber is added",true);
		
		OrangeHrmOR.getImmigrationsaveBtn().click();
		Reporter.log("Immigration Details added successfully",true);
}
}

	

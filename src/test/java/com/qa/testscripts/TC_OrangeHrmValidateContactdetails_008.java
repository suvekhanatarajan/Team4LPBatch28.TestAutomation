
package com.qa.testscripts;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_OrangeHrmValidateContactdetails_008 extends TC_OrangeHrmMyInfo_007 {
	@Test(priority=13)
	public void validateContactdetails() throws InterruptedException {
	OrangeHrmOR.getMyinfo().click();
	Reporter.log("Myinfo");
	Thread.sleep(2000);
	
	OrangeHrmOR.getContactDetails().click();
	Reporter.log("Contact details page should be displayed");
	Thread.sleep(2000);
	
	OrangeHrmOR.getEditandSaveBtn().click();
	
	OrangeHrmOR.getAddressStreet().clear();
	OrangeHrmOR.getAddressStreet().sendKeys(prop.getProperty("Address"));
	Reporter.log("Address is Added",true);
	
	OrangeHrmOR.getCity().clear();
	OrangeHrmOR.getCity().sendKeys(prop.getProperty("City"));
	Reporter.log("City is Added",true);
	
	OrangeHrmOR.getState().clear();
	OrangeHrmOR.getState().sendKeys(prop.getProperty("State"));
	Reporter.log("State is Added",true);
	
	OrangeHrmOR.getZipcode().clear();
	OrangeHrmOR.getZipcode().sendKeys(prop.getProperty("Zipcode"));
	Reporter.log("Zipcode is Added",true);
	
	OrangeHrmOR.getCtCountry().selectByVisibleText("India");
	Reporter.log("India is selected from dropdown");
	
	OrangeHrmOR.getMobilenumber().clear();
	OrangeHrmOR.getMobilenumber().sendKeys(prop.getProperty("Mobile"));
	Reporter.log("Mobile number is Added",true);
	
	OrangeHrmOR.getEmail().clear();
	OrangeHrmOR.getEmail().sendKeys(prop.getProperty("Email"));
	Reporter.log("Email is Added",true);
	
	OrangeHrmOR.getEditandSaveBtn().click();
	Reporter.log("Contact details Added Successfully",true);

}
}

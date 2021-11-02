package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_OrangeHrmAnniversaryValidation_017  extends TC_OrangeHrmCommentPost_016{
	@Test(priority=24)
	public void validateAnniversary() throws InterruptedException {
		OrangeHrmOR.getBuzzButton().click();
		OrangeHrmOR.getMoreAnniversaryBtn().click();
		Thread.sleep(1000);
		List<WebElement> allBirthdayDates = OrangeHrmOR.getBirthdayDates();
		for(WebElement eachBDay:allBirthdayDates) {
			String name= eachBDay.getText();
			String[] str=name.split(" ");
			for(String eachStr:str) {
				if(Character.isLetter(eachStr.charAt(0))) {
					if(Character.isUpperCase(eachStr.charAt(0))) {
						Assert.assertTrue(true);
					}
					else
					{
						Assert.assertTrue(false);
					}
				}
			}
			
		}
		Reporter.log("Yes all the month starts with capital letter",true);
	}
	@Test(priority=25)
	void validateNames() throws InterruptedException {
		Thread.sleep(1000);
		List<WebElement> allNames = OrangeHrmOR.getBirthdayNames();
		for(WebElement eachName:allNames) {
			String name= eachName.getText();
			String[] str=name.split(" ");
			for(String eachStr:str) {
				System.out.println(eachStr);
				if(Character.isUpperCase(eachStr.charAt(0))) {
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
		}
		Reporter.log("Yes first name and last name starts with capital letter",true);
	}
}

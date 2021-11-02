package com.qa.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_OrangeHrmEditPost_018 extends TC_OrangeHrmAnniversaryValidation_017{
	@Test(priority=26)
	void editPost() throws InterruptedException {
		//OrangeHrmOR.getBuzzButton().click();
		//Thread.sleep(1000);
		String oldPostText = OrangeHrmOR.getPostText().getText();
		OrangeHrmOR.getPostDropDown().click();
		Thread.sleep(1000);
		OrangeHrmOR.getPostEditBtn().click();
		Thread.sleep(1000);
		String editText="hey its not a weekend anymore";
		OrangeHrmOR.getEditPostTextArea().clear();
		OrangeHrmOR.getEditPostTextArea().sendKeys(editText);
		Thread.sleep(1000);
		OrangeHrmOR.getEditPostSaveBtn().click();
		Thread.sleep(2000);
		String newPostText = OrangeHrmOR.getPostText().getText();
		Thread.sleep(1000);
		
		System.out.println(newPostText+" <--> "+oldPostText);
		if(newPostText.equals(editText)) {
			Reporter.log("post edited successfully",true);
		}
		else {
			Reporter.log("edit post not successful",true);
		}
	}
}

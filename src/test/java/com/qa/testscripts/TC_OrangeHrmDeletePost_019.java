package com.qa.testscripts;

import org.testng.annotations.Test;


public class TC_OrangeHrmDeletePost_019 extends TC_OrangeHrmEditPost_018{
	@Test(priority=27)
	void deletePost() throws InterruptedException {
		OrangeHrmOR.getBuzzButton().click();
		OrangeHrmOR.getPostDropDown().click();
		Thread.sleep(1000);
		OrangeHrmOR.getPostDeleteBtn().click();
		Thread.sleep(1000);
		OrangeHrmOR.getConfirmDeleteBtn().click();
		Thread.sleep(1000);
	}
}

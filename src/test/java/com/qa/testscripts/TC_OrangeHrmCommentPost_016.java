package com.qa.testscripts;

import org.testng.annotations.Test;

public class TC_OrangeHrmCommentPost_016 extends TC_OrangeHrmPostStatusMsg_015{
	@Test(priority=23)
	void commentPost() throws InterruptedException {
		OrangeHrmOR.getBuzzButton().click();
		OrangeHrmOR.getCommentSection().sendKeys("Its Amazing");
		Thread.sleep(1000);
		OrangeHrmOR.getPostCmntBtn().click();
	}
}

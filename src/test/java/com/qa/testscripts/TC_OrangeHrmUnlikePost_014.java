package com.qa.testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_OrangeHrmUnlikePost_014 extends TC_OrangeHrmLikePost_013{
	@Test(priority=22)
	void unlikePost() throws InterruptedException, IOException {
		OrangeHrmOR.getBuzzButton().click();
		int oldUnlikes = Integer.parseInt(OrangeHrmOR.getNoOfUnlikes().getText());
		OrangeHrmOR.getPostUnlikeSymbol().click();
		Thread.sleep(1500);
		int currentunlikes = Integer.parseInt(OrangeHrmOR.getNoOfUnlikes().getText());
		Reporter.log("OldUnlikes:"+oldUnlikes+ " " +"currentunlikes:"+ currentunlikes);

		if ((oldUnlikes + 1) == currentunlikes) {
			sAssert.assertTrue(true);
			Reporter.log("unlike function works properly", true);
		} else {
			sAssert.assertTrue(false);
			Reporter.log("error in unlike function", true);
			captureScreenshot(driver, "unlikePost");
		}

	}
}

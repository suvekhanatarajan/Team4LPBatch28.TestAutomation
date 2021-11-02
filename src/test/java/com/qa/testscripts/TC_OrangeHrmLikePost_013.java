package com.qa.testscripts;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_OrangeHrmLikePost_013 extends  TC_OrangeHrmPIMEmpList_012{
	@Test(priority=20)
	public void likePost() throws InterruptedException, IOException {
		OrangeHrmOR.getBuzzButton().click();
		int currentLikes = Integer.parseInt(OrangeHrmOR.getNoOfLikes().getText());
		String classNames = OrangeHrmOR.getPostLikeSymbol().getAttribute("class");
		//System.out.print(classNames);
		if (!classNames.contains("Unlike postLike")) {
			OrangeHrmOR.getPostLikeSymbol().click();
			Thread.sleep(1500);
			int likesAfterClick = Integer.parseInt(OrangeHrmOR.getNoOfLikes().getText());
			if (likesAfterClick >currentLikes) {
				
				Reporter.log("Like function working properly",true);
			} 
			else
			{
				
				Reporter.log("Like function not working properly",true);
				captureScreenshot(driver,"likePost");
			}
			
		}
		else
		{
			Reporter.log("Already like is given");
			System.out.println("Already like is given");
		}
	}
}

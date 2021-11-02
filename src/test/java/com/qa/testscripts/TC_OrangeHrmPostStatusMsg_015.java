package com.qa.testscripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_OrangeHrmPostStatusMsg_015 extends TC_OrangeHrmUnlikePost_014{
	@Test(dataProvider = "getDataStatus",priority=20)
	public void postMsg(String data) throws InterruptedException {
		OrangeHrmOR.getBuzzButton().click();
		OrangeHrmOR.getInputTextArea().sendKeys(data);
		Thread.sleep(2000);
		OrangeHrmOR.getPostStatsuBtn().click();
	}
	
	@DataProvider
	public String[][] getDataStatus() throws IOException
	{

		String xFile = "C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
		String xSheet = "Sheet11";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String[][] data = new String[rowCount][cellCount];
		for(int row=1;row<=rowCount;row++)
		{
			for(int col=0;col<cellCount;col++)
			{
				data[row-1][col]= ExcelUtility.getCellData(xFile, xSheet, row, col);
			}
		}
		return data;
		
	}
	
}

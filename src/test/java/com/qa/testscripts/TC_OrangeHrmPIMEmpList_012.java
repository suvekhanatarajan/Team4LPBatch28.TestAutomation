package com.qa.testscripts;


	import java.io.IOException;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.qa.utility.ExcelUtility;

	public class TC_OrangeHrmPIMEmpList_012 extends TC_OrangeHrmPIMAddEmployee_011{

		@Test(priority=19,dataProvider="getDataPIM")
		public void EmpList(String Employeename,String Employeeid) throws InterruptedException {
			OrangeHrmOR.getPIMBtn().click();
			OrangeHrmOR.getEmpList().click();
			OrangeHrmOR.getPIMEmpName().sendKeys(Employeename);
			Thread.sleep(2000);
			OrangeHrmOR.getEmpId().sendKeys(Employeeid);
			OrangeHrmOR.getSupName();
			OrangeHrmOR.getPIMSearchBtn().click();
			Thread.sleep(2000);
			
	}
		
		
		@DataProvider
		public String[][] getDataPIM() throws IOException{
			String xFile="C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\TestData.xlsx";
			String xSheet="Sheet10";
			int rowCount=ExcelUtility.getRowCount(xFile, xSheet);
			int cellCount=ExcelUtility.getCellCount(xFile, xSheet, rowCount);
			
			String[][] data = new String[rowCount][cellCount];
			for(int i=1;i<=rowCount;i++) {
				for(int j=0;j<cellCount;j++) {
					data[i-1 ][j] = ExcelUtility.getCellData(xFile,xSheet,i,j);
				}
			}
			return data;
		}

		
		
}

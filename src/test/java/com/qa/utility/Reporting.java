package com.qa.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class Reporting extends TestListenerAdapter{
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports xReports;
	public ExtentTest xTest;
	 public void onStart(ITestContext testContext) {
		 String dataStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    	 String repName="Test-Automation"+dataStamp+".html";
    	 htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+repName);
    	 htmlReporter.config().setAutoCreateRelativePathMedia(true);
    	 htmlReporter.config().setDocumentTitle("Automation Testing results");
    	 htmlReporter.config().setReportName("Functional Test Report");
    	 xReports=new ExtentReports();
    	 xReports.attachReporter(htmlReporter);
     }

		
     public void onFinish(ITestContext testContext) {
    	 xReports.flush();
     }

		
	
	 public void onTestSuccess(ITestResult tr) {
		 xTest=xReports.createTest(tr.getName());
		 xTest.log(Status.PASS,"Test is Passed");
		 xTest.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
	  }

	 
	  public void onTestFailure(ITestResult tr) {
		  xTest=xReports.createTest(tr.getName());
		  xTest.log(Status.FAIL,"Test is Failed");
		  xTest.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
		  xTest.log(Status.FAIL,tr.getThrowable());
		  
		  String ssPath=System.getProperty("user.dir")+"/ScreenShots/"+tr.getName()+".png";
		  File file=new File(ssPath);
		  if(file.exists())
		  {
			 try {
				xTest.fail("ScreenShots of failed test is:"+xTest.addScreenCaptureFromPath(ssPath));
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		  }
	  }

	
	  public void onTestSkipped(ITestResult tr) {
		  xTest=xReports.createTest(tr.getName());
		  xTest.log(Status.SKIP,"Test is Skipped");
		  xTest.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.BLUE));
		  xTest.log(Status.FAIL,tr.getThrowable());
	  }
}

package com.qa.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.pages.OrangeHrmPages;

public class TestBase {
	   WebDriver driver;
	   OrangeHrmPages OrangeHrmOR;
	   FileInputStream fileLoc;
	   Properties prop;
	   SoftAssert sAssert;
       @Parameters({"Browser","Url"})
	   @BeforeClass
	   public void setUp(String Browser, String Url) throws IOException
	   {
		   if(Browser.equalsIgnoreCase("Chrome"))
		    {
		    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\Driver Executables\\chromedriver.exe");
		    	driver=new ChromeDriver();
		    }
		    else if(Browser.equalsIgnoreCase("ie"))
		    {
		    	System.setProperty("webdriver.ie.driver", "C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\Driver Executables\\IEDriverServer.exe");
		    	driver=new InternetExplorerDriver();
		    }
		    else if(Browser.equalsIgnoreCase("edge"))
		    {
		    	System.setProperty("webdriver.edge.driver", "C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\Driver Executables\\msedgedriver.exe");
		    	driver=new EdgeDriver();
		    }
		    else if(Browser.equalsIgnoreCase("firefox"))
		    {
		    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\Driver Executables\\geckodriver.exe");
		    	driver=new FirefoxDriver();
		    }
		    driver.manage().window().maximize();
		    driver.get(Url);
		    OrangeHrmOR=new OrangeHrmPages(driver);
		    sAssert=new SoftAssert();
		    fileLoc=new FileInputStream("C:\\Users\\saran\\eclipse-workspace\\Team4LPBatch28.TestAutomation\\src\\test\\java\\com\\qa\\testdata\\Credentials.properties");
		    prop=new Properties();
		    prop.load(fileLoc);  
	   }
       
       @AfterClass
       public void tearDown()
       {
    	   driver.close();
       }
       public void captureScreenshot(WebDriver driver,String tName) throws IOException
       {
    	   TakesScreenshot ts=(TakesScreenshot)driver;
    	   File source=ts.getScreenshotAs(OutputType.FILE);
    	   File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");
    	   FileUtils.copyFile(source,target);
    	   Reporter.log("Screenshot is captured successfully",true);
    	   }
}

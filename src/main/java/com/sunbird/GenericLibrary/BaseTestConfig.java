package com.sunbird.GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.sunbird.ReportLibrary.ExtendReportGenerator;







public class BaseTestConfig implements SunbirdCoKreat_ConstantData {
	
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static FrameworkConfigProvider frameworkconfig;
	Properties pro;                                                              
	public static ExtendReportGenerator reporter;

	
	@BeforeClass
	public void loadFrameworkConfigs() throws Exception {

		frameworkconfig=new FrameworkConfigProvider();
	}
	
	
	/* @Author = Raju 
	/* Close the browser once the execution of each testscript  */
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	
	
	/* This method will execute before each @Test method and here we are loding config file properties and Browser launch , 
	  navigate to application URL */

	@BeforeMethod
	public void LaunchBrowser() throws IOException {
	
			
			String path = System.getProperty("user.dir") + "\\Config\\Config.Properties";
			FileInputStream fis = new FileInputStream(path);
			pro = new Properties();
			pro.load(fis);
			

				System.setProperty(CHROME_KEY,CHROME_VAl);
		    driver=new ChromeDriver();
		 driver.manage().window().maximize();
	String Env=pro.getProperty("EnvironmentSetup");



if(Env.equalsIgnoreCase("DOCKSTAGING")) {
		
	
	  driver.get(DOCK_STAGING_URL);
		
	}
else if(Env.equalsIgnoreCase("DOCKPREPROD")) {
		
	 driver.get( DOCK_PREPROD_URL);
	}
	
	else if(Env.equalsIgnoreCase("PROD")) {
		
		 driver.get(DOCK_PROD_URL);
	}
	else if(Env.equalsIgnoreCase("DEVSTAGING")) {
		
		 driver.get(DOCKDEV_STAGING_URL);
	}
	
	}

}

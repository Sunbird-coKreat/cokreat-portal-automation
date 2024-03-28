package com.sunbird.ReportLibrary;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportGenerator {
	
	public static ExtentReports extent;
	public static ExtentReports getReport(){
		
		String path=System.getProperty("user.dir")+"\\Reports";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Sunbird Automation Test Report");
		reporter.config().setReportName("Automation Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name","Sunbird");
		extent.setSystemInfo("O.S", "Windows");
		String screenShot = System.getProperty("user.dir")+"\\Artifacts\\FileName.png";

		
		return extent;
	}	
	
}

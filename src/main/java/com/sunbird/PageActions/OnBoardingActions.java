package com.sunbird.PageActions;

import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.FrameworkConfigProvider;
import com.sunbird.PageObjects.LoginPage;

public class OnBoardingActions extends BaseTestConfig {

	/* @Author="Aparna" */
	/* This method will handle the sourcing org admin login */
	public static void loginAsSourcing() throws Exception {

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		String usrname = frameworkconfig.getFramework("SOURCINGORGADMIN_USRNAME");
		String password = frameworkconfig.getFramework("SOURCINGORGADMIN_PASSWORD");
		String AppendExplore = "/sourcing";
		frameworkconfig = new FrameworkConfigProvider();
		driver.get(BaseTestConfig.DOCK_STAGING_URL + AppendExplore);
		driver.manage().window().maximize();

		loginpage.LoginUserName(usrname);
		loginpage.LoginPassword(password);
		loginpage.TapLoginButton();
		// Assert.assertTrue(loginpage.AssertMyProject());
	}

	public static void loginAsContributor() throws Exception {

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		String usrname = frameworkconfig.getFramework("INDIVIDUALCONTRIBUTOR_USERNAME");
		String password = frameworkconfig.getFramework("INDIVIDUALCONTRIBUTOR_PASSWORD");
		String AppendExplore = "/contribute";
		frameworkconfig = new FrameworkConfigProvider();
		driver.get(BaseTestConfig.DOCK_STAGING_URL + AppendExplore);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage.LoginUserName(usrname);
		loginpage.LoginPassword(password);
		loginpage.TapLoginButton();

	}

}

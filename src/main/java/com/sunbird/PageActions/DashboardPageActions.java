package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.DashboardPage;
import com.sunbird.PageObjects.LoginPage;
import org.openqa.selenium.support.PageFactory;


/* Handle login flow by accepting username and password as parameter */
public class DashboardPageActions extends BaseTestConfig {



    public static void clickUserProfileIcon()
    {
        DashboardPage loginpage = PageFactory.initElements(driver, DashboardPage.class);
        loginpage.userProfileIcon();
    }
    public static void clickLogOut()
    {
        DashboardPage loginpage = PageFactory.initElements(driver, DashboardPage.class);
        loginpage.logOutBtn();
    }
}
	

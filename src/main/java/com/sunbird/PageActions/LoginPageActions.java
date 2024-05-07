package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.Listeners;
import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.LoginPage;


/* Handle login flow by accepting username and password as parameter */
public class LoginPageActions extends BaseTestConfig {


    public static void fetchText() {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        String chec = loginpage.getTeacherText();
        System.out.println("Able to fetch text" + chec);
    }
    public static void clickLoginInPopup()
    {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.LoginButtonInProfileIconDropdown();
    }
    public static void LoginForJoinCourse(String usrName, String passWord) throws InterruptedException {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.LoginUserName(usrName);
        loginpage.LoginPassword(passWord);
        loginpage.TapLoginButton();


    }
}
	

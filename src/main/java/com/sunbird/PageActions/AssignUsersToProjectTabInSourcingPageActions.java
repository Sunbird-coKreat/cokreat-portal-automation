package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.AssignUsersToProjectTabInSourcingPage;
import com.sunbird.PageObjects.NominationTabPage;
import org.openqa.selenium.support.PageFactory;


public class AssignUsersToProjectTabInSourcingPageActions extends BaseTestConfig {




    public static void assertAssignUserToProjectTabAndClick()
    {
        AssignUsersToProjectTabInSourcingPage assignUsersToProjectTabInSourcingPage = PageFactory.initElements(driver, AssignUsersToProjectTabInSourcingPage.class);
        assignUsersToProjectTabInSourcingPage.assignUserToProjectTabAndClick();
    }
    public static void enterUsernameInSearchTextBox(String usrName)
    {
        AssignUsersToProjectTabInSourcingPage assignUsersToProjectTabInSourcingPage = PageFactory.initElements(driver, AssignUsersToProjectTabInSourcingPage.class);
        assignUsersToProjectTabInSourcingPage.searchUserTextBox(usrName);
    }
    public static void clickSearchIconBtn()
    {
        AssignUsersToProjectTabInSourcingPage assignUsersToProjectTabInSourcingPage = PageFactory.initElements(driver, AssignUsersToProjectTabInSourcingPage.class);
        assignUsersToProjectTabInSourcingPage.searchIconBtn();
    }
    public static void clickSelectRoleOption()
    {
        AssignUsersToProjectTabInSourcingPage assignUsersToProjectTabInSourcingPage = PageFactory.initElements(driver, AssignUsersToProjectTabInSourcingPage.class);
        assignUsersToProjectTabInSourcingPage.selectRoleOption();
    }
    public static void selectReviewerRoleOption()
    {
        AssignUsersToProjectTabInSourcingPage assignUsersToProjectTabInSourcingPage = PageFactory.initElements(driver, AssignUsersToProjectTabInSourcingPage.class);
        assignUsersToProjectTabInSourcingPage.selectReviewerRoleOption();
    }
    public static void assertRoleUpdatedToastrMsg()
    {
        AssignUsersToProjectTabInSourcingPage assignUsersToProjectTabInSourcingPage = PageFactory.initElements(driver, AssignUsersToProjectTabInSourcingPage.class);
        assignUsersToProjectTabInSourcingPage.verifyRoleUpdatedToastrMsg();
    }
}
	

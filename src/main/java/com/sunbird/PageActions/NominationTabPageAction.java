package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.CokreatConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.CreateProjectPage;
import com.sunbird.PageObjects.LoginPage;
import com.sunbird.PageObjects.NominationTabPage;
import org.openqa.selenium.support.PageFactory;


/* Handle login flow by accepting username and password as parameter */
public class NominationTabPageAction extends BaseTestConfig {



    public static String getApprovedStatusXpath(String userName)
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
       return nominationTab.returnApprovedXpath(userName);

    }
    public static String getRejectedStatusXpath(String userName)
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
        return nominationTab.returnRejectionStatusXpath(userName);

    }

    public static void assertAllLabelDetailsInNominationTab()
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
nominationTab.verifyAllLabelsInNomindationTab();
    }
    public static void clickPendingStatusWithOpenButton()
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
        nominationTab.pendingStatusWithOpenButton();
    }
    public static void clickAcceptBtn()
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
        nominationTab.acceptBtn();
    }
    public static void clickRejectBtn()
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
        nominationTab.rejectBtn();
    }
    public static void assertNominationUpdatedSuccessToastrMsg()
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
        nominationTab.verifyNominationUpdatedSuccessToastrMsg();
    }
    public static void enterReasonForRejectingNomination()
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
        nominationTab.enterReasonForRejection();
    }
    public static void clickSubmitBtnInRejectionBox()
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
        nominationTab.submitBtnInRejectionBox();
    }

    public static void assertTotalCount(String expected)
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
    String totalCount=nominationTab.getTotalCount();
   UtilityFunctions.stringValueComparision(totalCount,expected, "Failed to validated total count");

    }
    public static void assertApprovedCount(String expected)
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
        String approvedCount=nominationTab.getApprovedCount();
        UtilityFunctions.stringValueComparision(approvedCount,expected, "Failed to validated approved count");

    }
    public static void assertRejectedCount(String expected)
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
        String rejectedCount=nominationTab.getRejectedCount();
        UtilityFunctions.stringValueComparision(rejectedCount,expected, "Failed to validated rejectedCount");

    }
    public static void assertPendingCount(String expected)
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
        String pendingCount=nominationTab.getPendingCount();
        UtilityFunctions.stringValueComparision(pendingCount,expected, "Failed to validated pendingCount");

    }
}
	

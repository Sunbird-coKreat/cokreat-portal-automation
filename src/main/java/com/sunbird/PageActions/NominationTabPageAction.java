package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
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
}
	

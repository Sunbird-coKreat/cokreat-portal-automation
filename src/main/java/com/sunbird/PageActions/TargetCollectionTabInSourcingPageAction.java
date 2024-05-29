package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.NominationTabPage;
import com.sunbird.PageObjects.TargetCollectionTabInSourcingPage;
import org.openqa.selenium.support.PageFactory;


/* Handle login flow by accepting username and password as parameter */
public class TargetCollectionTabInSourcingPageAction extends BaseTestConfig {



    public static void clickOpenButton()
    {
        TargetCollectionTabInSourcingPage targetCollectionTab = PageFactory.initElements(driver, TargetCollectionTabInSourcingPage.class);
        targetCollectionTab.openButton();
    }
    public static void clickSendBackForCorrections()
    {
        TargetCollectionTabInSourcingPage targetCollectionTab = PageFactory.initElements(driver, TargetCollectionTabInSourcingPage.class);
        targetCollectionTab.sendBackForCorrections();
    }
    public static void enterReviewComments(String comment)
    {
        TargetCollectionTabInSourcingPage targetCollectionTab = PageFactory.initElements(driver, TargetCollectionTabInSourcingPage.class);
        targetCollectionTab.enterReviewComments(comment);
    }
    public static void clickSubmitReviewInAddReviewCommentPopup()
    {
        TargetCollectionTabInSourcingPage targetCollectionTab = PageFactory.initElements(driver, TargetCollectionTabInSourcingPage.class);
        targetCollectionTab.submitReviewInAddReviewCommentPopup();
    }
}
	

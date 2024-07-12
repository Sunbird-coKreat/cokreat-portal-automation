package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.EnrollAsContributorPopupPage;
import com.sunbird.PageObjects.NominationTabPage;
import org.openqa.selenium.support.PageFactory;


/* Handle login flow by accepting username and password as parameter */
public class EnrollAsContributorPopupPageAction extends BaseTestConfig {


    public static void clickEnrollAsOrganizationContributor() {
        EnrollAsContributorPopupPage enrollAsContributorPopupPage = PageFactory.initElements(driver, EnrollAsContributorPopupPage.class);
        enrollAsContributorPopupPage.organizationContributorRadioBtn();

    }
    public static void clickEnrollAsindividualContributor() {
        EnrollAsContributorPopupPage enrollAsContributorPopupPage = PageFactory.initElements(driver, EnrollAsContributorPopupPage.class);
        enrollAsContributorPopupPage.individualContributorRadioBtn();

    }
    public static void clickTermsAndConditionCheckBox() {
        EnrollAsContributorPopupPage enrollAsContributorPopupPage = PageFactory.initElements(driver, EnrollAsContributorPopupPage.class);
        enrollAsContributorPopupPage.termsAndConditionCheckBox();

    }
    public static void clickSubmit() {
        EnrollAsContributorPopupPage enrollAsContributorPopupPage = PageFactory.initElements(driver, EnrollAsContributorPopupPage.class);
        enrollAsContributorPopupPage.submitButton();

    }
}
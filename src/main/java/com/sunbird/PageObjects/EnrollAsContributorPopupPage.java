package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.CokreatConstants;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnrollAsContributorPopupPage {



    @FindBy(how = How.XPATH, using = "//label[@for='tncAccepted']")
    private WebElement termsAndCheckBpx;

    @FindBy(how = How.XPATH, using = "//label[@for='Organisation']")
    private WebElement enrollAsOrganisationContributorRadioBtn;

    @FindBy(how = How.XPATH, using = "//label[@for='individual']")
    private WebElement enrollAsIndividualContributorRadioBtn;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
    private WebElement submitBtn;



    public void organizationContributorRadioBtn() {

        UtilityFunctions.waitForElementAndClickable(enrollAsOrganisationContributorRadioBtn);
        Listeners.addLogs("Clicked on enrollAsContributor");
        UtilityFunctions.validatIsElementPresent(enrollAsOrganisationContributorRadioBtn,"enrollAsOrganisationContributorRadioBtn not found");
    }
    public void individualContributorRadioBtn() {

        UtilityFunctions.waitForElementAndClickable(enrollAsIndividualContributorRadioBtn);
        Listeners.addLogs("Clicked on enrollAsContributor");
        UtilityFunctions.validatIsElementPresent(enrollAsIndividualContributorRadioBtn,"enrollAsIndividualContributorRadioBtn not found");

    }

    public void termsAndConditionCheckBox() {

        UtilityFunctions.waitForElementAndClickable(termsAndCheckBpx);
        Listeners.addLogs("Clicked on termsAndCheckBpx");

    }
    public void submitButton() {

        UtilityFunctions.waitForElementAndClickable(submitBtn);
        Listeners.addLogs("Clicked on submitBtn");

    }


}

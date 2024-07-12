package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.CokreatConstants;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AssignUsersToProjectTabInSourcingPage {



    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Assign users to project')]")
    private WebElement assertAssignUserToProjectTabAndClick;

    @FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Search')]")
    private WebElement searchUserTextBox;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Search')]")
    private WebElement searchIconBtn;

    @FindBy(how = How.XPATH, using = "//select[@valueField='name']")
    private WebElement selectRoleOption;

    @FindBy(how = How.XPATH, using = "//select[@valueField='name']//following::option[contains(text(),'REVIEWER')]")
    private WebElement selectReviewerRoleOption;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Roles updated')]")
    private WebElement assertRoleUpdatedToastrMsg;



    public void assignUserToProjectTabAndClick() {

        UtilityFunctions.waitForElementAndClickable(assertAssignUserToProjectTabAndClick);
        UtilityFunctions.validatIsElementPresent(assertAssignUserToProjectTabAndClick,"AssignUserToProjectTab not displayed");
        Listeners.addLogs("Clicked on assertAssignUserToProjectTabAndClick");
    }
    public void searchUserTextBox(String reviewerName) {

        UtilityFunctions.waitToBeClickableAndSendKeys(searchUserTextBox,reviewerName);
        Listeners.addLogs("Entered reviewerName");
    }
    public void searchIconBtn() {

        UtilityFunctions.waitForElementAndClickable(searchIconBtn);
        Listeners.addLogs("Clicked on searchIconBtn");
    }
    public void selectRoleOption() {

        UtilityFunctions.waitForElementAndClickable(selectRoleOption);
        Listeners.addLogs("Clicked on selectRoleOption");
    }
    public void selectReviewerRoleOption() {

        UtilityFunctions.waitForElementAndClickable(selectReviewerRoleOption);
        Listeners.addLogs("Clicked on selectReviewerRoleOption");
    }
    public void verifyRoleUpdatedToastrMsg() {
UtilityFunctions.waitForVisibilityOfWebElement(assertRoleUpdatedToastrMsg);
        UtilityFunctions.validatIsElementPresent(assertRoleUpdatedToastrMsg,"assertRoleUpdatedToastrMsg not displayed");
        UtilityFunctions.waitForElementToDisappear(assertRoleUpdatedToastrMsg);
        Listeners.addLogs("Verified assertRoleUpdatedToastrMsg");
    }
}

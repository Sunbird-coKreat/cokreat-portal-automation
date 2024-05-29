package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.CokreatConstants;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TargetCollectionTabInSourcingPage {



    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Open')]")
    private WebElement openButton;

    @FindBy(how = How.XPATH, using = "//button[@id='sendForCorrections']")
    private WebElement sendBackForCorrectionsBtn;

    @FindBy(how = How.XPATH, using = "//textarea[@type='text']")
    private WebElement enterReviewComments;

    @FindBy(how = How.XPATH, using = "//button[@id='submitReview']")
    private WebElement submitReviewBtnInAddReviewCommentPopup;

    public void openButton() {

        UtilityFunctions.waitForElementAndClickable(openButton);
        Listeners.addLogs("Clicked on openButton");
    }
    public void sendBackForCorrections() {

        UtilityFunctions.waitForElementAndClickable(sendBackForCorrectionsBtn);
        Listeners.addLogs("Clicked on sendBackForCorrectionsBtn");
    }
    public void enterReviewComments(String comment) {

        UtilityFunctions.waitToBeClickableAndSendKeys(enterReviewComments,comment);
        Listeners.addLogs("EnterReviewComments");
    }
    public void submitReviewInAddReviewCommentPopup() {

        UtilityFunctions.waitForElementAndClickable(submitReviewBtnInAddReviewCommentPopup);
        Listeners.addLogs("Clicked on submitReviewBtnInAddReviewCommentPopup");
    }
}

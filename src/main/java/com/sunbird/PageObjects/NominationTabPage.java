package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.CokreatConstants;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NominationTabPage {



    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Contributor Name')]")
    private WebElement assertContributorNameLabel;

    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Type')]")
    private WebElement assertTypeLabel;

    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Digital Textbooks')]")
    private WebElement assertDigitalTextBookLabel;

    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Samples')]")
    private WebElement assertSamplesLabel;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Status')]")
    private WebElement assertStatusLabel;

    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Nominated Date')]")
    private WebElement assertNominationDataLabel;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Download Nominations List')]")
    private WebElement assertDownloadNominationsListButton;

    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Contributor Name')]//following::span[contains(text(),'Pending')]//following::button[contains(text(),'Open')]")
    private WebElement pendingStatusWithOpenButton;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Accept')]")
    private WebElement acceptBtn;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Reject')]")
    private WebElement rejectBtn;
    @FindBy(how = How.XPATH, using = "//textarea[@name='rejectComment']")
    private WebElement commentBoxForReject;

    @FindBy(how = How.XPATH, using = "//button[@id='submitReview']")
    private WebElement submitBtnInReasonsForRejection;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Nomination updated successfully...')]")
    private WebElement verifyNominationUpdatedSuccessToastrMsg;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'left line')]//following::div[contains(text(),'Approved')]//preceding::span[1]")
    private WebElement totalCount;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'left line')]//following::div[contains(text(),'Rejected')]//preceding::span[1]")
    private WebElement approvedCount;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'left line')]//following::div[contains(text(),'Approved')]//following::span[1]")
    private WebElement rejectedCount;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'left line')]//following::div[contains(text(),'Rejected')]//following::span[1]")
    private WebElement pendingCount;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'View Sample Content')]//preceding::td[1]")
    private WebElement verifySampleCountInNominationTOCPage;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'View Sample Content')]")
    private WebElement viewSampleContent;

    @FindBy(how = How.XPATH, using = "//dd[contains(text(),'Total Content')]//preceding::dt")
    private WebElement verifySampleCountInNominationContentTOCPage;

    public void verifyAllLabelsInNomindationTab() {
        UtilityFunctions.isElementPresent(assertContributorNameLabel);
        UtilityFunctions.validatIsElementPresent(assertContributorNameLabel,"assertContributorNameLabel Not displayed");
        Listeners.addLogs("assertContributorNameLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertTypeLabel,"assertTypeLabel Not displayed");
        Listeners.addLogs("assertTypeLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertDigitalTextBookLabel,"assertDigitalTextBookLabel Not displayed");
        Listeners.addLogs("assertDigitalTextBookLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertSamplesLabel,"assertSamplesLabel Not displayed");
        Listeners.addLogs("assertSamplesLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertStatusLabel,"assertStatusLabel Not displayed");
        Listeners.addLogs("assertStatusLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertNominationDataLabel,"assertNominationDataLabel Not displayed");
        Listeners.addLogs("assertNominationDataLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertDownloadNominationsListButton,"assertDownloadNominationsListButton Not displayed");
        Listeners.addLogs("assertDownloadNominationsListButton displayed");

    }
    public static String returnApprovedXpath(String userName)
    {
        String approvedXpath= CokreatConstants.approvedXpath+userName+CokreatConstants.approvedXpath2;
        return approvedXpath;
    }
    public static String returnRejectionStatusXpath(String userName)
    {
        String rejectedXpath= CokreatConstants.approvedXpath+userName+CokreatConstants.nominationRejectedProject2;
        return rejectedXpath;
    }
    public void pendingStatusWithOpenButton() {

        UtilityFunctions.waitForElementAndClickable(pendingStatusWithOpenButton);
        Listeners.addLogs("Clicked on pendingStatusWithOpenButton");
    }
    public void acceptBtn() {

        UtilityFunctions.waitForElementAndClickable(acceptBtn);
        Listeners.addLogs("Clicked on acceptBtn");
    }
    public void verifyNominationUpdatedSuccessToastrMsg() {

        UtilityFunctions.waitForVisibilityOfWebElement(verifyNominationUpdatedSuccessToastrMsg);
        UtilityFunctions.validatIsElementPresent(verifyNominationUpdatedSuccessToastrMsg,"verifyNominationUpdatedSuccessToastrMsg failed");
        Listeners.addLogs("Verified verifyNominationUpdatedSuccessToastrMsg");
        UtilityFunctions.waitForElementToDisappear(verifyNominationUpdatedSuccessToastrMsg);
    }
    public void rejectBtn() {

        UtilityFunctions.waitForElementAndClickable(rejectBtn);
        Listeners.addLogs("Clicked on rejectBtn");
    }
    public void enterReasonForRejection() {

        UtilityFunctions.waitToBeClickableAndSendKeys(commentBoxForReject,"Need to be Rechecked");
        Listeners.addLogs("entered reasons for rejection");
    }
    public void submitBtnInRejectionBox() {

        UtilityFunctions.waitForElementAndClickable(submitBtnInReasonsForRejection);
        Listeners.addLogs("Clicked on submitBtnInReasonsForRejection");
    }

    public String getTotalCount() {
        UtilityFunctions.waitForVisibilityOfWebElement(totalCount);
        String totalcount=UtilityFunctions.getTextFromElement(totalCount);
        Listeners.addLogs("totalCount validated " +totalcount);
        return totalcount;
    }
    public String getApprovedCount() {
        UtilityFunctions.waitForVisibilityOfWebElement(approvedCount);
        String approvedcount=UtilityFunctions.getTextFromElement(approvedCount);
        Listeners.addLogs("approvedCount validated " +approvedcount);
        return approvedcount;
    }
    public String getRejectedCount() {
        UtilityFunctions.waitForVisibilityOfWebElement(rejectedCount);
        String rejectedcount=UtilityFunctions.getTextFromElement(rejectedCount);
        Listeners.addLogs("rejectedCount validated " +rejectedcount);
        return rejectedcount;
    }
    public String getPendingCount() {
        UtilityFunctions.waitForVisibilityOfWebElement(pendingCount);
        String pendingcount=UtilityFunctions.getTextFromElement(pendingCount);
        Listeners.addLogs("pendindcount validated " +pendingcount);
        return pendingcount;
    }
    public String getSampleCountInNominationTOCPage() {
        UtilityFunctions.waitForVisibilityOfWebElement(verifySampleCountInNominationTOCPage);
        String sampleCount=UtilityFunctions.getTextFromElement(verifySampleCountInNominationTOCPage);
        Listeners.addLogs("sampleCount validated in NominationTOCPage " +sampleCount);
        return sampleCount;
    }
    public void viewSampleContentBtn() {

        UtilityFunctions.waitForElementAndClickable(viewSampleContent);
        Listeners.addLogs("Clicked on viewSampleContent");
    }
    public String getSampleCountInNominationContentTOCPage() {
        UtilityFunctions.waitForVisibilityOfWebElement(verifySampleCountInNominationContentTOCPage);
        String sampleCount=UtilityFunctions.getTextFromElement(verifySampleCountInNominationContentTOCPage);
        Listeners.addLogs("sampleCount validated in verifySampleCountInNominationContentTOCPage " +sampleCount);
        return sampleCount;
    }
}

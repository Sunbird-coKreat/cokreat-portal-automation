package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProjectTOCInContributorPage {

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Select Content Types')]")
    private WebElement selectContentTypes;

    @FindBy(how = How.XPATH, using = "//label[@class='mb-0']")
    private List<WebElement> selectContentTypesCheckBox;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
    private WebElement submitBtnInSelectContentType;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Selected Content type(s) saved successfully')]")
    private WebElement verifyContentTypeSaveToastrMsg;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    private WebElement selectCheckBox;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Nominate')]")
    private WebElement nominateBtn;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
    private WebElement submitBtnInNominationSubmit;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Nomination sent')]")
    private WebElement verifyNominationSentToastrMsg;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload Sample')]")
    private WebElement uploadSample;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Create new')]")
    private WebElement createNewBtn;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'eTextbook')]")
    private WebElement selectETextbookType;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
    private WebElement continueBtn;

    @FindBy(how = How.XPATH, using = "//input[@type='file']")
    private WebElement selectFilesBtn;

    @FindBy(how = How.XPATH, using = "//button[@id='submitContent']")
    private WebElement submitContentBtn;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Name']")
    private WebElement enterETextbookName;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter Copyright and Year']")
    private WebElement enterETextBookCopyRight;

    @FindBy(how = How.XPATH, using = "//input[@id='content-policy-check']")
    private WebElement termsAndConditionInETextbookType;

    @FindBy(how = How.XPATH, using = "//input[@id='content-policy-check']//following::button[contains(text(),'Submit')]")
    private WebElement submitBtnETextbookType;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Content sent for review')]")
    private WebElement verifyContentSentForReview;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Content accepted successfully')]")
    private WebElement verifyContentAcceptedSuccesfully;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Content Successfully Uploaded')]")
    private WebElement verifyContentSuccessfullyUploaded;


    @FindBy(how = How.XPATH, using = "//dd[contains(text(),'Total Content')]//preceding::dt")
    private WebElement verifySampleCountInContributionTOCPage;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Back')]")
    private WebElement backBtn;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Upload Content')]")
    private WebElement uploadContentBtn;

    @FindBy(how = How.XPATH, using = "//button[@id='submitContent']")
    private WebElement submitForReviewBtn;

    public void selectContentTypesCheckBox() {
UtilityFunctions.waitForVisibilityOfWebElement(selectContentTypesCheckBox.get(0));
   int totalElement=selectContentTypesCheckBox.size();
   for(int i=0;i<totalElement;i++)
   {
       selectContentTypesCheckBox.get(i).click();
       Listeners.addLogs("clicked on selectContentTypesCheckBox");
   }

    }

    public void selectContentTypes() {
        UtilityFunctions.waitToBeClickableAndClick(selectContentTypes);
        Listeners.addLogs("Clicked on selectContentTypes");
    }
    public void submitBtnInSelectContentType() {
        UtilityFunctions.waitToBeClickableAndClick(submitBtnInSelectContentType);
        Listeners.addLogs("Clicked on submitBtnInSelectContentType");
    }
    public void verifyContentTypeSaveToastrMsg() {

        UtilityFunctions.waitForVisibilityOfWebElement(verifyContentTypeSaveToastrMsg);
        UtilityFunctions.validatIsElementPresent(verifyContentTypeSaveToastrMsg,"verifyContentTypeSaveToastrMsg failed");
        Listeners.addLogs("Verified verifyContentTypeSaveToastrMsg");
        UtilityFunctions.waitForElementToDisappear(verifyContentTypeSaveToastrMsg);
    }
    public void selectCheckBox() {
      //  UtilityFunctions.waitForVisibilityOfWebElement(selectCheckBox);
       // selectCheckBox.click();
        UtilityFunctions.clickUsingJavaScriptExecutor(selectCheckBox);
       // UtilityFunctions.waitToBeClickableAndClick(selectCheckBox);
        Listeners.addLogs("Clicked on selectCheckBox");
    }
    public void nominateBtn() {
        UtilityFunctions.waitToBeClickableAndClick(nominateBtn);
        Listeners.addLogs("Clicked on nominateBtn");
    }
    public void submitBtnInNominationSubmit() {
        UtilityFunctions.waitToBeClickableAndClick(submitBtnInNominationSubmit);
        Listeners.addLogs("Clicked on submitBtnInNominationSubmit");
    }
    public void verifyNominationSentToastrMsg() {

        UtilityFunctions.waitForVisibilityOfWebElement(verifyNominationSentToastrMsg);
        UtilityFunctions.validatIsElementPresent(verifyNominationSentToastrMsg,"verifyContentTypeSaveToastrMsg failed");
        Listeners.addLogs("Verified verifyNominationSentToastrMsg");
        UtilityFunctions.waitForElementToDisappear(verifyNominationSentToastrMsg);
    }
    public void uploadSample() {
        UtilityFunctions.waitToBeClickableAndClick(uploadSample);
        Listeners.addLogs("Clicked on uploadSample");
    }
    public void createNewBtn() {
        UtilityFunctions.waitToBeClickableAndClick(createNewBtn);
        Listeners.addLogs("Clicked on createNewBtn");
    }
public void selectContributionTypeContentType(String type)
{
    switch (type) {
        case "eTextbook":
            UtilityFunctions.waitToBeClickableAndClick(selectETextbookType);
            Listeners.addLogs("Selected ETextbookType");
            break;
    }
}
    public void continueBtn() {
        UtilityFunctions.waitToBeClickableAndClick(continueBtn);
        Listeners.addLogs("Clicked on continueBtn");
    }
    public void selectFilesAndUpload(String filePath) {
UtilityFunctions.waitForElementIsVisible(selectFilesBtn);
        UtilityFunctions.uploadSendKeys(selectFilesBtn, filePath);
        Listeners.addLogs("Clicked on selectFiles and uploaded ");

    }


    public void submitContentBtn() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(submitContentBtn);
     //   UtilityFunctions.clickUsingJavaScriptExecutor(submitContentBtn);

        Listeners.addLogs("Clicked on submitContentBtn");
    }
    public void verifyContentSuccesfullyUploadedMsg() {

        UtilityFunctions.waitForVisibilityOfWebElement(verifyContentSuccessfullyUploaded);
        UtilityFunctions.validatIsElementPresent(verifyContentSuccessfullyUploaded,"verifyContentSuccessfullyUploaded failed");
        Listeners.addLogs("Verified verifyContentSuccessfullyUploaded");
        UtilityFunctions.waitForElementToDisappear(verifyContentSuccessfullyUploaded);
    }
    public void enterETextbookName(String name) {
        UtilityFunctions.waitToBeClickableAndSendKeys(enterETextbookName,name);
        Listeners.addLogs("Entered ETextbookName");
    }
    public void enterETextBookCopyRight(String year) {
        UtilityFunctions.waitToBeClickableAndSendKeys(enterETextBookCopyRight,year);
        Listeners.addLogs("Entered ETextbook CopyRight");
    }
    public void termsAndConditionInETextbookType() {
        UtilityFunctions.scrollInToviewUsingJavaScript(termsAndConditionInETextbookType);
        UtilityFunctions.clickUsingJavaScriptExecutor(termsAndConditionInETextbookType);
        Listeners.addLogs("Clicked on termsAndConditionInETextbookType");
    }
    public void submitBtnETextbookType() {
        UtilityFunctions.waitToBeClickableAndClick(submitBtnETextbookType);
        Listeners.addLogs("Clicked on submitBtnETextbookType");
    }
    public void verifyContentSentForReview() {
        UtilityFunctions.waitForVisibilityOfWebElement(verifyContentSentForReview);
        UtilityFunctions.validatIsElementPresent(verifyContentSentForReview,"verifyContentSentForReview failed");
        Listeners.addLogs("Verified verifyContentSentForReview");
        UtilityFunctions.waitForElementToDisappear(verifyContentSentForReview);
    }
    public String getSampleCountInContributionTOCPage() {
        UtilityFunctions.waitForVisibilityOfWebElement(verifySampleCountInContributionTOCPage);
        String sampleCount=UtilityFunctions.getTextFromElement(verifySampleCountInContributionTOCPage);
        Listeners.addLogs("sampleCount validated in ContributionTOCPage " +sampleCount);
        return sampleCount;
    }
    public void backBtn() {
        UtilityFunctions.waitToBeClickableAndClick(backBtn);
        Listeners.addLogs("Clicked on backBtn");
    }
    public void uploadContentBtn() {
        UtilityFunctions.waitToBeClickableAndClick(uploadContentBtn);
        Listeners.addLogs("Clicked on uploadContentBtn");
    }
    public void submitForReviewBtn() throws InterruptedException {
        UtilityFunctions.waitToBeClickableAndClick(submitForReviewBtn);
        //   UtilityFunctions.clickUsingJavaScriptExecutor(submitContentBtn);

        Listeners.addLogs("Clicked on submitForReview");
    }
    public void verifyContentAcceptedSuccesfully() {
        UtilityFunctions.waitForVisibilityOfWebElement(verifyContentAcceptedSuccesfully);
        UtilityFunctions.validatIsElementPresent(verifyContentAcceptedSuccesfully,"verifyContentAcceptedSuccesfully failed");
        Listeners.addLogs("Verified verifyContentAcceptedSuccesfully");
        UtilityFunctions.waitForElementToDisappear(verifyContentAcceptedSuccesfully);
    }
}

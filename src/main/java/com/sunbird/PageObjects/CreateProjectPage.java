package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CreateProjectPage {

    @FindBy(how = How.XPATH, using = "//button[text()=' Create New Project']")
    private WebElement createNewBtn;

    @FindBy(how = How.XPATH, using = "//label[@for='collections']")
    private WebElement projectCollectionRadiobtn;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),' Create a Project ')]//following::button[contains(text(),'Next')]")
    private WebElement nextbtnInProjectCreation;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter project name']")
    private WebElement enterProjectName;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='Enter project description']")
    private WebElement enterProjectDesc;

    @FindBy(how = How.XPATH, using = "//label[@for='defaultContributeOrgReview']")
    private WebElement skipTwoLevelReviewDisable;

    // select date
    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='nomination_enddate']")
    private static WebElement nominationEndDate;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='shortlisting_enddate']")
    private static WebElement nominationShortlistingEndDate;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='content_submission_enddate']")
    private static WebElement contributionEndDate;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='enddate']")
    private WebElement projectEndDate;

    @FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add description']")
    private WebElement recognitionToContributorsTextbox;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
    private WebElement clkNextButtonInProjectCreation;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='targetPrimaryCategories']")
    private WebElement contentTypeDropDown;

    @FindBy(how = How.XPATH, using = "//*[@class='text default']//following::span//following::sui-select-option")
    private List<WebElement> contentTypeDropDownValues;

    @FindBy(how = How.XPATH, using = "//*[@formcontrolname='target_collection_category']")
    private WebElement targetCollectionDropdown;

    @FindBy(how = How.XPATH, using = "//sui-select[@formcontrolname='target_collection_category']//following::span[contains(text(),'Course')]")
    private WebElement selectCourseInTargetCollectionDropddown;

    @FindBy(how = How.XPATH, using = "//sui-select[@formcontrolname='target_collection_category']//following::span[contains(text(),'Digital Textbook')]")
    private WebElement selectDigitalTxtBooknTargetCollectionDropddown;

    @FindBy(how = How.XPATH, using = "//sui-select[@formcontrolname='target_collection_category']//following::span[contains(text(),'Question Paper')]")
    private WebElement selectQuestionPaperInTargetCollectionDropddown;

    @FindBy(how = How.XPATH, using = "//sui-select[@formcontrolname='target_collection_category']//following::span[contains(text(),'Content Playlist')]")
    private WebElement selectContentPlaylistInTargetCollectionDropddown;

    @FindBy(how = How.XPATH, using = "//select")
    private List<WebElement> BMCSelect;

    @FindBy(how = How.XPATH, using = "(//td[@class='collapsing'])[1]")
    private WebElement selectFirstContentInTargetCollection;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Publish Project')]")
    private WebElement publishProject;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
    private WebElement yesInPublishPopup;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Your project has been published suucessfully')]")
    private WebElement assertProjectPublished;


    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Skip two - level Review')]")
    private WebElement skipReviewEnable;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'English')]//following::div[@class='sb-avatar__img']")
    private WebElement userProfileIcon;

    @FindBy(how = How.XPATH, using = "//a[text()=' Login ']")
    private WebElement loginLink;

    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//button[@id='login']")
    private WebElement login;

    @FindBy(how = How.XPATH, using = "//div[@class='title mt-4']")
    private WebElement checkAssert;

    public void createNewBtn() {

        UtilityFunctions.waitToBeClickableAndClick(createNewBtn);
        Listeners.addLogs("Clicked on createNew Btn");

    }
    public void selectProjectWithCollectionRadiobtn() {

        UtilityFunctions.waitToBeClickableAndClick(projectCollectionRadiobtn);
        Listeners.addLogs("Clicked on projectCollectionRadiobtn");

    }
    public void nextBtnInProjectCreationPopup() {

        UtilityFunctions.waitToBeClickableAndClick(nextbtnInProjectCreation);
        Listeners.addLogs("Clicked on next btn");

    }

   public void enterProjectName(String projectName) {

        UtilityFunctions.waitToBeClickableAndSendKeys(enterProjectName, projectName);
        Listeners.addLogs("Entered projectName");

    }
    public void enterProjectDesc(String projectDesc) {

        UtilityFunctions.waitToBeClickableAndSendKeys(enterProjectDesc, projectDesc);
        Listeners.addLogs("Entered enterProjectDesc");

    }
    public void skiTwoLevelReviewClick() {

        UtilityFunctions.waitToBeClickableAndClick(skipTwoLevelReviewDisable);
        Listeners.addLogs("Clicked on skipTwoLevelReviewDisable btn");

    }

    public void nominationEndDate(String endDate) {
        UtilityFunctions.waitToBeClickableAndSendKeys(nominationEndDate,endDate);
        Listeners.addLogs("entered nominationEndDate");
    }
    public void nominationShortlistingEndDate(String endDate) {
        UtilityFunctions.waitToBeClickableAndSendKeys(nominationShortlistingEndDate,endDate);
        Listeners.addLogs("entered nominationShortlistingEndDate");
    }
    public void contributionEndDate(String endDate) {
        UtilityFunctions.waitToBeClickableAndSendKeys(contributionEndDate,endDate);
        Listeners.addLogs("entered contributionEndDate");
    }
    public void projectEndDate(String endDate) {
        UtilityFunctions.waitToBeClickableAndSendKeys(projectEndDate,endDate);
        Listeners.addLogs("entered projectEndDate");
    }
    public void recognitionToContributors(String text) {
        UtilityFunctions.waitToBeClickableAndSendKeys(recognitionToContributorsTextbox,text);
        Listeners.addLogs("entered recognitionToContributorsTextbox");
    }
    public void nextButtonProjectCreation() {

        UtilityFunctions.waitToBeClickableAndClick(clkNextButtonInProjectCreation);
        Listeners.addLogs("Clicked on clkNextButtonInProjectCreation btn");

    }
    public void contentTypeDropdown() {

        UtilityFunctions.waitToBeClickableAndClick(contentTypeDropDown);
        Listeners.addLogs("Clicked on contentTypeDropDown btn");

    }
    public void selectValuesInContentTypeDropdown(int n) {

        for(int i=0;i<n;i++) {
            UtilityFunctions.waitForElementAndClickable(contentTypeDropDownValues.get(i));
            Listeners.addLogs("Clicked on contentTypeDropDown btn");
        }
    }
    public void clickTargetCollection() {

        UtilityFunctions.waitForElementAndClickable(targetCollectionDropdown);
        Listeners.addLogs("Clicked on targetCollectionDropdown");

    }
    public void selectCourseInTargetCollection() {
        UtilityFunctions.waitForElementAndClickable(selectCourseInTargetCollectionDropddown);
        Listeners.addLogs("Clicked on selectCourseInTargetCollectionDropddown");
    }
    public void selectDigitalTxtBookInTargetCollection() {
        UtilityFunctions.waitForElementAndClickable(selectDigitalTxtBooknTargetCollectionDropddown);
        Listeners.addLogs("Clicked on selectDigitalTxtBooknTargetCollectionDropddown");
    }
    public void selectQuestionPaperInTargetCollection() {
        UtilityFunctions.waitForElementAndClickable(selectQuestionPaperInTargetCollectionDropddown);
        Listeners.addLogs("Clicked on selectQuestionPaperInTargetCollectionDropddown");
    }
    public void selectContentPlaylistInTargetCollectionDropdown() {
        UtilityFunctions.waitForElementAndClickable(selectContentPlaylistInTargetCollectionDropddown);
        Listeners.addLogs("Clicked on selectContentPlaylistInTargetCollectionDropddown");
    }
    public List<WebElement>  getSelectDropdowns() {
        return BMCSelect;
    }
    public void clickSelectDropdown(int i) {
        UtilityFunctions.waitForElementUsingForLoopAndAssert(BMCSelect.get(i),5);
        UtilityFunctions.scrollInToviewUsingJavaScript(BMCSelect.get(i));
        UtilityFunctions.waitForElementAndClickable(BMCSelect.get(i));
    }

    public void selectContentInTargetCollection() {
        UtilityFunctions.waitForElementAndClickable(selectFirstContentInTargetCollection);
        Listeners.addLogs("Clicked on selectFirstContentInTargetCollection");
    }
    public void publishProject() {
        UtilityFunctions.waitForElementAndClickable(publishProject);
        Listeners.addLogs("Clicked on publishProject");
    }
    public void yesBtnInPublishProject() {
        UtilityFunctions.waitForElementAndClickable(yesInPublishPopup);
        Listeners.addLogs("Clicked on yesBtnInPublishProject");
    }

    public String assertProjectPublishedToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertProjectPublished);
        String actualText=UtilityFunctions.getTextFromElement(assertProjectPublished);
        Listeners.addLogs("assertProjectPublished validated");
        UtilityFunctions.waitForElementToDisappear(assertProjectPublished);
        return actualText;
    }
}

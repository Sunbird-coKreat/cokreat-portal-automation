package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CreateProjectPage {

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Manage Users')]")
    private WebElement manageUserTab;

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

    @FindBy(how = How.XPATH, using = "//label[@for='type_private']")
    private WebElement fromYourOrganizationOnlyRadioBtn;

    @FindBy(how = How.XPATH, using = "//label[@for='type_restricted']")
    private WebElement fromSelectedSetofContributorsRadioBtn;

    @FindBy(how = How.XPATH, using = "//i[@data-tooltip='Modify']")
    private WebElement modifyBtnInSetOfContributors;

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

//    @FindBy(how = How.XPATH, using = "//td[@class='collapsing']")
//    private WebElement selectFirstContentInTargetCollection;

//    @FindBy(how = How.XPATH, using = "//td[@class='collapsing']//following::input[@type='checkbox']")
//    private WebElement selectFirstContentInTargetCollection;


    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Framework Type')]//following::sui-select")
    private WebElement frameWorkTypeDropdown;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Framework Type')]//following::span[contains(text(),'Continuous Professional Development')]")
    private WebElement tpdFrameworkValue;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
    private WebElement yesInChangeFrameworkpopup;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Publish Project')]")
    private WebElement publishProject;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Update')]")
    private WebElement updateBtn;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Save as Draft')]")
    private WebElement saveAsDraft;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
    private WebElement yesInPublishPopup;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Your project has been published suucessfully')]")
    private WebElement assertProjectPublished;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'The project has been modified successfully')]")
    private WebElement assertProjectModifiedMsg;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Your project has been saved as draft successfully!')]")
    private WebElement assertProjectSavedAsDraft;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Courses')]")
    private WebElement assertCourseTab;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Nominations ')]")
    private WebElement assertNominationTab;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Assign users to project ')]")
    private WebElement assertAssignUserToProject;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Contribution Dashboard')]")
    private WebElement assertContributionDashboard;

    @FindBy(how = How.XPATH, using = "//a[@class='item active']//following::a[contains(text(),'Reports')]")
    private WebElement assertReportTab;
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Skip two - level Review')]")
    private WebElement skipReviewEnable;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes')]")
    private WebElement yesBtnInDeleteProjectPopup;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'The project has been deleted successfully.')]")
    private WebElement verifyDeleteProjectToastrMsg;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'All Projects')]")
    private WebElement verifyAllProjects;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Projects')]")
    private WebElement verifyMyProjects;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'My Projects')]")
    private WebElement verifyMyProjectsForSourcingPage;

    @FindBy(how = How.XPATH, using = "//label[@for='searchCriteria']")
    private WebElement getIndividualContentNotTargetedToAnyCollectionRadioBtn;


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
        UtilityFunctions.waitForElementToBeClickable(enterProjectName);
        enterProjectName.click();
        enterProjectName.clear();
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
    public void selectedSetOfContributors() {
        UtilityFunctions.waitForElementAndClickable(fromSelectedSetofContributorsRadioBtn);
        Listeners.addLogs("clicked on fromSelectedSetofContributorsRadioBtn");
    }
    public void yourOrganizationOnlyRadiobtn() {
        UtilityFunctions.waitForElementAndClickable(fromYourOrganizationOnlyRadioBtn);
        Listeners.addLogs("clicked fromYourOrganizationOnlyRadioBtn");
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
    public void saveAsDraft() {
        UtilityFunctions.waitForElementAndClickable(saveAsDraft);
        Listeners.addLogs("Clicked on saveAsDraft");
    }
    public void yesBtnInPublishProject() {
        UtilityFunctions.waitForElementAndClickable(yesInPublishPopup);
        Listeners.addLogs("Clicked on yesBtnInPublishProject");
    }
    public void verifyProjectModifiedToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertProjectModifiedMsg);
        UtilityFunctions.validatIsElementPresent(assertProjectModifiedMsg,"assertProjectModifiedMsg Not displayed");
           UtilityFunctions.waitForElementToDisappear(assertProjectModifiedMsg);
        Listeners.addLogs("assertProjectPublished validated");
    }
    public String assertProjectPublishedToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertProjectPublished);
        String actualText=UtilityFunctions.getTextFromElement(assertProjectPublished);
        Listeners.addLogs("assertProjectPublished validated");
        UtilityFunctions.waitForElementToDisappear(assertProjectPublished);
        return actualText;
    }
    public String verifyProjectSavedAsDraftToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(assertProjectSavedAsDraft);
        String actualText=UtilityFunctions.getTextFromElement(assertProjectSavedAsDraft);
        Listeners.addLogs("assertProjectSavedAsDraft validated");
        UtilityFunctions.waitForElementToDisappear(assertProjectSavedAsDraft);
        return actualText;
    }
    public void verifyCoursesTab() {
        UtilityFunctions.waitForElementAndClickable(assertCourseTab);
        UtilityFunctions.validatIsElementPresent(assertCourseTab,"CourseTab Not displayed");
        Listeners.addLogs("assertCourseTabp");
    }
    public void verifyNominationTab() {
        UtilityFunctions.waitForElementAndClickable(assertNominationTab);
        UtilityFunctions.validatIsElementPresent(assertNominationTab,"NominationTab Not displayed");
        Listeners.addLogs("assertNominationTab");
    }
    public void verifyAssignUserToProjectTab() {
        UtilityFunctions.waitForElementAndClickable(assertAssignUserToProject);
        UtilityFunctions.validatIsElementPresent(assertAssignUserToProject,"AssignUserToProjectTab Not displayed");
        Listeners.addLogs("assertAssignUserToProject");
    }
    public void verifyContributionDashboardTab() {
        UtilityFunctions.waitForElementAndClickable(assertContributionDashboard);
        UtilityFunctions.validatIsElementPresent(assertContributionDashboard,"ContributionDashboardTab Not displayed");
        Listeners.addLogs("assertContributionDashboard");
    }
    public void verifyReportsTab() {
        UtilityFunctions.waitForElementAndClickable(assertReportTab);
        Listeners.addLogs("assertReportTab");
    }
    public void verifyNominationTabNotDisplayed() {
        UtilityFunctions.validatElementNotPresent(assertNominationTab);
        Listeners.addLogs("assertNominationTab Not displayed");
    }
    public void frameworkTypeDropdown() {
        UtilityFunctions.waitForElementAndClickable(frameWorkTypeDropdown);
        Listeners.addLogs("clicked on frameWorkTypeDropdown");
    }
    public void selectTPD() {
        UtilityFunctions.waitForElementAndClickable(tpdFrameworkValue);
        Listeners.addLogs("selected tpdFrameworkValue");
    }
    public void yesbtnInFrameworkChangePopup() {
        UtilityFunctions.waitForElementAndClickable(yesInChangeFrameworkpopup);
        Listeners.addLogs("clicked on yesInChangeFrameworkpopup");
    }
    public void yesBtnInDeletePopup() {
        UtilityFunctions.waitForElementAndClickable(yesBtnInDeleteProjectPopup);
        Listeners.addLogs("clicked on yesBtnInDeleteProjectPopup");
    }
    public void verifyDeleteToastrMsg() {
        UtilityFunctions.waitForVisibilityOfWebElement(verifyDeleteProjectToastrMsg);
        UtilityFunctions.validatIsElementPresent(verifyDeleteProjectToastrMsg,"DeleteProject failed");
        Listeners.addLogs("verifyDeleteProjectToastrMsg");
    }
    public void verifyAllProjects() {

        UtilityFunctions.waitToBeClickableAndClick(verifyAllProjects);
        Listeners.addLogs("Clicked on verifyAllProjects");
        UtilityFunctions.validatIsElementPresent(verifyAllProjects,"AllProjects Not displayed");

    }
    public void verifyMyProjects() {

        UtilityFunctions.waitToBeClickableAndClick(verifyMyProjects);
        Listeners.addLogs("Clicked on verifyMyProjects");
        UtilityFunctions.validatIsElementPresent(verifyMyProjects,"verifyMyProjects Not displayed");

    }

    public void selectGetIndividualContentNotTargetedToAnyCollectionRadioBtn() {

        UtilityFunctions.waitToBeClickableAndClick(getIndividualContentNotTargetedToAnyCollectionRadioBtn);
        Listeners.addLogs("Clicked getIndividualContentNotTargetedToAnyCollectionRadioBtn");

    }
    public void modifyBtnInSetOfContributors() {

        UtilityFunctions.waitToBeClickableAndClick(modifyBtnInSetOfContributors);
        Listeners.addLogs("Clicked modifyBtnInSetOfContributors");

    }
    public void createNewProjectShouldNotDisplay() {
UtilityFunctions.validatElementNotPresent(createNewBtn);
        Listeners.addLogs("createNewBtn Not displayed");

    }
    public void mangageUserShouldNotDisplay() {
        UtilityFunctions.validatElementNotPresent(manageUserTab);
        Listeners.addLogs("manageUserTab Not displayed");

    }
    public void updateBtn() {

        UtilityFunctions.waitToBeClickableAndClick(updateBtn);
        Listeners.addLogs("Clicked updateBtn");

    }
    public void verifyMyProjectsForSourcingPage() {

        UtilityFunctions.waitToBeClickableAndClick(verifyMyProjectsForSourcingPage);
        Listeners.addLogs("Clicked verifyMyProjectsForSourcingPage");

    }
}

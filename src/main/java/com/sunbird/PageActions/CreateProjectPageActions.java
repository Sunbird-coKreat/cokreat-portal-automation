package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.CokreatConstants;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.CreateProjectPage;
import org.openqa.selenium.support.PageFactory;


/* Handle login flow by accepting username and password as parameter */
public class CreateProjectPageActions extends BaseTestConfig {


    public static void clickCreateNewBtn() {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.createNewBtn();
    }

    public static void selectProjectCreationCollectionType() {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.selectProjectWithCollectionRadiobtn();
    }

    public static void clickNextBtnInProjectCreationPopup() {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.nextBtnInProjectCreationPopup();

    }

    public static String enteredProjectName() {
        String projectName = UtilityFunctions.generateRandomName("automation");
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
              createProjectPage.enterProjectName(projectName);
        return projectName;
    }

    public static String enteredProjectDesc() {
        String projectDesc = UtilityFunctions.generateRandomName("automation");
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.enterProjectDesc(projectDesc);
        return projectDesc;
    }
    public static void clickFromYourOrganizationOnlyRadioBtn() {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.yourOrganizationOnlyRadiobtn();
    }
    public static void clickFromSelectedSetOfContributorsRadioBtn() {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.selectedSetOfContributors();
    }
    public static void enterNominationEndDate(String endDate) {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.nominationEndDate(endDate);
    }

    public static void enterNominationShortListingDate(String endDate) {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.nominationShortlistingEndDate(endDate);
    }

    public static void enterContributionEndDate(String endDate) {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.contributionEndDate(endDate);
    }

    public static void enterProjectEndDate(String endDate) {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.projectEndDate(endDate);
    }

    public static void enterRecognitionToContributors(String inputText) {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.recognitionToContributors(inputText);
    }

    public static void clickNextButtonInProjectCreation() {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.nextButtonProjectCreation();
    }

    public static void clickContentTypeDropdown() {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.contentTypeDropdown();
    }

    public static void selectValuesInContentTypeDropdown() {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.selectValuesInContentTypeDropdown(9);
    }

    public static void clickTargetCollectionDropdown(String targetCollectionType) throws InterruptedException {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
                    createProjectPage.clickTargetCollection();
                    UtilityFunctions.threadSleep(2000);
        switch (targetCollectionType) {
            case "Course":
                createProjectPage.selectCourseInTargetCollection();
                break;
            case "Digital Textbook":
                createProjectPage.selectDigitalTxtBookInTargetCollection();
                break;
            case "Question Paper":
                createProjectPage.selectQuestionPaperInTargetCollection();
                break;
            case "Content Playlist":
                createProjectPage.selectContentPlaylistInTargetCollectionDropdown();
                break;
        }
    }

    public static void clickFrameworkTypeDropdown()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.frameworkTypeDropdown();
    }
    public static void selectTPD()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.selectTPD();
    }
    public static void clickOnYesInFrameworkChangePopup()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.yesbtnInFrameworkChangePopup();
    }
    public static void selectFirstContentInTargetCollection()
    {
           CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
createProjectPage.selectContentInTargetCollection();
    }
    public static void clickPublishProject()
    {
             CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
createProjectPage.publishProject();
    }

    public static void clickSaveAsDraft()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.saveAsDraft();
    }
    public static void clickYesInPublishProjectPopup()
    {
                    CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
createProjectPage.yesBtnInPublishProject();
    }
    public static void assertProjectPublishedToastrMsg()
    {
      CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
     String actualText=createProjectPage.assertProjectPublishedToastrMsg();
      UtilityFunctions.stringValueComparision(actualText, CokreatConstants.projectPublishedMsg, "Failed to create publish");

    }
    public static void assertCourseTabAndClick()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.verifyCoursesTab();
    }
    public static void assertNominationTabAndClick()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.verifyNominationTab();
    }
    public static void assertAssignUserToProjectTabAndClick()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.verifyAssignUserToProjectTab();
    }
    public static void assertContributionDashboardTabAndClick()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.verifyContributionDashboardTab();
    }
    public static void assertReportTabAndClick()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.verifyReportsTab();
    }
    public static void nominationTabNotDisplayed()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.verifyNominationTabNotDisplayed();
    }
    public static void assertProjectSavedAsDraftToastrMsg()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        String actualText=createProjectPage.verifyProjectSavedAsDraftToastrMsg();
        UtilityFunctions.stringValueComparision(actualText, CokreatConstants.projectSavedAsDraftMsg, "Failed to save project as draf");

    }
    public static void clickOnYesDeleteProjectPopup()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.yesBtnInDeletePopup();
    }
    public static void assertDeleteProjectTostrMsg()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.verifyDeleteToastrMsg();
    }
    public static void assertAndClickAllProjects()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.verifyAllProjects();
    }
    public static void assertAndClickMyProjects()
    {
        CreateProjectPage createProjectPage = PageFactory.initElements(driver, CreateProjectPage.class);
        createProjectPage.verifyMyProjects();
    }
}
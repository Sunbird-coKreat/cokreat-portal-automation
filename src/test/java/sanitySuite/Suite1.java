package sanitySuite;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class Suite1 extends BaseTestConfig {


    @Test(description = "Verify Sourcing org Admin  is able to login to dock portal")
    public void UserAbleToLoginToSourcingAndContributePortal() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_USERNAME"), cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_PASSWORD"));


    }

    @Test(description = "Sourcing org Admin  should be able to create nomination enabled and skip review enabled project.")
    public void CreateNominationEnabledProjectWithCourseAsTargetCollectionWithSkipReviewEnabled() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertCourseTabAndClick();
        CreateProjectPageActions.assertNominationTabAndClick();
        CreateProjectPageActions.assertAssignUserToProjectTabAndClick();
        CreateProjectPageActions.assertContributionDashboardTabAndClick();
        CreateProjectPageActions.assertReportTabAndClick();
    }

    @Test(description = "Sourcing org Admin  should be able to create nomination disabled and skip review enabled project.")
    public void CreateNominationDisableProjectWithCourseAsTargetCollectionWithSkipReviewEnabled() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.clickFromYourOrganizationOnlyRadioBtn();
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertCourseTabAndClick();
        CreateProjectPageActions.nominationTabNotDisplayed();

    }

    @Test(description = "Admin should be able to create and Publish the Project using curriculum framework ")
    public void AdminAbleToCreateProjectWithCurriculumFramework() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_USERNAME"), cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_PASSWORD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);

    }

    @Test(description = "Admin should be able to create and Publish the Project using TPD framework ")
    public void AdminAbleToCreateProjectWithTPDFramework() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAMECBSE"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAMEPWD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        CreateProjectPageActions.clickFrameworkTypeDropdown();
        CreateProjectPageActions.selectTPD();
        CreateProjectPageActions.clickOnYesInFrameworkChangePopup();
        // UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        UtilityFunctions.scrollDownUsingPixelValue();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_USERNAME"), cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_PASSWORD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);


    }

    @Test(description = "Sourcing org Admin  should be able to create and publish the Project with defined set of contributors.")
    public void PublishProjectWithDefinedSetOfContributors() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.clickFromSelectedSetOfContributorsRadioBtn();
        SelectContributorsInProjectCreationPageActions.clickSelectContributorBtn();
        SelectContributorsInProjectCreationPageActions.ClickContributionTypeDropdown();
        SelectContributorsInProjectCreationPageActions.SelectIndividualOptionInList();
        String individualContributorUsrName = cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR");
        SelectContributorsInProjectCreationPageActions.enterUsernameOrOrganizationNameTxtBox(individualContributorUsrName);
        SelectContributorsInProjectCreationPageActions.ClickSearchBtnInSelectContributors();
        SelectContributorsInProjectCreationPageActions.ClickCheckBoxToSelectUser();
        SelectContributorsInProjectCreationPageActions.ClickSaveBtnInSelectContributors();
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();
        String approvedStatus = NominationTabPageAction.getApprovedStatusXpath(individualContributorUsrName);
        UtilityFunctions.assertWebElementAsString(approvedStatus);
    }

    @Test(description = "Admin should be able to create and Publish the Project using content Playlist")
    public void AdminAbleToCreateProjectUsingContentPlayListAsTargetCollection() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Content Playlist");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_USERNAME"), cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_PASSWORD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);

    }


    /*New week*/
    @Test(description = "Pre-approved nomination should be displayed in the Nomination tab with approved status.")
    public void VerifyPreApprovedUserNominationIsDisplayedInNominationTab() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Digital Textbook");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();
        String approvedStatus = NominationTabPageAction.getApprovedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("CONTRIBUTORNAME"));
        UtilityFunctions.assertWebElementAsString(approvedStatus);
    }

    @Test(description = "Verify all the details in Nomination Tab")
    public void VerifyLabelsInNominationTab() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Digital Textbook");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();
        NominationTabPageAction.assertAllLabelDetailsInNominationTab();
    }

    @Test(description = "The projects should be available for nomination under explore projects for Individual contributor.")
    public void CreatedProjectsAreAvailableOnAllProjectsTabForIndividualContributor() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);

    }

    @Test(description = "The projects should be available for nomination under explore projects for ContributorOrgAdmin")
    public void CreatedProjectsAreAvailableOnAllProjectsTabForContributorOrgAdmin() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("Contributor_Org_Admin"), cokreat_config.getCoKreatConfigPropertyValue("Contributor_Org_Admin_PWD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);

    }

    @Test(description = "User should be able to create Draft Project")
    public void UserAbleToCreateDraftProject() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Digital Textbook");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickSaveAsDraft();
        CreateProjectPageActions.assertProjectSavedAsDraftToastrMsg();
        String assertDeleteProjectXpath = UtilityFunctions.returnDeleteProjectCreatedXpath(projectName);
        UtilityFunctions.assertWebElementAsString(assertDeleteProjectXpath);
        String assertDraftStatus = UtilityFunctions.returnDraftStatusCreatedProjectXpath(projectName);
        UtilityFunctions.assertWebElementAsString(assertDraftStatus);
        String draftProjectXpath = UtilityFunctions.returnEditDraftProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(draftProjectXpath);
    }

    @Test(description = "User should be able to edit and delete Draft Project")
    public void UserAbleToEditDraftAndDeleteDraftProject() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Digital Textbook");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickSaveAsDraft();
        CreateProjectPageActions.assertProjectSavedAsDraftToastrMsg();
        String draftProjectXpath = UtilityFunctions.returnEditDraftProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(draftProjectXpath);
        String editProjectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.clickSaveAsDraft();
        CreateProjectPageActions.assertProjectSavedAsDraftToastrMsg();
        String deleteProjectXpath = UtilityFunctions.returnDeleteProjectCreatedXpath(editProjectName);
        UtilityFunctions.assertWebElementAsString(deleteProjectXpath);
        UtilityFunctions.findDynamicElementAndClick(deleteProjectXpath);
        CreateProjectPageActions.clickOnYesDeleteProjectPopup();
        CreateProjectPageActions.assertDeleteProjectTostrMsg();
        UtilityFunctions.assertWebElementAsStringAndShouldNotDisplay(deleteProjectXpath);

    }

    @Test(description = "Enrollment form should get displayed with contribute as an organization's/ Individual option.")
    public void EnrollAsContributorFormPopup() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("DoNotUseNewUser"), cokreat_config.getCoKreatConfigPropertyValue("DoNotUseNewUserPwd"));
        EnrollAsContributorPopupPageAction.clickEnrollAsOrganizationContributor();
        EnrollAsContributorPopupPageAction.clickEnrollAsindividualContributor();

    }


    /* New */

    @Test(description = "Verify Sourcing org Admin  is able to create nomination disabled without target and skip review enabled project.")
    public void CreateNominationDisabledProjectWithoutTargetCollectionAndSkipReviewEnabledProject() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.clickIndividualContentNotTargetToAnyCollection();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.clickFromYourOrganizationOnlyRadioBtn();
        CreateProjectPageActions.clickSkipTwoLevelReviewClick();
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        String projectXpath = UtilityFunctions.returnIndividualContentProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.nominationTabNotDisplayed();

    }

    @Test(description = "Verify content status count is available in nomination Tab for project with course")
    public void VerifyNominationStatusCountInNominationTabForProjectWithCourse() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickSelectCheckBox();
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
        String pendingStatus = UtilityFunctions.returnNominationPendingStatusProjectCreatedXpath(projectName);
        UtilityFunctions.assertWebElementAsString(pendingStatus);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("INDIVIDUALCONTRIBUTOR_USERNAME"), cokreat_config.getCoKreatConfigPropertyValue("INDIVIDUALCONTRIBUTOR_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickSelectCheckBox();
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
        UtilityFunctions.assertWebElementAsString(pendingStatus);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();

        NominationTabPageAction.assertTotalCount("3");
        NominationTabPageAction.assertApprovedCount("1");
        NominationTabPageAction.assertRejectedCount("0");
        NominationTabPageAction.assertPendingCount("2");

        NominationTabPageAction.clickPendingStatusWithOpenButton();
        NominationTabPageAction.clickRejectBtn();
        NominationTabPageAction.enterReasonForRejectingNomination();
        NominationTabPageAction.clickSubmitBtnInRejectionBox();
        NominationTabPageAction.assertNominationUpdatedSuccessToastrMsg();
        String rejectedStatus = NominationTabPageAction.getRejectedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_ProfileName"));
        UtilityFunctions.assertWebElementAsString(rejectedStatus);

        NominationTabPageAction.assertTotalCount("3");
        NominationTabPageAction.assertApprovedCount("1");
        NominationTabPageAction.assertRejectedCount("1");
        NominationTabPageAction.assertPendingCount("1");

        NominationTabPageAction.clickPendingStatusWithOpenButton();
        NominationTabPageAction.clickAcceptBtn();
        NominationTabPageAction.assertNominationUpdatedSuccessToastrMsg();
        String approvedStatus = NominationTabPageAction.getApprovedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("INDIVIDUALCONTRIBUTOR_ProfileName"));
        UtilityFunctions.assertWebElementAsString(approvedStatus);

        NominationTabPageAction.assertTotalCount("3");
        NominationTabPageAction.assertApprovedCount("2");
        NominationTabPageAction.assertRejectedCount("1");
        NominationTabPageAction.assertPendingCount("0");
    }
    @Test(description = "Verify contribution dashboard is displayed for Sourcing org Admin")
    public void VerifyContributionDashboardDisplayedForSourcingOrgAdmind() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.clickIndividualContentNotTargetToAnyCollection();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.clickFromYourOrganizationOnlyRadioBtn();
        CreateProjectPageActions.clickSkipTwoLevelReviewClick();
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        String projectXpath = UtilityFunctions.returnIndividualContentProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertContributionDashboardTabAndClick();

    }

    @Test(description = "Verify Sourcing org Admin  is able to accept nomination")
    public void SourcingOrgAdminIsAbleToAcceptNomination() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickSelectCheckBox();
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
        String pendingStatus = UtilityFunctions.returnNominationPendingStatusProjectCreatedXpath(projectName);
        UtilityFunctions.assertWebElementAsString(pendingStatus);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();
        NominationTabPageAction.clickPendingStatusWithOpenButton();
        NominationTabPageAction.clickAcceptBtn();
        NominationTabPageAction.assertNominationUpdatedSuccessToastrMsg();
        String approvedStatus = NominationTabPageAction.getApprovedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_ProfileName"));
        UtilityFunctions.assertWebElementAsString(approvedStatus);
    }

    @Test(description = "Verify Sourcing org Admin  is able to reject  nomination")
    public void SourcingOrgAdminIsAbleToRejectNomination() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickSelectCheckBox();
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
        String pendingStatus = UtilityFunctions.returnNominationPendingStatusProjectCreatedXpath(projectName);
        UtilityFunctions.assertWebElementAsString(pendingStatus);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();
        NominationTabPageAction.clickPendingStatusWithOpenButton();
        NominationTabPageAction.clickRejectBtn();
        NominationTabPageAction.enterReasonForRejectingNomination();
        NominationTabPageAction.clickSubmitBtnInRejectionBox();
        NominationTabPageAction.assertNominationUpdatedSuccessToastrMsg();
        String approvedStatus = NominationTabPageAction.getRejectedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_ProfileName"));
        UtilityFunctions.assertWebElementAsString(approvedStatus);
    }

    @Test(description = "Verify content status count is available in nomination Tab for project with ContentPlayList")
    public void VerifyNominationStatusCountInNominationTabForProjectWithContentPlayList() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Content Playlist");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickSelectCheckBox();
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
        String pendingStatus = UtilityFunctions.returnNominationPendingStatusProjectCreatedXpath(projectName);
        UtilityFunctions.assertWebElementAsString(pendingStatus);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("INDIVIDUALCONTRIBUTOR_USERNAME"), cokreat_config.getCoKreatConfigPropertyValue("INDIVIDUALCONTRIBUTOR_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickSelectCheckBox();
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
        UtilityFunctions.assertWebElementAsString(pendingStatus);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();

        NominationTabPageAction.assertTotalCount("3");
        NominationTabPageAction.assertApprovedCount("1");
        NominationTabPageAction.assertRejectedCount("0");
        NominationTabPageAction.assertPendingCount("2");

        NominationTabPageAction.clickPendingStatusWithOpenButton();
        NominationTabPageAction.clickRejectBtn();
        NominationTabPageAction.enterReasonForRejectingNomination();
        NominationTabPageAction.clickSubmitBtnInRejectionBox();
        NominationTabPageAction.assertNominationUpdatedSuccessToastrMsg();
        String rejectedStatus = NominationTabPageAction.getRejectedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_ProfileName"));
        UtilityFunctions.assertWebElementAsString(rejectedStatus);

        NominationTabPageAction.assertTotalCount("3");
        NominationTabPageAction.assertApprovedCount("1");
        NominationTabPageAction.assertRejectedCount("1");
        NominationTabPageAction.assertPendingCount("1");

        NominationTabPageAction.clickPendingStatusWithOpenButton();
        NominationTabPageAction.clickAcceptBtn();
        NominationTabPageAction.assertNominationUpdatedSuccessToastrMsg();
        String approvedStatus = NominationTabPageAction.getApprovedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("INDIVIDUALCONTRIBUTOR_ProfileName"));
        UtilityFunctions.assertWebElementAsString(approvedStatus);

        NominationTabPageAction.assertTotalCount("3");
        NominationTabPageAction.assertApprovedCount("2");
        NominationTabPageAction.assertRejectedCount("1");
        NominationTabPageAction.assertPendingCount("0");
    }

    @Test(description = "Verify content status count is available in nomination Tab for project with Digital Textbook")
    public void VerifyNominationStatusCountInNominationTabForProjectWithDigitalTextbook() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Digital Textbook");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickSelectCheckBox();
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
        String pendingStatus = UtilityFunctions.returnNominationPendingStatusProjectCreatedXpath(projectName);
        UtilityFunctions.assertWebElementAsString(pendingStatus);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("INDIVIDUALCONTRIBUTOR_USERNAME"), cokreat_config.getCoKreatConfigPropertyValue("INDIVIDUALCONTRIBUTOR_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickSelectCheckBox();
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
        UtilityFunctions.assertWebElementAsString(pendingStatus);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();

        NominationTabPageAction.assertTotalCount("3");
        NominationTabPageAction.assertApprovedCount("1");
        NominationTabPageAction.assertRejectedCount("0");
        NominationTabPageAction.assertPendingCount("2");

        NominationTabPageAction.clickPendingStatusWithOpenButton();
        NominationTabPageAction.clickRejectBtn();
        NominationTabPageAction.enterReasonForRejectingNomination();
        NominationTabPageAction.clickSubmitBtnInRejectionBox();
        NominationTabPageAction.assertNominationUpdatedSuccessToastrMsg();
        String rejectedStatus = NominationTabPageAction.getRejectedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_ProfileName"));
        UtilityFunctions.assertWebElementAsString(rejectedStatus);

        NominationTabPageAction.assertTotalCount("3");
        NominationTabPageAction.assertApprovedCount("1");
        NominationTabPageAction.assertRejectedCount("1");
        NominationTabPageAction.assertPendingCount("1");

        NominationTabPageAction.clickPendingStatusWithOpenButton();
        NominationTabPageAction.clickAcceptBtn();
        NominationTabPageAction.assertNominationUpdatedSuccessToastrMsg();
        String approvedStatus = NominationTabPageAction.getApprovedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("INDIVIDUALCONTRIBUTOR_ProfileName"));
        UtilityFunctions.assertWebElementAsString(approvedStatus);

        NominationTabPageAction.assertTotalCount("3");
        NominationTabPageAction.assertApprovedCount("2");
        NominationTabPageAction.assertRejectedCount("1");
        NominationTabPageAction.assertPendingCount("0");
    }


    @Test(description = "Verify Sourcing org Admin  is able to view the samples uploaded by the users")
    public void AdminAbleToViewSampleAndValidateSampleCountInNominationTab() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Digital Textbook");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickSelectCheckBox();
        ProjectTOCInContributePageAction.clickUploadSample();
        ProjectTOCInContributePageAction.clickCreateNewBtn();
        ProjectTOCInContributePageAction.selectContributionTypeContent("eTextbook");
        ProjectTOCInContributePageAction.clickContinueBtn();
        ProjectTOCInContributePageAction.selectFileAndUpload("PDF");
        ProjectTOCInContributePageAction.assertContentSuccesfullyUploadedMsg();
        ProjectTOCInContributePageAction.clickSubmitContentBtn();
        String eTextbookName=ProjectTOCInContributePageAction.enterETextbookName();
        ProjectTOCInContributePageAction.enterETextBookCopyRightYear();
        ProjectTOCInContributePageAction.clickTermsAndConditionInETextbookType();
        ProjectTOCInContributePageAction.clickSubmitBtnETextbookType();
        ProjectTOCInContributePageAction.assertContentSentForReview();
        ProjectTOCInContributePageAction.fetchSampleCountInContributionTOCPage("1");
        ProjectTOCInContributePageAction.clickBackBtn();
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();
        NominationTabPageAction.clickPendingStatusWithOpenButton();
        NominationTabPageAction.assertSampleCountInNominationTocPage("1");
        NominationTabPageAction.clickViewSampleBtn();
        NominationTabPageAction.assertSampleCountInNominationContentTocPage("1");
        String eTextbookContentXpath = UtilityFunctions.returnContributeContentNameXpath(eTextbookName);
        UtilityFunctions.findDynamicElementAndClick(eTextbookContentXpath);
        UtilityFunctions.assertWebElementAsString(eTextbookContentXpath);

    }

    @Test(description = "Verify Sourcing org Admin  is able to view the sample and reject the nomination")
    public void AdminAbleToViewSampleAndRejectTheNominationInNominationTab() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName = CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
        CreateProjectPageActions.clickNextButtonInProjectCreation();
        CreateProjectPageActions.clickContentTypeDropdown();
        CreateProjectPageActions.selectValuesInContentTypeDropdown();
        UtilityFunctions.MoveByOffSet(50, 100);
        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.selectFirstContentInTargetCollection();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickSelectCheckBox();
        ProjectTOCInContributePageAction.clickUploadSample();
        ProjectTOCInContributePageAction.clickCreateNewBtn();
        ProjectTOCInContributePageAction.selectContributionTypeContent("eTextbook");
        ProjectTOCInContributePageAction.clickContinueBtn();
        ProjectTOCInContributePageAction.selectFileAndUpload("PDF");
        ProjectTOCInContributePageAction.assertContentSuccesfullyUploadedMsg();
        ProjectTOCInContributePageAction.clickSubmitContentBtn();
        String eTextbookName=ProjectTOCInContributePageAction.enterETextbookName();
        ProjectTOCInContributePageAction.enterETextBookCopyRightYear();
        ProjectTOCInContributePageAction.clickTermsAndConditionInETextbookType();
        ProjectTOCInContributePageAction.clickSubmitBtnETextbookType();
        ProjectTOCInContributePageAction.assertContentSentForReview();
        ProjectTOCInContributePageAction.fetchSampleCountInContributionTOCPage("1");
        ProjectTOCInContributePageAction.clickBackBtn();
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();
        NominationTabPageAction.clickPendingStatusWithOpenButton();
        NominationTabPageAction.clickViewSampleBtn();
        NominationTabPageAction.assertSampleCountInNominationContentTocPage("1");
        ProjectTOCInContributePageAction.clickBackBtn();
        NominationTabPageAction.clickRejectBtn();
        NominationTabPageAction.enterReasonForRejectingNomination();
        NominationTabPageAction.clickSubmitBtnInRejectionBox();
        NominationTabPageAction.assertNominationUpdatedSuccessToastrMsg();
        String approvedStatus = NominationTabPageAction.getRejectedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_ProfileName"));
        UtilityFunctions.assertWebElementAsString(approvedStatus);
    }
}
package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import com.sunbird.PageObjects.NominationTabPage;
import org.testng.annotations.Test;

import java.lang.ref.PhantomReference;

public class FirstStep4 extends BaseTestConfig {



   /* @Test(description = "Verify Sourcing org Admin  is able to login to dock portal")
    public void UserAbleToLoginToSourcingAndContributePortal() throws Exception {

        String currentURL=UtilityFunctions.getCurrentURLAsString();
          driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
       LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"),cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
                DashboardPageActions.clickUserProfileIcon();
                DashboardPageActions.clickLogOut();
         driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_USERNAME"),cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_PASSWORD"));


    }
*/

   /* @Test(description = "Sourcing org Admin  should be able to create nomination enabled and skip review enabled project.")
    public void CreateNominationEnabledProjectWithCourseAsTargetCollectionWithSkipReviewEnabled() throws Exception {

        String currentURL=UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"),cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
    String projectName= CreateProjectPageActions.enteredProjectName();
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
String projectXpath=UtilityFunctions.returnProjectCreatedXpath(projectName);
UtilityFunctions.findDynamicElementAndClick(projectXpath);
CreateProjectPageActions.assertCourseTabAndClick();
CreateProjectPageActions.assertNominationTabAndClick();
CreateProjectPageActions.assertAssignUserToProjectTabAndClick();
CreateProjectPageActions.assertContributionDashboardTabAndClick();
CreateProjectPageActions.assertReportTabAndClick();
    }*/

  /*  @Test(description = "Sourcing org Admin  should be able to create nomination enabled and skip review enabled project.")
    public void CreateNominationDisableProjectWithCourseAsTargetCollectionWithSkipReviewEnabled() throws Exception {

        String currentURL=UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"),cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName= CreateProjectPageActions.enteredProjectName();
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
        String projectXpath=UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertCourseTabAndClick();
        CreateProjectPageActions.nominationTabNotDisplayed();

    }*/
/*  @Test(description = "Admin should be able to create and Publish the Project using curriculum framework ")
  public void AdminAbleToCreateProjectWithCurriculumFramework() throws Exception {

      String currentURL=UtilityFunctions.getCurrentURLAsString();
      driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
      LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"),cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
      CreateProjectPageActions.clickCreateNewBtn();
      CreateProjectPageActions.selectProjectCreationCollectionType();
      CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
      String projectName= CreateProjectPageActions.enteredProjectName();
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
      driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
      LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_USERNAME"),cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_PASSWORD"));
      String projectXpath=UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);

  }*/

//    @Test(description = "Admin should be able to create and Publish the Project using TPD framework ")
//    public void AdminAbleToCreateProjectWithTPDFramework() throws Exception {
//
//        String currentURL=UtilityFunctions.getCurrentURLAsString();
//        driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
//        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAMECBSE"),cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAMEPWD"));
//        CreateProjectPageActions.clickCreateNewBtn();
//        CreateProjectPageActions.selectProjectCreationCollectionType();
//        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
//        String projectName= CreateProjectPageActions.enteredProjectName();
//        CreateProjectPageActions.enteredProjectDesc();
//        CreateProjectPageActions.enterNominationEndDate(UtilityFunctions.setCurrentDate());
//        CreateProjectPageActions.enterNominationShortListingDate(UtilityFunctions.setFutureDate(2));
//        CreateProjectPageActions.enterContributionEndDate(UtilityFunctions.setFutureDate(3));
//        CreateProjectPageActions.enterProjectEndDate(UtilityFunctions.setFutureDate(4));
//        CreateProjectPageActions.enterRecognitionToContributors("Congratulations");
//        CreateProjectPageActions.clickNextButtonInProjectCreation();
//              CreateProjectPageActions.clickContentTypeDropdown();
//        CreateProjectPageActions.selectValuesInContentTypeDropdown();
//        UtilityFunctions.MoveByOffSet(50, 100);
//        CreateProjectPageActions.clickTargetCollectionDropdown("Course");
//      CreateProjectPageActions.clickFrameworkTypeDropdown();
//      CreateProjectPageActions.selectTPD();
//      CreateProjectPageActions.clickOnYesInFrameworkChangePopup();
//             // UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
//        CreateProjectPageActions.selectFirstContentInTargetCollection();
//        UtilityFunctions.scrollDownUsingPixelValue();
//        CreateProjectPageActions.clickPublishProject();
//        CreateProjectPageActions.clickYesInPublishProjectPopup();
//        CreateProjectPageActions.assertProjectPublishedToastrMsg();
//        DashboardPageActions.clickUserProfileIcon();
//        DashboardPageActions.clickLogOut();
//        driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
//        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_USERNAME"),cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_PASSWORD"));
//        String projectXpath=UtilityFunctions.returnProjectCreatedXpath(projectName);
//        UtilityFunctions.findDynamicElementAndClick(projectXpath);
//
//
//    }

    /*@Test(description = "Sourcing org Admin  should be able to create and publish the Project with defined set of contributors.")
    public void publishProjectWithDefinedSetOfContributors() throws Exception {

        String currentURL=UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"),cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName= CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.enteredProjectDesc();
        CreateProjectPageActions.clickFromSelectedSetOfContributorsRadioBtn();
        SelectContributorsInProjectCreationPageActions.clickSelectContributorBtn();
        SelectContributorsInProjectCreationPageActions.ClickContributionTypeDropdown();
        SelectContributorsInProjectCreationPageActions.SelectIndividualOptionInList();
        String individualContributorUsrName=cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR");
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
        String projectXpath=UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        CreateProjectPageActions.assertNominationTabAndClick();
        UtilityFunctions.scrollDownUsingPixelValue();
       String approvedStatus= NominationTabPageAction.getApprovedStatusXpath(individualContributorUsrName);
UtilityFunctions.assertWebElementAsString(approvedStatus);
    }*/

/*    @Test(description = "Admin should be able to create and Publish the Project using content Playlist")
    public void AdminAbleToCreateProjectUsingContentPlayListAsTargetCollection() throws Exception {

        String currentURL=UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"),cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName= CreateProjectPageActions.enteredProjectName();
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
        driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_USERNAME"),cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_PASSWORD"));
        String projectXpath=UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);

    }*/

/*    @Test(description = "Admin should be able to create and Publish the Project using content Playlist")
    public void AdminAbleToCreateProjectUsingContentPlayListAsTargetCollection() throws Exception {

        String currentURL=UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"),cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName= CreateProjectPageActions.enteredProjectName();
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
        driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_USERNAME"),cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_PASSWORD"));
        String projectXpath=UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);

    }*/

  /*  @Test(description = "User should be able to edit and delete Draft Project")
    public void UserAbleToEditDraftAndDeleteDraftProject() throws Exception {

        String currentURL=UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"),cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.selectProjectCreationCollectionType();
        CreateProjectPageActions.clickNextBtnInProjectCreationPopup();
        String projectName= CreateProjectPageActions.enteredProjectName();
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
        String draftProjectXpath=UtilityFunctions.returnEditDraftProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(draftProjectXpath);
        String editProjectName= CreateProjectPageActions.enteredProjectName();
        CreateProjectPageActions.clickSaveAsDraft();
        CreateProjectPageActions.assertProjectSavedAsDraftToastrMsg();
        String deleteProjectXpath=UtilityFunctions.returnDeleteProjectCreatedXpath(editProjectName);
        UtilityFunctions.assertWebElementAsString(deleteProjectXpath);
        UtilityFunctions.findDynamicElementAndClick(deleteProjectXpath);
CreateProjectPageActions.clickOnYesDeleteProjectPopup();
CreateProjectPageActions.assertDeleteProjectTostrMsg();
UtilityFunctions.assertWebElementAsStringAndShouldNotDisplay(deleteProjectXpath);

        }*/

/*    @Test(description = "Verify Sourcing org Admin  is able to accept nomination")
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
        String approvedStatus = NominationTabPageAction.getApprovedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"));
        UtilityFunctions.assertWebElementAsString(approvedStatus);
    }*/

   /* @Test(description = "Verify content status count is available in nomination Tab for project with Digital Textbook")
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
    }*/


    /*@Test(description = "Verify Sourcing org Admin  is able to view the samples uploaded by the users")
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

    }*/
/*
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
    }*/



   /* @Test(description = "Verify Sourcing org Admin  is able to send back content for correction")
    public void SouringOrgAdminAbleToSendBackContentforCorrection() throws Exception {

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
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
      CreateProjectPageActions.assertAndClickMyProjects();
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
ProjectTOCInContributePageAction.clickUploadContentBtn();
        ProjectTOCInContributePageAction.clickCreateNewBtn();
        ProjectTOCInContributePageAction.selectContributionTypeContent("eTextbook");
        ProjectTOCInContributePageAction.clickContinueBtn();
        ProjectTOCInContributePageAction.selectFileAndUpload("PDF");
        ProjectTOCInContributePageAction.assertContentSuccesfullyUploadedMsg();
        ProjectTOCInContributePageAction.clickSubmitForReview();
        String eTextbookName=ProjectTOCInContributePageAction.enterETextbookName();
        ProjectTOCInContributePageAction.enterETextBookCopyRightYear();
        ProjectTOCInContributePageAction.clickTermsAndConditionInETextbookType();
        ProjectTOCInContributePageAction.clickSubmitBtnETextbookType();
        ProjectTOCInContributePageAction.assertContentAcceptedSuccesfully();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
TargetCollectionTabInSourcingPageAction.clickOpenButton();
        String eTextbookContentXpath = UtilityFunctions.returnContributeContentNameXpath(eTextbookName);
        UtilityFunctions.findDynamicElementAndClick(eTextbookContentXpath);
TargetCollectionTabInSourcingPageAction.clickSendBackForCorrections();
TargetCollectionTabInSourcingPageAction.enterReviewComments("Not Good");
TargetCollectionTabInSourcingPageAction.clickSubmitReviewInAddReviewCommentPopup();


    }*/

    /*@Test(description = "Verify project with approved nomination status is displayed under My Projects tab for defined set of contributors")
    public void CreatedProjectDisplayedInMyProjectsTabWithNominationApprovedStatusForDefinedSetOfContributors() throws Exception {

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
        String individualContributorUsrName = cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_ProfileName");
        SelectContributorsInProjectCreationPageActions.enterUsernameOrOrganizationNameTxtBox(individualContributorUsrName);
        SelectContributorsInProjectCreationPageActions.ClickSearchBtnInSelectContributors();
        SelectContributorsInProjectCreationPageActions.ClickCheckBoxToSelectUser();
        SelectContributorsInProjectCreationPageActions.ClickSaveBtnInSelectContributors();
        CreateProjectPageActions.clickModifyBtnInSetOfContributors();
        String contributorOrgAdminUsrName = cokreat_config.getCoKreatConfigPropertyValue("Contributor_Org_Admin_ProfileName");
        SelectContributorsInProjectCreationPageActions.enterUsernameOrOrganizationNameTxtBox(contributorOrgAdminUsrName);
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
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("Contributor_Org_Admin"), cokreat_config.getCoKreatConfigPropertyValue("Contributor_Org_Admin_PWD"));
        CreateProjectPageActions.assertAndClickMyProjects();
        String approvedStatus = UtilityFunctions.returnNominationApprovedStatusCreatedProjectXpath(projectName);
        UtilityFunctions.assertWebElementAsString(approvedStatus);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        CreateProjectPageActions.assertAndClickMyProjects();
        UtilityFunctions.assertWebElementAsString(approvedStatus);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

    }*/

   /* @Test(description = "Verify Sourcing org Admin  is able to send back content for correction")
    public void SouringOrgAdminAbleToSendBackContentforCorrection() throws Exception {

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
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        CreateProjectPageActions.assertAndClickMyProjects();
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickUploadContentBtn();
        ProjectTOCInContributePageAction.clickCreateNewBtn();
        ProjectTOCInContributePageAction.selectContributionTypeContent("eTextbook");
        ProjectTOCInContributePageAction.clickContinueBtn();
        ProjectTOCInContributePageAction.selectFileAndUpload("PDF");
        ProjectTOCInContributePageAction.assertContentSuccesfullyUploadedMsg();
        ProjectTOCInContributePageAction.clickSubmitForReview();
        String eTextbookName=ProjectTOCInContributePageAction.enterETextbookName();
        ProjectTOCInContributePageAction.enterETextBookCopyRightYear();
        ProjectTOCInContributePageAction.clickTermsAndConditionInETextbookType();
        ProjectTOCInContributePageAction.clickSubmitBtnETextbookType();
        ProjectTOCInContributePageAction.assertContentAcceptedSuccesfully();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        TargetCollectionTabInSourcingPageAction.clickOpenButton();
        String eTextbookContentXpath = UtilityFunctions.returnContributeContentNameXpath(eTextbookName);
        UtilityFunctions.findDynamicElementAndClick(eTextbookContentXpath);
        TargetCollectionTabInSourcingPageAction.clickSendBackForCorrections();
        TargetCollectionTabInSourcingPageAction.enterReviewComments("Not Good");
        TargetCollectionTabInSourcingPageAction.clickSubmitReviewInAddReviewCommentPopup();

    }

    @Test(description = "Verify project with approved nomination status is displayed under My Projects tab for defined set of contributors")
    public void CreatedProjectDisplayedInMyProjectsTabWithNominationApprovedStatusForDefinedSetOfContributors() throws Exception {

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
        String individualContributorUsrName = cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_ProfileName");
        SelectContributorsInProjectCreationPageActions.enterUsernameOrOrganizationNameTxtBox(individualContributorUsrName);
        SelectContributorsInProjectCreationPageActions.ClickSearchBtnInSelectContributors();
        SelectContributorsInProjectCreationPageActions.ClickCheckBoxToSelectUser();
        SelectContributorsInProjectCreationPageActions.ClickSaveBtnInSelectContributors();
        CreateProjectPageActions.clickModifyBtnInSetOfContributors();
        String contributorOrgAdminUsrName = cokreat_config.getCoKreatConfigPropertyValue("Contributor_Org_Admin_ProfileName");
        SelectContributorsInProjectCreationPageActions.enterUsernameOrOrganizationNameTxtBox(contributorOrgAdminUsrName);
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
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("Contributor_Org_Admin"), cokreat_config.getCoKreatConfigPropertyValue("Contributor_Org_Admin_PWD"));
        CreateProjectPageActions.assertAndClickMyProjects();
        String approvedStatus = UtilityFunctions.returnNominationApprovedStatusCreatedProjectXpath(projectName);
        UtilityFunctions.assertWebElementAsString(approvedStatus);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_USR"), cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_PWD"));
        CreateProjectPageActions.assertAndClickMyProjects();
        UtilityFunctions.assertWebElementAsString(approvedStatus);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();

    }*/

  /*  @Test(description = "Verify contirbution org admin is able to upload sample and nominate to the without target collection Project")
    public void VerifyContirbutionOrgAdminIsAbleToUploadSampleAndNominateForWithoutTargetCollectionProject() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.clickIndividualContentNotTargetToAnyCollection();
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
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
        CreateProjectPageActions.clickPublishProject();
        CreateProjectPageActions.clickYesInPublishProjectPopup();
        CreateProjectPageActions.assertProjectPublishedToastrMsg();
        DashboardPageActions.clickUserProfileIcon();
        DashboardPageActions.clickLogOut();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("Contributor_Org_Admin"), cokreat_config.getCoKreatConfigPropertyValue("Contributor_Org_Admin_PWD"));
        String projectXpath = UtilityFunctions.returnProjectCreatedXpath(projectName);
        UtilityFunctions.findDynamicElementAndClick(projectXpath);
        ProjectTOCInContributePageAction.clickSelectContentTypeBtn();
        ProjectTOCInContributePageAction.selectAllContentTypeCheckBox();
        ProjectTOCInContributePageAction.submitClickInContentTypeSelection();
        ProjectTOCInContributePageAction.AssertContentTypeSaveToastrMsg();
        ProjectTOCInContributePageAction.clickUploadSample();
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
          ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
    }*/

   /* @Test(description = "Verify individual contributor is able to nominate to without target collection project without uploading the sample")
    public void VerifyIndividualContributorIsAbleToUploadSampleAndNominateForWithoutTargetCollectionProject() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"), cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
        CreateProjectPageActions.clickCreateNewBtn();
        CreateProjectPageActions.clickIndividualContentNotTargetToAnyCollection();
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
        UtilityFunctions.scrollDownUsingPixelValue();
        UtilityFunctions.dynamicElementHandlingForSelectTagnameInProjectCreation();
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
        ProjectTOCInContributePageAction.clickUploadSample();
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
        ProjectTOCInContributePageAction.ClickNominateBtn();
        ProjectTOCInContributePageAction.ClickSubmitBtnInNominationSubmit();
        ProjectTOCInContributePageAction.AssertNominationSentToastrMsg();
    }*/

    @Test(description = "Verify Sourcing org Admin  is able to view the sample and accept the nomination")
    public void AdminAbleToViewSampleAndItsCountAndAcceptTheNominationInNominationTab() throws Exception {

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
        NominationTabPageAction.clickAcceptBtn();
        NominationTabPageAction.assertNominationUpdatedSuccessToastrMsg();
        String approvedStatus = NominationTabPageAction.getApprovedStatusXpath(cokreat_config.getCoKreatConfigPropertyValue("IndiVidual_CON_ProfileName"));
        UtilityFunctions.assertWebElementAsString(approvedStatus);


    }

}

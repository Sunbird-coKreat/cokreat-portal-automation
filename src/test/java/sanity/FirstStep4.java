package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

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

    @Test(description = "Admin should be able to create and Publish the Project using curriculum framework ")
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

    }
}
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

    @Test(description = "Verify Sourcing org Admin  is able to login to dock portal")
    public void UserAbleToLoginToSourcingAndContributePortal() throws Exception {

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
Thread.sleep(5000);
CreateProjectPageActions.selectFirstContentInTargetCollection();
CreateProjectPageActions.clickPublishProject();
CreateProjectPageActions.clickYesInPublishProjectPopup();
CreateProjectPageActions.assertProjectPublishedToastrMsg();
String projectXpath=UtilityFunctions.returnProjectCreatedXpath(projectName);
UtilityFunctions.findDynamicElementAndClick(projectXpath);
Thread.sleep(5000);
    }

}
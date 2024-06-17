package sanitySuite;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.annotations.Test;

public class NewCredentialsScenario extends BaseTestConfig {


    @Test(description = "User should be able to register as an individual contributor.")
    public void UserAbleToRegisterAsIndividualContributorAndValidateAllAndMyProjectsTab() throws Exception {

        String currentURL = UtilityFunctions.getCurrentURLAsString();
        driver.get(currentURL + cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("IndividualContributorNewUser"), cokreat_config.getCoKreatConfigPropertyValue("IndividualContributorNewUsrPwd"));
        EnrollAsContributorPopupPageAction.clickEnrollAsindividualContributor();
        EnrollAsContributorPopupPageAction.clickTermsAndConditionCheckBox();
        EnrollAsContributorPopupPageAction.clickSubmit();
        CreateProjectPageActions.assertAndClickAllProjects();
        CreateProjectPageActions.assertAndClickMyProjects();

    }


}
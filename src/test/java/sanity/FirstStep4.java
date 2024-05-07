package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FirstStep4 extends BaseTestConfig {



    @Test(description = "Verify Sourcing org Admin  is able to login to dock portal")
    public void UserAbleToLoginToSourcingAndContributePortal() throws Exception {

        String currentURL=UtilityFunctions.getCurrentURLAsString();
          driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("SourcingURL"));
       LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_USRNAME"),cokreat_config.getCoKreatConfigPropertyValue("SOURCINGORGADMIN_PASSWORD"));
                DashboardPageActions.clickUserProfileIcon();
                DashboardPageActions.clickLogOut();
         driver.get(currentURL+ cokreat_config.getCoKreatConfigPropertyValue("ContributeURL"));
        LoginPageActions.LoginForJoinCourse(cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_USERNAME"),cokreat_config.getCoKreatConfigPropertyValue("CONORGADMIN_PASSWORD"));


    }


}
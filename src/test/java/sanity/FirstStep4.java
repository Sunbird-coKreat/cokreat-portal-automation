package sanity;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageActions.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FirstStep4 extends BaseTestConfig {



    @Test(description = "User should be able to select block/cluster/school value for User during onboarding")
    public void userAbleToSelectStateBlockClusterAndSchoolInLocationPopupForNewUser() throws Exception {
        String st="https://dockstaging.sunbirded.org/";
        String AppendExplore = "/sourcing";
        Thread.sleep(4000);
      //  driver.get(st+AppendExplore);
        LoginPageActions.LoginForJoinCourse("raju","psdfds");
   //     OnBoardingActions.RolePoup();


    }


}
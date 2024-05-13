package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.LoginPage;
import com.sunbird.PageObjects.NominationTabPage;
import org.openqa.selenium.support.PageFactory;


/* Handle login flow by accepting username and password as parameter */
public class NominationTabPageAction extends BaseTestConfig {



    public static String getApprovedStatusXpath(String userName)
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
       return nominationTab.returnApprovedXpath(userName);

    }

    public static void assertAllLabelDetailsInNominationTab()
    {
        NominationTabPage nominationTab = PageFactory.initElements(driver, NominationTabPage.class);
nominationTab.verifyAllLabelsInNomindationTab();
    }

}
	

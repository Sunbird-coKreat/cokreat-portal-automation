package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContributionDashboardPage {



    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Contribution Dashboard')]")
    private WebElement contributionDashboardTab;





    public void contributionDashboardTab() {

        UtilityFunctions.waitForElementAndClickable(contributionDashboardTab);
        Listeners.addLogs("Clicked on contributionDashboardTab");
        UtilityFunctions.validatIsElementPresent(contributionDashboardTab,"enrollAsOrganisationContributorRadioBtn not found");
    }


}

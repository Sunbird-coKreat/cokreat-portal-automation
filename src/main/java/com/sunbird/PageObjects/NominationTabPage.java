package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.CokreatConstants;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NominationTabPage {


    public static String returnApprovedXpath(String userName)
    {
        String approvedXpath= CokreatConstants.approvedXpath+userName+CokreatConstants.approvedXpath2;
        return approvedXpath;
    }
    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Contributor Name')]")
    private WebElement assertContributorNameLabel;

    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Type')]")
    private WebElement assertTypeLabel;

    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Digital Textbooks')]")
    private WebElement assertDigitalTextBookLabel;

    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Samples')]")
    private WebElement assertSamplesLabel;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Status')]")
    private WebElement assertStatusLabel;

    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Nominated Date')]")
    private WebElement assertNominationDataLabel;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Download Nominations List')]")
    private WebElement assertDownloadNominationsListButton;

    public void verifyAllLabelsInNomindationTab() {
        UtilityFunctions.isElementPresent(assertContributorNameLabel);
        UtilityFunctions.validatIsElementPresent(assertContributorNameLabel,"assertContributorNameLabel Not displayed");
        Listeners.addLogs("assertContributorNameLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertTypeLabel,"assertTypeLabel Not displayed");
        Listeners.addLogs("assertTypeLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertDigitalTextBookLabel,"assertDigitalTextBookLabel Not displayed");
        Listeners.addLogs("assertDigitalTextBookLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertSamplesLabel,"assertSamplesLabel Not displayed");
        Listeners.addLogs("assertSamplesLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertStatusLabel,"assertStatusLabel Not displayed");
        Listeners.addLogs("assertStatusLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertNominationDataLabel,"assertNominationDataLabel Not displayed");
        Listeners.addLogs("assertNominationDataLabel displayed");
        UtilityFunctions.validatIsElementPresent(assertDownloadNominationsListButton,"assertDownloadNominationsListButton Not displayed");
        Listeners.addLogs("assertDownloadNominationsListButton displayed");

    }

}

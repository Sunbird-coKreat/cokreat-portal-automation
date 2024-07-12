package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectContributorsInProjectCreationPage {

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Select Contributors')]")
    private WebElement selectContibutorBtnInProjectCreation;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Contributor Type ')]//following::span[2]")
    private WebElement contributinTypeDropdown;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Contributor Type ')]//following::span[contains(text(),'Individual')]")
    private WebElement selectIndividualOption;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search by user name/ Organisation name']")
    private WebElement searchUserNameTextBox;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Search')]")
    private WebElement searchBtnInSelectContributors;

//    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Contributor Type ')]//following::input[@type='checkbox']")
//    private WebElement checkBoxToSelectUser;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),' Name')]//following::input[@type='checkbox']")
    private WebElement checkBoxToSelectUser;



    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Contributor Type ')]//following::button[contains(text(),'Save')]")
    private WebElement saveBtnInSelectContributors;


    public void selectContibutorBtnInProjectCreation() {
        UtilityFunctions.waitForElementAndClickable(selectContibutorBtnInProjectCreation);
        Listeners.addLogs("clicked on selectContibutorBtnInProjectCreation");
    }

    public void contributinTypeDropdown() {
        UtilityFunctions.waitForElementAndClickable(contributinTypeDropdown);
        Listeners.addLogs("clicked on contributinTypeDropdown");
    }
    public void selectIndividualOption() {
        UtilityFunctions.waitForElementAndClickable(selectIndividualOption);
        Listeners.addLogs("clicked on selectIndividualOption");
    }
    public void enterUsernameOrOrganizationName(String userName) {

        UtilityFunctions.waitToBeClickableAndSendKeys(searchUserNameTextBox, userName);
        Listeners.addLogs("Entered userName");

    }
    public void searchBtnInSelectContributors() {
        UtilityFunctions.waitForElementAndClickable(searchBtnInSelectContributors);
        Listeners.addLogs("clicked on searchBtnInSelectContributors");
    }
    public void checkBoxToSelectUser() {
        UtilityFunctions.waitForElementAndClickable(checkBoxToSelectUser);
        Listeners.addLogs("clicked on checkBoxToSelectUser");
    }
    public void saveBtnInSelectContributors() {
        UtilityFunctions.waitForElementAndClickable(saveBtnInSelectContributors);
        Listeners.addLogs("clicked on saveBtnInSelectContributors");
    }
}

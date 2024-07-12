package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.CreateProjectPage;
import com.sunbird.PageObjects.LoginPage;
import com.sunbird.PageObjects.SelectContributorsInProjectCreationPage;
import org.openqa.selenium.support.PageFactory;


/* Handle login flow by accepting username and password as parameter */
public class SelectContributorsInProjectCreationPageActions extends BaseTestConfig {


    public static void clickSelectContributorBtn() {
        SelectContributorsInProjectCreationPage selectContributorsPage = PageFactory.initElements(driver, SelectContributorsInProjectCreationPage.class);
        selectContributorsPage.selectContibutorBtnInProjectCreation();
    }
    public static void ClickContributionTypeDropdown() {
        SelectContributorsInProjectCreationPage selectContributorsPage = PageFactory.initElements(driver, SelectContributorsInProjectCreationPage.class);
        selectContributorsPage.contributinTypeDropdown();
    }
    public static void SelectIndividualOptionInList() {
        SelectContributorsInProjectCreationPage selectContributorsPage = PageFactory.initElements(driver, SelectContributorsInProjectCreationPage.class);
        selectContributorsPage.selectIndividualOption();
    }
    public static void enterUsernameOrOrganizationNameTxtBox(String userName) {
        SelectContributorsInProjectCreationPage selectContributorsPage = PageFactory.initElements(driver, SelectContributorsInProjectCreationPage.class);
        selectContributorsPage.enterUsernameOrOrganizationName(userName);
    }
    public static void ClickSearchBtnInSelectContributors() {
        SelectContributorsInProjectCreationPage selectContributorsPage = PageFactory.initElements(driver, SelectContributorsInProjectCreationPage.class);
        selectContributorsPage.searchBtnInSelectContributors();
    }
    public static void ClickCheckBoxToSelectUser() {
        SelectContributorsInProjectCreationPage selectContributorsPage = PageFactory.initElements(driver, SelectContributorsInProjectCreationPage.class);
        selectContributorsPage.checkBoxToSelectUser();
    }
    public static void ClickSaveBtnInSelectContributors() {
        SelectContributorsInProjectCreationPage selectContributorsPage = PageFactory.initElements(driver, SelectContributorsInProjectCreationPage.class);
        selectContributorsPage.saveBtnInSelectContributors();
    }
}
	

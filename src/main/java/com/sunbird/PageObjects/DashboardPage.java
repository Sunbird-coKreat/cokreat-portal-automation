package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

    @FindBy(how = How.XPATH, using = "//div[@class='avatar-content']")
    private WebElement userProfileIcon;

    @FindBy(how = How.XPATH, using = "//div[@class='avatar-content']//following::*[contains(text(),' Logout')]")
    private WebElement loginOutBtn;



    public void userProfileIcon() {

        UtilityFunctions.waitForElementAndClickable(userProfileIcon);
    }

    public void logOutBtn() {

        UtilityFunctions.waitToBeClickableAndClick(loginOutBtn);
        Listeners.addLogs("Clicked on loginOutBtn");
    }


}

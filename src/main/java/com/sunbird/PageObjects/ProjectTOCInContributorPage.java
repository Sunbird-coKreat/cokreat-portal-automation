package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProjectTOCInContributorPage {

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Select Content Types')]")
    private WebElement selectContentTypes;

    @FindBy(how = How.XPATH, using = "//label[@class='mb-0']")
    private List<WebElement> selectContentTypesCheckBox;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
    private WebElement submitBtnInSelectContentType;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Selected Content type(s) saved successfully')]")
    private WebElement verifyContentTypeSaveToastrMsg;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    private WebElement selectCheckBox;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Nominate')]")
    private WebElement nominateBtn;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
    private WebElement submitBtnInNominationSubmit;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Nomination sent')]")
    private WebElement verifyNominationSentToastrMsg;

    public void selectContentTypesCheckBox() {
UtilityFunctions.waitForVisibilityOfWebElement(selectContentTypesCheckBox.get(0));
   int totalElement=selectContentTypesCheckBox.size();
   for(int i=0;i<totalElement;i++)
   {
       selectContentTypesCheckBox.get(i).click();
       Listeners.addLogs("clicked on selectContentTypesCheckBox");
   }

    }

    public void selectContentTypes() {
        UtilityFunctions.waitToBeClickableAndClick(selectContentTypes);
        Listeners.addLogs("Clicked on selectContentTypes");
    }
    public void submitBtnInSelectContentType() {
        UtilityFunctions.waitToBeClickableAndClick(submitBtnInSelectContentType);
        Listeners.addLogs("Clicked on submitBtnInSelectContentType");
    }
    public void verifyContentTypeSaveToastrMsg() {

        UtilityFunctions.waitForVisibilityOfWebElement(verifyContentTypeSaveToastrMsg);
        UtilityFunctions.validatIsElementPresent(verifyContentTypeSaveToastrMsg,"verifyContentTypeSaveToastrMsg failed");
        Listeners.addLogs("Verified verifyContentTypeSaveToastrMsg");
        UtilityFunctions.waitForElementToDisappear(verifyContentTypeSaveToastrMsg);
    }
    public void selectCheckBox() {
      //  UtilityFunctions.waitForVisibilityOfWebElement(selectCheckBox);
       // selectCheckBox.click();
        UtilityFunctions.clickUsingJavaScriptExecutor(selectCheckBox);
       // UtilityFunctions.waitToBeClickableAndClick(selectCheckBox);
        Listeners.addLogs("Clicked on selectCheckBox");
    }
    public void nominateBtn() {
        UtilityFunctions.waitToBeClickableAndClick(nominateBtn);
        Listeners.addLogs("Clicked on nominateBtn");
    }
    public void submitBtnInNominationSubmit() {
        UtilityFunctions.waitToBeClickableAndClick(submitBtnInNominationSubmit);
        Listeners.addLogs("Clicked on submitBtnInNominationSubmit");
    }
    public void verifyNominationSentToastrMsg() {

        UtilityFunctions.waitForVisibilityOfWebElement(verifyNominationSentToastrMsg);
        UtilityFunctions.validatIsElementPresent(verifyNominationSentToastrMsg,"verifyContentTypeSaveToastrMsg failed");
        Listeners.addLogs("Verified verifyNominationSentToastrMsg");
        UtilityFunctions.waitForElementToDisappear(verifyNominationSentToastrMsg);
    }
}

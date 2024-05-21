package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageObjects.ProjectTOCInContributorPage;
import org.openqa.selenium.support.PageFactory;


/* Handle login flow by accepting username and password as parameter */
public class ProjectTOCInContributePageAction extends BaseTestConfig {



    public static void clickSelectContentTypeBtn()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.selectContentTypes();
    }

    public static void selectAllContentTypeCheckBox()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.selectContentTypesCheckBox();
    }
    public static void submitClickInContentTypeSelection()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.submitBtnInSelectContentType();
    }
    public static void AssertContentTypeSaveToastrMsg()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.verifyContentTypeSaveToastrMsg();
    }
    public static void clickSelectCheckBox()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.selectCheckBox();
    }
    public static void ClickNominateBtn()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.nominateBtn();
    }
    public static void ClickSubmitBtnInNominationSubmit()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.submitBtnInNominationSubmit();
    }
    public static void AssertNominationSentToastrMsg()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.verifyNominationSentToastrMsg();
    }
}
	

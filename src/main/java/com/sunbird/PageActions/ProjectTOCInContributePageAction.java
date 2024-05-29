package com.sunbird.PageActions;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
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
    public static void clickUploadSample()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.uploadSample();
    }
    public static void clickCreateNewBtn()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.createNewBtn();
    }
    public static void selectContributionTypeContent(String type)
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.selectContributionTypeContentType(type);
    }
    public static void clickContinueBtn()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.continueBtn();
    }
    public static void selectFileAndUpload(String fileType)
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        String filepath = System.getProperty("user.dir") + cokreat_config.getCoKreatConfigPropertyValue(fileType);
        projectTOCInContributorPage.selectFilesAndUpload(filepath);
    }
    public static void assertContentSuccesfullyUploadedMsg()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.verifyContentSuccesfullyUploadedMsg();
    }
    public static void clickSubmitContentBtn() throws InterruptedException {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.submitContentBtn();
    }
    public static String enterETextbookName()
    {
        String name = UtilityFunctions.generateRandomName("automationETextbook");
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.enterETextbookName(name);
        return name;
    }
    public static void enterETextBookCopyRightYear()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.enterETextBookCopyRight("2024");
    }
    public static void clickTermsAndConditionInETextbookType()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.termsAndConditionInETextbookType();
    }
    public static void clickSubmitBtnETextbookType()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.submitBtnETextbookType();
    }
    public static void assertContentSentForReview()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.verifyContentSentForReview();
    }
    public static void fetchSampleCountInContributionTOCPage(String expected)
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
     String actualCount= projectTOCInContributorPage.getSampleCountInContributionTOCPage();
        UtilityFunctions.stringValueComparision(actualCount,expected, "Failed to validated sampleCountInContributorPage");

    }
    public static void clickBackBtn()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.backBtn();
    }
    public static void clickUploadContentBtn()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.uploadContentBtn();
    }
    public static void clickSubmitForReview() throws InterruptedException {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.submitForReviewBtn();
        UtilityFunctions.threadSleep(15000);
        UtilityFunctions.threadSleep(15000);
        UtilityFunctions.threadSleep(15000);

    }
    public static void assertContentAcceptedSuccesfully()
    {
        ProjectTOCInContributorPage projectTOCInContributorPage = PageFactory.initElements(driver, ProjectTOCInContributorPage.class);
        projectTOCInContributorPage.verifyContentAcceptedSuccesfully();
    }
}
	

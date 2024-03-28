package com.sunbird.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;

public class CreateNewProject extends BaseTestConfig {
	@FindBy(how = How.XPATH, using = "//button[text()=' Create New Project']")
	private WebElement createNewBtn;

	@FindBy(how = How.XPATH, using = "//label[text()='Get content targeted to Textbooks, Courses or other collections']")
	private WebElement projOpt1;

	@FindBy(how = How.XPATH, using = "//span[text()='My Projects']")
	private WebElement myProjectTab;

	@FindBy(how = How.XPATH, using = "//button[text()='Cancel']//preceding::button[1]")
	private WebElement clkbtn;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Enter project name']")
	private WebElement enterProjectName;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Enter project description']")
	private WebElement enterProjectDesc;

	@FindBy(how = How.XPATH, using = "//input[@id='type_restricted']")
	private WebElement selectedSetofContributors;

	@FindBy(how = How.XPATH, using = "//span[text()='Select Contributors']")
	private WebElement clkSelectContributors;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search by user name/ Organisation name']")
	private WebElement enterOrgName;

	@FindBy(how = How.XPATH, using = "(//div[@class='sb-checkbox sb-checkbox-primary'])[2]")
	private WebElement selectOrg;

	@FindBy(how = How.XPATH, using = "//button[text()='Save']")
	private WebElement clkSaveButton;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'From your organization only')]")
	private WebElement fromYourOrg;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Skip two - level Review')]")
	private WebElement skipReviewEnable;

	// select date
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='nomination_enddate']")
	private static WebElement selNominationEndDate;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='nomination_enddate']")
	private WebElement nominationEndDate;

//select short listing date
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='shortlisting_enddate']")
	private static WebElement selShortlistingEndDate;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='shortlisting_enddate']")
	private WebElement shortlistEndDate;

	@FindBy(how = How.XPATH, using = "(//i[@class='calendar icon date-calendar'])[3]")
	private WebElement clkcontributionEndDate;

	// contribution end date
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='content_submission_enddate']")
	private static WebElement SelContributeEndDate;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='content_submission_enddate']")
	private WebElement contributionEndDate;

	// project end date
	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='enddate']")
	private static WebElement selProjectEndDate;

	@FindBy(how = How.XPATH, using = "//input[@formcontrolname='enddate']")
	private WebElement enrollmentEndDate;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder='Add description']")
	private WebElement recognitiontoContributors;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Next')]")
	private WebElement clkNextButton;

	@FindBy(how = How.XPATH, using = "//sui-multi-select[@formcontrolname='targetPrimaryCategories']")
	private WebElement clkContentTypes;

	@FindBy(how = How.XPATH, using = "//span[text()='Course Assessment']")
	private WebElement selCourseAssesment;

	@FindBy(how = How.XPATH, using = "//span[text()='eTextbook']")
	private WebElement seleTextbook;

	@FindBy(how = How.XPATH, using = "//span[text()='Explanation Content']")
	private WebElement explanationContent;

	@FindBy(how = How.XPATH, using = "//span[text()='Learning Resource']")
	private WebElement learningResource;

	@FindBy(how = How.XPATH, using = "//span[text()='Practice Question Set']")
	private WebElement practiceQuestionSet;

	@FindBy(how = How.XPATH, using = "//span[text()='Teacher Resource']")
	private WebElement teacherResource;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Framework Type ')]")
	private WebElement selFrameworktype;

	@FindBy(how = How.XPATH, using = "//option[contains(text(),'Select Board')]")
	private WebElement selBoard;

	@FindBy(how = How.XPATH, using = "//option[contains(text(),'CBSE')]")
	private WebElement selCbse;

	@FindBy(how = How.XPATH, using = "//option[contains(text(),'Select Medium')]")
	private WebElement selMedium;

	@FindBy(how = How.XPATH, using = "//option[contains(text(),'Select Medium')]/following::option[1]")
	private WebElement selEnglish;

	@FindBy(how = How.XPATH, using = "//option[contains(text(),'Select Subject')]")
	private WebElement selSubject;

	@FindBy(how = How.XPATH, using = "//option[contains(text(),'Select Subject')]/following::option[16]")
	private WebElement selHindi;

	@FindBy(how = How.XPATH, using = "//option[contains(text(),'Select Grade ')]")
	private WebElement selGrade;

	@FindBy(how = How.XPATH, using = "//option[contains(text(),'Select Grade')]/following::option[1]")
	private WebElement selClass1;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Apply' )]")
	private WebElement applyButton;

	@FindBy(how = How.XPATH, using = "//sui-select[@formcontrolname='target_collection_category']")
	private WebElement clkTargetCollectionCat;

	@FindBy(how = How.XPATH, using = "//span[text()='Course']")
	private WebElement selCourse;

	@FindBy(how = How.XPATH, using = "//span[text()='Digital Textbook']")
	private WebElement selDigiTextBook;

	@FindBy(how = How.XPATH, using = "(//td[@class='collapsing'])[1]")
	private WebElement chooseTargetCollection;

	@FindBy(how = How.XPATH, using = "//button[text()='Publish Project']")
	private WebElement clkPublishBtn;

	@FindBy(how = How.XPATH, using = "//button[text()='Yes']")
	private WebElement clkConfirm;

	public void CreateNewBtn() {
		UtilityFunctions.waitToBeClickableAndClick(createNewBtn);
	}

	public void ProjOpt1() {
		UtilityFunctions.waitToBeClickableAndClick(projOpt1);
	}

	public void Clkbtn() {
		UtilityFunctions.waitToBeClickableAndClick(clkbtn);
	}

	public void EnterProjectName(String ProjectName) {

		UtilityFunctions.waitToBeClickableAndSendKeys(enterProjectName, ProjectName);

	}

	public void EnterProjectDesc(String Description) {

		UtilityFunctions.waitToBeClickableAndSendKeys(enterProjectDesc, Description);
	}

	public void SelectedSetofContributors(String contributor) {

		UtilityFunctions.waitToBeClickableAndClick(selectedSetofContributors);
		UtilityFunctions.waitToBeClickableAndClick(clkSelectContributors);
		UtilityFunctions.waitToBeClickableAndSendKeys(enterOrgName, contributor);
		UtilityFunctions.waitToBeClickableAndClick(selectOrg);
		UtilityFunctions.waitToBeClickableAndClick(clkSaveButton);

	}

	public void FromYourOrg() {

		UtilityFunctions.scrollDown();
		UtilityFunctions.waitToBeClickableAndClick(fromYourOrg);
	}

	public void SkipReviewEnable() {

		UtilityFunctions.waitToBeClickableAndClick(skipReviewEnable);
	}

	public void NominationEndDate() throws InterruptedException {

		UtilityFunctions.waitToBeClickableAndClick(nominationEndDate);
		UtilityFunctions.setCurrentDate(selNominationEndDate);
	}

	public void ShortlistEndDate() throws InterruptedException {

		UtilityFunctions.waitToBeClickableAndClick(shortlistEndDate);
		UtilityFunctions.setFutureDate(selShortlistingEndDate);
	}

	public void ContributionEndDate() throws InterruptedException {
		UtilityFunctions.waitToBeClickableAndClick(contributionEndDate);
		UtilityFunctions.setFutureDate(SelContributeEndDate);
	}

	public void EnrollmentEndDate() throws InterruptedException {
		UtilityFunctions.scrollDown();
		UtilityFunctions.waitToBeClickableAndClick(enrollmentEndDate);
		UtilityFunctions.setFutureDate(selProjectEndDate);

	}

	public void RecognitiontoContributors(String adddescription) {
		UtilityFunctions.waitToBeClickableAndSendKeys(recognitiontoContributors, adddescription);
	}

	public void NextButton() {
		UtilityFunctions.waitToBeClickableAndClick(clkNextButton);
	}

	public void ClkContentTypes() {
		UtilityFunctions.waitToBeClickableAndClick(clkContentTypes);
	}

	public void SelCourseAssesment() {
		UtilityFunctions.waitToBeClickableAndClick(selCourseAssesment);
	}

	public void SeleTextbook() {
		UtilityFunctions.waitToBeClickableAndClick(seleTextbook);
	}

	public void SelExplanationContent() {
		UtilityFunctions.waitToBeClickableAndClick(explanationContent);
	}

	public void SelLearningResource() {
		UtilityFunctions.waitToBeClickableAndClick(learningResource);
	}

	public void SelPracticeQuestionSet() {
		UtilityFunctions.waitToBeClickableAndClick(practiceQuestionSet);
	}

	public void SelTeacherResource() {
		UtilityFunctions.waitToBeClickableAndClick(teacherResource);
	}

	public void SelFrameworktype() {
		UtilityFunctions.waitToBeClickableAndClick(selFrameworktype);
	}

	public void ClkTargetCollectionCat() {
		UtilityFunctions.waitToBeClickableAndClick(clkTargetCollectionCat);
	}

	public void SelCourse() {
		UtilityFunctions.waitToBeClickableAndClick(selCourse);
	}

	public void SelDigitaTextBook() {
		UtilityFunctions.waitToBeClickableAndClick(selDigiTextBook);
	}

	public void SelBoard() {
		UtilityFunctions.waitForElementAndClickable(selBoard);
	}

	public void SelCbse() {
		UtilityFunctions.waitToBeClickableAndClick(selCbse);
	}

	public void SelMedium() {
		UtilityFunctions.waitForElementAndClickable(selMedium);
	}

	public void SelEnglish() {
		UtilityFunctions.waitToBeClickableAndClick(selEnglish);
	}

	public void SelSubject() {
		UtilityFunctions.waitForElementAndClickable(selSubject);
	}

	public void SelHindi() {
		UtilityFunctions.waitToBeClickableAndClick(selHindi);
	}

	public void SelGrade() {
		UtilityFunctions.waitForElementAndClickable(selGrade);
	}

	public void SelClass1() {
		UtilityFunctions.waitToBeClickableAndClick(selClass1);
	}

	public void SelApplyButton() {
		UtilityFunctions.waitToBeClickableAndClick(applyButton);
	}

	public void ChooseTargetCollection() {
		UtilityFunctions.waitToBeClickableAndClick(chooseTargetCollection);
	}

	public void ClkPublishBtn() {
		UtilityFunctions.waitToBeClickableAndClick(clkPublishBtn);
	}

	public void ClkConfirm() {
		UtilityFunctions.waitToBeClickableAndClick(clkConfirm);
	}
}

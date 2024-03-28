package com.sunbird.PageActions;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.GenericLibrary.UtilityFunctions;
import com.sunbird.PageObjects.CreateNewProject;

public class CreateNewProjectActions extends BaseTestConfig {

	public static void createProjectforAnyoneandSkipDisablewithTextBook() throws InterruptedException {
		CreateNewProject createproject = PageFactory.initElements(driver, CreateNewProject.class);
		createproject.CreateNewBtn();
		createproject.ProjOpt1();
		createproject.Clkbtn();
		String randomChars = UtilityFunctions.getRandomChars(6);
		String projectName = frameworkconfig.getFramework("NAME_STARTSWITH").concat(randomChars);
		createproject.EnterProjectName(projectName);
		createproject.EnterProjectDesc(projectName);
		createproject.NominationEndDate();
		createproject.ShortlistEndDate();
		createproject.ContributionEndDate();
		createproject.EnrollmentEndDate();
		createproject.NextButton();
		createproject.ClkContentTypes();
		createproject.SeleTextbook();
		createproject.SelCourseAssesment();
		createproject.SelExplanationContent();
		createproject.SelPracticeQuestionSet();
		createproject.SelTeacherResource();
		createproject.SelLearningResource();
		createproject.SelFrameworktype();
		createproject.ClkTargetCollectionCat();
		createproject.SelDigitaTextBook();
		createproject.ChooseTargetCollection();
		createproject.ClkPublishBtn();
		createproject.ClkConfirm();

	}

	public static void createProjectforAnyoneandSkipEnablewithTextBook() throws InterruptedException {
		CreateNewProject createproject = PageFactory.initElements(driver, CreateNewProject.class);
		createproject.CreateNewBtn();
		createproject.ProjOpt1();
		createproject.Clkbtn();
		String randomChars = UtilityFunctions.getRandomChars(6);
		String projectName = frameworkconfig.getFramework("NAME_STARTSWITH").concat(randomChars);
		createproject.EnterProjectName(projectName);
		createproject.EnterProjectDesc(projectName);
		createproject.SkipReviewEnable();
		createproject.NominationEndDate();
		createproject.ShortlistEndDate();
		createproject.ContributionEndDate();
		createproject.EnrollmentEndDate();
		createproject.NextButton();
		createproject.ClkContentTypes();
		createproject.SeleTextbook();
		createproject.SelCourseAssesment();
		createproject.SelExplanationContent();
		createproject.SelPracticeQuestionSet();
		createproject.SelTeacherResource();
		createproject.SelLearningResource();
		createproject.SelFrameworktype();
		createproject.ClkTargetCollectionCat();
		createproject.SelDigitaTextBook();
		createproject.ChooseTargetCollection();
		createproject.ClkPublishBtn();
		createproject.ClkConfirm();

	}

	public static void createProjectforSelectedSetofContributorsandSkipDisablewithTextBook()
			throws InterruptedException {
		CreateNewProject createproject = PageFactory.initElements(driver, CreateNewProject.class);
		createproject.CreateNewBtn();
		createproject.ProjOpt1();
		createproject.Clkbtn();
		String randomChars = UtilityFunctions.getRandomChars(6);
		String projectName = frameworkconfig.getFramework("NAME_STARTSWITH").concat(randomChars);
		String selContributor = frameworkconfig.getFramework("CONTRIBUTORNAME");
		createproject.EnterProjectName(projectName);
		createproject.EnterProjectDesc(projectName);
		createproject.SelectedSetofContributors(selContributor);
		createproject.ContributionEndDate();
		createproject.EnrollmentEndDate();
		createproject.NextButton();
		createproject.ClkContentTypes();
		createproject.SeleTextbook();
		createproject.SelCourseAssesment();
		createproject.SelExplanationContent();
		createproject.SelPracticeQuestionSet();
		createproject.SelTeacherResource();
		createproject.SelLearningResource();
		createproject.SelFrameworktype();
		createproject.ClkTargetCollectionCat();
		createproject.SelDigitaTextBook();
		createproject.ChooseTargetCollection();
		createproject.ClkPublishBtn();
		createproject.ClkConfirm();

	}

	public static void createProjectforSelectedSetofContributorsandSkipEnablewithTextBook()
			throws InterruptedException {
		CreateNewProject createproject = PageFactory.initElements(driver, CreateNewProject.class);
		createproject.CreateNewBtn();
		createproject.ProjOpt1();
		createproject.Clkbtn();
		String randomChars = UtilityFunctions.getRandomChars(6);
		String projectName = frameworkconfig.getFramework("NAME_STARTSWITH").concat(randomChars);
		String selContributor = frameworkconfig.getFramework("CONTRIBUTORNAME");
		createproject.EnterProjectName(projectName);
		createproject.EnterProjectDesc(projectName);
		createproject.SelectedSetofContributors(selContributor);
		createproject.SkipReviewEnable();
		createproject.ContributionEndDate();
		createproject.EnrollmentEndDate();
		createproject.NextButton();
		createproject.ClkContentTypes();
		createproject.SeleTextbook();
		createproject.SelCourseAssesment();
		createproject.SelExplanationContent();
		createproject.SelPracticeQuestionSet();
		createproject.SelTeacherResource();
		createproject.SelLearningResource();
		createproject.SelFrameworktype();
		createproject.ClkTargetCollectionCat();
		createproject.SelDigitaTextBook();
		createproject.ChooseTargetCollection();
		createproject.ClkPublishBtn();
		createproject.ClkConfirm();

	}

	public static void createProjectforSameOrgandSkipDisablewithTextBook() throws InterruptedException {
		CreateNewProject createproject = PageFactory.initElements(driver, CreateNewProject.class);
		createproject.CreateNewBtn();
		createproject.ProjOpt1();
		createproject.Clkbtn();
		String randomChars = UtilityFunctions.getRandomChars(6);
		String projectName = frameworkconfig.getFramework("NAME_STARTSWITH").concat(randomChars);
		createproject.EnterProjectName(projectName);
		createproject.EnterProjectDesc(projectName);
		createproject.FromYourOrg();
		createproject.ContributionEndDate();
		createproject.EnrollmentEndDate();
		createproject.NextButton();
		createproject.ClkContentTypes();
		createproject.SeleTextbook();
		createproject.SelCourseAssesment();
		createproject.SelExplanationContent();
		createproject.SelPracticeQuestionSet();
		createproject.SelTeacherResource();
		createproject.SelLearningResource();
		createproject.SelFrameworktype();
		createproject.ClkTargetCollectionCat();
		createproject.SelDigitaTextBook();
		createproject.ChooseTargetCollection();
		createproject.ClkPublishBtn();
		createproject.ClkConfirm();

	}

	public static void createProjectforSameOrgandSkipEnablewithTextBook() throws InterruptedException {
		CreateNewProject createproject = PageFactory.initElements(driver, CreateNewProject.class);
		createproject.CreateNewBtn();
		createproject.ProjOpt1();
		createproject.Clkbtn();
		String randomChars = UtilityFunctions.getRandomChars(6);
		String projectName = frameworkconfig.getFramework("NAME_STARTSWITH").concat(randomChars);
		createproject.EnterProjectName(projectName);
		createproject.EnterProjectDesc(projectName);
		createproject.FromYourOrg();
		createproject.SkipReviewEnable();
		createproject.ContributionEndDate();
		createproject.EnrollmentEndDate();
		createproject.RecognitiontoContributors(projectName);
		createproject.NextButton();
		createproject.ClkContentTypes();
		createproject.SeleTextbook();
		createproject.SelCourseAssesment();
		createproject.SelExplanationContent();
		createproject.SelPracticeQuestionSet();
		createproject.SelTeacherResource();
		createproject.SelLearningResource();
		createproject.SelFrameworktype();
		createproject.ClkTargetCollectionCat();
		createproject.SelDigitaTextBook();
		createproject.ChooseTargetCollection();
		createproject.ClkPublishBtn();
		createproject.ClkConfirm();

	}

	public static void createProjectwithPracticeQuestionSetasContentType() throws InterruptedException {
		CreateNewProject createproject = PageFactory.initElements(driver, CreateNewProject.class);
		createproject.CreateNewBtn();
		createproject.ProjOpt1();
		createproject.Clkbtn();
		String randomChars = UtilityFunctions.getRandomChars(6);
		String projectName = frameworkconfig.getFramework("NAME_STARTSWITH").concat(randomChars);
		createproject.EnterProjectName(projectName);
		createproject.EnterProjectDesc(projectName);
		createproject.NominationEndDate();
		createproject.ShortlistEndDate();
		createproject.ContributionEndDate();
		createproject.EnrollmentEndDate();
		createproject.NextButton();
		createproject.ClkContentTypes();
		UtilityFunctions.scrollDown();
		createproject.SelPracticeQuestionSet();
		createproject.SelFrameworktype();
		createproject.ClkTargetCollectionCat();
		createproject.SelDigitaTextBook();
		createproject.SelBoard();
		createproject.SelCbse();
		createproject.SelMedium();
		createproject.SelEnglish();
		createproject.SelSubject();
		createproject.SelHindi();
		createproject.SelGrade();
		createproject.SelClass1();
		createproject.SelApplyButton();
		createproject.ChooseTargetCollection();
		createproject.ClkPublishBtn();
		createproject.ClkConfirm();

	}

	public static void createProjectwithPracticeQuestionSetasContentTypeskipEnable() throws InterruptedException {
		CreateNewProject createproject = PageFactory.initElements(driver, CreateNewProject.class);
		createproject.CreateNewBtn();
		createproject.ProjOpt1();
		createproject.Clkbtn();
		String randomChars = UtilityFunctions.getRandomChars(6);
		String projectName = frameworkconfig.getFramework("NAME_STARTSWITH").concat(randomChars);
		createproject.EnterProjectName(projectName);
		createproject.EnterProjectDesc(projectName);
		createproject.SkipReviewEnable();
		createproject.NominationEndDate();
		createproject.ShortlistEndDate();
		createproject.ContributionEndDate();
		createproject.EnrollmentEndDate();
		createproject.NextButton();
		createproject.ClkContentTypes();
		UtilityFunctions.scrollDown();
		createproject.SelPracticeQuestionSet();
		createproject.SelFrameworktype();
		createproject.ClkTargetCollectionCat();
		Thread.sleep(1000);
		createproject.SelDigitaTextBook();
		createproject.SelBoard();
		createproject.SelCbse();
		createproject.SelMedium();
		createproject.SelEnglish();
		createproject.SelSubject();
		createproject.SelHindi();
		createproject.SelGrade();
		createproject.SelClass1();
		createproject.SelApplyButton();
		createproject.ChooseTargetCollection();
		createproject.ClkPublishBtn();
		createproject.ClkConfirm();

	}
}

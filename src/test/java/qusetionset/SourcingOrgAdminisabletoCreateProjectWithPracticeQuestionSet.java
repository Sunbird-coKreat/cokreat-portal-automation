package qusetionset;

import org.testng.annotations.Test;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.CreateNewProjectActions;
import com.sunbird.PageActions.IndividualContributorActions;
import com.sunbird.PageActions.OnBoardingActions;

public class SourcingOrgAdminisabletoCreateProjectWithPracticeQuestionSet extends BaseTestConfig {
	@Test
	public void VerifySourcingOrgAdminisAbletoCreatetheProjectwithPracticeQuestionSet() throws Exception {

		OnBoardingActions.loginAsSourcing();
		CreateNewProjectActions.createProjectwithPracticeQuestionSetasContentType();
	}

	@Test
	public void VerifySourcingOrgAdminisAbletoCreatetheProjectwithPracticeQuestionSetandSkipEnable() throws Exception {

		OnBoardingActions.loginAsSourcing();
		CreateNewProjectActions.createProjectwithPracticeQuestionSetasContentType();
	}

	@Test
	public void VerifyIndividualContributorContributetheContent() throws Exception {

		OnBoardingActions.loginAsSourcing();
		CreateNewProjectActions.createProjectwithPracticeQuestionSetasContentType();
		OnBoardingActions.loginAsContributor();
		IndividualContributorActions.IndividualContributorNominatetotheProject();

	}

}

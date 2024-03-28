package sanity;

import org.testng.annotations.Test;

import com.sunbird.GenericLibrary.BaseTestConfig;
import com.sunbird.PageActions.OnBoardingActions;
import com.sunbird.PageActions.CreateNewProjectActions;

public class VerifySourcingOrgAdminabletoLogin extends BaseTestConfig {

/*@Author=Aparna
 * Verify Sourcing org admin able to login*/
	
//	@Test 
//public void VerifyLoginWithSourcingOrgAdmin() throws Exception
//{
//	
//	 OnBoardingActions.loginAsSourcing();
//	 CreateNewProjectActions.createProjectforAnyoneandSkipDisablewithTextBook();
//}
	
//	@Test 
//public void VerifyLoginWithSourcingOrgAdmin() throws Exception
//{
//	
//	 OnBoardingActions.loginAsSourcing();
//	 CreateNewProjectActions.createProjectforAnyoneandSkipDisablewithTextBook();
//}
	
	@Test 
public void VerifyLoginWithSourcingOrgAdmin() throws Exception
{
	
	 OnBoardingActions.loginAsSourcing();
	 CreateNewProjectActions.createProjectforAnyoneandSkipDisablewithTextBook();
}
	@Test
public void verifySourcingOrgAdminisabletoPublishtheProjectfromMyOrgandSkipEnable () throws Exception {
	
	OnBoardingActions.loginAsSourcing();
	CreateNewProjectActions.createProjectforSameOrgandSkipEnablewithTextBook();
}
	
}

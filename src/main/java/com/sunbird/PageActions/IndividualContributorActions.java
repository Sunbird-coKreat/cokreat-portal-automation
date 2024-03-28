package com.sunbird.PageActions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;

import com.sunbird.PageObjects.IndividualContributor;

public class IndividualContributorActions {

	private static SearchContext driver;

	public static void IndividualContributorNominatetotheProject() throws InterruptedException {

		IndividualContributor individualcontributor = PageFactory.initElements(driver, IndividualContributor.class);
		individualcontributor.OpenButton();
	}
}

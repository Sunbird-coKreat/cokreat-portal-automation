package com.sunbird.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.sunbird.GenericLibrary.UtilityFunctions;

public class IndividualContributor {

	@FindBy(how = How.XPATH, using = "//th[contains(text(),'Project Dates')] / following::button[1]")
	private WebElement openBtn;

	public void OpenButton() {
		UtilityFunctions.waitToBeClickableAndClick(openBtn);
	}

}

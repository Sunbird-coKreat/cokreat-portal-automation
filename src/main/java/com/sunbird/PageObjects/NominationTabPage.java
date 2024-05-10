package com.sunbird.PageObjects;

import com.sunbird.GenericLibrary.CokreatConstants;
import com.sunbird.GenericLibrary.Listeners;
import com.sunbird.GenericLibrary.UtilityFunctions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NominationTabPage {


    public static String returnApprovedXpath(String userName)
    {
        String approvedXpath= CokreatConstants.approvedXpath+userName+CokreatConstants.approvedXpath2;
        return approvedXpath;
    }

}

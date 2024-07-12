package com.sunbird.GenericLibrary;

public class CokreatConstants {
    public static String projectPublishedMsg = "Your project has been published suucessfully";
    public static String projectSavedAsDraftMsg = "Your project has been saved as draft successfully!";
    public static String projectXpath1="//div[contains(text(),'";
public static String projectXpath2="')]//following::button[contains(text(),'Open')][1]";
public static String approvedXpath="//div[contains(text(),'";
public static String approvedXpath2="')]//following::span[contains(text(),'Approved')]";
 public static String editDraftProjectXpath2 ="')]//following::span[contains(text(),'Edit Draft')][1]";
 public static String deleteProjectXpath2="')]//following::i[@data-tooltip='Delete'][1]";
    public static String draftStatusProjectXpath2 ="')]//following::div[contains(text(),'Draft')][1]";
    public static String IndividualContentProjectXpath1="(//div[contains(text(),'";
    public static String IndividualContentProjectXpath2="')])[3]//following::button[contains(text(),'Open')][1]";
    public static String nominationPendingProject2="')]//following::span[contains(text(),'Pending')][1]";
    public static String nominationRejectedProject2="')]//following::span[contains(text(),'Rejected')]";
    public static String contributeContentNameXpath1="//*[contains(text(),'";
    public static String contributeContentNameXpath2="')]";
    public static String projectNominationApprovedStatus="//preceding::span[contains(text(),'Approved')]";
    public static String modifyIconXpath="//following::i[@data-tooltip='Modify'][1]";


}

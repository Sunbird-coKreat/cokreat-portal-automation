package com.sunbird.GenericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class CokreatConfigProvider extends BaseTestConfig {

    Properties cokreatConfigPro;

    /*Creates object and loads the Config properties file */
    public CokreatConfigProvider() throws Exception {

//        String path = System.getProperty("user.dir") + "//Config//SunbirdConfig.Properties";
//        FileInputStream fis = new FileInputStream(path);
//        pro = new Properties();
//        pro.load(fis);
//
//        String Env = pro.getProperty("EnvironmentSetup");
//        String path2="";
//                       if (Env.equalsIgnoreCase("STAGING")) {
//            path2 = System.getProperty("user.dir") + "//Config//Sunbird.Properties";
//
//        } else if (Env.equalsIgnoreCase("PREPROD")) {
//
//             path2 = System.getProperty("user.dir") + "//Config//SunbirdPreProd.Properties";
//
//        } else if (Env.equalsIgnoreCase("Prod")) {
//          path2 = System.getProperty("user.dir") + "//Config//SunbirdProd.Properties";
//
//        }

//UtilityFunctions.getProperyFilePath();
        FileInputStream fis2 = new FileInputStream(UtilityFunctions.getProperyFilePath());
        cokreatConfigPro = new Properties();
        cokreatConfigPro.load(fis2);

    }
    /* Method returns the keyValue in properties file based on KeyName Parameter */
    public String getCoKreatConfigPropertyValue(String keyName) {

        return cokreatConfigPro.getProperty(keyName);
    }
  /*  public void writeDataIntoPropertyFile(String keyName, String keyValue) throws IOException {
        sunbirdConfigPro.setProperty(keyName,keyValue);

        sunbirdConfigPro.store(new FileWriter(System.getProperty("user.dir") + "//Config//Sunbird.Properties"),"Javatpoint Properties Example");
    }*/
}

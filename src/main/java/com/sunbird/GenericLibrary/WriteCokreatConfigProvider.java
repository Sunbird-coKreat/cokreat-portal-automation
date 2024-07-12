package com.sunbird.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteCokreatConfigProvider extends BaseTestConfig {

    Properties writesunbirdConfigPro;

    /*Creates object and loads the Config properties file */
    public WriteCokreatConfigProvider() throws Exception {

        String path = System.getProperty("user.dir") + "//Config//Createdcokreat.Properties";

        FileInputStream fis = new FileInputStream(path);
        writesunbirdConfigPro = new Properties();
        writesunbirdConfigPro.load(fis);

    }
    public String getWriteSunbidConfigPropertyValue(String keyName) {

        return writesunbirdConfigPro.getProperty(keyName);
    }
    public void writeDataIntoPropertyFile(String keyName, String keyValue) throws IOException {
        writesunbirdConfigPro.setProperty(keyName,keyValue);
        writesunbirdConfigPro.store(new FileWriter(System.getProperty("user.dir") + "//Config//CreatedSunbirdStagingData.Properties"),"Created content data");
    }
}

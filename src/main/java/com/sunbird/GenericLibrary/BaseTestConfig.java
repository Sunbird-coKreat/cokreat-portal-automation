package com.sunbird.GenericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.sunbird.ReportLibrary.ExtendReportGenerator;

public class BaseTestConfig {

    public static WebDriver driver;
    public static CokreatConfigProvider cokreat_config;

    public static WriteCokreatConfigProvider writecokreat_config;

    Properties pro;
    public static ExtendReportGenerator reporter;


    /* Loads sunbirdConfi properties object */
    @BeforeClass
    public void loadFrameworkConfigs() throws Exception {

        cokreat_config = new CokreatConfigProvider();
        writecokreat_config = new WriteCokreatConfigProvider();
    }

    /*@BeforeTest
    public void load() throws Exception {
        sunbird_config = new SunbirdConfigProvider();
        writesunbird_config=new WriteSunbirdConfigProvider();
    }*/
    /* @Author = Raju
    /* Close the browser once the execution of each testscript  */
    @AfterMethod
    public void CloseBrowser() {

        driver.close();
    }


    /* This method will execute before each @Test method and here we are loding config file properties and Browser launch ,
      navigate to application URL */
    @BeforeMethod
    public void LaunchBrowser() throws Exception {

        String path = System.getProperty("user.dir") + "//Config//Cokreat.Properties";
        FileInputStream fis = new FileInputStream(path);
        pro = new Properties();
        pro.load(fis);
        //System.setProperty(CHROME_KEY,CHROME_VAl);

        //      ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-extensions");
//        options.addArguments("--disable-gpu");
        // options.addArguments("--disable-dev-shm-usage");
//        options.setScriptTimeout(Duration.ofMillis(20000));
//        options.setImplicitWaitTimeout(Duration.ofMillis(5000));
//        options.setPageLoadTimeout(Duration.ofMillis(5000));
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        String Env = pro.getProperty("EnvironmentSetup");


        if (Env.equalsIgnoreCase("STAGING")) {

            driver.get(pro.getProperty("StagingURL"));

        } else if (Env.equalsIgnoreCase("PREPROD")) {

            driver.get(pro.getProperty("PreProdURL"));
        } else if (Env.equalsIgnoreCase("Prod")) {

            driver.get(pro.getProperty("ProdURL"));
        }
        else if (Env.equalsIgnoreCase("Dev")) {

            driver.get(pro.getProperty("DockDevURL"));
        }

    }


//    public String getConfigPropertyEnvironmentPath() {
//        String Env = pro.getProperty("EnvironmentSetup");
//        if (Env.equalsIgnoreCase("STAGING")) {
//
//            String path = System.getProperty("user.dir") + "//Config//Sunbird.Properties";
//
//            return path;
//
//        } else if (Env.equalsIgnoreCase("PREPROD")) {
//
//            String path = System.getProperty("user.dir") + "//Config//SunbirdPreProd.Properties";
//
//            return path;
//        } else if (Env.equalsIgnoreCase("Prod")) {
//            String path = System.getProperty("user.dir") + "//Config//SunbirdProd.Properties";
//            return path;
//        }
//        return "null";
//    }

}

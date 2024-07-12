# CoKreat-portal-automation

             SELENIUM INSTALLATION
             
Pre-Requisite to install the Selenium WebDriver: -

[Before downloading and installing SELENIUM WEB DRIVER in Windows,
please. make sure the below-given prerequisites are fulfilled.]

• Download and Install Java 8 or higher version

• Download and configure Eclipse IDE

• Download Selenium Webdriver Java Client

• Configure Selenium web driver


                      Download And Install Java :
                      
Follow the steps given below to download the latest version of JDK –

• Openthislink – https://www.oracle.com/java/technologies/downloads/

• Scroll down and then select Java 17, and then Windows

• Click on .exelink

JDK should successfully download to your machine.

                  Install Java Development Kit (JDK):
    Given below are the steps that you can follow to install the version
    JDK on your machine –

* Navigate to the folder where you downloaded JDK.

* Double-click on the exe file to start the installation process


* The installation process would begin. Click on the Next button
on the Setup screen


![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/f774537b-2bca-4bc8-bd6a-671141671af8)

* Wait for a few seconds for Java to install some files. After that,
it will ask you to specify the destination folder for JDK. Leave the
default location as it is and click on Next button


![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/308fe9ff-c781-45e4-87bb-3f379d16995f)

    • JDK installatio would now begin
    
    • Once the installation is completed, you will see the window as shown in the screenshot below. Click on Close button to close the window


  ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/d97631b3-c3d8-4a52-94ca-88bd5912ac53)


   * To verify that the installation is successful, open Java folder in Program files. You would see that a new JDK folder with the latest version numbers has been created.

                  * Setup Java Environment Variables:
     
* As the firststep, please copy the folder location where the latest version of JDK is installed, we had installed JDK at the default location (C:\Program Files\Java). If you have also done the same, then open that location

* Nowopen the JDKfolder. If youhave multiple JDKfolders, thenopen theonewhichrepresentsthelatestversion, andcopythefolderlocation. As perthe below screenshot, we are copying this folderlocation – C:\Program Files\Java\jdk-17

* You have to opentheenvironment variableswindow in your machine. To do this, click on the Search icon and then type environment variables in the search bar. Click on Edit the system environment variables option to open it


* ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/47ca5e3c-b04c-43de-ad6e-49a0d0172dc8)

* This would open the System Properties window as shown below. Now from the Advanced Tab, click on Environment Variables button


![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/f96348ab-1495-4bf0-9bbe-4659edf319a7)

    • Fromthe Environment Variables window, click on New button from
System variables section


![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/8128c072-3fb3-46c8-bd2f-26d84e5ebd5f)

* Enter JAVA_HOME in Variable Namefieldand JDKfolderlocation (C:\Program Files\Java\jdk-17) in Variable value field as shown in below image.


 ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/a8fa5553-e4ad-4308-a299-6ff7e66cfda9)

    • Please enter the correct folderlocation thatyou have in your machine
    
    • Click on the OK button. You will seethat JAVA_HOME

      • variablehasnow been added in System Variables.
      
* If you already have JAVA_HOME previously set, then you can click on Edit button to modify its value.***


            * Setup Path Variable

Path variable refers to the location of the bin folder inside the JDK folder.

*Openyourlatest JDKfolderandcheckthat it has bin folder in it

*Nowopenthisbinfolderandcopythe entire folder location. For us, this folder location is – C:\Program Files\Java\jdk-17\bin

* Since the JDKfolder location is already represented by the JAVA_HOME variable, we can replace the location of JDK folder with JAVA_HOME like this – %JAVA_HOME%\bin

* In the Environment variables window, check that there is a variable called Pathunder System variables. Please note that Path is an existing variable, and we would edit it to add the bin folder location

* Select the Path variable and click on the Edit button. The edit environment variable window would be opened

* Click on the New button. A new line is highlighted in the window. Add JDK bin path %JAVA_HOME%\bin as shown in the below image

![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/da875e7b-8a88-4161-9ff3-b95cf1af9f98)


* Click on the OK button. bin folder location is now added in the Path variable

* Close the Environment variable window by clicking on the Ok button. With this, we have now successfully setup Path variableas well

       * Verify that JAVA_HOME and Path variables are set correctly:

  * After you have added JAVA_HOME and Path variables, it’s time to check if the variables are set correctly. Follow the steps given below to check this
    
  * Open command prompt

   * Run the command javac -version.
     
   * This should show the javac version number.
 
   * Verify that this version number is same as the latest JDKversion (from JDKfoldername). You can also run the command where javac. This command should show the JDK bin folder location. This should be the same folder location that you had set in the Path variable

![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/33086f2d-d079-4998-adba-327b9179c7ac)

            Eclipse IDE – Download and Install: Download
             Perform the steps given below to download the latest version of Eclipse

                * IDE
  
    • Openthislink – https://www.eclipse.org/downloads/packages/
    
    • This link is the latest Eclipse IDEversionsfordifferentprogramming languages. We are interested in Eclipse IDE for Enterprise Java and Web Developers

    ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/19fff42b-cf12-4f7b-a00d-aecd45d3c4e9)

* Click on the x86_64 link on Windows to download Eclipse
  
* Once you click on the link, you will be navigated to the download page as shown below. Click on the Download button to start the Download process.

* ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/a3c3deb5-a317-4727-9318-7c6a72186bd3)

Eclipse IDE would start downloading.

With this, we complete the process of downloading Eclipse IDEfor Java.

             Let’s now look at how to set it up
              Install/Setup Eclipse IDE       
              
Unlike a lot of software tools, Eclipse doesn’t need to be installed. Once you unzip it, you can start using it directly. Let us see how this is done 

    • Go to the folder where you had downloaded Eclipseandlocate
the Eclipse zip file

![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/f66c3ec1-f3a9-48b5-bd02-7d2c56259a76)

* Right-click on the Zip file and unzip it
  
* After unzippingthe zip file, you will get the eclipse folder. Open this eclipse folder, it will have content similar to what is shown in the below image

* Double-click on the eclipse.exe file to open the IDE. Once it starts, it will ask you to select a workspace directory.

* In Eclipse, the workspace is the directory where all your projects would be saved.

* Leave the default folder path as it is and click on the Launch button. Eclipse would open the IDE and you would see the Welcome tab as shown below
* 
* ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/54a2ae29-f98b-4862-a128-f638d07ccd0a)

                   


                Install Drivers For Browsers:
                
Installing a web driver for a specific browser is necessary to use Selenium to interact with that browser. The process for installing a web driver will vary depending on your browser and operating system.

 Here are some examples of how to install web drivers for some popular browsers.

 ** Chrome: You can download the Chromedriver executable from the following link - https://chromedriver.chromium.org/downloads. Once you have downloaded the executable, you need to add the path of the downloaded driver to your system environment variable.

** Firefox: You can download the GeckoDriver executable from the following link - https://github.com/mozilla/geckodriver/releases. Once you have downloaded the executable, you need to add the path of the downloaded driver to your system environment variable.

** Safari: Safari does not require a separate web driver to be installed, as it
uses the browser’s built-in automation capabilities.

** Internet Explorer: You can download the InternetExplorerDriver executable from the following link -

link -
https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver.

Once you have downloaded the executable, you need to add the path of the downloaded driver to your system environment variable

                 Configure Eclipse IDE with WebDriver:
                 
    • Launch the “eclipse.exe” file inside the “eclipse” folder that we
extracted, the executable should be located on C:\eclipse\eclipse.exe.        

* When asked to select for a workspace, just accept the default location.

* ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/b6e0c394-9c6f-40d0-85fb-3397eb05b8e6)



                      ** How to install TestNG in Eclipse
                      
To configure Eclipse you need to perform the following:

    • Add TestNG to Eclipse using TestNG Plugin configuration and Run

    ** How to Install and Add TestNG in Eclipse
Step 1: Navigate to Eclipse Marketplace

![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/b22deea7-2be3-4d77-8315-58a28d11cb47)

Step 2: Search for TestNG and click on install.
Note: After the plugin is installed, restart the Eclipse IDE

![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/48d73998-00c7-4cf6-9831-831257ca63b3)

As the plugin is installed, you can see Options like Run All, Run | Debug in the editor itself, and clicking on Run above the TestNG Test will execute the test like wise Debug will allow debugging the test.

                   ** Import code from Github
                   
*  Steps to copy the code URL from GitHub:
[URL - https://github.com/Sunbird-Ed/sunbird-portal- automation/tree/sunbirdportal7.0]
       • Open the URL
       * From the Master drop down, select the latest branch
       • Now, click on the ‘Code’ drop down and click on download Zip file

* Process To Import the Code in Eclipse IDE:

   • Search the Eclipse IDE from the search bar in your system
   • Open the Eclipse IDE
   • Click on File option

  ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/ca4eab25-3042-4e7f-98ad-f493f3c1c63f)

Click on ‘Import’ option

![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/d5455e5a-7861-4d0e-b69c-7091fa78966a)

* Select 'Existing Maven Projects' and click on 'Next' button.

![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/70e86570-8b4b-4e70-a6a0-67e09e4d5459)

Click on 'Browse' option

![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/e22b177d-348d-4db8-a62d-0b47df58ad51)

   • Click on 'Downloads' and then select the downloaded zip file.
  • Click on the 'Select Folder' option

![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/d041b8ac-886e-416e-8e3d-0c76c56944d6)


   • Click on the 'Advanced' drop-down and enter the keywords in Profiles and Name Template.
   • Select the checkbox under Projects
   • Click on the 'Finish' option

   ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/56e56a99-4e4f-4e1a-93b8-53996eacca08)

 * In Left side, you can see the added name and expand it

![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/cbe7358a-c2c2-4019-8c3e-93668590cf33)


*Once you Import the code in Eclipse IDE, you need to run the script:

* Click on ' testng.xml
  
![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/71d945cb-08d4-4680-8707-aa865a74ec90)

* Now, expand ' src/test/java' folder and then select and expand the folder where you have created the main class

* ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/1691b98a-0e65-4aa1-8b5c-ab91454fa860)

* After that, in 'testng.xml' - give the class name for which you want to run the script

* ![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/84d1d4fd-56e1-48af-a978-52c4acc041d7)

* Now, Click on the 'Run' button to launch the application


![image](https://github.com/Sunbird-Ed/sunbird-portal-automation/assets/43565430/509c0acc-86d2-4b28-9ae5-54fd000d0722)

* The application should get launched successfully.




         ******  Key Observations ***********
  
 * To change the Execution Environment follow the below steps
  
         * Go to SunbirdConfig.properties 
         * Enable Environment variable to OCI, Prod, etc.

        
  * To change the suite execution follow the below steps
    
          * Open TestNg.XMl in suite inventory
          * Give packagename.className
        Ex: <class name="sanitySuite.Sanity"/>
        Ex: <class name="regression.CourseConsumption"/>

  * To Trigger the TestNG.xml follow the below steps
   
         * Open any TestNG.xml file
         *  Right-click and click on Run as "TestNG.xml"

  * Check the Extent report after the execution in the below path
    
         * In the Framework root directory, Open the Report folder
         * .Html file will be created 
    

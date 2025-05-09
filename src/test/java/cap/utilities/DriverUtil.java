package java.cap.utilities;

import cap.helpers.Constants;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.*;


public class DriverUtil {

    public static DesiredCapabilities capability = null;

    public static WebDriver getDriver() {

        WebDriver driver = null;
        String strConfig = System.getProperty(Constants.ENV_VARIABLE_CONFIG, "");
        String strBrowser = System.getProperty(Constants.ENV_VARIABLE_BROWSER_NAME, "");
        String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
//        System.out.println("strConfig :: " + strConfig);
//        System.out.println("strBrowser :: " + strBrowser);
//        System.out.println("strExecutionType :: " + strExecutionType);
        if (strConfig.isEmpty() || strExecutionType.equalsIgnoreCase("BROWSER")) {
            driver = getLocalDriver(strBrowser);
            driver.manage().window().maximize();
        } else if (strConfig.isEmpty() || strExecutionType.equalsIgnoreCase("WEBMOBILE")) {
            driver = getLocalDriver(strBrowser);
            driver.manage().window().maximize();
        } else if (strConfig.isEmpty() || strExecutionType.equalsIgnoreCase("MOBILE")) {
            driver = getLocalDriver(strBrowser);
            driver.manage().window().maximize();
        } else if (strConfig.equalsIgnoreCase("remote")) {
//            BrowserStack Web Execution ( Chrome )
            try {
                URL url = new URL("http://172.25.192.1:4545/wd/hub");
                ChromeOptions options = new ChromeOptions();
                //	options.addArguments("--start-maximized");
                options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
                options.addArguments("chrome.switches", "--disable-extensions");
                HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
                chromePrefs.put("credentials_enable_service", false);
                chromePrefs.put("profile.password_manager_enabled", false);
                options.setExperimentalOption("prefs", chromePrefs);

                driver = new RemoteWebDriver(url, options);
            } catch (Exception ex) {
                System.out.println("Exception for Remote Execution : " + ex.getMessage());
            }
        }

        return driver;
    }

    public static WebDriver getMobileDriver() {
        WebDriver driver = null;
        String strExecutionType = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
//        System.out.println("strExecutionType ::"+strExecutionType);
        String strConfig = System.getProperty(Constants.ENV_VARIABLE_CONFIG, "");
//        System.out.println("strConfig ::"+strConfig);
        if (!strConfig.isEmpty()) {
            capability = getCapability(strExecutionType, strConfig, "");
            System.out.println("capability :: " + capability);
            driver = getAppiumDriver(capability);
        } else {
            System.out.println("\nCAP Fatal Error : Please provide Config E.g. -Dconfig=testobject_android_LG_Nexus_5X_Free");
            System.exit(0);
        }
        return driver;
    }

    private static WebDriver getLocalDriver(String strBrowserName) {
        WebDriver driver = null;
        String strExecutionView = System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "");
        try {
            final String osName = OSValidator.getOSName();
            System.out.println(osName);

            switch (strBrowserName) {
                case "firefox":
                    driver = new FirefoxDriver(firefoxOptions());
                    break;

                case "chrome":
                    if ("mobileview".equalsIgnoreCase(strExecutionView)) {
                        driver = new ChromeDriver(chromeCapabilitiesForWebMobileView());
                    }
                    if ("tabview".equalsIgnoreCase(strExecutionView)) {
                        driver = new ChromeDriver(chromeCapabilitiesForWebMobileView());
                    } else if ("mobile".equalsIgnoreCase(strExecutionView)) {
                        driver = new ChromeDriver(chromeCapabilitiesForRealDevice());
                    } else if ("tabletview".equalsIgnoreCase(strExecutionView)) {
                        driver = new ChromeDriver(chromeCapabilitiesForTabletView());
                    } else {
                        driver = new ChromeDriver(chromeCapabilities());
                        driver.manage().window().maximize();
                    }
                    break;

                case "ie":
                    driver = new InternetExplorerDriver(ieCapabilities());
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    break;

                default:
                    driver = new ChromeDriver(chromeCapabilities());
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(new StringBuilder().append("\nCAP Fatal Error : ").append(e.getMessage()));
        }

        return driver;
    }

    public static ChromeOptions chromeCapabilities() {

        String strWorkingDirectory = System.getProperty("user.dir");
        String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                .append(File.separator).append(Constants.DOWNLOAD_PATH).toString();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-autofill-keyboard-accessory-view");
        options.addArguments("--disable-save-password-bubble");
        options.setExperimentalOption("prefs", new HashMap<String, Object>() {{
            put("credentials_enable_service", false);
            put("profile.password_manager_enabled", false);
            put("autofill.credit_card_enabled", false);
        }});

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        options.addArguments("--disable-notifications");

        // Hide save credentials prompt
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);

        // Default download directory
        chromePrefs.put("download.default_directory", strDownloadLocation);
        chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
        chromePrefs.put("safebrowsing.enabled", "true");

        //Disable infobar in chrome instance
        options.addArguments("disable-infobars");

        //  options.addArguments("chrome.switches", "--disable-extensions");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches",
                Collections.singletonList("enable-automation"));
        options.setExperimentalOption("prefs", chromePrefs);
        options.setCapability("goog:chromeOptions", true);
//        options.setCapability("chromedriver_autodownload", true);
        options.setHeadless(false);


        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        // cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        cap.setCapability("chromedriver_autodownload", true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        return options;
    }

    public static ChromeOptions chromeCapabilitiesForRealDevice() {

        String strWorkingDirectory = System.getProperty("user.dir");
        String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                .append(File.separator).append(Constants.DOWNLOAD_PATH).toString();
        System.setProperty("webdriver.chrome.verboseLogging", "true");
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        options.addArguments("--disable-notifications");
        // Hide save credentials prompt
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);

        // Default download directory
        chromePrefs.put("download.default_directory", strDownloadLocation);
        chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
        chromePrefs.put("safebrowsing.enabled", "true");

        //Disable infobar in chrome instance
        options.addArguments("disable-infobars");

        //  options.addArguments("chrome.switches", "--disable-extensions");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches",
                Collections.singletonList("enable-automation"));
        options.setExperimentalOption("prefs", chromePrefs);
        options.setCapability("goog:chromeOptions", true);

        //chrome Driver auto Download for Real device
        options.setCapability("chromedriver_autodownload", true);


        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setBrowserName("chrome");
//         cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability("chromedriver_autodownload", true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        return options;
    }

    public static ChromeOptions chromeCapabilitiesForWebMobileView() {
        String strWorkingDirectory = System.getProperty("user.dir");
        String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                .append(File.separator).append(Constants.DOWNLOAD_PATH).toString();
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        // Hide save credentials prompt
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);
        // Default download directory
        chromePrefs.put("download.default_directory", strDownloadLocation);
        chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
        chromePrefs.put("safebrowsing.enabled", "true");
        //Disable infobar in chrome instance
        options.addArguments("disable-infobars");
        options.addArguments("--disable-extensions");
        options.setExperimentalOption("profile.default_content_settings.popups", 0);
        options.setExperimentalOption("download.prompt_for_download", "false");
        options.setExperimentalOption("download.default_directory", "/tmp");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches",
                Collections.singletonList("enable-automation"));
        options.setExperimentalOption("prefs", chromePrefs);
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("“appium:deviceName”,", "Galaxy S5");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
//        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        return options;
    }

    public static ChromeOptions chromeCapabilitiesForTabletView() {
        String strWorkingDirectory = System.getProperty("user.dir");
        String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                .append(File.separator).append(Constants.DOWNLOAD_PATH).toString();
        ChromeOptions options = new ChromeOptions();

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        // Hide save credentials prompt
        chromePrefs.put("credentials_enable_service", false);
        chromePrefs.put("profile.password_manager_enabled", false);
        // Default download directory
        chromePrefs.put("download.default_directory", strDownloadLocation);
        chromePrefs.put("profile.default_content_setting_values.automatic_downloads", 1);
        chromePrefs.put("safebrowsing.enabled", "true");
        //Disable infobar in chrome instance
        options.addArguments("disable-infobars");
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("height", 1024);
        deviceMetrics.put("width", 768);
        deviceMetrics.put("pixelRatio", 3.0);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 4.2.1; en-us; Nexus 5 Build/JOP40D) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.166 Mobile Safari/535.19");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
//        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        options.addArguments("incognito");
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        return options;
    }


    public static DesiredCapabilities getCapability(String strExecutionType, String strConfig, String strBrowser) {
        DesiredCapabilities capability = new DesiredCapabilities();
        Properties config_prop = new Properties();
        InputStream config_inputStream = null;
        System.out.println("\n Enter :: getCapability :: Type : " + strExecutionType + "\n Config: " + strConfig);
        switch (strExecutionType) {
            case "mobile":
                try {
                    config_inputStream = new FileInputStream(new StringBuilder()
                            .append(Constants.CONFIG_FOLDER)
                            .append("/")
                            .append(Constants.ENV_VARIABLE_MOBILE)
                            .append("/")
                            .append(strConfig).append(".properties").toString());

                    config_prop.load(config_inputStream);

                    if (!strBrowser.isEmpty()) {
                        capability.setBrowserName(strBrowser);
                    }

                    // set capabilities
                    Enumeration<Object> enuKeys = config_prop.keys();
                    while (enuKeys.hasMoreElements()) {
                        String key = (String) enuKeys.nextElement();
                        String value = config_prop.getProperty(key);
                        capability.setCapability(key, value);
                        System.setProperty(key, value);
                        System.out.println(key + value);
                    }
                    capability.setCapability("newCommandTimeout", 15000);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("\nCAP Fatal Error : File not present or Invalid config file name " + strConfig + ".properties");
                    System.exit(0);
                } finally {
                    try {
                        config_inputStream.close();
                    } catch (Exception e) {
                    }
                }
                break;
            case "webmobile":
                try {
                    config_inputStream = new FileInputStream(new StringBuilder()
                            .append(Constants.CONFIG_FOLDER)
                            .append("/")
                            .append(Constants.ENV_VARIABLE_MOBILE)
                            .append("/")
                            .append(strConfig).append(".properties").toString());

                    config_prop.load(config_inputStream);

                    if (!strBrowser.isEmpty()) {
                        capability.setBrowserName(strBrowser);
                    }

                    // set capabilities
                    Enumeration<Object> enuKeys = config_prop.keys();
                    while (enuKeys.hasMoreElements()) {
                        String key = (String) enuKeys.nextElement();
                        String value = config_prop.getProperty(key);
                        capability.setCapability(key, value);
                        System.setProperty(key, value);
                        System.out.println(key + value);
                    }
                    capability.setCapability("newCommandTimeout", 15000);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("\nCAP Fatal Error : File not present or Invalid config file name " + strConfig + ".properties");
                    System.exit(0);
                } finally {
                    try {
                        config_inputStream.close();
                    } catch (Exception e) {
                    }
                }
                break;


            case "WINDOWS":
                System.out.println(" - Caps - Windows");
                try {
                    config_inputStream = new FileInputStream(new StringBuilder()
                            .append(Constants.CONFIG_FOLDER)
                            .append("/")
                            .append(Constants.ENV_VARIABLE_WINDOW)
                            .append("/")
                            .append(strConfig).append(".properties").toString());

                    config_prop.load(config_inputStream);

                    if (!strBrowser.isEmpty()) {
                        capability.setBrowserName(strBrowser);
                    }

                    // set capabilities
                    Enumeration<Object> enuKeys = config_prop.keys();
                    while (enuKeys.hasMoreElements()) {
                        String key = (String) enuKeys.nextElement();
                        String value = config_prop.getProperty(key);
                        capability.setCapability(key, value);
                        System.setProperty(key, value);
                    }
                    capability.setCapability("newCommandTimeout", 15000);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("\nCAP Fatal Error : File not present or Invalid config file name " + strConfig + ".properties");
                    System.exit(0);
                } finally {
                    try {
                        config_inputStream.close();
                    } catch (Exception e) {
                    }
                }
                break;

            case "both":
                try {
                    config_inputStream = new FileInputStream(new StringBuilder()
                            .append(Constants.CONFIG_FOLDER)
                            .append("/")
                            .append(Constants.ENV_VARIABLE_WINDOW)
                            .append("/")
                            .append(strConfig).append(".properties").toString());

                    config_prop.load(config_inputStream);

                    if (!strBrowser.isEmpty()) {
                        capability.setBrowserName(strBrowser);
                    }

                    // set capabilities
                    Enumeration<Object> enuKeys = config_prop.keys();
                    while (enuKeys.hasMoreElements()) {
                        String key = (String) enuKeys.nextElement();
                        String value = config_prop.getProperty(key);
                        capability.setCapability(key, value);
                        System.setProperty(key, value);
                    }
                    capability.setCapability("newCommandTimeout", 15000);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("\nCAP Fatal Error : File not present or Invalid config file name " + strConfig + ".properties");
                    System.exit(0);
                } finally {
                    try {
                        config_inputStream.close();
                    } catch (Exception e) {
                    }
                }
                break;
        }
        return capability;
    }

    public static WebDriver getAppiumDriver(DesiredCapabilities capability) {
        WebDriver driver = null;
        System.out.println("\n Enter Get Appium Driver... method in...");
        try {
            String strRemoteIP = System.getProperty(Constants.ENV_VARIABLE_REMOTE_IP, "");
            String strRemotePort = System.getProperty(Constants.ENV_VARIABLE_REMOTE_PORT, "");
            System.out.println("");
            if (strRemoteIP.isEmpty()) {
                strRemoteIP = Constants.APPIUM_LOCAL_IP;
            }
            if (strRemotePort.isEmpty()) {
                strRemotePort = Constants.APPIUM_LOCAL_PORT;
            }
            String strURL = "";
            //Browser Stack Mobile Real device & Mobile App Execution
            if (System.getProperty(Constants.ENV_VARIABLE_CONFIG, "").contains("remote_")) {
                System.out.println("\n enter if... remote Execut");
                String USERNAME = "rdevanathan_NS9RGC";
                String AUTOMATE_KEY = "6HKdZhsteHb6zMAykmyY";
                strURL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

            } else {
                //Real Device Chome & Mobile App ( Android & IOS )
                strURL = new StringBuilder()
                        .append("http://")
                        .append(strRemoteIP)
                        .append(":")
                        .append(strRemotePort)
                        .toString();
                System.out.println("strURL  " + strURL);
            }
            System.out.println("capability  ::" + capability);
            driver = new AndroidDriver(new URL(strURL), capability);

            System.out.println("driver  ::" + driver);
            System.setProperty("PLATFORM", capability.getPlatformName().toString().toUpperCase());
            System.out.println(">>> Check Paltform Name >> >> " + System.getProperty("PLATFORM"));

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(new StringBuilder().append("\nCAP Fatal Error : ").append(e.getMessage()));
            System.exit(0);
        }

        return driver;
    }


    public static FirefoxOptions firefoxOptions() throws Exception {
        FirefoxOptions options = new FirefoxOptions();
        String strWorkingDirectory = System.getProperty("user.dir");
        String strDownloadLocation = new StringBuilder(strWorkingDirectory)
                .append(File.separator).append(Constants.DOWNLOAD_PATH).toString();

        options.addPreference("browser.download.folderList", 2);
        options.addPreference("browser.download.manager.showWhenStarting", false);
        //Set downloadPath
        options.addPreference("browser.download.dir", strDownloadLocation);

        options.addPreference("browser.helperApps.neverAsk.openFile",
                "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml;text/html;message/rfc822;application/octet-stream;");
        options.addPreference("browser.helperApps.neverAsk.saveToDisk",
                "text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml;text/html;message/rfc822;application/octet-stream;");

        options.addPreference("browser.download.manager.showWhenStarting", false);
        options.addPreference("pdfjs.disabled", true);
        options.addPreference("browser.helperApps.alwaysAsk.force", false);
        options.addPreference("browser.download.manager.alertOnEXEOpen", false);
        options.addPreference("browser.download.manager.focusWhenStarting", false);
        options.addPreference("browser.download.manager.useWindow", false);

        options.addPreference("browser.download.manager.showAlertOnComplete", false);
        options.addPreference("browser.download.manager.closeWhenDone", false);
        return options;
    }

    public static InternetExplorerOptions ieCapabilities() {
        InternetExplorerOptions options = new InternetExplorerOptions();

        options.introduceFlakinessByIgnoringSecurityDomains();
        options.ignoreZoomSettings();
        options.enablePersistentHovering();
        options.takeFullPageScreenshot();
        //  options.disableNativeEvents();
        options.requireWindowFocus();
        options.setCapability("ignoreProtectedModeSettings", true);
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);

        return options;
    }


}

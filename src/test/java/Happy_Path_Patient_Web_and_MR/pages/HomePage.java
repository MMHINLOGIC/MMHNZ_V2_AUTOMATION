package Happy_Path_Patient_Web_and_MR.pages;

import cap.common.BasePage;
import cap.helpers.Constants;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import cap.utilities.WindowsProcessUtil;
import io.restassured.internal.TrustAndKeystoreSpec;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static cap.utilities.DateUtil.*;
import static cap.utilities.SharedDriver.strExecutionNumber;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    static Process pb = null;

    public static String strAppVersion;
    public static String strBrowserName;
    public static String strBrowserVersion;
    public static String strSystemName;
    public static String NewEmailAttribute;

    public static String BTBNewEmail;


    //MMH_v2

    @FindBy(how = How.XPATH, using = "//div[@class='navbar-header']")
    protected WebElement elmntLogo;

    @FindBy(how = How.XPATH, using = "//button[@id='Login']")
    protected WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    protected WebElement elmntLoginBtn;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'btn-primary-pill')]")
    protected WebElement elmntLoginUIUX;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Beat Depression and Anxiety')]")
    protected WebElement elmntBtbLoginPage;

    @FindBy(how = How.XPATH, using = "(//img[@src='https://btbdevnz.wpenginepowered.com/wp-content/uploads/2023/11/Login-Button2.png'])[1]")
    protected WebElement elmntClickBTBLoginButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Provider Sign Up')]")
    protected WebElement elmntProviderSignUp;


    @FindBy(how = How.XPATH, using = "(//img[@src='https://btbdevnz.wpenginepowered.com/wp-content/uploads/2023/11/Login-Button2.png'])[3]")
    protected WebElement elmntMobileClickBTBLoginButton;


    @FindBy(how = How.XPATH, using = "//span[text()='Login']")
    protected WebElement elmntMobileLoginBtn;

    @FindBy(how = How.XPATH, using = "//span[text()='Provider Login']")
    protected WebElement ClickPatientLoginBtn;

    @FindBy(how = How.XPATH, using = "//img[@src='assets/images/profile-unknown.svg']")
    protected WebElement elmntProfile;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' Sign Out ')]")
    protected WebElement elmntSignout;

    @FindBy(how = How.XPATH, using = "//div[@class='appVersion']/small")
    protected WebElement txtAppVersion;

    @FindBy(how = How.XPATH, using = "(//*[contains(text(),'My Home page') or contains(text(),'Welcome') or contains(text(),'Start managing your health today')])[1]")
    protected WebElement elmntVerifyHomePage;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Helping you get better and stay well')]")
    protected WebElement elmntVerifyBTBHomePage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'MANAGE YOUR HEALTH')]")
    protected WebElement elmntVerifyProviderBTBHomePage;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Important Update')]")
    protected WebElement elmntTeamsConditionsHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'ACCEPT')]")
    protected WebElement elmntTeamsConditions;
    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Testpreferred')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Gp2White')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Barry')]")
    })
    protected WebElement txtProviderPortalWelcomePage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashboard;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'SIGN OUT')]")
    protected WebElement elmntSignOut;


    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),'Harry Harry!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Peter')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Auto Autochrisc1')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'14')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Chrisc4')]")

    })
    protected WebElement txtPatientWelcomePage;

    @FindBy(how = How.XPATH, using = "(//img[@alt='ManageMyHealth'])[1]")
    protected WebElement elmntMMHLogo;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Your session is about to expire!')]")
    protected WebElement elmntLogoutPopup;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Yes, Keep Working')]")
    protected WebElement elmntLogoutPopupButton;

    @FindBy(how = How.XPATH, using = "(//a[@class='pum-trigger'])[1]")
    protected WebElement elmntSignLogin;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Create an Individual Account')]")
    protected WebElement elmntCreateanIndividualAccount;

    @FindBy(how = How.XPATH, using = "//input[@name='Firstname']")
    protected WebElement elmntEnterFirstName;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Hi! Tell us a bit about you.')]")
    protected WebElement elmntVerifySelfRegistrationPage;

    protected String strDayAfterDate = new StringBuilder()
            .append("//table[@class='mat-calendar-table']//tbody//tr//td//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Well done you are almost there!')]")
    protected WebElement elmntInformationPopup;

    @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Last name']")
    protected WebElement elmntEnterLastName;

    @FindBy(how = How.XPATH, using = "//input[@name='email']")
    protected WebElement elmntEnterEmail;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'It looks like you are already registered with Manage My Health.')]")
    protected WebElement elmntError;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    protected WebElement elmntEnterPassword;

    @FindBy(how = How.XPATH, using = "//input[@name='confirmPassword']")
    protected WebElement elmntEnterConfirmPassword;

    @FindBy(how = How.XPATH, using = "(//input[@name='dob']//following::button)[1]")
    protected WebElement elmntSelectDOB;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Choose month and year']")
    protected WebElement elmntMonthAndYear;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'2002')]")
    protected WebElement elmntYear;

    public String futureDate = new StringBuilder()
            .append("//td/div[contains(text(),'")
            .append("<<REPLACEMENT>>")
            .append("')]").toString();

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Open calendar']")
    protected WebElement elmntCalendar;

    @FindBy(how = How.XPATH, using = "//mat-select[@name='gender']")
    protected WebElement elmntSelectGender;

    protected String elmntHealthCenter = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@name='ethnicity']")
    protected WebElement elmntSelectEthnicity;

    @FindBy(how = How.XPATH, using = "(//mat-select[@name='ethnicity']//following::input)[1]")
    protected WebElement elmntSelectCheckBox1;

    @FindBy(how = How.XPATH, using = "(//mat-select[@name='ethnicity']//following::input)[2]")
    protected WebElement elmntSelectCheckBox2;

    @FindBy(how = How.XPATH, using = "(//mat-select[@name='ethnicity']//following::input)[3]")
    protected WebElement elmntSelectCheckBox3;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'SUBMIT')]")
    protected WebElement elmntSubmitButton;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'OK')]")
    protected WebElement elmntokButton;

    @FindBy(how = How.XPATH, using = "//input[@autocomplete='username']")
    protected WebElement elmntGmailEmail;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
    protected WebElement elmntNextButton;

    @FindBy(how = How.XPATH, using = "//input[@autocomplete='current-password']")
    protected WebElement elmntGmailPassword;

    @FindBy(how = How.XPATH, using = "//a[@title='Gmail']//img")
    protected WebElement elmntGmailLogo;

    @FindBy(how = How.XPATH, using = "(//span[text()='Welcome to Beating the Blues'])[2]")
    protected WebElement elmntWelcomeMessage;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Success')]")
    protected WebElement elmntSuccessMessage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Congratulations! You have successfully completed your verification.')]")
    protected WebElement elmntSuccessMessageText;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'beatingtheblues@mmh.')])[2]")
    protected WebElement elmntBtbConfirmYourMail;

    @FindBy(how = How.XPATH, using = "//strong[contains(text(),'Welcome to Beating the Blues')]")
    protected WebElement verifybtbmailcontent;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'OK')]")
    protected WebElement selectOkButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'- your Account has been created.')]")
    protected WebElement verifybtbmailcontent1;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Please click the button below to verify your email address and confirm your registration.')]")
    protected WebElement verifybtbmailcontent2;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'(You will not be able to login to Beating the Blues until your account has been verified).')]")
    protected WebElement verifybtbmailcontent3;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'CONFIRM YOUR REGISTRATION')]")
    protected WebElement verifyconfirmyourRegistration;

    @FindBy(how = How.XPATH, using = "//input[@aria-label='Search mail']")
    protected WebElement elmntGmailSearchBox;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign in')]")
    protected WebElement verifyBTBLoginPage;
    protected String elmntSubmitButtonEnablePage = "(//button[@ng-reflect-disabled='false'])[2]";

//    @FindBy(how = How.XPATH, using = "(//mat-select[@name='ethnicity']//following::input)[3]")
//    protected WebElement elmntSelectCheckBox3;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'I understand that Beating the Blues is not a clinically monitored service and does not provide crisis support.')]")
    protected WebElement verifyCheckBoxContent;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),' I have read and agree to the patient')]")
    protected WebElement verifyCheckBox1Content;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'I understand the Beating the Blues is powered by Manage My Health.')]")
    protected WebElement verifyCheckBox2Content;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Information')]")
    protected WebElement verifyInformationPopup;

    @FindBy(how = How.XPATH, using = "//iframe[@title='reCAPTCHA']")
    protected WebElement elmntIframe;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'I understand the Beating the Blues is powered by Manage My Health.')]")
    protected WebElement elmntCreate;


//    @FindBy(xpath = "//h1[contains(text(),'Welcome,')]/following::h3[contains(text(),'Start managing your health, today')]")
//    protected WebElement txtWelcome;

//    @FindBy(xpath = "//h1[contains(text(),'Welcome,')]//span[text()=' Harry Harry!']")
//    protected WebElement txtWelcome;

    //h1[contains(text(),'Welcome,')]//span[text()=' Christopher Michael!']

    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[text()=' Harry Harry!']"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[text()=' Christopher Michael!']"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Peter')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[text()=' Auto Autochrisc1']"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'14')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[text()=' Chrisc4']")

    })
    protected WebElement txtWelcome;


    @FindBy(how = How.XPATH, using = "//button[contains(@class,'hamburger')]")
    protected WebElement btnMobileMenu;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntSideBar;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Sign out')])[1]")
    protected WebElement btnExitApp;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Sign out')]//following::span[@class='mat-mdc-button-touch-target'])[1]")
    protected WebElement btnExitAppMobile;

    //mat-icon[contains(text(),'exit_to_app')]

    @FindBy(how = How.XPATH, using = "//input[@id='UserName']")
    protected WebElement txtEmail;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Join meeting')])[1]")
    protected WebElement txtProviderPortal;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'sign up')])[1]")
    protected WebElement txtMobileSignUp;

    //p[text()='Login to Manage My Health Patient Portal']

    @FindBy(how = How.XPATH, using = "//input[@id='EncrySecuredPassword']")
    protected WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'header')]//span[text()='Appointments']")
    protected WebElement btnAppointmentExpand;

    @FindBy(how = How.XPATH, using = "//img[@src='/assets/themes/app/Book Appointment.svg']")
    protected WebElement VerifyBookAppointmentHeaderIcon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Book an Appointment')]")
    protected WebElement VerifyDashboardBookAppointmentIcon;

    @FindBy(how = How.XPATH, using = "//a[contains(@class,'header')]/span[text()='Messages']//following-sibling::mat-icon")
    protected WebElement btnMessagesExpand;

    @FindBy(how = How.XPATH, using = "(//h3[contains(text(),' Upcoming Appointments')])[1]")
    protected WebElement elmntFutureAppointment;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Upcoming Appointments')]")
    protected WebElement elmntMobileFutureAppointment;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'hamburger')]")
    protected WebElement btnHamburgerIcon;

    @FindBy(how = How.XPATH, using = "//span[text()='Appointments']")
    protected WebElement elmntAppointment;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'BOOK APPOINTMENT')]")
    protected WebElement elmntPatientBookAppointment;

    @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    protected WebElement elmntloginbtn;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='exit_to_app']")
    protected WebElement elmntMobileLogOut;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Home')and contains(text(),'My Home page') or contains(text(),'Start managing your health, today')]")
    protected WebElement verifyPatientHomePage;

    @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    protected WebElement elmntSignIn;

    @FindBy(how = How.XPATH, using = "//h3[text()=' Future Appointments']")
    protected WebElement elmntFutureAppointments;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'icon-list-view')]")
    protected WebElement btnCardView;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'icon-grid-view')]")
    protected WebElement btnGridView;

    @FindBy(how = How.XPATH, using = "//div[@aria-label='Data table']")
    protected WebElement elmntTableView;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'mobile-view')]/mat-accordion")
    protected WebElement elmntMobileView;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'block-view')][1]")
    protected WebElement elmntGridView;

    @FindBy(how = How.XPATH, using = "//kendo-grid-group-panel[contains(@class,'grouping-header')]")
    protected WebElement elmntGroupingHeader;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Email Address' or @placeholder='Email address']")
    protected WebElement txtBoxEmail;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Email Address' or @data-placeholder='Email address']"),
            @FindBy(how = How.XPATH, using = "//input[@Placeholder='Email Address']")
    })
    protected WebElement txtInboxPatient;

//    @FindAll({
//            @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Email Address' or @data-placeholder='Email address']"),
//            @FindBy(how = How.XPATH, using = "//input[@Placeholder='Email Address']")
//    })
//    protected WebElement txtBoxEmail;


//    @FindAll({
//            @FindBy(how = How.XPATH, using = "//input[@data-placeholder='Email Address' or @data-placeholder='Email address']"),
//            @FindBy(how = How.XPATH, using = "//input[@Placeholder='Password']")
//    })
//    protected WebElement txtBoxPassword;


    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    protected WebElement txtBoxPassword;


    @FindBy(how = How.XPATH, using = "//span[text()='Sign in']")
    protected WebElement SignInBtn;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    public void clickSignInButton() {
        waitForSeconds(3);
        if (verifyElement(SignInBtn)) {
            waitForElement(SignInBtn);
            jsClick(SignInBtn);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } else if (!verifyElement(SignInBtn)) {
            System.out.println("user already in the home page");
        }
    }


    public void BTBvisit() {
        int WindowsCount = driver.getWindowHandles().size();
        System.out.println("===============>WindowsCount::" + WindowsCount);
        if (WindowsCount == 1) {
            focusWindow(1);
            driver.manage().deleteAllCookies();
            visit(TestDataUtil.getValue("&BTB_SELF_REGISTER_URL&"));
            System.out.println("User here in Provider home page");

        }

    }

    public void SelfRegisteredPateintBTBWebsite() {
        int WindowsCount = driver.getWindowHandles().size();
        System.out.println("===============>WindowsCount::" + WindowsCount);
        if (WindowsCount == 1) {
            focusWindow(1);
            driver.manage().deleteAllCookies();
            visit(TestDataUtil.getValue("&BTB_SELF_REGISTER_URL&"));
            System.out.println("User here in Provider home page");

        }

    }

    public void ExistingBTBProvidervisit() {
        int WindowsCount = driver.getWindowHandles().size();
        System.out.println("===============>WindowsCount::" + WindowsCount);
        if (WindowsCount == 1) {
            focusWindow(1);
            driver.manage().deleteAllCookies();
            visit(TestDataUtil.getValue("&BTB_MMH_V2_PORTAL&"));
            System.out.println("User here in Provider home page");

        }

    }


    public void BTBSignButton() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntSignLogin);
        click(elmntSignLogin);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));

//        jsScrollIntoView(elmntCreate);
//        jsScrollUp();
//        waitForSeconds(3);
//     driver.switchTo().frame(elmntIframe);

//        focusWindow(2);
//
//        waitForSeconds(10);

//        ##NotWorking Click

//        driver.switchTo().frame("a-9wt0e8vkopnm");
//        System.out.println("Switch to Frame");
//        driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();


//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name,'a-')]")));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark")));
//        element.click();


//        WebDriverWait wait=new WebDriverWait(driver,25);
//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
//
//        waitForSeconds(5);
//
////        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();
//
//wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();
//
//System.out.println("Successfully Clicked");

//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name,'a-') and starts-with (@src, 'https://www.google.com/recaptcha')]")));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div [ @class =  'recaptcha-checkbox-border']"))).click( );
//        driver.switchTo().defaultContent();


//        WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@src, 'recaptcha')]"));
//        driver.switchTo().frame(iframe);
//
//
//        WebElement checkbox = driver.findElement(By.cssSelector("div[class='recaptcha-checkbox-border']"));
//        checkbox.click();
//
//        takeScreenshot(driver);
//        takeScreenshot(driver);
//
//        waitForSeconds(10);
//
//        driver.switchTo().defaultContent();


    }


    public boolean ClickcreateanIndividualAccount() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntCreateanIndividualAccount);
            click(elmntCreateanIndividualAccount);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(5);

            focusWindow(2);

            String GetUrl = driver.getCurrentUrl();
            System.out.println(">>>" + GetUrl);

            String FormURL = "https://v2webuat.mmh-demo.com/btb/self-registration";
            if (GetUrl.equalsIgnoreCase(FormURL)) {
                System.out.println("Check URL True");
                isverified = true;
            } else {
                System.out.println("Check URL False");
                isverified = false;
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean EnterFirstName(String Data) {
        boolean isverified = false;
        try {

            System.out.println(">>> ::" + TestDataUtil.getValue(Data));
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntEnterFirstName);
            enterValue(elmntEnterFirstName, Data);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifySelfRegistrationPage);
            isverified = verifyElement(elmntVerifySelfRegistrationPage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean EnterLastName(String Data) {
        boolean isverified = false;
        try {
            System.out.println(">>> ::" + TestDataUtil.getValue(Data));
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntEnterLastName);
            enterValue(elmntEnterLastName, Data);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifySelfRegistrationPage);
            isverified = verifyElement(elmntVerifySelfRegistrationPage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean EnterEmail(List<String> Data) {
        boolean isverified = false;
        try {

            String original = TestDataUtil.getValue(Data.get(2));
            String toInsert = strExecutionNumber;
            int position = 17;

            StringBuilder sb = new StringBuilder(original);
            sb.insert(position, Integer.valueOf(toInsert));

            String result = sb.toString();
            System.out.println(result);

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntEnterEmail);
            enterValue(elmntEnterEmail, result);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            NewEmailAttribute = elmntEnterEmail.getAttribute("ng-reflect-model");
            System.out.println("New Email Attribute :: " + NewEmailAttribute);
            if (!verifyElement(elmntError)) {
                upDateEmailToTestData(NewEmailAttribute);
            }

            waitForElement(elmntVerifySelfRegistrationPage);
            isverified = verifyElement(elmntVerifySelfRegistrationPage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public void upDateEmailToTestData(String strNewEmail) {
        TestDataUtil.updateData("config/testdata/testdata.xlsx", "General_Sanity_Provider_Web", "NEW_EMAIL", strNewEmail);
    }

    public boolean EnterPassword(String Data) {
        boolean isverified = false;
        try {
            System.out.println(">>> ::" + TestDataUtil.getValue(Data));
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntEnterPassword);
            enterValue(elmntEnterPassword, Data);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifySelfRegistrationPage);
            isverified = verifyElement(elmntVerifySelfRegistrationPage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean EnterConfirmPassword(String Data) {
        boolean isverified = false;
        try {
            System.out.println(">>> ::" + TestDataUtil.getValue(Data));
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntEnterConfirmPassword);
            enterValue(elmntEnterConfirmPassword, Data);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifySelfRegistrationPage);
            isverified = verifyElement(elmntVerifySelfRegistrationPage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean SelectDOB(String Data) {
        boolean isverified = false;
        try {
            waitForSeconds(3);
//            jsScrollIntoView(elmntSelectDOB);
//            waitForElement(elmntSelectDOB);
//            mouseClick(elmntSelectDOB);


//                    LocalDate currentDate = LocalDate.now();
//
//                    LocalDate oneYearAgo = currentDate.minusYears(20);
//
//
//                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//                    String formattedDate = oneYearAgo.format(formatter);
//
//                    System.out.println("One 20 year ago: " + formattedDate);


//
//            waitForElement(elmntSelectDOB);
//            mouseClick(elmntSelectDOB);
//            waitForSeconds(3);
//            driver.switchTo().activeElement().sendKeys(formattedDate);

//            WebElement datePicker = driver.findElement(By.xpath("//input[@name='dob']")); // Replace with your actual locator strategy
//            System.out.println("datePicker  :: "+datePicker);
//            datePicker.sendKeys(formattedDate);

//                        WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", formattedDate)));
//            click(elmntDayAfterDate);


//            waitForSeconds(3);
//            String strDateFormat = "yyyy";
//            String strDay = "2001";
//            String strDate = DateUtil.getDate(strDay, strDateFormat);
//            System.out.println("Current Day ::>>" + strDate);
//            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
//            click(elmntDayAfterDate);
//            System.out.println(">>> ::"+TestDataUtil.getValue(Data));
//            waitForSeconds(3);
//            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//

//            waitForSeconds(3);
//            waitForElement(elmntMonthAndYear);
//            waitForElementClickable(elmntMonthAndYear);
//            jsClick(elmntMonthAndYear);
//
//            waitForSeconds(3);
//            waitForElement(elmntYear);
//            jsClick(elmntYear);
//
//
//            String date = getDayAfterTommorrowDate("d");
//            String month = getMonth("MMM").toUpperCase();
////            String year = g("YYYY");
//
//            System.out.println("getDayAfterTomorrowDate >>> :: " + date);
//            System.out.println("getDayAfterTomorrowDate >>> :: " + month);
//            System.out.println("getDayAfterTomorrowDate >>> :: " + year);
//
//
//            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", Data));
//            WebElement selectYear = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", Data)));
//
//            waitForSeconds(3);
//            waitForElement(selectYear);
//            waitForElementClickable(selectYear);
//            jsClick(selectYear);
//
//            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", month));
//            WebElement selectMonth = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", month)));
//
//            waitForSeconds(3);
//            waitForElement(selectMonth);
//            waitForElementClickable(selectMonth);
//            jsClick(selectMonth);
//
//            System.out.println("X-Path for Year >>> :: " + futureDate.replace("<<REPLACEMENT>>", date));
//            WebElement selectDate = waitForElement(By.xpath(futureDate.replace("<<REPLACEMENT>>", date)));
//
//            waitForSeconds(3);
//            waitForElement(selectDate);
//            waitForElementClickable(selectDate);
//            jsClick(selectDate);

//            System.out.println("Value >>> :: " + elmntCalendar.getAttribute("value"));
////            waitForElement(elmntCalendar);
////            String strEnteredDate = elmntCalendar.getAttribute("value");
////            System.out.println("strEnteredDate >>>> :: "+strEnteredDate);
//            waitForSeconds(2);
//            takeScreenshot(driver);


            isverified = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }


    public boolean SelectGenderDropDown(String strPraticeName) {
        boolean isverified = false;
        try {
            waitForElement(elmntSelectGender);
            click(elmntSelectGender);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntSelectHealthCenter = waitForElement(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", strPraticeName)));
            System.out.println(">>>>>>>>" + elmntSelectHealthCenter);
            mouseClick(elmntSelectHealthCenter);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isverified = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean SelectEthnicityDropDown(String strPraticeName) {
        boolean isverified = false;
        try {
            waitForElement(elmntSelectEthnicity);
            click(elmntSelectEthnicity);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntSelectHealthCenter = waitForElement(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", strPraticeName)));
            System.out.println(">>>>>>>>" + elmntSelectHealthCenter);
            mouseClick(elmntSelectHealthCenter);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isverified = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean SelectCheckBox1() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntSelectCheckBox1);
            jsClick(elmntSelectCheckBox1);
            waitForElement(verifyCheckBoxContent);
            isverified = verifyElement(verifyCheckBoxContent);
            waitForElement(elmntVerifySelfRegistrationPage);
            isverified = verifyElement(elmntVerifySelfRegistrationPage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean SelectCheckBox2() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntSelectCheckBox2);
            jsClick(elmntSelectCheckBox2);
            waitForElement(verifyCheckBox1Content);
            isverified = verifyElement(verifyCheckBox1Content);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifySelfRegistrationPage);
            isverified = verifyElement(elmntVerifySelfRegistrationPage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean SelectCheckBox3() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntSelectCheckBox3);
            jsClick(elmntSelectCheckBox3);
            waitForElement(verifyCheckBox2Content);
            isverified = verifyElement(verifyCheckBox2Content);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifySelfRegistrationPage);
            isverified = verifyElement(elmntVerifySelfRegistrationPage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }


    public void SelectReCaptcha() {
//        waitForElementDisappear(driver, By.xpath(elmntSpinner));
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name,'a-')]")));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark")));
//        waitForSeconds(2);
//        jsClick(element);
//        waitForSeconds(2);
//        driver.switchTo().defaultContent();
//        waitForSeconds(5);
        waitForSeconds(50);
        waitForElementToAppear(driver, By.xpath(elmntSubmitButtonEnablePage));

    }

    public boolean SelectSubmit() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntSubmitButton);
            jsClick(elmntSubmitButton);
            waitForElement(verifyInformationPopup);
            isverified = verifyElement(verifyInformationPopup);
//            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForElement(elmntInformationPopup);
//            isverified=verifyElement(elmntInformationPopup);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean SelectOkButton() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntokButton);
            jsClick(elmntokButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyBTBLoginPage);
            isverified = verifyElement(verifyBTBLoginPage);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean VisitGmail(String data) {
        boolean isverified = false;
        try {
//            ((JavascriptExecutor) driver).executeScript("window.open()");
//            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//            driver.switchTo().window(tabs.get(1));
            focusWindow(3);
            visit(TestDataUtil.getValue(data));
            isverified = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean EnterGmailEmail(String data) {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElement(elmntGmailEmail);
            enterValue(elmntGmailEmail, data);
            waitForSeconds(3);
            waitForElement(elmntNextButton);
            click(elmntNextButton);
            isverified = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean EnterGmailPassword(String data) {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElement(elmntGmailPassword);
            enterValue(elmntGmailPassword, data);
            waitForSeconds(3);
            waitForElement(elmntNextButton);
            click(elmntNextButton);
            isverified = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean ClickSearchBox() {
        boolean isverified = false;
        try {
            System.out.println(">>> New Email Id :: " + NewEmailAttribute);
            BTBNewEmail = NewEmailAttribute + "om";
            System.out.println(">>>BTBNewEmail :: " + BTBNewEmail);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElement(elmntGmailLogo);
            isverified = verifyElement(elmntGmailLogo);
            waitForSeconds(3);
            waitForElement(elmntGmailSearchBox);
            enterValue(elmntGmailSearchBox, BTBNewEmail);
            waitForSeconds(3);
            elmntGmailSearchBox.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean SelectBTBConfirmMail() {
        boolean isverified = false;
        try {

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
//            waitForElement(elmntWelcomeMessage);
//            isverified=verifyElement(elmntWelcomeMessage);
            waitForElement(elmntBtbConfirmYourMail);
            isverified = verifyElement(elmntBtbConfirmYourMail);
            click(elmntBtbConfirmYourMail);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifybtbmailcontent);
            isverified = verifyElement(verifybtbmailcontent);
            waitForElement(verifybtbmailcontent1);
            isverified = verifyElement(verifybtbmailcontent1);
            waitForElement(verifybtbmailcontent2);
            isverified = verifyElement(verifybtbmailcontent2);
            waitForElement(verifybtbmailcontent3);
            isverified = verifyElement(verifybtbmailcontent3);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean SelectConfirmyourregistration() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
//            waitForElement(elmntSuccessMessage);
//            isverified=verifyElement(elmntSuccessMessage);
//            waitForElement(elmntSuccessMessageText);
//            isverified=verifyElement(elmntSuccessMessageText);
//            waitForElement(verifybtbmailcontent);
//            isverified=verifyElement(verifybtbmailcontent);
            waitForElement(verifyconfirmyourRegistration);
            click(verifyconfirmyourRegistration);
            waitForElement(selectOkButton);
            isverified = verifyElement(selectOkButton);
            click(selectOkButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean NavigatetoManageMyHealth() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            String WebprdURL = "https://v2webprdfeature.mmh-demo.com/authentication/confirm-account?Validate";
            String GetWebPrdUrl = driver.getCurrentUrl();
            if (WebprdURL.equalsIgnoreCase(GetWebPrdUrl)) {
                isverified = true;
            } else {
                isverified = false;
            }
            waitForElement(txtBoxEmail);
            verifyElement(txtBoxEmail);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }


    public void visit() {
        int WindowsCount = driver.getWindowHandles().size();
        System.out.println("===============>WindowsCount::" + WindowsCount);
//        if (WindowsCount == 2) {
//            focusWindow(1);
//            if (verifyElement(txtPatientWelcomePage)) {
//                driver.manage().deleteAllCookies();
//                System.out.println("User here in Provider home page");
//            } else {
////                System.out.println("Else Part ::::::Window Count 2");
//                driver.manage().deleteAllCookies();
//                visit(TestDataUtil.getValue("&URL&"));
//
//            }
//        }
        if (WindowsCount == 1) {
            waitForSeconds(5);
            focusWindow(1);
            System.out.println("Enter Windows 1 ");
            visit(TestDataUtil.getValue("&URL&"));
            System.out.println("Enter Windows 1 ");
            waitForSeconds(3);
            if (isElementDisplayed(txtPatientWelcomePage)) {
                driver.manage().deleteAllCookies();
                System.out.println("User here in Provider home page");
                takeScreenshot(driver);
            } else {
                waitForSeconds(3);
                visit(TestDataUtil.getValue("&URL&"));
                driver.manage().deleteAllCookies();
            }

        }
    }

    public void enterPasswordForBeta(String strPassword) {
        if (verifyElement(txtBoxPassword)) {
            waitForElementClickable(txtBoxPassword);
            enterValue(txtBoxPassword, strPassword);
        }
        if (!verifyElement(txtBoxPassword)) {
            System.out.println("User here in home page");
        }

    }

    public void enterEmail(String strEmail) {
        if (verifyElement(txtBoxEmail)) {
            waitForSeconds(3);
            waitForElementClickable(txtBoxEmail);
            enterValue(txtBoxEmail, strEmail);

        } else {
            System.out.println("User Already in Home Page");
        }


    }


    public boolean waitForMMHLoginPage() {
        System.out.println("\n >>> Get First Line :: ");
        waitForElement(elmntLogo);
        takeScreenshot(driver);
        waitForElement(btnLogin);
        System.out.println("----> BLN elmntMainHeader : " + verifyElement(btnLogin));
        return verifyElement(btnLogin);
    }


    public void enterEmailForBeta(String strEmail) {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        System.out.println(">>>  Email :: " + TestDataUtil.getValue(strEmail));
        if (verifyElement(txtBoxEmail)) {
            waitForSeconds(3);
            waitForElementClickable(txtBoxEmail);
            enterValue(txtBoxEmail, strEmail);
        }
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        if (!verifyElement(txtBoxEmail)) {
            System.out.println("User here in home page");
        }

    }

    public void BTBNewenterEmail() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        System.out.println(">>>  Email :: " + TestDataUtil.getValue(BTBNewEmail));
        if (verifyElement(txtBoxEmail)) {
            waitForSeconds(3);
            waitForElementClickable(txtBoxEmail);
            enterValue(txtBoxEmail, BTBNewEmail);
        }
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        if (!verifyElement(txtBoxEmail)) {
            System.out.println("User here in home page");
        }

    }

    public void enterpassword(String strPassword) {
        if (verifyElement(txtBoxPassword)) {
            waitForElementClickable(txtBoxPassword);
            enterValue(txtBoxPassword, strPassword);
        } else {
            System.out.println("User here in home page");
        }

    }

    public boolean clickLoginButton() {
        waitForElement(btnLogin);
        waitForElementClickable(btnLogin);
        return click(btnLogin);
    }

    public boolean verifyBTBLoginPage() {
        boolean blResult = false;


        try {
            int WindowsCount = driver.getWindowHandles().size();
            System.out.println("===============>WindowsCount::" + WindowsCount);
            if (WindowsCount == 1) {
                driver.manage().deleteAllCookies();
                waitForElement(elmntBtbLoginPage);
                verifyElement(elmntBtbLoginPage);
                driver.manage().deleteAllCookies();
                waitForElement(elmntClickBTBLoginButton);
                click(elmntClickBTBLoginButton);
                waitForSeconds(5);
                focusWindow(2);
                waitForSeconds(5);
                String BTBPageGetURL = driver.getCurrentUrl();
                System.out.println(">>> :: " + BTBPageGetURL);
                String BTBPageURL = "https://v2webuat.mmh-demo.com/authentication/login?rf=btb";
                System.out.println(">>> :: " + BTBPageURL);
                Assert.assertEquals(BTBPageGetURL, BTBPageURL);
                waitForElement(txtBoxEmail);
                blResult = verifyElement(txtBoxEmail);
            }
            if (WindowsCount == 2) {
                focusWindow(2);
                System.out.println("user in Provider Home Page");
            }
            System.out.println("Try Block 1 executed");
        } catch (Exception e) {
            try {
                waitForElementClickable(elmntProfile);
                jsClick(elmntProfile);
                waitForSeconds(2);
                waitForElementClickable(elmntSignout);
                jsClick(elmntSignout);
                visit();
                waitForElement(elmntLoginBtn);
                click(elmntLoginBtn);
                blResult = true;
                System.out.println("Catch Block 1 executed");
            } catch (Exception d) {
                d.printStackTrace();
            }

        }
        return blResult;

    }

    public boolean verifyBTBWebsiteLoginPage() {
        boolean blResult = false;


        try {
            int WindowsCount = driver.getWindowHandles().size();
            System.out.println("===============>WindowsCount::" + WindowsCount);
            if (WindowsCount == 1) {
                driver.manage().deleteAllCookies();
                waitForElement(elmntBtbLoginPage);
                verifyElement(elmntBtbLoginPage);
                driver.manage().deleteAllCookies();
                waitForElement(elmntClickBTBLoginButton);
                click(elmntClickBTBLoginButton);
                waitForSeconds(5);
                focusWindow(2);
                waitForSeconds(5);
                String BTBPageGetURL = driver.getCurrentUrl();
                System.out.println(">>> :: " + BTBPageGetURL);
                String BTBPageURL = "https://v2webuat.mmh-demo.com/authentication/login?rf=btb";
                System.out.println(">>> :: " + BTBPageURL);
                Assert.assertEquals(BTBPageGetURL, BTBPageURL);
                waitForElement(txtBoxEmail);
                blResult = verifyElement(txtBoxEmail);
            }
            if (WindowsCount == 2) {
                focusWindow(2);
                System.out.println("user in Provider Home Page");
            }
            System.out.println("Try Block 1 executed");
        } catch (Exception e) {
            try {
                waitForElementClickable(elmntProfile);
                jsClick(elmntProfile);
                waitForSeconds(2);
                waitForElementClickable(elmntSignout);
                jsClick(elmntSignout);
                visit();
                waitForElement(elmntLoginBtn);
                click(elmntLoginBtn);
                blResult = true;
                System.out.println("Catch Block 1 executed");
            } catch (Exception d) {
                d.printStackTrace();
            }

        }
        return blResult;

    }

    public boolean verifyMobileBTBLoginPage() {
        boolean blResult = false;

        try {
            int WindowsCount = driver.getWindowHandles().size();
            System.out.println("===============>WindowsCount::" + WindowsCount);
            if (WindowsCount == 1) {
                driver.manage().deleteAllCookies();
                waitForElement(elmntBtbLoginPage);
                verifyElement(elmntBtbLoginPage);
                driver.manage().deleteAllCookies();
                waitForElement(elmntMobileClickBTBLoginButton);
                click(elmntMobileClickBTBLoginButton);
                waitForSeconds(5);
                focusWindow(2);
                waitForSeconds(5);
                waitForElement(txtBoxEmail);
                blResult = verifyElement(txtBoxEmail);

            }
            if (WindowsCount == 2) {
                focusWindow(2);
                System.out.println("user in Provider Home Page");
            }
            System.out.println("Try Block 1 executed");
        } catch (Exception e) {
            try {
                waitForElementClickable(elmntProfile);
                jsClick(elmntProfile);
                waitForSeconds(2);
                waitForElementClickable(elmntSignout);
                jsClick(elmntSignout);
                visit();
                waitForElement(elmntLoginBtn);
                click(elmntLoginBtn);
                blResult = true;
                System.out.println("Catch Block 1 executed");
            } catch (Exception d) {
                d.printStackTrace();
            }

        }
        return blResult;

    }

    public boolean clickBetaLoginButton() {
        boolean blResult = false;

        try {
            int WindowsCount = driver.getWindowHandles().size();
            System.out.println("===============>WindowsCount::" + WindowsCount);

            String Date = getDate("TODAY", "dd MMM yyyy");
            System.out.println(Date);


            String strTime = getCurrentDate("h:mm aaa");
            System.out.println(strTime);


//                if (verifyElement(elmntLoginUIUX)) {
//                    List<String> data = TestDataUtil.getListOfValue("&LOGINBUTTON_DATA&");
//                    System.out.println("TestData :: " + data);
//                    boolean Login = elmntLoginUIUX.isDisplayed();
//                    System.out.println("LoginButton : " + Login);
//                    if (data.get(0).equals(Login)) {
//                        blResult = true;
//                    }
//                    String color = driver.findElement(By.xpath("//a[contains(@class,'btn-primary-rect')]")).getCssValue("color");
//                    String LoginButtonColor = Color.fromString(color).asHex();
//                    System.out.println("LoginButtonColor :" + LoginButtonColor);
//                    if (data.get(1).equals(LoginButtonColor)) {
//                        blResult = true;
//                    }
//                    String backgroundcolor = driver.findElement(By.xpath("//a[contains(@class,'btn-primary-rect')]")).getCssValue("background-color");
//                    String LoginButtonbackgroundcolor = Color.fromString(backgroundcolor).asHex();
//                    System.out.println("LoginButtonbackgroundcolor :" + LoginButtonbackgroundcolor);
//                    if (data.get(2).equals(LoginButtonbackgroundcolor)) {
//                        blResult = true;
//                    }
//                    String LoginHeight = driver.findElement(By.xpath("//a[contains(@class,'btn-primary-rect')]")).getCssValue("height");
//                    System.out.println("LoginHeight :" + LoginHeight);
//                    if (data.get(3).equals(LoginHeight)) {
//                        blResult = true;
//                    }
//                    String LoginWidth = driver.findElement(By.xpath("//a[contains(@class,'btn-primary-rect')]")).getCssValue("width");
//                    System.out.println("LoginWidth :" + LoginWidth);
//                    if (data.get(4).equals(LoginWidth)) {
//                        blResult = true;
//                    }
//                    String LoginText = elmntLoginUIUX.getText();
//                    if (data.get(6).equals(LoginText)) {
//                        System.out.println("Enter");
//                        isverfied = true;
//                    }else {
//                        System.out.println("false");
//                        isverfied = false;
//                    }
//                    String LoginAlign = driver.findElement(By.xpath("//div[contains(@class,'btn-align text-right')]")).getCssValue("text-align");
//                    System.out.println("LoginAlign :" + LoginAlign);
//                    if (data.get(5).equals(LoginAlign)) {
//                        isverfied = true;
//                    }

//                }
            if (WindowsCount == 1) {
                driver.manage().deleteAllCookies();
                waitForSeconds(8);
                waitForElement(elmntLoginBtn);
                jsClick(elmntLoginBtn);
                driver.manage().deleteAllCookies();
                blResult = true;
            }
            if (WindowsCount == 2) {
                focusWindow(1);
                System.out.println("user in Provider Home Page");
            }
            System.out.println("Try Block 1 executed");
        } catch (Exception e) {
            try {
                waitForElementClickable(elmntProfile);
                jsClick(elmntProfile);
                waitForSeconds(2);
                waitForElementClickable(elmntSignout);
                jsClick(elmntSignout);
                visit();
                waitForElement(elmntLoginBtn);
                click(elmntLoginBtn);
                blResult = true;
                System.out.println("Catch Block 1 executed");
            } catch (Exception d) {
                d.printStackTrace();
            }

        }
        return blResult;

    }

    public boolean clickPatientandProviderLoginButton() {
        boolean blResult = false;

        try {
            int WindowsCount = driver.getWindowHandles().size();
//            System.out.println("===============>WindowsCount::" + WindowsCount);
            if (WindowsCount == 1) {
                waitForElement(elmntMobileLoginBtn);
                click(elmntMobileLoginBtn);
                waitForElement(txtBoxEmail);
                blResult = verifyElement(txtBoxEmail);
            }
            if (WindowsCount == 2) {
                focusWindow(1);
                System.out.println("user in Provider Home Page");
            }
//            System.out.println("Try Block 1 executed");
        } catch (Exception e) {
            try {
                waitForElementClickable(elmntProfile);
                jsClick(elmntProfile);
                waitForSeconds(2);
                waitForElementClickable(elmntSignout);
                jsClick(elmntSignout);
                visit();
                waitForElement(elmntLoginBtn);
                blResult = click(elmntLoginBtn);
                System.out.println("Catch Block 1 executed");
            } catch (Exception d) {
                d.printStackTrace();
            }

        }
        return blResult;

    }

    public boolean veriflyTeamscondition() {
        boolean blResult = false;
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(4);
        if (verifyElement(elmntTeamsConditionsHeader)) {
            click(elmntTeamsConditions);
            blResult = true;
        } else {
            System.out.println("Teams & Conditions Is Not Displayed");
            blResult = true;
        }
        return blResult;
    }

    public boolean clickPatientDashBoardForMobile() {
        boolean isVerified = true;

        if (isElementDisplayed(txtPatientWelcomePage)) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(5);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//        waitForElementClickable(btnMobileMenu);
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            jsClick(elmntDashboard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            driver.navigate().refresh();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isVerified = verifyElement(elmntVerifyHomePage);

        }
        if (!isElementDisplayed(txtPatientWelcomePage)) {
            focusWindow(1);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(5);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//        waitForElementClickable(btnMobileMenu);
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            jsClick(elmntDashboard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            driver.navigate().refresh();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isVerified = verifyElement(elmntVerifyHomePage);

        }
        return isVerified;
    }

    public boolean verifyHomePageOfMMHPortal() {
        waitForSeconds(5);
//        waitForElement(elmntVerifyHomePage);
        if (verifyElement(txtAppVersion)) {
            strAppVersion = txtAppVersion.getText();
            System.out.printf("TxtAPPVersion" + strAppVersion);
        }
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        strBrowserName = cap.getBrowserName();
        strBrowserVersion = cap.getVersion();
        try {
            strSystemName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        waitForElement(elmntVerifyHomePage);
        return verifyElement(elmntVerifyHomePage);
    }

    public boolean clickPatientDashBoard() {
        boolean isVerified = false;
        jsScrollIntoView(elmntDashboard);
        waitForElement(elmntDashboard);
        jsClick(elmntDashboard);
        if (isElementDisplayed(txtPatientWelcomePage)) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            jsClick(elmntDashboard);
            takeScreenshot(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            driver.navigate().refresh();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifyHomePage);
            isVerified = verifyElement(elmntVerifyHomePage);
        }
        if (!isElementDisplayed(txtPatientWelcomePage)) {
            focusWindow(1);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            jsClick(elmntDashboard);
            takeScreenshot(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            driver.navigate().refresh();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifyHomePage);
            isVerified = verifyElement(elmntVerifyHomePage);

        }


        return isVerified;
    }

    public boolean verifyHomePageOfBTB() {
        waitForSeconds(5);
        waitForElement(elmntVerifyBTBHomePage);
        if (verifyElement(txtAppVersion)) {
            strAppVersion = txtAppVersion.getText();
            System.out.printf("TxtAPPVersion" + strAppVersion);
        }
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        strBrowserName = cap.getBrowserName();
        strBrowserVersion = cap.getVersion();
        try {
            strSystemName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return verifyElement(elmntVerifyBTBHomePage);
    }

    public boolean verifyHomePageOfProviderBTB() {
        waitForSeconds(5);
        waitForElement(elmntVerifyProviderBTBHomePage);
        if (verifyElement(txtAppVersion)) {
            strAppVersion = txtAppVersion.getText();
            System.out.printf("TxtAPPVersion" + strAppVersion);
        }
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        strBrowserName = cap.getBrowserName();
        strBrowserVersion = cap.getVersion();
        try {
            strSystemName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return verifyElement(elmntVerifyProviderBTBHomePage);
    }

    public boolean verifyHomePageOfProviderPortal() {
        waitForSeconds(5);
        waitForElement(txtProviderPortalWelcomePage);
        if (verifyElement(txtAppVersion)) {
            strAppVersion = txtAppVersion.getText();
            System.out.printf("TxtAPPVersion" + strAppVersion);
        }
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        strBrowserName = cap.getBrowserName();
        strBrowserVersion = cap.getVersion();
        try {
            strSystemName = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return verifyElement(txtProviderPortalWelcomePage);
    }

    public boolean navigateToHomePage() {
        boolean blResult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForSeconds(3);
                jsScrollIntoView(elmntDashboard);
                waitForElement(elmntDashboard);
                verifyElement(elmntDashboard);
                waitForSeconds(3);
                waitForElement(elmntDashboard);
                jsClick(elmntDashboard);
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                if (verifyElement(txtWelcome)) {
                    verifyElement(elmntDashboard);
                    waitForElementClickable(elmntDashboard);
                    jsClick(elmntDashboard);
                    waitForElementDisappear(driver, By.xpath(elmntSpinner));
                    refreshPage();
                    waitForElement(txtWelcome);
                    blResult = verifyElement(txtWelcome);
                } else {
                    focusWindow(2);
                    jsScrollIntoView(elmntDashboard);
                    waitForElementClickable(elmntDashboard);
                    jsClick(elmntDashboard);
                    waitForElementDisappear(driver, By.xpath(elmntSpinner));
//               refreshPage();
                    blResult = verifyElement(txtWelcome);
                }
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                if (verifyElement(txtWelcome)) {
                    waitForElementClickable(btnMobileMenu);
                    jsClick(btnMobileMenu);
                    verifyElement(elmntDashboard);
                    waitForElementClickable(elmntDashboard);
                    jsClick(elmntDashboard);
                    waitForElementDisappear(driver, By.xpath(elmntSpinner));
                    refreshPage();
                    waitForElement(txtWelcome);
                    blResult = verifyElement(txtWelcome);
                } else {
                    focusWindow(2);
                    waitForElementClickable(btnMobileMenu);
                    jsClick(btnMobileMenu);
                    jsScrollIntoView(elmntDashboard);
                    waitForElementClickable(elmntDashboard);
                    jsClick(elmntDashboard);
                    waitForElementDisappear(driver, By.xpath(elmntSpinner));
//               refreshPage();
                    blResult = verifyElement(txtWelcome);
                }

            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
                if (verifyElement(txtWelcome)) {
                    waitForElementClickable(btnMobileMenu);
                    jsClick(btnMobileMenu);
                    verifyElement(elmntDashboard);
                    waitForElementClickable(elmntDashboard);
                    jsClick(elmntDashboard);
                    waitForElementDisappear(driver, By.xpath(elmntSpinner));
                    refreshPage();
                    waitForElement(txtWelcome);
                    blResult = verifyElement(txtWelcome);
                } else {
                    focusWindow(2);
                    waitForElementClickable(btnMobileMenu);
                    jsClick(btnMobileMenu);
                    jsScrollIntoView(elmntDashboard);
                    waitForElementClickable(elmntDashboard);
                    jsClick(elmntDashboard);
                    waitForElementDisappear(driver, By.xpath(elmntSpinner));
//               refreshPage();
                    blResult = verifyElement(txtWelcome);
                }


            }

            return blResult;

        } catch (Exception e) {
            System.out.println("User not Navigated to Patient Portal");

            e.printStackTrace();
        }
        return blResult;
    }

    public boolean navigateToDashboard() {
        boolean blResult = false;
        try {
            jsScrollIntoView(elmntDashboard);
            verifyElement(elmntDashboard);
            waitForElementClickable(elmntDashboard);
            jsClick(elmntDashboard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtWelcome);
            blResult = verifyElement(txtWelcome);

            return blResult;

        } catch (Exception e) {
            System.out.println("User not Navigated to Patient Portal");

            e.printStackTrace();
        }
        return blResult;
    }


    public void clickAppointmentOptionFromMenu() {
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(btnAppointmentExpand);
            click(btnAppointmentExpand);
            click(elmntFutureAppointment);
        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForElement(btnHamburgerIcon);
            click(btnHamburgerIcon);
            waitForElement(btnAppointmentExpand);
            click(btnAppointmentExpand);
            waitForElement(btnAppointmentExpand);
            click(elmntFutureAppointment);
        }
    }

    public boolean verifyFutureAppoinmentsPage() {
        waitForElement(elmntFutureAppointments);
        takeScreenshot(driver);
        return verifyElement(elmntFutureAppointments);
    }

    public void clickCardView() {
        waitForElement(btnCardView);
        click(btnCardView);
    }

    public boolean verifyAppointmentsInCardView() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            waitForElement(elmntGroupingHeader);
            takeScreenshot(driver);
            isVerified = verifyElement(elmntTableView);

        }
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            System.out.println("INTO MOBILE VIEW");
            waitForElement(elmntMobileView);
            takeScreenshot(driver);
            isVerified = verifyElement(elmntMobileView);
        }
        return isVerified;
    }

    public void clickGridView() {
        waitForElement(btnGridView);
        click(btnGridView);
    }

    public boolean verifyAppointmentsInGridView() {
        waitForElement(elmntGridView);
        takeScreenshot(driver);
        return verifyElement(elmntGridView);
    }

    public boolean clickAppointmentsExpandIcon() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntDashboard);
        waitForElement(btnAppointmentExpand);
        jsClick(btnAppointmentExpand);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntFutureAppointment);
        return verifyElement(elmntFutureAppointment);
    }

    public boolean DashboardIconsVerification() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(elmntDashboard);
        click(elmntDashboard);
        waitForElement(VerifyBookAppointmentHeaderIcon);
        verifyElement(VerifyBookAppointmentHeaderIcon);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(VerifyDashboardBookAppointmentIcon);
        return verifyElement(VerifyDashboardBookAppointmentIcon);
    }

    public boolean MobileDashboardIconsVerification() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(VerifyBookAppointmentHeaderIcon);
        verifyElement(VerifyBookAppointmentHeaderIcon);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElement(VerifyDashboardBookAppointmentIcon);
        return verifyElement(VerifyDashboardBookAppointmentIcon);
    }


    public boolean clickMobileAppointmentsExpandIcon() {
        waitForSeconds(3);
        waitForElement(elmntDashboard);
        waitForElement(btnAppointmentExpand);
        jsClick(btnAppointmentExpand);
        return verifyElement(elmntMobileFutureAppointment);
    }

    public boolean clickDashBoardForMobile() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(5);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
//        waitForElementClickable(btnMobileMenu);
        waitForElement(btnMobileMenu);
        jsClick(btnMobileMenu);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        jsScrollIntoView(elmntDashboard);
        waitForElement(elmntDashboard);
        jsClick(elmntDashboard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        driver.navigate().refresh();
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        return verifyElement(elmntVerifyHomePage);
    }

    public boolean clickDashBoard() {
        boolean isVerified = false;
        waitForSeconds(3);
        jsScrollIntoView(elmntDashboard);
        waitForElement(elmntDashboard);
        jsClick(elmntDashboard);
        if (isElementDisplayed(txtPatientWelcomePage)) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            jsClick(elmntDashboard);
            takeScreenshot(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            driver.navigate().refresh();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifyHomePage);
            isVerified = verifyElement(elmntVerifyHomePage);
        }
        if (!isElementDisplayed(txtPatientWelcomePage)) {
            focusWindow(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            jsClick(elmntDashboard);
            takeScreenshot(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            driver.navigate().refresh();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifyHomePage);
            isVerified = verifyElement(elmntVerifyHomePage);

        }


        return isVerified;
    }

    public boolean verifyPatientDashBoard() {
        boolean isVerified = false;
        jsScrollIntoView(elmntDashboard);
        waitForElement(elmntDashboard);
        jsClick(elmntDashboard);
        if (isElementDisplayed(txtPatientWelcomePage)) {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            jsClick(elmntDashboard);
            takeScreenshot(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            driver.navigate().refresh();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifyHomePage);
            isVerified = verifyElement(elmntVerifyHomePage);
        }
        if (!isElementDisplayed(txtPatientWelcomePage)) {
            focusWindow(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            jsClick(elmntDashboard);
            takeScreenshot(driver);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            driver.navigate().refresh();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntVerifyHomePage);
            isVerified = verifyElement(elmntVerifyHomePage);

        }


        return isVerified;
    }

    public boolean clickLogoutButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            takeScreenshot(driver);
            waitForElement(elmntDashboard);
            click(elmntDashboard);
            waitForSeconds(3);
            jsClick(btnExitApp);
            waitForSeconds(180);
            waitForElement(txtProviderPortal);
            isVerified = verifyElement(txtProviderPortal);
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILEVIEW")) {
            waitForElement(btnExitAppMobile);
            jsClick(btnExitAppMobile);
            waitForSeconds(180);
            waitForElement(txtMobileSignUp);
            isVerified = verifyElement(txtMobileSignUp);
        }

        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
            waitForElement(btnExitAppMobile);
            click(btnExitAppMobile);
            waitForSeconds(180);
            waitForElement(txtMobileSignUp);
            isVerified = verifyElement(txtMobileSignUp);
        }
        return isVerified;
    }

    public boolean clickProviderLogoutButton() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            takeScreenshot(driver);
            waitForElement(elmntDashboard);
            click(elmntDashboard);
            waitForSeconds(3);
            jsClick(btnExitApp);
            waitForElement(txtProviderPortal);
            isVerified = verifyElement(txtProviderPortal);
        }

        return isVerified;
    }


    public boolean clickMesagesExpandIcon() {
        waitForSeconds(3);
        waitForElement(elmntDashboard);
        waitForElement(btnMessagesExpand);
        jsClick(btnMessagesExpand);
        return verifyElement(elmntFutureAppointment);
    }

    public boolean clickHamburgerIcon() {
//        waitForSeconds(3);
//        refreshPage();
        waitForElement(btnHamburgerIcon);
        waitForElementClickable(btnHamburgerIcon);
//        waitForSeconds(2);
        jsClick(btnHamburgerIcon);
//        waitForSeconds(1);
        waitForElement(elmntSideBar);
        return verifyElement(elmntSideBar);
    }

    public boolean changeTimeZone(String strTimeZone) {
        boolean blResult = false;
        try {
            pb = WindowsProcessUtil.startTimeZoneProcess(strTimeZone);
            waitForSeconds(5);
            WindowsProcessUtil.stopProcess(pb);
            blResult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;

    }

    public boolean clickPatientBookAppointment() {
        boolean blresult = false;
        try {
            waitForElementToAppear(driver, By.xpath(elmntSpinner));
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElementClickable(elmntAppointment);
            jsClick(elmntAppointment);
            waitForElementToAppear(driver, By.xpath(elmntSpinner));
            waitForElementDisappear(driver, By.xpath("//mat-progress-spinner[@role='progressbar']"));
            waitForElement(elmntPatientBookAppointment);
            click(elmntPatientBookAppointment);
            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean launchPatientUrl() {
        boolean blresult = false;
        try {
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
                int WindowsCount = driver.getWindowHandles().size();
                System.out.println(">>>>>>>>>>>>>>>>>>>>" + WindowsCount);
                if (WindowsCount == 2) {
                    focusWindow(2);
                    if (verifyElement(verifyPatientHomePage)) {
                        System.out.println("user here in patient portal homepage");
                    } else {
                        visit(TestDataUtil.getValue("&URL&"));
                    }
                }
                if (WindowsCount == 1) {
//                    ((JavascriptExecutor) driver).executeScript("window.open()");
//                    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//                    driver.switchTo().window(tabs.get(1));
                    visit(TestDataUtil.getValue("&URL&"));
                    waitForSeconds(4);
                    waitForElementClickable(elmntSignIn);
                    jsClick(elmntSignIn);
                    waitForSeconds(2);
                    visit(TestDataUtil.getValue("&URL&"));
                }
            }
            if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("MOBILE")) {
                int WindowsCount = driver.getWindowHandles().size();
                System.out.println(">>>>>>>>>>>>>>>>>>>>" + WindowsCount);
                if (WindowsCount == 2) {
                    focusWindow(2);
                    verifyElement(verifyPatientHomePage);
                    System.out.println("user here in patient portal homepage");
                } else {
                    visit(TestDataUtil.getValue("&URL&"));
                }
                if (WindowsCount == 1) {
//                    ((JavascriptExecutor) driver).executeScript("window.open()");
//                    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//                    driver.switchTo().window(tabs.get(1));
                    visit(TestDataUtil.getValue("&URL&"));
                    waitForSeconds(4);
                    waitForElementClickable(elmntMobileLogOut);
                    jsClick(elmntMobileLogOut);
                    waitForSeconds(2);
                    visit(TestDataUtil.getValue("&URL&"));
                }

            }

            blresult = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blresult;
    }

    public boolean clickLogin() {
        boolean blresult = false;
        try {
            if (verifyElement(elmntloginbtn)) {
                waitForSeconds(3);
                jsClick(elmntloginbtn);
                System.out.println(" sucessfully clicked login ");
                refreshPage();
                blresult = true;
            }
            if (!verifyElement(elmntloginbtn)) {
                System.out.println("user here in home page");
                blresult = true;

            }
        } catch (Exception e) {
            System.out.println("user here in Patient Home Page");
            blresult = true;

        }
        return blresult;
    }

    public boolean clickMMHLogo() {
        boolean isVerified = false;
        if (System.getProperty(Constants.ENV_VARIABLE_EXECUTION_TYPE, "").equalsIgnoreCase("BROWSER")) {
            takeScreenshot(driver);
            waitForElement(elmntMMHLogo);
            click(elmntMMHLogo);
            waitForElement(txtProviderPortal);
            isVerified = verifyElement(txtProviderPortal);
        }


        return isVerified;
    }

    public void enterEmailForProvider(String strEmail) {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        if (verifyElement(txtBoxEmail)) {
            waitForSeconds(3);
            waitForElementClickable(txtBoxEmail);
            enterValue(txtBoxEmail, strEmail);
        }
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(3);
        if (!verifyElement(txtBoxEmail)) {
            System.out.println("User here in home page");
        }

    }
}




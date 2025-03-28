package Sanity_Patient_Web.pages;

import cap.common.BasePage;
import cap.utilities.DateUtil;
import cap.utilities.TestDataUtil;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.io.File;
import java.util.List;

import static cap.utilities.SharedDriver.strExecutionID;
import static cap.utilities.SharedDriver.strExecutionNumber;

public class BeatingTheBlues extends BasePage {
    public BeatingTheBlues(WebDriver driver) {
        super(driver);

    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Beating the Blues')]")
    protected WebElement elmtBeatingTheBlues;

    @FindBy(how = How.XPATH, using = " //h5[contains(text(),'Beating The Blues')]")
    protected WebElement elmtBeatingTheBluesHeader;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    protected String elmntAppointmentPreScreening1 = "//span[contains(text(),'Appointment Pre-Screening')]";

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Appointment Pre-Screening')]")
    protected WebElement elmntAppointmentPreScreening;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'page-content')]")
    protected WebElement elmntAppointmentPanel;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'NO')]//parent::button")
    protected WebElement elmntDeclineCovidPreScreening;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Resume Session')]")
    protected WebElement elmtviewsession1;


    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Continue Session 1')])[1]")
    protected WebElement elmtContinuesession1;

    @FindBy(how = How.XPATH, using = "//iframe[@title='Beating The Blues']")
    protected WebElement getElmtBeatingTheBluesFrame;

    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    protected WebElement getElmtBeatingTheBluesCloseButton;

    //iframe[@title='Beating The Blues']

    //button[@type='button']

    protected String elmtContinuesession = "(//div[contains(text(),'Continue Session 1')]//following::span)[1]";


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'What are your thoughts about doing weekly projects?')]")
    protected WebElement elmtWhatareyourthoughtsaboutdoingweeklyprojects;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Account')]")
    protected WebElement elmtMyAccount;

    @FindBy(how = How.XPATH, using = "//mat-icon[text()='menu']")
    protected WebElement btnMobileMenu;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Update Profile')]")
    protected WebElement elmtUpdateProfile;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'View Profile')]")
    protected WebElement elmtviewProfile;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'My Health Centres')]")
    protected WebElement elmtMyHealthCentreHeader;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'My Health Centres')]")
    protected WebElement elmtMyHealthCentre;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'My Health Centres')]")
    protected WebElement elmtMobileMyHealthCentre;

    @FindBy(how = How.XPATH, using = "//mat-label[contains(text(),'Location')]")
    protected WebElement verifyLocationIsDisplayed;

    @FindBy(how = How.XPATH, using = "//mat-label[text()='Roles']")
    protected WebElement verifyRoleIsDisplayed;

    @FindBy(how = How.XPATH, using = "//div[text()='My Subscriptions']")
    protected WebElement clickMySubscriptions;

    @FindBy(how = How.XPATH, using = "//a[text()='My Subscriptions']")
    protected WebElement clickMobileMySubscriptions;
    @FindBy(how = How.XPATH, using = "//div[@class='d-flex align-items-center']//i")
    protected WebElement clickBackArrow;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'My Subscriptions')]")
    protected WebElement verifyMySubscriptions;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'My Subscriptions')]")
    protected WebElement verifyMobileMySubscriptions;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Registered as Beating the blues user')]")
    protected WebElement verifyRegisteredBTB;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Activated')]")
    protected WebElement verifyBTBActivatedStatus;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Beating the Blues')]")
    protected WebElement verifyBeatingtheBlues;

    @FindBy(how = How.XPATH, using = "//span[text()='Dashboard']")
    protected WebElement clickDashboard;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'MANAGE YOUR HEALTH')]")
    protected WebElement clickManageMyHealthHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Book an Appointment')]")
    protected WebElement clickBookAnAppointment;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Appointments')]")
    protected WebElement clickMobileBookAnAppointment;

    @FindBy(how = How.XPATH, using = "//button[@mattooltip='Book appointment']//span//img")
    protected WebElement elmntMobileBookAppointmentimg;


    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Schedule your appointment now.')]")
    protected WebElement elmntAppointPageHeader;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Information')]")
    protected WebElement elmntAppointmentPopupInformation;


    @FindBy(how = How.XPATH, using = "//div[contains(text(),'To get access to this feature, you will need to be registered by your health centre on the Manage My Health portal.')]")
    protected WebElement elmntAppointmentPopupDetails;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Cancel')])[3]")
    protected WebElement elmntcancelButton;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Cancel')])[3]")
    protected WebElement elmntMobilecancelButton;



    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New Repeat Prescription')]")
    protected WebElement clickNewRepeatPrescription;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Repeat Prescriptions')]")
    protected WebElement clickMobileRepeatPrescription;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Request New Script')]")
    protected WebElement verifyRequestNewScript;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Request New Script')]")
    protected WebElement ClickRequestNewScript;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New Repeat Prescription')]")
    protected WebElement ClickMobileRequestNewScript;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Health Records')]//following::mat-icon)[1]")
    protected WebElement clickHealthRecords;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Health Records')]")
    protected WebElement clickDashboardHealthRecords;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Summary')]")
    protected WebElement elmntclickSummary;
    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'HEALTH SUMMARY FOR')]")
    protected WebElement verifyHealthSummary;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Lab Results')]")
    protected WebElement clickLabResults;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Lab Results')]")
    protected WebElement verifyLabResults;

    @FindBy(how = How.XPATH, using = "(//h3[contains(text(),'Lab Results')])[2]")
    protected WebElement verifyMobileLabResults;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Messages')]")
    protected WebElement clickMessages;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Inbox')]")
    protected WebElement verifyInbox;

    @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Inbox')])[2]")
    protected WebElement verifyMobileInbox;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Home')]")
    protected WebElement clickBTBHomeIcon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Send Invitation')]")
    protected WebElement clickSendInvitation;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Beating the Blues')]")
    protected WebElement clickBeatingtheblues;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Register New Client')])[1]")
    protected WebElement clickProviderBTBRegisterNewClient;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Register New Client')])[2]")
    protected WebElement clickProviderBTBRegisterDashboardIcons;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search Clients')])[1]")
    protected WebElement clickProviderBTBSearchClient;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Search Clients')])[2]")
    protected WebElement clickProviderBTBDashboardIcons;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Resources')])[1]")
    protected WebElement clickResources;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Progress Reports')])[2]")
    protected WebElement clickProgressReports;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Usage Reports')])[2]")
    protected WebElement clickUsageReports;


    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Usage Reports')])[3]")
    protected WebElement clickUsageReports1;

//        @FindAll({
//            @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Usage Reports')])[2]"),
//            @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Usage Reports')])[3]")
//
//    })
//    protected WebElement clickUsageReports;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Settings')])[2]")
    protected WebElement clickSetting;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Settings - Client Risk Alert')]")
    protected WebElement clickSettingClientRiskAlert;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Live progress report')]")
    protected WebElement verifyLiveProgressReport;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Clients Registered by Me')]")
    protected WebElement verifyClientRegisteredByMe;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Usage Summary by Age Group')]")
    protected WebElement verifyUsageSummaryByAgeGroup;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Usage Summary by Female Age Group')]")
    protected WebElement verifyUsageSummaryByFemaleAgeGroup;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Usage Summary by Male Age Group')]")
    protected WebElement verifyUsageSummaryByMaleAgeGroup;

    @FindBy(how = How.XPATH, using = "(//h1[contains(text(),'Beating the Blues Usage Reports')])[2]")
    protected WebElement verifyBeatingtheBluesUsageReports;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Resources')]")
    protected WebElement verifyResourcesHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Provider Guide')]")
    protected WebElement clickviewProviderGuide;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View Provider Guide')]")
    protected WebElement verifyviewProviderGuideHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View User Guide')]")
    protected WebElement clickViewUserGuide;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Download')]")
    protected WebElement clickDownload;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View User Guide')]")
    protected WebElement verifyViewUserGuideHeader;


    @FindBy(how = How.XPATH, using = "(//mat-select[@role='combobox']//following::span)[1]")
    protected WebElement clickBeatingtheBluesDropdown;

    @FindBy(how = How.XPATH, using = "//mat-select[@formcontrolname='PracticeId']")
    protected WebElement clickRegisterNewClientDropdown;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Last Name First Name')]//preceding::input)[3]")
    protected WebElement clickLastNameFirstNameRadioButton;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='Firstname']")
    protected WebElement EnterFirstNameRegisterNewClient;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='Lastname']")
    protected WebElement EnterLastNameRegisterNewClient;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='emailId']")
    protected WebElement EnterEmailRegisterNewClient;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='Verify']")
    protected WebElement EnterVerifyEmailRegisterNewClient;


    @FindBy(how = How.XPATH, using = "//input[@placeholder='Start typing Client Last name to get auto suggested list']")
    protected WebElement EnterClientName;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Me')]//preceding::input)[7]")
    protected WebElement clickRegistered;

    @FindBy(how = How.XPATH, using = "(//p[contains(text(),'Client Activation Status')]//following::input)[1]")
    protected WebElement clickClientActivationStatus;

    @FindBy(how = How.XPATH, using = "//span[text()=' Search ']")
    protected WebElement clickSearchButton;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Search Results')]")
    protected WebElement VerifySearchResultsPage;


    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Beating the Blues Program')])[1]")
    protected WebElement clickPraticeDropdown;

    protected String elmntHealthCenter = new StringBuilder().append("//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String elmntRegisterNewClient = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Search Clients - Beating the Blues')]")
    protected WebElement verifysearchclientspage;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Register New Client')])[2]")
    protected WebElement clickRegisterNewClient;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Register New Client for Beating the Blues')]")
    protected WebElement verifyRegisterNewClientPage;

    @FindBy(how = How.XPATH, using = "(//input[@formcontrolname='DateString']//following::button)[1]")
    protected WebElement verifyRegisterDate;

    protected String strDayAfterDate = new StringBuilder()
            .append("//table[@class='mat-calendar-table']//tbody//tr//td//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Resources')])[1]")
    protected WebElement clickProviderBTBResources;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Resources')])[2]")
    protected WebElement clickProviderBTBResourcesDashboardIcons;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Progress Reports')])[1]")
    protected WebElement clickProviderBTBProgressReports;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Progress Reports')])[2]")
    protected WebElement clickProviderBTBProgressReportsDashboardIcons;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Usage Reports')])[1]")
    protected WebElement clickProviderBTBusageReports;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Usage Reports')])[2]")
    protected WebElement clickProviderBTBusageReportsDashboardIcons;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Usage Reports')])[2]")
    protected WebElement clickExistingProviderBTBusageReportsDashboardIcons;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Settings')])[1]")
    protected WebElement clickProviderBTBSettings;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Settings')])[2]")
    protected WebElement clickProviderBTBSettingsDashboardIcons;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Beating the Blues')]//following::mat-icon)[1]")
    protected WebElement clickBTB;


    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Helping you get better and stay well')]")
    protected WebElement verifyBTBHeadLines;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Session Overview')])[1]")
    protected WebElement verifySessionOverview;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Session Overview')])[2]")
    protected WebElement verifySessionOverviewHomeIcon;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Session Overview')])[1]")
    protected WebElement verifyMobileSessionOverview;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntdashboard;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Resume Session')]")
    protected WebElement verifyResumeSession;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Start Session')]")
    protected WebElement verifyStartSessionHomePageIcon;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Progress')]")
    protected WebElement verifyMyProgress;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'My Progress')])[2]")
    protected WebElement verifyMyProgressHomePageIcon;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'My Progress')])[2]")
    protected WebElement verifyMobileMyProgress;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'View User Guide')]")
    protected WebElement verifyViewUserGuide;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Session Overview')]")
    protected WebElement verifySessionOverviewHeader;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'1. Define your problems')]")
    protected WebElement verifySession1;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'2. Set your goals')]")
    protected WebElement verifySession2;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'3. Understand your thoughts')]")
    protected WebElement verifySession3;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'4. Challenge your thoughts')]")
    protected WebElement verifySession4;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'5. Refine your techniques')]")
    protected WebElement verifySession5;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'6. Understand your successes')]")
    protected WebElement verifySession6;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'7. Learn new habits')]")
    protected WebElement verifySession7;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'8. Plan for your future')]")
    protected WebElement verifySession8;



    @FindBy(how = How.XPATH, using = "//iframe[@id='iframe-id']")
    protected WebElement elmntiFrame;

    @FindBy(how = How.XPATH, using = "//img[@src='assets/images/btb-logo.png']")
    protected WebElement elmntBTBimage;

    @FindBy(how = How.XPATH, using = "//img[@src='assets/images/btb-logo-mobile.png']")
    protected WebElement elmntBTBSmileimg;
    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Your Progress')]")
    protected WebElement elmntYourProgressHeader;


//  @FindBy(how = How.XPATH, using = "//label[contains(text(),'Continue Session')]")
//    protected WebElement elmntContinueSession;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//label[contains(text(),'Continue Session')]"),
            @FindBy(how = How.XPATH, using = "//label[contains(text(),'Start Session')]")


    })protected WebElement elmntContinueSession;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Upset and Disappointments')]")
    protected WebElement elmntUpsetandDisappointments;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'None this session')]")
    protected WebElement elmntNonethissession;
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    protected WebElement elmntclosebutton;


    public boolean clickViewsummary() {
        waitForSeconds(3);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        jsScrollIntoView(elmtBeatingTheBlues);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForElementClickable(elmtBeatingTheBlues);
        waitAndClick(elmtBeatingTheBlues);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
//        waitForElement(elmtBeatingTheBluesHeader);
        return true;
    }

    public void clickViewsession() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(5);
        waitForElement(elmtviewsession1);
        jsClick(elmtviewsession1);
        waitForElementToAppear(driver,By.xpath(elmntSpinner));
        waitForElementDisappear(driver, By.xpath(elmntSpinner));

    }

    public boolean clickContinuesession1() {
        waitForSeconds(5);
        focusWindow(2);
        waitForSeconds(3);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
//        driver.switchTo().frame(getElmtBeatingTheBluesFrame);
        waitForSeconds(3);
        waitForElementToAppear(driver, By.xpath(elmtContinuesession));
//        waitForElementClickable(elmtContinuesession1);
        jsClick(elmtContinuesession1);
        waitForElementToAppear(driver, By.xpath(elmtContinuesession));
        waitForSeconds(2);
//        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
//        jsClick(getElmtBeatingTheBluesCloseButton);
        closeWindow(2);
//        waitForSeconds(3);
//        driver.switchTo().defaultContent();
//        focusWindow(1);
        waitForSeconds(3);
        return true;

    }

    public boolean clickBeatingTheBluesOption() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmtBeatingTheBlues);
            isverified = verifyElement(elmtBeatingTheBlues);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(elmtBeatingTheBlues);
            waitAndClick(elmtBeatingTheBlues);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTBHomeIcon);
            isverified = verifyElement(clickBTBHomeIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean VerifyBTBLeftSideMenu() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyBTBHeadLines);
            isverified = verifyElement(verifyBTBHeadLines);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTBHomeIcon);
            isverified = verifyElement(clickBTBHomeIcon);
            waitForElement(verifySessionOverview);
            isverified=verifyElement(verifySessionOverview);
            waitForElement(verifyResumeSession);
            isverified=verifyElement(verifyResumeSession);
            waitForElement(verifyMyProgress);
            isverified=verifyElement(verifyMyProgress);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean VerifyMMHBTBLeftSideMenu() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTBHomeIcon);
            isverified = verifyElement(clickBTBHomeIcon);
            waitForElement(verifySessionOverview);
            isverified=verifyElement(verifySessionOverview);
            waitForElement(verifyResumeSession);
            isverified=verifyElement(verifyResumeSession);
            waitForElement(verifyMyProgress);
            isverified=verifyElement(verifyMyProgress);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean VerifyBTBHomePageMenu() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTBHomeIcon);
            click(clickBTBHomeIcon);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyBTBHeadLines);
            isverified = verifyElement(verifyBTBHeadLines);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifySessionOverviewHomeIcon);
            isverified=verifyElement(verifySessionOverviewHomeIcon);
//            waitForElement(verifyStartSessionHomePageIcon);
//            isverified=verifyElement(verifyStartSessionHomePageIcon);
            waitForElement(verifyMyProgressHomePageIcon);
            isverified=verifyElement(verifyMyProgressHomePageIcon);
            waitForElement(verifyViewUserGuide);
            isverified=verifyElement(verifyViewUserGuide);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean VerifyProviderBTBDashboardLeftMenu() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTBHomeIcon);
            click(clickBTBHomeIcon);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickProviderBTBRegisterNewClient);
            isverified = verifyElement(clickProviderBTBRegisterNewClient);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickProviderBTBSearchClient);
            isverified=verifyElement(clickProviderBTBSearchClient);
            waitForElement(clickProviderBTBResources);
            isverified=verifyElement(clickProviderBTBResources);
            waitForElement(clickProviderBTBProgressReports);
            isverified=verifyElement(clickProviderBTBProgressReports);
            waitForElement(clickProviderBTBusageReports);
            isverified=verifyElement(clickProviderBTBusageReports);
            waitForElement(clickProviderBTBSettings);
            isverified=verifyElement(clickProviderBTBSettings);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }



    public boolean VerifyExistingProviderBTBDashboardLeftMenu() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBeatingtheblues);
            click(clickBeatingtheblues);
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTBHomeIcon);
            click(clickBTBHomeIcon);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickProviderBTBRegisterNewClient);
            isverified = verifyElement(clickProviderBTBRegisterNewClient);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickProviderBTBSearchClient);
            isverified=verifyElement(clickProviderBTBSearchClient);
            waitForElement(clickProviderBTBResources);
            isverified=verifyElement(clickProviderBTBResources);
            waitForElement(clickProviderBTBProgressReports);
            isverified=verifyElement(clickProviderBTBProgressReports);
            waitForElement(clickExistingProviderBTBusageReportsDashboardIcons);
            isverified=verifyElement(clickExistingProviderBTBusageReportsDashboardIcons);
            waitForElement(clickProviderBTBSettings);
            isverified=verifyElement(clickProviderBTBSettings);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean VerifyProviderBTBHomePageIcons() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTBHomeIcon);
            click(clickBTBHomeIcon);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickProviderBTBRegisterDashboardIcons);
            isverified = verifyElement(clickProviderBTBRegisterDashboardIcons);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickProviderBTBDashboardIcons);
            isverified=verifyElement(clickProviderBTBDashboardIcons);
            waitForElement(clickProviderBTBResourcesDashboardIcons);
            isverified=verifyElement(clickProviderBTBResourcesDashboardIcons);
            waitForElement(clickProviderBTBProgressReportsDashboardIcons);
            isverified=verifyElement(clickProviderBTBProgressReportsDashboardIcons);
//            waitForElement(clickProviderBTBusageReportsDashboardIcons);
//            isverified=verifyElement(clickProviderBTBusageReportsDashboardIcons);
            waitForElement(clickProviderBTBSettingsDashboardIcons);
            isverified=verifyElement(clickProviderBTBSettingsDashboardIcons);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickSearchClients() {
        boolean isverified = false;
        try {
            waitForElement(clickProviderBTBDashboardIcons);
           click(clickProviderBTBDashboardIcons);
           waitForElement(verifysearchclientspage);
           isverified=verifyElement(verifysearchclientspage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickRegisterNewClient() {
        boolean isverified = false;
        try {
            waitForElement(clickBTBHomeIcon);
            click(clickBTBHomeIcon);
            waitForElement(clickRegisterNewClient);
            click(clickRegisterNewClient);
            waitForElement(verifyRegisterNewClientPage);
            isverified=verifyElement(verifyRegisterNewClientPage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }


    public boolean clickSendInvitation() {
        boolean isverified = false;
        try {
            waitForElement(clickSendInvitation);
            click(clickSendInvitation);
            isverified=true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickResources() {
        boolean isverified = false;
        try {
            waitForElement(clickResources);
            click(clickResources);
            waitForElement(verifyResourcesHeader);
            isverified=verifyElement(verifyResourcesHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickProgressReports() {
        boolean isverified = false;
        try {
            waitForElement(clickProgressReports);
            click(clickProgressReports);
            waitForElement(verifyLiveProgressReport);
            isverified=verifyElement(verifyLiveProgressReport);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickUsageReports() {
        boolean isverified = false;
        try {
            waitForElement(clickUsageReports);
            click(clickUsageReports);
            waitForElement(verifyClientRegisteredByMe);
            isverified=verifyElement(verifyClientRegisteredByMe);
            waitForElement(verifyUsageSummaryByAgeGroup);
            isverified=verifyElement(verifyUsageSummaryByAgeGroup);
            waitForElement(verifyUsageSummaryByFemaleAgeGroup);
            isverified=verifyElement(verifyUsageSummaryByFemaleAgeGroup);
            waitForElement(verifyUsageSummaryByMaleAgeGroup);
            isverified=verifyElement(verifyUsageSummaryByMaleAgeGroup);
            waitForElement(verifyBeatingtheBluesUsageReports);
            isverified=verifyElement(verifyBeatingtheBluesUsageReports);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickExistingUsageReports() {
        boolean isverified = false;
        try {
            waitForElement(clickUsageReports1);
            click(clickUsageReports1);
            waitForElement(verifyClientRegisteredByMe);
            isverified=verifyElement(verifyClientRegisteredByMe);
            waitForElement(verifyUsageSummaryByAgeGroup);
            isverified=verifyElement(verifyUsageSummaryByAgeGroup);
            waitForElement(verifyUsageSummaryByFemaleAgeGroup);
            isverified=verifyElement(verifyUsageSummaryByFemaleAgeGroup);
            waitForElement(verifyUsageSummaryByMaleAgeGroup);
            isverified=verifyElement(verifyUsageSummaryByMaleAgeGroup);
            waitForElement(verifyBeatingtheBluesUsageReports);
            isverified=verifyElement(verifyBeatingtheBluesUsageReports);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }


    public boolean clickSetting() {
        boolean isverified = false;
        try {
            waitForElement(clickSetting);
            click(clickSetting);
            waitForElement(clickSettingClientRiskAlert);
            isverified=verifyElement(clickSettingClientRiskAlert);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyRecentViewedDetails() {
        boolean isverified = false;
        try {
            waitForElement(elmntdashboard);
            click(elmntdashboard);
isverified=true;
            int WindowsCount = driver.getWindowHandles().size();
            System.out.println(">> WindowsCount ::"+WindowsCount);
            if(WindowsCount==2){
               closeWindow(2);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickHomeIcon() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTBHomeIcon);
            click(clickBTBHomeIcon);
            waitForElement(clickManageMyHealthHeader);
            isverified=verifyElement(clickManageMyHealthHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickViewProviderGuide() {
        boolean isverified = false;
        try {
            waitForElement(clickviewProviderGuide);
            click(clickviewProviderGuide);
            waitForElement(verifyviewProviderGuideHeader);
            isverified=verifyElement(verifyviewProviderGuideHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickViewUserGuide() {
        boolean isverified = false;
        try {
            waitForElement(clickviewProviderGuide);
            click(clickviewProviderGuide);
            waitForSeconds(3);
            waitForElement(clickViewUserGuide);
            click(clickViewUserGuide);
            waitForElement(verifyViewUserGuideHeader);
            isverified=verifyElement(verifyViewUserGuideHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickDownload() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickDownload);
            jsClick(clickDownload);

            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyviewProviderGuideHeader);
            isverified=verifyElement(verifyviewProviderGuideHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public void DeleteFile() {
        File path = new File("config/Downloads");
        File[] files = path.listFiles();
        for (File file : files) {
            System.out.println("Deleted filename :" + file.getName());
            file.delete();
        }
    }

    public boolean clickViewUserGuideDownload() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickDownload);
            jsClick(clickDownload);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickViewUserGuide);
            isverified=verifyElement(clickViewUserGuide);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }



    public boolean clickPraticeNameDropDown(List<String> strPraticeName) {
        boolean isverified = false;
        try {
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBeatingtheBluesDropdown);
            mouseClick(clickBeatingtheBluesDropdown);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntSelectHealthCenter = waitForElement(By.xpath(elmntHealthCenter.replace("<<REPLACEMENT>>", strPraticeName.get(0))));
            System.out.println(">>>>>>>>"+elmntSelectHealthCenter);
            mouseClick(elmntSelectHealthCenter);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifysearchclientspage);
            isverified=verifyElement(verifysearchclientspage);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickRegisterNewClientPraticeNameDropDown(List<String> strPraticeName) {
        boolean isverified = false;
        try {
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickRegisterNewClientDropdown);
            mouseClick(clickRegisterNewClientDropdown);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntSelectHealthCenter = waitForElement(By.xpath(elmntRegisterNewClient.replace("<<REPLACEMENT>>", strPraticeName.get(0))));
            System.out.println(">>>>>>>>"+elmntSelectHealthCenter);
            mouseClick(elmntSelectHealthCenter);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyRegisterNewClientPage);
            isverified=verifyElement(verifyRegisterNewClientPage);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickLastNameFirstName() {
        boolean isverified = false;
        try {
            waitForElement(clickLastNameFirstNameRadioButton);
            jsClick(clickLastNameFirstNameRadioButton);
            waitForElement(verifysearchclientspage);
            isverified=verifyElement(verifysearchclientspage);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean EnterRegisterNewClientFirstName(List<String> data) {
        boolean isverified = false;
        try {
            waitForElement(EnterFirstNameRegisterNewClient);
//            jsClick(EnterFirstNameRegisterNewClient);
            enterValue(EnterFirstNameRegisterNewClient,data.get(1));
            waitForElement(verifyRegisterNewClientPage);
            isverified=verifyElement(verifyRegisterNewClientPage);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean EnterRegisterNewClientLastName(List<String> data) {
        boolean isverified = false;
        try {
            waitForElement(EnterLastNameRegisterNewClient);
//            jsClick(EnterLastNameRegisterNewClient);
            enterValue(EnterLastNameRegisterNewClient,data.get(2));
            waitForElement(verifyRegisterNewClientPage);
            isverified=verifyElement(verifyRegisterNewClientPage);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean EnterEmailAddress(List<String> data) {
        boolean isverified = false;
        try {
            String original = TestDataUtil.getValue(data.get(4));
            String toInsert = strExecutionNumber;
            int position = 13;

            StringBuilder sb = new StringBuilder(original);
            sb.insert(position,Integer.valueOf(toInsert));

            String result = sb.toString();
            System.out.println(result);
            waitForElement(EnterEmailRegisterNewClient);
//            jsClick(EnterLastNameRegisterNewClient);
            enterValue(EnterEmailRegisterNewClient,result);
            waitForElement(verifyRegisterNewClientPage);
            isverified=verifyElement(verifyRegisterNewClientPage);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean EnterVerifyEmailAddress(List<String> data) {
        boolean isverified = false;
        try {
            String original = TestDataUtil.getValue(data.get(4));
            String toInsert = strExecutionNumber;
            int position = 13;

            StringBuilder sb = new StringBuilder(original);
            sb.insert(position,Integer.valueOf(toInsert));

            String result = sb.toString();
            System.out.println(result);
            waitForElement(EnterVerifyEmailRegisterNewClient);
//            jsClick(EnterLastNameRegisterNewClient);
            enterValue(EnterVerifyEmailRegisterNewClient,result);
            waitForElement(verifyRegisterNewClientPage);
            isverified=verifyElement(verifyRegisterNewClientPage);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean SelectDate() {
        boolean isverified = false;
        try {

            waitForElement(verifyRegisterDate);
            jsClick(verifyRegisterDate);
            String strDateFormat = "d";
            String strDay = "TODAY";
            String strDate = DateUtil.getDate(strDay, strDateFormat);
            System.out.println("Current Day::>>" + strDate);
            WebElement elmntDayAfterDate = waitForElement(By.xpath(strDayAfterDate.replace("<<REPLACEMENT>>", strDate)));
            click(elmntDayAfterDate);
            isverified=true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }
    public boolean EnterClientName(List<String> data) {
        boolean isverified = false;
        try {
            waitForElement(EnterClientName);
            jsClick(EnterClientName);
//            driver.switchTo().activeElement().sendKeys(data.get(1));
            enterValue(EnterClientName,data.get(1));
            waitForSeconds(2);
            EnterClientName.sendKeys(Keys.ENTER);
            waitForSeconds(2);
            waitForElement(verifysearchclientspage);
            isverified=verifyElement(verifysearchclientspage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickRegistered() {
        boolean isverified = false;
        try {
            waitForElement(clickRegistered);
            jsClick(clickRegistered);
            waitForElement(verifysearchclientspage);
            isverified=verifyElement(verifysearchclientspage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickClientActivationStatus() {
        boolean isverified = false;
        try {
            waitForElement(clickClientActivationStatus);
            jsClick(clickClientActivationStatus);
            waitForElement(verifysearchclientspage);
            isverified=verifyElement(verifysearchclientspage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickSearch() {
        boolean isverified = false;
        try {
            jsScrollIntoView(clickSearchButton);
            waitForElement(clickSearchButton);
            jsClick(clickSearchButton);
            waitForElement(VerifySearchResultsPage);
            isverified=verifyElement(VerifySearchResultsPage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }



    public boolean VerifyMobileBtbWebsiteHomePage() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyBTBHeadLines);
            isverified = verifyElement(verifyBTBHeadLines);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            click(btnMobileMenu);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTBHomeIcon);
            isverified = verifyElement(clickBTBHomeIcon);
            waitForElement(verifyMobileSessionOverview);
            isverified=verifyElement(verifyMobileSessionOverview);
            waitForElement(btnMobileMenu);
            click(btnMobileMenu);
//            waitForElement(verifyResumeSession1);
//            isverified=verifyElement(verifyResumeSession1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public void clickDashboardFromMenu() {
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        jsScrollIntoView(elmntdashboard);
        waitForElement(elmntdashboard);
        click(elmntdashboard);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));

    }
    public boolean VerifyBtbWebsiteHome() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyBTBHeadLines);
            isverified = verifyElement(verifyBTBHeadLines);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTBHomeIcon);
            isverified = verifyElement(clickBTBHomeIcon);
            waitForElement(verifySessionOverview);
            isverified=verifyElement(verifySessionOverview);
            waitForElement(verifyResumeSession);
            isverified=verifyElement(verifyResumeSession);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }


    public boolean clickMyAccount() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmtMyAccount);
            click(elmtMyAccount);
            jsScrollIntoView(elmtUpdateProfile);
            isverified = verifyElement(elmtUpdateProfile);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtUpdateProfile);
            click(elmtUpdateProfile);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtviewProfile);
            isverified = verifyElement(elmtviewProfile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickMobileMyAccount() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(4);
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForSeconds(3);
            jsScrollIntoView(elmtMyAccount);
            waitForElement(elmtMyAccount);
            jsClick(elmtMyAccount);
            jsScrollIntoView(elmtUpdateProfile);
            isverified = verifyElement(elmtUpdateProfile);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtUpdateProfile);
            click(elmtUpdateProfile);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtviewProfile);
            isverified = verifyElement(elmtviewProfile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }
    public boolean clickMobileMyAccount1() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(4);
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForSeconds(3);
            jsScrollIntoView(elmtMyAccount);
            waitForElement(elmtMyAccount);
            jsClick(elmtMyAccount);
            jsScrollIntoView(elmtUpdateProfile);
            isverified = verifyElement(elmtUpdateProfile);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtUpdateProfile);
            click(elmtUpdateProfile);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtviewProfile);
            isverified = verifyElement(elmtviewProfile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }


    public boolean clickMyHealthCentre() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtMyHealthCentre);
            click(elmtMyHealthCentre);
            waitForElement(elmtMyHealthCentreHeader);
            isverified=verifyElement(elmtMyHealthCentreHeader);
//            jsScrollIntoView(verifyLocationIsDisplayed);
//            waitForElement(verifyLocationIsDisplayed);
//            isverified = verifyElement(verifyLocationIsDisplayed);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForElementClickable(verifyRoleIsDisplayed);
//            isverified = verifyElement(verifyRoleIsDisplayed);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyMyHealthCentrelocationisnotDisplayed() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtMyHealthCentre);
            click(elmtMyHealthCentre);
            waitForElement(elmtMyHealthCentreHeader);
            isverified=verifyElement(elmtMyHealthCentreHeader);
            isverified = !verifyElement(verifyLocationIsDisplayed);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isverified = !verifyElement(verifyRoleIsDisplayed);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickMobileMyHealthCentre() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtMobileMyHealthCentre);
            click(elmtMobileMyHealthCentre);
            waitForElement(elmtMyHealthCentreHeader);
            isverified=verifyElement(elmtMyHealthCentreHeader);
            jsScrollIntoView(verifyLocationIsDisplayed);
            waitForElement(verifyLocationIsDisplayed);
            isverified = verifyElement(verifyLocationIsDisplayed);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(verifyRoleIsDisplayed);
            isverified = verifyElement(verifyRoleIsDisplayed);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyMyHealthCentreIsnotConnectedLocation() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtMobileMyHealthCentre);
            click(elmtMobileMyHealthCentre);
            waitForElement(elmtMyHealthCentreHeader);
            isverified=verifyElement(elmtMyHealthCentreHeader);
            isverified = !verifyElement(verifyLocationIsDisplayed);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            isverified = !verifyElement(verifyRoleIsDisplayed);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }
    public boolean clickMySubscriptions() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            waitForSeconds(5);
            jsScrollIntoView(clickMySubscriptions);
            waitForElement(clickMySubscriptions);
            jsClick(clickMySubscriptions);
            waitForElement(verifyMySubscriptions);
            isverified = verifyElement(verifyMySubscriptions);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(verifyRegisteredBTB);
            isverified = verifyElement(verifyRegisteredBTB);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyBTBActivatedStatus);
            isverified = verifyElement(verifyBTBActivatedStatus);
            waitForElement(verifyBeatingtheBlues);
            isverified = verifyElement(verifyBeatingtheBlues);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickMobileMySubscriptions() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
waitForElement(clickBackArrow);
jsClick(clickBackArrow);
            waitForSeconds(5);
            jsScrollIntoView(clickMobileMySubscriptions);
            waitForElement(clickMobileMySubscriptions);
            jsClick(clickMobileMySubscriptions);
            waitForElement(verifyMobileMySubscriptions);
            isverified = verifyElement(verifyMobileMySubscriptions);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(verifyRegisteredBTB);
            isverified = verifyElement(verifyRegisteredBTB);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyBTBActivatedStatus);
            isverified = verifyElement(verifyBTBActivatedStatus);
            waitForElement(verifyBeatingtheBlues);
            isverified = verifyElement(verifyBeatingtheBlues);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickBookanAppointmentOption() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            jsClick(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickBookAnAppointment);
            click(clickBookAnAppointment);

            waitForElement(elmntAppointPageHeader);
            isverified = verifyElement(elmntAppointPageHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyLocationIsDisplayed);
            isverified = verifyElement(verifyLocationIsDisplayed);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyBookAppointmentPopup() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            jsClick(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickBookAnAppointment);
            click(clickBookAnAppointment);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntcancelButton);
            click(elmntcancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyMobileBookAppointmentPopup() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            jsClick(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickBookAnAppointment);
            click(clickBookAnAppointment);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntMobilecancelButton);
            click(elmntMobilecancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickMobileBookanAppointmentOption() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            jsClick(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementClickable(clickMobileBookAnAppointment);
            click(clickMobileBookAnAppointment);
            waitForElement(elmntMobileBookAppointmentimg);
            click(elmntMobileBookAppointmentimg);
            waitForElement(elmntAppointPageHeader);
            isverified = verifyElement(elmntAppointPageHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyLocationIsDisplayed);
            isverified = verifyElement(verifyLocationIsDisplayed);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }


    public boolean clickRRPOption() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickNewRepeatPrescription);
            click(clickNewRepeatPrescription);
//            waitForElement(ClickMobileRequestNewScript);
//            click(ClickMobileRequestNewScript);
//            waitForElement(verifyRequestNewScript);
//            isverified = verifyElement(verifyRequestNewScript);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyRRPPopupMessage() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickNewRepeatPrescription);
            click(clickNewRepeatPrescription);
            waitForElement(ClickMobileRequestNewScript);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntcancelButton);
            click(elmntcancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyMobileRRPPopupMessage() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickNewRepeatPrescription);
            click(clickNewRepeatPrescription);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntMobilecancelButton);
            click(elmntMobilecancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickMobileRRPOption() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementClickable(clickMobileRepeatPrescription);
            click(clickMobileRepeatPrescription);
            waitForElement(ClickRequestNewScript);
            click(ClickRequestNewScript);
            waitForElement(verifyRequestNewScript);
            isverified = verifyElement(verifyRequestNewScript);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickHealthRecords() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickHealthRecords);
            jsClick(clickHealthRecords);
            waitForSeconds(3);
            waitForElement(elmntclickSummary);
            jsClick(elmntclickSummary);
            waitForSeconds(3);
            waitForElement(verifyHealthSummary);
            isverified = verifyElement(verifyHealthSummary);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickHealthRecords);
            click(clickHealthRecords);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyHealthRecordsPopup() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickDashboardHealthRecords);
            click(clickDashboardHealthRecords);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntcancelButton);
            click(elmntcancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyMobileHealthRecordsPopup() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickDashboardHealthRecords);
            click(clickDashboardHealthRecords);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntMobilecancelButton);
            click(elmntMobilecancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }
    public boolean clickMobileHealthRecords() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementClickable(clickHealthRecords);
            click(clickHealthRecords);
            waitForElement(elmntclickSummary);
            click(elmntclickSummary);
            waitForSeconds(3);
            waitForElement(verifyHealthSummary);
            isverified = verifyElement(verifyHealthSummary);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyMobileHealthRecords() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementClickable(clickHealthRecords);
            click(clickHealthRecords);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntMobilecancelButton);
            click(elmntMobilecancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickLabResults() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            refreshPage();
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickHealthRecords);
            click(clickHealthRecords);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickLabResults);
            click(clickLabResults);
            waitForElement(verifyLabResults);
            isverified = verifyElement(verifyLabResults);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyLabResultsPopup() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickLabResults);
            click(clickLabResults);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntcancelButton);
            click(elmntcancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickMobileLabResults() {
        boolean isverified = false;
        try {
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickLabResults);
            jsClick(clickLabResults);
            waitForElement(verifyMobileLabResults);
            isverified = verifyElement(verifyMobileLabResults);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyMobileLabResultsPopup() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickLabResults);
            jsClick(clickLabResults);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntMobilecancelButton);
            click(elmntMobilecancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickMessages() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickMessages);
            click(clickMessages);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForElement(verifyInbox);
//            isverified = verifyElement(verifyInbox);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            int WindowsCount = driver.getWindowHandles().size();
//            if (WindowsCount==2){
//                closeWindow(2);
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickMessagesPopup() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickMessages);
            click(clickMessages);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntMobilecancelButton);
            click(elmntMobilecancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
//            int WindowsCount = driver.getWindowHandles().size();
//            if (WindowsCount==2){
//                closeWindow(2);
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickMobileMessages() {
        boolean isverified = false;
        try {
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(clickDashboard);
            waitForElement(clickDashboard);
            click(clickDashboard);
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickMessages);
            click(clickMessages);
            waitForElement(verifyMobileInbox);
            isverified = verifyElement(verifyMobileInbox);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            int WindowsCount = driver.getWindowHandles().size();
            if (WindowsCount==2){
                closeWindow(2);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyMobileMessagesPopup() {
        boolean isverified = false;
        try {

            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementClickable(clickMessages);
            click(clickMessages);
            waitForElement(elmntAppointmentPopupInformation);
            isverified = verifyElement(elmntAppointmentPopupInformation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppointmentPopupDetails);
            isverified = verifyElement(elmntAppointmentPopupDetails);
            waitForElement(elmntMobilecancelButton);
            click(elmntMobilecancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageMyHealthHeader);
            isverified = verifyElement(clickManageMyHealthHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickBTBHomeIcon() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(clickBTBHomeIcon);
            waitForElement(clickBTBHomeIcon);
            click(clickBTBHomeIcon);
            waitForElement(verifyBTBHeadLines);
            isverified = verifyElement(verifyBTBHeadLines);
            waitForElement(verifySessionOverview);
            isverified = verifyElement(verifySessionOverview);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyMyProgress);
            isverified = verifyElement(verifyMyProgress);
            waitForElement(verifyViewUserGuide);
            isverified = verifyElement(verifyViewUserGuide);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }
    public boolean clickMobileBTBHomeIcon() {
        boolean isverified = false;
        try {
            waitForElement(btnMobileMenu);
            jsClick(btnMobileMenu);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickBTB);
            click(clickBTB);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(clickBTBHomeIcon);
            waitForElement(clickBTBHomeIcon);
            click(clickBTBHomeIcon);
            waitForElement(verifyBTBHeadLines);
            isverified = verifyElement(verifyBTBHeadLines);
            waitForElement(verifySessionOverview);
            isverified = verifyElement(verifySessionOverview);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyMobileMyProgress);
            isverified = verifyElement(verifyMobileMyProgress);
            waitForElement(verifyViewUserGuide);
            isverified = verifyElement(verifyViewUserGuide);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickSessionOverview() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifySessionOverview);
            click(verifySessionOverview);
            waitForElement(verifySessionOverviewHeader);
            isverified = verifyElement(verifySessionOverviewHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean verifyEightSessions() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifySession1);
            isverified = verifyElement(verifySession1);
            waitForElement(verifySession2);
            isverified = verifyElement(verifySession2);
            waitForElement(verifySession3);
            isverified = verifyElement(verifySession3);
            waitForElement(verifySession4);
            isverified = verifyElement(verifySession4);
            waitForElement(verifySession5);
            isverified = verifyElement(verifySession5);
            waitForElement(verifySession6);
            isverified = verifyElement(verifySession6);
            waitForElement(verifySession7);
            isverified = verifyElement(verifySession7);
            waitForElement(verifySession8);
            isverified = verifyElement(verifySession8);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean clickResumeSessionIcon() {
        boolean isverified = false;
        boolean isverified1 = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyResumeSession);
            click(verifyResumeSession);
            waitForSeconds(5);
            int WindowsCount = driver.getWindowHandles().size();
            if(WindowsCount==2){
                focusWindow(2);
            }
            if(WindowsCount==3){
                focusWindow(3);
            }

            waitForSeconds(3);
            String BTBNavigateURL=driver.getCurrentUrl();
            System.out.println("BTBUrl ::"+BTBNavigateURL);
            String BTB="https://v2staging.beatingtheblues.co.nz/session/summary/";
            Character GetData =BTBNavigateURL.charAt(56);
            System.out.println(">>> :"+GetData);
            String CompareUrl=BTB+GetData;
            System.out.println(">>>>"+CompareUrl);
            if (BTBNavigateURL.contains(CompareUrl)){
                isverified1=true;
                System.out.println("Checked URL");
            }
            else {
                isverified1=false;
                System.out.println("Fail URL");
            }

            waitForElement(elmntBTBimage);
            isverified = verifyElement(elmntBTBimage);
            waitForElement(elmntYourProgressHeader);
            isverified = verifyElement(elmntYourProgressHeader);
            driver.switchTo().defaultContent();
            System.out.println("DefaultContent");
            waitForSeconds(2);
            int Windows=driver.getWindowHandles().size();
            System.out.println("Windows ::"+Windows);
            if (Windows==3) {
                closeWindow(3);
            }

            int Windows1=driver.getWindowHandles().size();
            System.out.println("Windows ::"+Windows1);
            if (Windows1==2) {
                waitForSeconds(2);
                closeWindow(2);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified && isverified1;
    }

    public boolean clickMobileResumeSessionIcon() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(btnMobileMenu);
            click(btnMobileMenu);
            waitForElement(verifyResumeSession);
            click(verifyResumeSession);
            waitForSeconds(5);
            focusWindow(2);
            System.out.println("Successfully Switched Window");
            waitForElement(elmntBTBSmileimg);
            isverified = verifyElement(elmntBTBSmileimg);
            waitForElement(elmntYourProgressHeader);
            isverified = verifyElement(elmntYourProgressHeader);
            waitForElement(elmntContinueSession);
            isverified = verifyElement(elmntContinueSession);
            waitForElement(elmntUpsetandDisappointments);
            isverified = verifyElement(elmntUpsetandDisappointments);
            waitForSeconds(2);
            closeWindow(2);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isverified;
    }

    public boolean declineCovidPreScreeningPopup() {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElementToAppear(driver,By.xpath(elmntAppointmentPreScreening1));
            if (isElementDisplayed(elmntAppointmentPreScreening)) {
                System.out.println("Covid Prescreening popup is displayed");
                waitForElementDisappear(driver, By.xpath(elmntSpinner));
                waitForElement(elmntDeclineCovidPreScreening);
                jsClick(elmntDeclineCovidPreScreening);
            }
            if (!isElementDisplayed(elmntAppointmentPreScreening)){
                System.out.println("Covid Prescreening popup is not displayed");
            }
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntAppointmentPanel);
        } catch (Exception e) {
            System.out.println("Cannot Verify Covid Prescreening popup ");
            e.printStackTrace();
        }
        return blResult;
    }
}

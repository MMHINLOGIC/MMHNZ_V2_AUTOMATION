package Sanity_Patient_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Resume Session')]//parent::a")
    protected WebElement elmtviewsession1;


    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Continue Session 1')]//following::span)[1]")
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

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Update Profile')]")
    protected WebElement elmtUpdateProfile;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'View Profile')]")
    protected WebElement elmtviewProfile;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'My Health Centres')]")
    protected WebElement elmtMyHealthCentreHeader;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'My Health Centres')]")
    protected WebElement elmtMyHealthCentre;

    @FindBy(how = How.XPATH, using = "//mat-label[contains(text(),'Location')]")
    protected WebElement verifyLocationIsDisplayed;

    @FindBy(how = How.XPATH, using = "//mat-label[text()='Roles']")
    protected WebElement verifyRoleIsDisplayed;

    @FindBy(how = How.XPATH, using = "//div[text()='My Subscriptions']")
    protected WebElement clickMySubscriptions;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'My Subscriptions')]")
    protected WebElement verifyMySubscriptions;

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

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Schedule your appointment now.')]")
    protected WebElement elmntAppointPageHeader;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New Repeat Prescription')]")
    protected WebElement clickNewRepeatPrescription;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Request New Script')]")
    protected WebElement verifyRequestNewScript;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Health Records')]")
    protected WebElement clickHealthRecords;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Summary')]")
    protected WebElement elmntclickSummary;
    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'HEALTH SUMMARY FOR')]")
    protected WebElement verifyHealthSummary;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Lab Results')]")
    protected WebElement clickLabResults;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Lab Results')]")
    protected WebElement verifyLabResults;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Messages')]")
    protected WebElement clickMessages;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Inbox')]")
    protected WebElement verifyInbox;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Home')]")
    protected WebElement clickBTBHomeIcon;

    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Helping you get better and stay well')]")
    protected WebElement verifyBTBHeadLines;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Session Overview')])[2]")
    protected WebElement verifySessionOverview;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntdashboard;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Resume Session 1')]")
    protected WebElement verifyResumeSession1;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'My Progress')]")
    protected WebElement verifyMyProgress;

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

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Resume Session')]")
    protected WebElement verifyResumeSession;

    @FindBy(how = How.XPATH, using = "//iframe[@id='iframe-id']")
    protected WebElement elmntiFrame;

    @FindBy(how = How.XPATH, using = "//img[@src='assets/images/btb-logo.png']")
    protected WebElement elmntBTBimage;

    @FindBy(how = How.XPATH, using = "//img[@src='assets/images/btb-logo-mobile.png']")
    protected WebElement elmntBTBSmileimg;
    @FindBy(how = How.XPATH, using = "//h3[contains(text(),'Your Progress')]")
    protected WebElement elmntYourProgressHeader;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Continue Session 1')]")
    protected WebElement elmntContinueSession;

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
        waitForElementDisappear(driver, By.xpath(elmntSpinner));

    }

    public boolean clickContinuesession1() {
//        focusWindow(2);
        waitForSeconds(3);
        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        driver.switchTo().frame(getElmtBeatingTheBluesFrame);
        waitForSeconds(3);
        waitForElementToAppear(driver, By.xpath(elmtContinuesession));
//        waitForElementClickable(elmtContinuesession1);
        jsClick(elmtContinuesession1);
        waitForSeconds(2);
//        waitForElementDisappear(driver, By.xpath(elmntSpinner));
        waitForSeconds(2);
        jsClick(getElmtBeatingTheBluesCloseButton);
//        closeWindow(2);
//        waitForSeconds(3);
        driver.switchTo().defaultContent();
//        focusWindow(1);
        waitForSeconds(3);
        return true;

    }

    public boolean clickBeatingTheBluesOption() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
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

    public boolean VerifyBtbWebsiteHomePage() {
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
            waitForElement(verifyResumeSession1);
            isverified=verifyElement(verifyResumeSession1);
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

    public boolean clickMyHealthCentre() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtMyHealthCentre);
            click(elmtMyHealthCentre);
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
//            jsScrollIntoView(clickDashboard);
//            waitForElement(clickDashboard);
//            click(clickDashboard);
//            waitForElement(clickManageMyHealthHeader);
//            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
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

    public boolean clickLabResults() {
        boolean isverified = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            jsScrollIntoView(clickDashboard);
//            waitForElement(clickDashboard);
//            click(clickDashboard);
//            waitForElement(clickManageMyHealthHeader);
//            isverified = verifyElement(clickManageMyHealthHeader);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForElement(clickHealthRecords);
//            click(clickHealthRecords);
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
            waitForElement(verifyInbox);
            isverified = verifyElement(verifyInbox);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
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
//            waitForElement(verifyResumeSession1);
//            isverified = verifyElement(verifyResumeSession1);
            waitForElement(verifyMyProgress);
            isverified = verifyElement(verifyMyProgress);
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
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyResumeSession);
            click(verifyResumeSession);
            driver.switchTo().frame(elmntiFrame);
            waitForSeconds(3);
            waitForElement(elmntBTBimage);
            isverified = verifyElement(elmntBTBimage);
            waitForElement(elmntBTBSmileimg);
            isverified = verifyElement(elmntBTBSmileimg);
            waitForElement(elmntYourProgressHeader);
            isverified = verifyElement(elmntYourProgressHeader);
            waitForElement(elmntContinueSession);
            isverified = verifyElement(elmntContinueSession);
            waitForElement(elmntUpsetandDisappointments);
            isverified = verifyElement(elmntUpsetandDisappointments);
            waitForElement(elmntNonethissession);
            isverified = verifyElement(elmntNonethissession);
            waitForSeconds(2);
            driver.switchTo().defaultContent();
            waitForElement(elmntclosebutton);
            click(elmntclosebutton);
            waitForElement(verifyBTBHeadLines);
            isverified = verifyElement(verifyBTBHeadLines);
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

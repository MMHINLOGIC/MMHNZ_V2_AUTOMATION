package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PhoneAppointmentSettingPage extends BasePage {

    public PhoneAppointmentSettingPage(WebDriver driver) {
        super(driver);
    }

//        @FindAll({
//            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"), //Desktop View
//            @FindBy(how = How.XPATH, using = " //h1[contains(text(),'Welcome,')]//span[contains(text(),'Steve!')]"),
//    })
//    protected WebElement txtWelcome;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Gp2White')]")
    })
    protected WebElement txtProviderPortalWelcomePage;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    protected WebElement elmtMMHLogo;
    @FindBy(xpath = "//span[contains(text(),'Appointment Settings')]")
    protected WebElement elmtAppointmentSettings;
    @FindBy(xpath = "(//span[contains(text(),'Appointments')])[2]")
    protected WebElement elmtAppointments;
    @FindBy (how = How.XPATH, using = "//span[text()='Systems Menu']")
    protected WebElement elmntSystemMenu;
    @FindBy(xpath = "//span[contains(text(),'Systems Menu')]/following::mat-icon[contains(@class,'mat-icon notranslate dd')]")
    protected WebElement elmtSystemsMenu;
    @FindBy(how = How.XPATH, using = "//div[text()='Phone Appointment Settings']")
    protected WebElement elmntPhoneAppointmentSetting;
    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Phone Appointment Settings')]")
    protected WebElement elmntPhoneAppointmentSettingHeader;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit')]")
    protected WebElement elmntPhoneAppointmentSettingEditButton;
    @FindBy(how = How.XPATH, using = "//mat-select[@role='combobox']")
    protected WebElement elmntPhoneAppointmentSettingHealthcentre;
    protected String elmntPhoneAppoinmentHealthCentre = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Automation1_Loc1')]//preceding::input[@aria-checked='true']")
    protected WebElement elmntPhoneAppointmentAutomationLoc1;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Automation1_Loc1')]//preceding::input[@aria-checked='false']")
    protected WebElement verifyPhoneAppointmentAutomationLocation;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc2')]//preceding::input[@aria-checked='true'])[2]")
    protected WebElement elmntPhoneAppointmentAutomationLocation2;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Automation1_Loc2')]//preceding::input[@aria-checked='false']")
    protected WebElement verifyPhoneAppointmentAutomationLocation2;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc1')]//following::input[@name='rules0'])[1]")
    protected WebElement clickVM03LocationRule1;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc1')]//following::input[@name='rules0'])[2]")
    protected WebElement clickVM03LocationRule2;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc2')]//following::input[@name='rules1'])[1]")
    protected WebElement clickVM03Location2Rule1;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc2')]//following::input[@name='rules1'])[1]")
    protected WebElement clickVM03Location2Rule2;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc1')]//following::textarea)[1]")
    protected WebElement EnterVM03LocationTextValue;
    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Automation1_Loc2')]//following::textarea)[1]")
    protected WebElement EnterVM03Location2TextValue;
    @FindBy(how = How.XPATH, using = " //span[contains(text(),'Save')] ")
    protected WebElement ClickSaveButton;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Practice')]//preceding::input[@name='phnecallInitiation0'])[1]")
    protected WebElement clickAutomationLoc1LocationPraticeRadioButton;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Practice')]//preceding::input[@name='phnecallInitiation1'])[1]")
    protected WebElement clickAutomationLocation2PraticeRadioButton;

    @FindBy(how = How.XPATH, using = " (//div[contains(text(),'Patient')]//preceding::input[@name='phnecallInitiation0'])[2]")
    protected WebElement clickVM03LocationPatientRadioButton;

    @FindBy(how = How.XPATH, using = "(//div[contains(text(),'Patient')]//preceding::input[@name='phnecallInitiation1'])[2]")
    protected WebElement clickVM03Location2PatientRadioButton;

    @FindBy(xpath = "(//span[contains(text(),'Setup Modules')]//following::mat-icon)[1]")
    protected WebElement elmtSetupModules;

    @FindBy(xpath = "//span[contains(text(),'Repeat Prescriptions')]")
    protected WebElement elmtRepeatScriptSettings;

    public boolean  navigateToProviderHomepage() {
        boolean blResult = false;
        try{

            if (isElementDisplayed(txtProviderPortalWelcomePage)) {
                verifyElement(txtProviderPortalWelcomePage);
                waitForSeconds(3);
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                waitForSeconds(3);
                blResult = verifyElement(txtProviderPortalWelcomePage);
            }
            if (!isElementDisplayed(txtProviderPortalWelcomePage)){
                focusWindow(1);
                System.out.println("Successfully switch to doctor portal");
                waitForElement(elmtMMHLogo);
                waitForElementClickable(elmtMMHLogo);
                jsClick(elmtMMHLogo);
                System.out.println("Successfully click Logo");
                waitForSeconds(3);
                blResult=verifyElement(txtProviderPortalWelcomePage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickSetupModule() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSetupModules);
            waitForSeconds(2);
            waitForElementClickable(elmtSetupModules);
            System.out.println("Systems Menu is available to click");
            jsClick(elmtSetupModules);
            jsScrollIntoView(elmtRepeatScriptSettings);
            System.out.println("scrolled ");
            takeScreenshot(driver);
            if (!verifyElement(elmtRepeatScriptSettings)){
                click(elmtSetupModules);
            }
            jsScrollIntoView(elmtRepeatScriptSettings);
            blResult = verifyElement(elmtRepeatScriptSettings);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean clickSystemMenu() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSystemsMenu);
            waitForSeconds(2);
            waitForElementClickable(elmtSystemsMenu);
            System.out.println("Systems Menu is available to click");
            jsClick(elmtSystemsMenu);
//            jsScrollIntoView(elmtRepeatScriptSettings);
            System.out.println("scrolled ");
            if (!verifyElement(elmtAppointmentSettings)){
                click(elmntSystemMenu);
            }
            jsScrollIntoView(elmtAppointmentSettings);
            blResult = verifyElement(elmtAppointmentSettings);
        } catch (Exception e) {
            System.out.println("Failed to click System Menu >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean clickPhoneAppointmentSetting() {
        boolean blresult = false;
        try {
            jsScrollIntoView(elmtAppointments);
            waitForElement(elmtAppointments);
            click(elmtAppointments);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntPhoneAppointmentSetting);
            waitForElement(elmntPhoneAppointmentSetting);
            jsClick(elmntPhoneAppointmentSetting);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntPhoneAppointmentSettingHeader);
            verifyElement(elmntPhoneAppointmentSettingHeader);
            jsScrollIntoView(elmntPhoneAppointmentSettingEditButton);
            waitForElementClickable(elmntPhoneAppointmentSettingEditButton);
            jsClick(elmntPhoneAppointmentSettingEditButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            System.out.println("Successfull see the Appointment Setting");
            waitForElement(elmntPhoneAppointmentSettingHeader);
            blresult = verifyElement(elmntPhoneAppointmentSettingHeader);
        } catch (Exception e) {

        }
        return blresult;
    }

    public boolean clickPhoneAppointmentSettingHealthCenter(List<String> Strdata) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntPhoneAppointmentSettingHealthcentre);
            jsClick(elmntPhoneAppointmentSettingHealthcentre);
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntPhoneAppoinmentHealthCentre.replace("<<REPLACEMENT>>",TestDataUtil.getValue(Strdata.get(0)))));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            mouseClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmntPhoneAppointmentSettingHealthcentre);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickPhoneAppointmentSettingAutomationLoc1checkbox() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
         if(verifyElement(elmntPhoneAppointmentAutomationLoc1)){
             System.out.println("AlreadyCheck box checked");
             blresult=true;
         }
         if(!verifyElement(elmntPhoneAppointmentAutomationLoc1)){
             waitForElement(verifyPhoneAppointmentAutomationLocation);
             jsClick(verifyPhoneAppointmentAutomationLocation);
             verifyElement(elmntPhoneAppointmentAutomationLoc1);
             blresult=true;
         }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }


    public boolean clickPhoneAppointmentSettingAutomationLocation2checkbox() {
        boolean blresult = false;
        try {
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            if(verifyElement(elmntPhoneAppointmentAutomationLocation2)){
                System.out.println("AlreadyCheck box checked");
                blresult=true;
            }
            if(!verifyElement(elmntPhoneAppointmentAutomationLocation2)){
                waitForElement(verifyPhoneAppointmentAutomationLocation2);
                jsClick(verifyPhoneAppointmentAutomationLocation2);
                verifyElement(elmntPhoneAppointmentAutomationLocation2);
                blresult=true;
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }
    public boolean clickVM03LocationRule1RadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElement(clickVM03LocationRule1);
            jsClick(clickVM03LocationRule1);
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean clickVM03LocationRule2RadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElement(clickVM03LocationRule2);
            mouseClick(clickVM03LocationRule2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=verifyElement(clickVM03LocationRule2);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }


    public boolean clickVM03Location2Rule1RadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickVM03Location2Rule1);
            jsClick(clickVM03Location2Rule1);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=verifyElement(clickVM03Location2Rule1);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickVM03Location2Rule2RadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickVM03Location2Rule2);
            jsClick(clickVM03Location2Rule2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=verifyElement(clickVM03Location2Rule2);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }
    public boolean clickAutomationLocation1PraticeRadioButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickAutomationLoc1LocationPraticeRadioButton);
            jsClick(clickAutomationLoc1LocationPraticeRadioButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=verifyElement(clickAutomationLoc1LocationPraticeRadioButton);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }


    public boolean EnterAutomationLoc1textbox(String textboxdata) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(EnterVM03LocationTextValue);
            enterValue(EnterVM03LocationTextValue, textboxdata);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean EnterVM03Location2textbox(String textboxdata) {
        boolean blresult = false;
        try {
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            jsScrollIntoView(EnterVM03Location2TextValue);
            waitForElement(EnterVM03Location2TextValue);
            jsClick(EnterVM03Location2TextValue);
enterValue(EnterVM03Location2TextValue,textboxdata);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));

            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickSaveButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(ClickSaveButton);
            jsClick(ClickSaveButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean clickAutomationLocation2PraticeRadioButton() {
        boolean blresult = false;
        try {
            waitForElement(clickAutomationLocation2PraticeRadioButton);
            jsClick(clickAutomationLocation2PraticeRadioButton);
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickVM03LocationPatientRadioButton() {
        boolean blresult = false;
        try {
            waitForElement(clickVM03LocationPatientRadioButton);
            jsClick(clickVM03LocationPatientRadioButton);
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }

    public boolean clickVM03Location2PatientRadioButton() {
        boolean blresult = false;
        try {
            waitForElement(clickVM03Location2PatientRadioButton);
            jsClick(clickVM03Location2PatientRadioButton);
            blresult=true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;

    }



}

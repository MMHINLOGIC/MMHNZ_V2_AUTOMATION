package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlternativeProviderPage extends BasePage {
    public AlternativeProviderPage(WebDriver driver) {
        super(driver);
    }

    @FindAll({
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome,')]//span[contains(text(),' Timprefer!')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Gp2White')]"),
            @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Welcome')]//span[contains(text(),'Barry')]")
    })
    protected WebElement txtProviderPortalWelcomePage;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashboard;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(xpath = "//span[contains(text(),'Setup Modules')]")
    protected WebElement elmtSetupModules;

    @FindBy (how = How.XPATH, using = "//span[text()='Appointments']")
    protected WebElement elmntAppointments;

    @FindBy(xpath = "//span[text()='Alternative Appointment Providers']")
    protected WebElement elmtAlternativeAppointmentProvider;

    @FindBy(xpath = "//span[contains(text(),'Appointment Reasons')]")
    protected WebElement elmtAppointmentReasons;

    @FindBy(xpath = "//span[contains(text(),'Pre Screening Questionnaire')]")
    protected WebElement elmtPreScreeningQuestionnaire;

    @FindBy(xpath = "//h1[text()='Alternative Appointment Providers']")
    protected WebElement elmtAlternativeAppointmentProviderHeader;

    @FindBy(xpath = "//h1[contains(text(),'Appointment Reasons')] ")
    protected WebElement elmtAppointmentReasonHeader;

    @FindBy(xpath = "//h1[contains(text(),'Pre Screening Questionnaire')] ")
    protected WebElement elmtPreScreeningQuestionnaireHeader;

    @FindBy(xpath = "//mat-select[@role='combobox']")
    protected WebElement elmtHealthcentre;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    protected WebElement elmtAppointmentReasonHealthcentre;

    protected String elmntHealthCentreDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    protected String elmntAppointmentReasonHealthCentreDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[1]").toString();

    @FindBy(xpath = "//a[text()='EDIT']")
    protected WebElement elmtEditButton;

    @FindBy(xpath = "(//img[@mattooltip='Edit'])[1]")
    protected WebElement verifyEditButton;

    @FindBy(xpath = "(//img[@mattooltip='Delete'])[1]")
    protected WebElement verifyDeleteButton;

    @FindBy(xpath = " //span[contains(text(),'CANCEL')]")
    protected WebElement verifycancelButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement verifysaveButton;

    @FindBy(xpath = "//h3[contains(text(),'Alternative Appointment Provider Details')]")
    protected WebElement verifyheader;

    @FindBy(xpath = "(//span[contains(text(),'Edit')])[2]")
    protected WebElement elmtEdit;

    @FindBy(xpath = "//div[contains(text(),'Enable Alternative Appointment Provider')]")
    protected WebElement verifyAlternativeAppointmentProvider;

    @FindBy(xpath = "(//mat-radio-group[@formcontrolname='AlternativeProiderIsEnable']//following::label)[1]")
    protected WebElement elmntAlternativeProiderIsEnable;
    @FindBy(xpath = "(//mat-radio-group[@formcontrolname='AlternativeProiderIsEnable']//following::label)[2]")
    protected WebElement elmntAlternativeProiderIsDisable;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement verifySaveButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement clickSaveButton;

    @FindBy(xpath = "//button[text()=' Back ']")
    protected WebElement verifyBackButton;

    @FindBy(xpath = "//p[text()='Name : CareHQ']")
    protected WebElement verifyName;




    @FindBy(xpath = "//p[text()='Changes saved successfully']")
    protected WebElement clickChangessavedsuccessfully;

    public boolean clickAlternativeAppointmentProviders() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            click(elmntDashboard);
            waitForSeconds(3);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSetupModules);
            waitForSeconds(2);
            waitForElementClickable(elmtSetupModules);
            jsClick(elmtSetupModules);
            jsScrollIntoView(elmtAlternativeAppointmentProvider);
            verifyElement(elmtAlternativeAppointmentProvider);
            click(elmtAlternativeAppointmentProvider);
            jsScrollIntoView(elmtAlternativeAppointmentProviderHeader);
            blResult = verifyElement(elmtAlternativeAppointmentProviderHeader);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickAppointmentReason() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
//            waitForElement(elmntDashboard);
            click(elmntDashboard);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSetupModules);
            waitForSeconds(2);
            waitForElementClickable(elmtSetupModules);
            jsClick(elmtSetupModules);
            waitForElement(elmntAppointments);
         jsClick(elmntAppointments);
            jsScrollIntoView(elmtAppointmentReasons);
            verifyElement(elmtAppointmentReasons);
            jsClick(elmtAppointmentReasons);
            jsScrollIntoView(elmtAppointmentReasonHeader);
            blResult = verifyElement(elmtAppointmentReasonHeader);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean clickPreScreeningQuestionnaire() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
//            waitForElement(elmntDashboard);
            click(elmntDashboard);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSetupModules);
            waitForSeconds(2);
            waitForElementClickable(elmtSetupModules);
            jsClick(elmtSetupModules);
            waitForElement(elmntAppointments);
            jsClick(elmntAppointments);
            jsScrollIntoView(elmtPreScreeningQuestionnaire);
            verifyElement(elmtPreScreeningQuestionnaire);
            jsClick(elmtPreScreeningQuestionnaire);
            jsScrollIntoView(elmtPreScreeningQuestionnaireHeader);
            blResult = verifyElement(elmtPreScreeningQuestionnaireHeader);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }



    public boolean clickHealthCenterLocation(String Strdata) {
        boolean blresult = false;
        try {
            waitForSeconds(3);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            waitForElement(elmtHealthcentre);
            mouseClick(elmtHealthcentre);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult =verifyElement(elmtHealthcentre);
        } catch (Exception e) {
            System.out.println("Failed to click Health Center Location >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean clickAppointmentReasonHealthCenterLocation(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmtAppointmentReasonHealthcentre);
            jsClick(elmtAppointmentReasonHealthcentre);
            waitForElementDisappear(driver,By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAppointmentReasonHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre"+elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult =verifyElement(elmtAppointmentReasonHealthcentre);
        } catch (Exception e) {
            System.out.println("Failed to click Health Center Location >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }


    public boolean clickEditButton() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmtEditButton);
            click(elmtEditButton);
            waitForElement(verifyheader);
            blResult = verifyElement(verifyheader);
            waitForElement(elmtEdit);
            blResult=verifyElement(elmtEdit);
            click(elmtEdit);
            waitForElement(verifyheader);
            blResult=verifyElement(verifyheader);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean verifyAllElements() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyEditButton);
            click(verifyEditButton);
            waitForElement(verifyDeleteButton);
            blResult = verifyElement(verifyDeleteButton);
            waitForElement(verifycancelButton);
            blResult=verifyElement(verifycancelButton);
            waitForElement(verifysaveButton);
            blResult=verifyElement(verifysaveButton);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickYesButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyAlternativeAppointmentProvider);
            verifyElement(verifyAlternativeAppointmentProvider);
            waitForElement(verifyName);
            verifyElement(verifyName);
            waitForElement(elmntAlternativeProiderIsEnable);
            jsClick(elmntAlternativeProiderIsEnable);
            waitForElement(verifyBackButton);
            blResult=verifyElement(verifyBackButton);
            waitForElement(verifySaveButton);
            blResult = verifyElement(verifySaveButton);
            waitForElement(clickSaveButton);
            blResult=verifyElement(clickSaveButton);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
    public boolean ClickNoButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyAlternativeAppointmentProvider);
            verifyElement(verifyAlternativeAppointmentProvider);
            waitForElement(verifyName);
            verifyElement(verifyName);
            waitForElement(elmntAlternativeProiderIsDisable);
            click(elmntAlternativeProiderIsDisable);
            waitForElement(verifyBackButton);
            blResult=verifyElement(verifyBackButton);
            waitForElement(verifySaveButton);
            blResult = verifyElement(verifySaveButton);
            waitForElement(clickSaveButton);
            blResult=verifyElement(clickSaveButton);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean ClickSaveButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickSaveButton);
            click(clickSaveButton);
            waitForElement(clickChangessavedsuccessfully);
            blResult=verifyElement(clickChangessavedsuccessfully);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }
}

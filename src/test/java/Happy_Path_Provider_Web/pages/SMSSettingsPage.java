package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SMSSettingsPage extends BasePage {

    public SMSSettingsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashboard;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//span[text()='SMS']")
    protected WebElement elmntSMS;

    @FindBy(xpath = "//span[contains(text(),'Setup Modules')]")
    protected WebElement elmtSecureMessaging;

    @FindBy(how = How.XPATH, using = "//h1[text()='SMS Settings']")
    protected WebElement elmntSMSHeader;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'EDIT')]")
    protected WebElement elmntEditButton;

    protected String clickHealthCentre = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    @FindBy(how = How.XPATH, using = "//mat-select[@name='PracticeManageId']")
    protected WebElement SelectHealthCentre;

    @FindBy(how = How.XPATH, using = "//mat-select[@name='SMSModuleID']")
    protected WebElement SelectModule;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'SAVE')]")
    protected WebElement SelectSaveButton;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@name='IsSMSEnabled']//label)[1]")
    protected WebElement SelectGroupMessageYesButton;

    @FindBy(how = How.XPATH, using = "(//mat-radio-group[@name='IsSMSEnabled']//label)[2]")
    protected WebElement SelectGroupMessageNoButton;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'SMS Settings Updated Successfully.')]")
    protected WebElement VerifySavedSuccessfullyPopup;


    public boolean clickSMS() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
            waitForElement(elmntDashboard);
            click(elmntDashboard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
//            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmtSecureMessaging);
            waitForElement(elmtSecureMessaging);
            click(elmtSecureMessaging);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntSMS);
            waitForElement(elmntSMS);
            click(elmntSMS);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntSMSHeader);
            blResult = verifyElement(elmntSMSHeader);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHealthCentre(String Strdata) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(SelectHealthCentre);
            jsClick(SelectHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntHealthCentre = waitForElement(By.xpath(clickHealthCentre.replace("<<REPLACEMENT>>", Strdata)));
            waitForElement(elmntHealthCentre);
            jsClick(elmntHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(SelectSaveButton);
            blresult = verifyElement(SelectSaveButton);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean selectModule(String Strdata) {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(SelectModule);
            jsClick(SelectModule);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntHealthCentre = waitForElement(By.xpath(clickHealthCentre.replace("<<REPLACEMENT>>", Strdata)));
            waitForElement(elmntHealthCentre);
            jsClick(elmntHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(SelectSaveButton);
            blresult = verifyElement(SelectSaveButton);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean EnableGroupMessaging() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(SelectGroupMessageYesButton);
            click(SelectGroupMessageYesButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(SelectSaveButton);
            blresult = verifyElement(SelectSaveButton);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean DisableGroupMessaging() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(SelectGroupMessageNoButton);
            click(SelectGroupMessageNoButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(SelectSaveButton);
            blresult = verifyElement(SelectSaveButton);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean selectEditButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntEditButton);
            jsClick(elmntEditButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(SelectSaveButton);
            blresult = verifyElement(SelectSaveButton);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean SelectSaveButton() {
        boolean blresult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(SelectSaveButton);
            jsClick(SelectSaveButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(VerifySavedSuccessfullyPopup);
            blresult = verifyElement(VerifySavedSuccessfullyPopup);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

}


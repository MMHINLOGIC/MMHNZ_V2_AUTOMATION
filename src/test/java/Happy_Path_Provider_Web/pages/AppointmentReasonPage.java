package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static cap.utilities.SharedDriver.strExecutionID;

public class AppointmentReasonPage extends BasePage {
    public AppointmentReasonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    protected WebElement elmtAppointmentReasonHealthcentre;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    protected String elmntAppointmentReasonHealthCentreDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[3]").toString();

    @FindBy(xpath = "(//img[@mattooltip='Edit'])[1]")
    protected WebElement verifyEditButton;

    @FindBy(xpath = "(//img[@mattooltip='Delete'])[1]")
    protected WebElement verifyDeleteButton;

    @FindBy(xpath = " //span[contains(text(),'CANCEL')]")
    protected WebElement verifycancelButton;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement verifysaveButton;

    @FindBy(xpath = "//input[@formcontrolname='AppointmentReason']")
    protected WebElement elmtAppointmentReason;

    protected String verifyAppointmentReason = new StringBuilder().append("//p[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    protected String clickAppointmentReasonEditIcon = new StringBuilder().append("(//p[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//following::img)[1]").toString();

    protected String DeleteAppointmentReason = new StringBuilder().append("(//p[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]//following::img)[2]").toString();


    @FindBy(xpath = "//h1[contains(text(),'Appointment Reasons')] ")
    protected WebElement elmtAppointmentReasonHeader;

    @FindBy(xpath = "//p[contains(text(),'New reason added successfully')]")
    protected WebElement elmtSavedPopup;


    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement elmtsaveButton;

    @FindBy(xpath = "(//span[contains(text(),'Update')])[2]")
    protected WebElement elmtUpdateButton;

    @FindBy(xpath = "//p[contains(text(),'Changes Saved Successfully')]")
    protected WebElement elmtUpdatePopup;

    @FindBy(xpath = "//span[contains(text(),'Information')]")
    protected WebElement verifyPopupInformation;

    @FindBy(xpath = "//p[contains(text(),'Do you want to delete Appointment reason?')]")
    protected WebElement verifyPopupContent;

    @FindBy(xpath = "//span[contains(text(),'Yes')]")
    protected WebElement clickYesButton;

    public boolean clickAppointmentReasonHealthCenterLocation(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmtAppointmentReasonHealthcentre);
            jsClick(elmtAppointmentReasonHealthcentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntAppointmentReasonHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre" + elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmtAppointmentReasonHealthcentre);
        } catch (Exception e) {
            System.out.println("Failed to click Health Center Location >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }


    public boolean verifyAllElements() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyEditButton);
            verifyElement(verifyEditButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElement(verifyDeleteButton);
            blResult = verifyElement(verifyDeleteButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElement(verifycancelButton);
            blResult = verifyElement(verifycancelButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElement(verifysaveButton);
            blResult = verifyElement(verifysaveButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean EnterAppointmentReason(String Strdata) {
        boolean blresult = false;
        try {
            String Data = Strdata.concat(strExecutionID);
            waitForElement(elmtAppointmentReason);
            jsClick(elmtAppointmentReason);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            enterValue(elmtAppointmentReason, Data);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmtAppointmentReason);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean UpdateAppointmentReason(String Strdata) {
        boolean blresult = false;
        try {
            String Data = Strdata.concat(strExecutionID);
            waitForElement(elmtAppointmentReason);
            jsClick(elmtAppointmentReason);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            enterValue(elmtAppointmentReason, Data);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmtAppointmentReason);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean clickAppointmentReasonEditIcon(String Strdata) {
        boolean blresult = false;
        try {
            WebElement elmntAppointmentReason = waitForElement(By.xpath(clickAppointmentReasonEditIcon.replace("<<REPLACEMENT>>", Strdata)));
            System.out.println("elmntAppointmentReason" + elmntAppointmentReason);
            waitForElement(elmntAppointmentReason);
            jsClick(elmntAppointmentReason);
            blresult = verifyElement(elmtUpdateButton);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }


    public boolean clickSaveButton() {
        boolean blresult = false;
        try {
            waitForElement(elmtsaveButton);
            verifyElement(elmtsaveButton);
            click(elmtsaveButton);
            waitForElement(elmtSavedPopup);
            blresult = verifyElement(elmtSavedPopup);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }


    public boolean clickUpdateButton() {
        boolean blresult = false;
        try {
            waitForElement(elmtUpdateButton);
            verifyElement(elmtUpdateButton);
            click(elmtUpdateButton);
            waitForElement(elmtUpdatePopup);
            blresult = verifyElement(elmtUpdatePopup);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean verifyAppointmentReason(String Strdata) {
        boolean blresult = false;
        try {
            WebElement elmntAppointmentReason = waitForElement(By.xpath(verifyAppointmentReason.replace("<<REPLACEMENT>>", Strdata.concat(strExecutionID))));
            System.out.println("elmntAppointmentReason" + elmntAppointmentReason);
            waitForElement(elmntAppointmentReason);
            blresult = verifyElement(elmntAppointmentReason);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean DeleteAppointmentReason(String Strdata) {
        boolean blresult = false;
        try {

            WebElement elmntAppointmentReason = waitForElement(By.xpath(DeleteAppointmentReason.replace("<<REPLACEMENT>>", Strdata.concat(strExecutionID))));
            System.out.println("elmntAppointmentReason" + elmntAppointmentReason);
            waitForElement(elmntAppointmentReason);
            jsClick(elmntAppointmentReason);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyPopupInformation);
            verifyElement(verifyPopupInformation);
            waitForElement(verifyPopupContent);
            verifyElement(verifyPopupContent);
            waitForElement(clickYesButton);
            click(clickYesButton);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmtAppointmentReason);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return blresult;
    }


}

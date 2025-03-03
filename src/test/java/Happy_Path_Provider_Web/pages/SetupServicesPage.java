package java.Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SetupServicesPage extends BasePage {
    public SetupServicesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Add New Service')]/i")
    protected WebElement elmntAddNewService;

    @FindBy(xpath = "//h1[contains(text(),'Setup Services')]")
    protected WebElement txtSetupServiceHeader;

    @FindBy(xpath = "//p[contains(text(),'Service Added Successfully')]")
    protected WebElement txtServiceAddedSuccessfullyPopup;


    @FindBy(xpath = "//mat-label[text()='Health centre']//following::mat-select")
    protected WebElement elmntHealthCentre;

    public String txtHealthCentredropdown = new StringBuilder()
            .append("(//span[contains(text(),'")
            .append("<<NAME>>")
            .append("')])[1]").toString();

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(xpath = "//mat-select[@formcontrolname='ServiceCategory']")
    protected WebElement elmntServiceCategory;

    @FindBy(xpath = "//input[@formcontrolname='ServiceName']")
    protected WebElement elmntServiceName;

    @FindBy(xpath = "//input[@formcontrolname='ServiceCode']")
    protected WebElement elmntServiceCode;

    @FindBy(xpath = "//label[text()='Clinical ']")
    protected WebElement elmntClinicalRadioButton;

    @FindBy(xpath = "//label[text()='Non Clinical']")
    protected WebElement elmntNonClinicalRadioButton;

    @FindBy(xpath = "//label[contains(text(),'Staff')]")
    protected WebElement elmntAppliesToRadioButton;

    @FindBy(xpath = "//input[@name='selectedRole']//following::label[text()='Clinical Staff']")
    protected WebElement elmntAppliesToRadioButtonclickClinicalstaff;

    @FindBy(xpath = "//label[contains(text(),'Patient ')]")
    protected WebElement elmntAppliesToPatientRadioButton;


//    @FindBy(xpath = "(//input[@name='LocationName'])[1]")
//    protected WebElement elmntRecipientLocationCheckbox;

    @FindAll({
            @FindBy(how = How.XPATH, using = "//label[text()='Automation1_Loc1 ']"),
            @FindBy(how = How.XPATH, using = "//label[text()='VM07 Loc1 Evo Prod ']")

    })
    protected WebElement elmntRecipientLocationCheckbox;

    @FindBy(xpath = "(//mat-select[@name='staffRoles'])[1]")
    protected WebElement elmntRecipientRole;

//    @FindBy(xpath = "(//span[contains(text(),'Allow Sender to select Recipient Role')])[1]")
//    protected WebElement txtRecipientRoledropdown;


    @FindAll({
            @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Allow Sender to select Recipient Role')])[1]"),
            @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Allow Patient to select Recipient Role')])[1]")

    })
    protected WebElement txtRecipientRoledropdown;

    @FindBy(xpath = "(//mat-select[@name='staffDefaults'])[1]")
    protected WebElement elmntSelectRole;

    @FindBy(xpath = "(//span[contains(text(),' Allow Patient to select Recipient – No default ')])[1]")
    protected WebElement txtSelectRoledropdown;

    @FindBy(xpath = "//mat-radio-group[@formcontrolname='RestrictDefaultLocation']//label[text()='No']")
    protected WebElement elmntRestrictDefaultLocationNoRadioButton;

    @FindBy(xpath = "//mat-radio-group[@formcontrolname='AllowReplyFromPatients']//label[text()='Yes']")
    protected WebElement elmntAllowreplyfrompatientsYesRadioButton;


    @FindBy(xpath = "//mat-radio-group[@formcontrolname='AllowReplyFromPatients']//label[text()='No']")
    protected WebElement elmntAllowreplyfrompatientsNoRadioButton;

    @FindBy(xpath = "//textarea[@formcontrolname='Description']")
    protected WebElement elmntDescriptionTextbox;

    @FindBy(xpath = "//mat-radio-group[@formcontrolname='IsChargeable']//label[text()='No']")
    protected WebElement elmntIsChargeableNoRadioButton;

    @FindBy(xpath = "//textarea[@formcontrolname='TermsConditions']")
    protected WebElement elmntTeamsandconditionTextbox;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement elmntSaveButton;

    @FindBy(xpath = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashboard;

    public boolean AddNewServices() {
        boolean blResult = false;
        try {
            waitForElement(elmntAddNewService);
            jsClick(elmntAddNewService);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectHealthCentre(String strName) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntHealthCentre);
            jsClick(elmntHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            WebElement element = driver.findElement(By.xpath(txtHealthCentredropdown.replace("<<NAME>>", strName)));
            System.out.printf(">>>>>>>>>>" + element);
            waitForElement(element);
            jsClick(element);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtSetupServiceHeader);
            takeScreenshot(driver);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {

            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectServiceCategory(String strName) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntServiceCategory);
            jsClick(elmntServiceCategory);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement element = driver.findElement(By.xpath(txtHealthCentredropdown.replace("<<NAME>>", strName)));
            System.out.printf(">>>>>>>>>>" + element);
            waitForElement(element);
            mouseClick(element);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtSetupServiceHeader);
            takeScreenshot(driver);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectServiceName(String strName) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntServiceName);
            click(elmntServiceName);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            enterValue(elmntServiceName, strName);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean SelectServiceCode(String strName) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntServiceCode);
            click(elmntServiceCode);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            enterValue(elmntServiceCode, strName);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectServiceInitiatedByClinicalRadioButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntClinicalRadioButton);
            jsClick(elmntClinicalRadioButton);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectServiceInitiatedByNonClinicalRadioButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntNonClinicalRadioButton);
            jsClick(elmntNonClinicalRadioButton);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectAppliesToStaffRadioButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppliesToRadioButton);
            jsClick(elmntAppliesToRadioButton);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectAppliesToStaffRadioButtonClickClinicalstaff() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppliesToRadioButtonclickClinicalstaff);
            jsClick(elmntAppliesToRadioButtonclickClinicalstaff);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectRecipientLocation() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntRecipientLocationCheckbox);
            jsClick(elmntRecipientLocationCheckbox);
            waitForElement(elmntRecipientRole);
            jsClick(elmntRecipientRole);
            waitForElement(txtRecipientRoledropdown);
            mouseClick(txtRecipientRoledropdown);
            waitForElement(elmntSelectRole);
            jsClick(elmntSelectRole);
            waitForElement(txtSelectRoledropdown);
            mouseClick(txtSelectRoledropdown);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectRestricttoPatientdefaultlocationNoRadioButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntRestrictDefaultLocationNoRadioButton);
            jsClick(elmntRestrictDefaultLocationNoRadioButton);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectAllowreplyfrompatientsYesRadioButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAllowreplyfrompatientsYesRadioButton);
            jsClick(elmntAllowreplyfrompatientsYesRadioButton);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectAllowreplyfrompatientsNoRadioButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAllowreplyfrompatientsNoRadioButton);
            jsClick(elmntAllowreplyfrompatientsNoRadioButton);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean EnterDescriptionValue(String strName) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElement(elmntDescriptionTextbox);
            enterValue(elmntDescriptionTextbox, strName);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectIsChargeablaRadioButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntIsChargeableNoRadioButton);
            jsClick(elmntIsChargeableNoRadioButton);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean EnterTeamsandconditionsValue(String strName) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntTeamsandconditionTextbox);
            enterValue(elmntTeamsandconditionTextbox, strName);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectSaveButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntSaveButton);
            jsScrollIntoView(elmntSaveButton);
            jsClick(elmntSaveButton);
            waitForElement(txtServiceAddedSuccessfullyPopup);
            blResult = verifyElement(txtServiceAddedSuccessfullyPopup);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean SelectAppliesToPatientRadioButton() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(elmntAppliesToPatientRadioButton);
            jsClick(elmntAppliesToPatientRadioButton);
            waitForElement(txtSetupServiceHeader);
            blResult = verifyElement(txtSetupServiceHeader);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean selectHealthcentre() {
        boolean re = false;

        return true;

    }
}

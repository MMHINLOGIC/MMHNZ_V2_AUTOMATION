package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static cap.utilities.DateUtil.getDate;

public class ManageProvidersPage extends BasePage {

    public ManageProvidersPage(WebDriver driver) {
        super(driver);

    }

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Setup Practice')]")
    protected WebElement clickSetupPracticeButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Manage Providers')]")
    protected WebElement clickManageProvidersButton;

    @FindBy(how = How.XPATH, using = "//h1[contains(text(),'Manage Providers')]")
    protected WebElement verifyManageProvidersHeader;

    @FindBy(how = How.XPATH, using = "//input[@formcontrolname='searchStaff']")
    protected WebElement elmntSearchTextBox;

    protected String strMyAppointmentContentLocator = new StringBuilder()
            .append("//td[contains(text(),'")
            .append("<<REPLACEMENT1>>").append("')]//following::td[contains(text(),'")
            .append("<<REPLACEMENT2>>").append("')]//following::td//following::td[contains(text(),'")
            .append("<<REPLACEMENT3>>").append("')]//following::td//i").toString();

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Nurse')]")
    protected WebElement elmntProviderType;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit provider type')]")
    protected WebElement verifyEditProviderTypeHeader;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'Update')])[2]")
    protected WebElement clickUpdateButton;


    @FindBy(how = How.XPATH, using = "//p[contains(text(),'provider type updated successfully')]")
    protected WebElement verifyupdatesuccessfullyPopup;


    //td[contains(text(),'Gp2white4')]//following::td[contains(text(),'456')]//following::td//following::td[contains(text(),'Doctor')]//following::td//i


    public boolean clickSetupPracticeButton() {
        boolean blresult = false;
        try {
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickSetupPracticeButton);
            jsClick(clickSetupPracticeButton);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickManageProvidersButton);
            jsClick(clickManageProvidersButton);
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyManageProvidersHeader);
            blresult = verifyElement(verifyManageProvidersHeader);
        } catch (Exception e) {
            System.out.println("Failed to click Appointment Button >>> :: ");
        }
        return blresult;
    }

    public boolean selectSearchTextBox(String strdata) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            enterValue(elmntSearchTextBox, strdata);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blResult = verifyElement(elmntSearchTextBox);
        } catch (Exception e) {
            System.out.println("Failed to select Search TextBox >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean VerifyManageProvidersTableData(List<String> lstDetails) {
        boolean blResult = false;
        try {
            waitForSeconds(3);
            WebElement elmntManageProvidersTableData = waitForElementFewSeconds(By.xpath(strMyAppointmentContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(4)))));

            waitForElement(elmntManageProvidersTableData);
            verifyElement(elmntManageProvidersTableData);
            jsClick(elmntManageProvidersTableData);
            blResult = true;
        } catch (Exception e) {
            System.out.println("Failed to Verify MyAppointment Table Data >>> :: ");
            e.printStackTrace();
        }

        return blResult;
    }

    public boolean clickProviderTypeValue() {
        boolean blResult = false;
        try {
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(verifyEditProviderTypeHeader);
            verifyElement(verifyEditProviderTypeHeader);
            waitForElement(elmntProviderType);
            jsClick(elmntProviderType);
            waitForElement(clickUpdateButton);
            blResult = verifyElement(clickUpdateButton);
        } catch (Exception e) {
            System.out.println("Failed to select Search TextBox >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean clickUpdateButton() {
        boolean blResult = false;
        try {
waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForElement(clickUpdateButton);
            click(clickUpdateButton);
            waitForElement(verifyupdatesuccessfullyPopup);
            blResult = verifyElement(verifyupdatesuccessfullyPopup);
        } catch (Exception e) {
            System.out.println("Failed to select Search TextBox >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

    public boolean VerifyManageProvidersUpdateData(List<String> lstDetails) {
        boolean blResult = false;
        try {      waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(2);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntManageProvidersTableData = waitForElementFewSeconds(By.xpath(strMyAppointmentContentLocator
                    .replace("<<REPLACEMENT1>>", TestDataUtil.getValue(lstDetails.get(2)))
                    .replace("<<REPLACEMENT2>>", TestDataUtil.getValue(lstDetails.get(3)))
                    .replace("<<REPLACEMENT3>>", TestDataUtil.getValue(lstDetails.get(4)))));

            waitForElement(elmntManageProvidersTableData);
            verifyElement(elmntManageProvidersTableData);

            blResult = true;
        } catch (Exception e) {
            System.out.println("Failed to Verify MyAppointment Table Data >>> :: ");
            e.printStackTrace();
        }

        return blResult;
    }
}

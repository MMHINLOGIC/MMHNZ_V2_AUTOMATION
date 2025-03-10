package Happy_Path_Provider_Web.pages;

import cap.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PreScreeningQuestionnairePage extends BasePage {

    public PreScreeningQuestionnairePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
    protected WebElement elmntDashboard;

    @FindBy(xpath = "//span[contains(text(),'Setup Modules')]")
    protected WebElement elmtSetupModules;

    @FindBy(xpath = "//span[contains(text(),'Pre Screening Questionnaire')]")
    protected WebElement elmtPreScreeningQuestionnaire;

    @FindBy(xpath = "//h1[contains(text(),'Pre Screening Questionnaire')] ")
    protected WebElement elmtPreScreeningQuestionnaireHeader;

    @FindBy(how = How.XPATH, using = "//span[text()='Appointments']")
    protected WebElement elmntAppointments;

    protected String elmntSpinner = "//mat-progress-spinner[@role='progressbar']";

    @FindBy(xpath = "//mat-select[@formcontrolname='healthCenter']")
    protected WebElement elmtHealthcentre;

    @FindBy(xpath = "//mat-select[@formcontrolname='location']")
    protected WebElement elmtLocation;


    protected String elmntPreScreenQuesHealthCentreDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    protected String elmntPreScreenQuesLocationDrop = new StringBuilder().append("(//span[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')])[2]").toString();

    @FindBy(xpath = "(//div[@class='ProseMirror']//p)[2]")
    protected WebElement elmtWriteYourQuestion;


    @FindBy(xpath = "//span[contains(text(),'Save')]")
    protected WebElement elmtSaveButton;

    @FindBy(xpath = "//p[contains(text(),'Questionnaire saved successfully.')]")
    protected WebElement elmtQuestionnairesavedsuccessfullyPopup;

    public boolean clickPreScreeningQuestionnaire() {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            jsScrollIntoView(elmntDashboard);
//            waitForElement(elmntDashboard);
            click(elmntDashboard);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
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

    public boolean clickAppointmentReasonHealthCenterLocation(String Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmtHealthcentre);
            jsClick(elmtHealthcentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntPreScreenQuesHealthCentreDrop.replace("<<REPLACEMENT>>", Strdata)));
            System.out.printf("elmntEntriesFromHealthCentre" + elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmtHealthcentre);
        } catch (Exception e) {
            System.out.println("Failed to click Health Center Location >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean clickPreScreenQuesLocation(List<String> Strdata) {
        boolean blresult = false;
        try {
            waitForElement(elmtLocation);
            jsClick(elmtLocation);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            WebElement elmntEntriesFromHealthCentre = waitForElement(By.xpath(elmntPreScreenQuesLocationDrop.replace("<<REPLACEMENT>>", Strdata.get(0))));
            System.out.printf("elmntEntriesFromHealthCentre" + elmntEntriesFromHealthCentre);
            jsClick(elmntEntriesFromHealthCentre);
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            blresult = verifyElement(elmtLocation);
        } catch (Exception e) {
            System.out.println("Failed to click Health Center Location >>> :: ");
            e.printStackTrace();

        }
        return blresult;
    }

    public boolean EnterPreScreeningInformation(List<String> data) {
        boolean blResult = false;
        try {
            waitForElementDisappear(driver, By.xpath(elmntSpinner));
            waitForSeconds(3);
            waitForElement(elmtWriteYourQuestion);
            click(elmtWriteYourQuestion);
            waitForSeconds(3);
            driver.switchTo().activeElement().sendKeys(data.get(1));
            waitForElement(elmtSaveButton);
            click(elmtSaveButton);
            waitForElement(elmtQuestionnairesavedsuccessfullyPopup);
            blResult = verifyElement(elmtQuestionnairesavedsuccessfullyPopup);
        } catch (Exception e) {
            System.out.println("Failed to click Secure Messages >>> :: ");
            e.printStackTrace();
        }
        return blResult;
    }

}

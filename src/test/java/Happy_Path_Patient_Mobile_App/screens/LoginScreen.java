package Happy_Path_Patient_Mobile_App.screens;

import cap.common.BaseScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    public LoginScreen(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.Image[@text='loginLogo']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[1]/XCUIElementTypeImage")
    protected WebElement logoMMH;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='log out outline']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[1]/XCUIElementTypeImage")
    protected WebElement logoSignOut;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='YES']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"main\"]/XCUIElementTypeOther[1]/XCUIElementTypeImage")
    protected WebElement logoSignOutYesButton;

//   (//android.view.View/following::android.widget.Image)[1]

    @AndroidFindBy(xpath = "//android.widget.Image[@content-desc=\"person\"]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"person\"]/following::XCUIElementTypeTextField")
    protected WebElement txtUserName;


    @AndroidFindBy(xpath = "//android.widget.Image[@content-desc=\"key\"]/following-sibling::android.widget.EditText")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"person\"]/following::XCUIElementTypeSecureTextField[@value='Password']")
    protected WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SIGN-IN']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Sign-In\"]")
    protected WebElement btnSignIn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='log out outline']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"log out outline\"]")
    protected WebElement iconLogout;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Are you sure you want to logout?\"]")
    protected WebElement elmntLogoutPopup;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='YES']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Yes\"]")
    protected WebElement btnYes;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Two-step verification']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Two-step verification\"]")
    protected WebElement HeadingTwoStepVerification;


    @AndroidFindBy(xpath = "(//android.widget.EditText)[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Two-step verification\"]")
    protected WebElement EnterVerificationCode1;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Two-step verification\"]")
    protected WebElement EnterVerificationCode2;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Two-step verification\"]")
    protected WebElement EnterVerificationCode3;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[4]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Two-step verification\"]")
    protected WebElement EnterVerificationCode4;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[5]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Two-step verification\"]")
    protected WebElement EnterVerificationCode5;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[6]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Two-step verification\"]")
    protected WebElement EnterVerificationCode6;


    public boolean verifyMMHLoginScreen() {
        boolean blruselts = false;
        waitForSecond(2);
        if (verifyElement(logoMMH)) {
            waitForElement(logoMMH);
            blruselts = true;
        } else {
            waitForElement(logoSignOut);
            verifyElement(logoSignOut);
            click(logoSignOut);
            waitForElement(logoSignOutYesButton);
            verifyElement(logoSignOutYesButton);
            click(logoSignOutYesButton);
            waitForElement(logoMMH);
            blruselts = verifyElement(logoMMH);
        }

        return blruselts;
    }

    public void enterUserName(String strUserName) {
        takeScreenshot(driver);
        waitForElement(txtUserName);
        enterValue(txtUserName, strUserName);

    }

    public void enterPassword(String strPassword) {
        waitForElement(txtPassword);
        enterValue(txtPassword, strPassword);

    }

    public void tapSignIn() {
        waitForElement(btnSignIn);
        click(btnSignIn);
        if (verifyElement(HeadingTwoStepVerification)) {
            System.out.println("Enter OTP Page");
            waitForElement(EnterVerificationCode1);
            EnterVerificationCode1.sendKeys("3");
            waitForSecond(1);
            EnterVerificationCode2.sendKeys("4");
            waitForSecond(1);
            EnterVerificationCode3.sendKeys("5");
            waitForSecond(1);
            EnterVerificationCode4.sendKeys("3");
            waitForSecond(1);
            EnterVerificationCode5.sendKeys("5");
            waitForSecond(1);
            EnterVerificationCode6.sendKeys("1");
        }
    }

    public void tapProviderSignIn() {
        waitForElement(btnSignIn);
        click(btnSignIn);
        waitForSecond(4);
        if (verifyElement(HeadingTwoStepVerification)) {
            waitForElement(EnterVerificationCode1);
            EnterVerificationCode1.sendKeys("3");
            waitForSecond(1);
            EnterVerificationCode2.sendKeys("4");
            waitForSecond(1);
            EnterVerificationCode3.sendKeys("5");
            waitForSecond(1);
            EnterVerificationCode4.sendKeys("3");
            waitForSecond(1);
            EnterVerificationCode5.sendKeys("5");
            waitForSecond(1);
            EnterVerificationCode6.sendKeys("9");
        }
    }


    public boolean verifyMMHLoginScreenForiOS() {
        waitForSecond(2);
        if (verifyElementWithoutWait(iconLogout)) {
            click(iconLogout);
            waitForElement(elmntLogoutPopup);
            click(btnYes);
        }
        waitForElement(logoMMH);
        return verifyElement(logoMMH);
    }
}
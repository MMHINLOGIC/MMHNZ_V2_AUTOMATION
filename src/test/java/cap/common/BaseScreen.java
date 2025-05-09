package java.cap.common;

import Happy_Path_Patient_Mobile_App.DemoScreenContainer;
import cap.helpers.Constants;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

// Static imports for TouchAction wait options and point factory methods.
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class BaseScreen {

    protected final WebDriver driver;
    protected final WebDriverWait wait;
    protected final WebDriverWait invisibleWait;
//    public AndroidDriver<WebElement> androidDriver;

    // Platform name can be set via system property (e.g., "android" or "ios")
    static String strPlatformName = System.getProperty("platformName");

    // Directory path for images (adjust file separator if needed)
    public static String strImageDirectory = System.getProperty("user.dir") + File.separator + "config" + File.separator + "Images" + File.separator;

    // Reference to a container for logging/screenshot purposes (if needed)
    public static DemoScreenContainer pageContainer;

    /**
     * Constructor that initializes the page elements and explicit waits.
     *
     * @param driver the WebDriver (or AppiumDriver) instance
     */
    public BaseScreen(WebDriver driver) {
        // Initialize mobile elements with a 5-second timeout
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
        this.driver = driver;
        // Set explicit waits using Duration rather than integer seconds
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
        invisibleWait = new WebDriverWait(this.driver, Duration.ofSeconds(30));

    }

    /**
     * Helper method to perform a short sleep.
     *
     * @param seconds number of seconds to wait
     */
    public void waitForSecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupted during waitForSecond: " + e.getMessage());
        }
    }



    /**
     * Starts an Android activity.
     *
     * @param strAppPackage the package name of the app
     * @param strAppActivity the activity name to start
     */
    public void startAndroidActivity(String strAppPackage, String strAppActivity) {
        ((StartsActivity) driver).startActivity(new Activity(strAppPackage, strAppActivity));
    }

    /**
     * Hides the mobile keyboard.
     */
    public void hideMobileKeyboard() {
        ((HidesKeyboard) driver).hideKeyboard();
    }

    /**
     * Waits until the given element is visible.
     *
     * @param element the WebElement to wait for
     * @return the visible WebElement
     */
    public WebElement waitForElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Waits until the given element (located by By) is visible.
     *
     * @param by the locator for the element
     * @return the visible WebElement
     */
    public WebElement waitForElement(By by) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /**
     * Waits until the given element is clickable.
     *
     * @param element the WebElement to wait for
     * @return the clickable WebElement
     */
    public WebElement waitForElementClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Clicks on the specified element.
     *
     * @param element the WebElement to click
     * @return true if successful, false otherwise
     */
    public boolean click(WebElement element) {
        try {
            WebElement ele = waitForElement(element);
            ele.click();
            return true;
        } catch (Exception e) {
            System.out.println("Click Element Exception: " + e.getMessage());
            return false;
        }
    }

    /**
     * Clicks on the element located by the given By locator.
     *
     * @param by the locator for the element
     * @return true if successful, false otherwise
     */
    public boolean click(By by) {
        try {
            WebElement ele = waitForElement(by);
            ele.click();
            return true;
        } catch (Exception e) {
            System.out.println("Click Element Exception: " + e.getMessage());
            return false;
        }
    }

    /**
     * Scrolls vertically until the element containing the specified text is in view (Android-specific).
     *
     * @param strTextToScroll the text to scroll to
     */
    public void scrollVerticalIntoView(String strTextToScroll) {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                            ".scrollIntoView(new UiSelector().text(\"" + strTextToScroll + "\"))"));
        } catch (Exception e) {
            System.out.println("Scroll Vertical Exception: " + e.getMessage());
        }
    }

    /**
     * Verifies that the given element is displayed.
     *
     * @param element the WebElement to verify
     * @return true if displayed, false otherwise
     */
    public boolean verifyElement(WebElement element) {
        try {
            return waitForElement(element).isDisplayed();
        } catch (Exception e) {
            System.out.println("Verify Element Exception: " + e.getMessage());
            return false;
        }
    }

    /**
     * Verifies that an element located by the given By locator is displayed.
     *
     * @param by the locator for the element
     * @return true if displayed, false otherwise
     */
    public boolean verifyElement(By by) {
        try {
            return driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     * Verifies the element without using an explicit wait.
     *
     * @param element the WebElement to verify
     * @return true if displayed, false otherwise
     */
    public boolean verifyElementWithoutWait(WebElement element) {
        try {
            if (element.isDisplayed()) {
                waitForSecond(1);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Verify Element Exception: " + e.getMessage());
        }
        return false;
    }

    /**
     * Switches focus to a frame identified by the given element.
     *
     * @param element the frame element
     * @return true if focus is switched, false otherwise
     */
    public boolean focusFrame(WebElement element) {
        waitForSecond(1);
        driver.switchTo().frame(element);
        System.out.println("Frame is focused.");
        return true;
    }

    /**
     * Relaunches the Android app by closing and reactivating it.
     */
    public void reLaunchAppAndroid() {
        ((AndroidDriver) driver).closeApp();
        System.out.println("App terminated.");
        waitForSecond(3);
        ((AndroidDriver) driver).activateApp("managemyhealth.co.nz");
        System.out.println("App relaunched.");
    }

    /**
     * Taps on the screen using the coordinates of the given element.
     *
     * @param element the WebElement whose coordinates are used for tapping
     */
    public void tapCoordinatesByElement(WebElement element) {
        waitForSecond(3);
        int xCoordinate = element.getLocation().x;
        int yCoordinate = element.getLocation().y;
        new TouchAction<>((PerformsTouchActions) driver)
                .tap(PointOption.point(xCoordinate, yCoordinate))
                .perform();
    }

    /**
     * Waits until all elements in the given list are visible.
     *
     * @param elements the list of WebElements
     * @return the list of visible WebElements
     */
    public List<WebElement> waitForElements(List<WebElement> elements) {
        return wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    /**
     * Clears and enters the specified value into the given element.
     *
     * @param element the WebElement to send keys to
     * @param value the value to enter
     * @return true if successful, false otherwise
     */
    public boolean enterValue(WebElement element, String value) {
        try {
            waitForElement(element).click();
            waitForElement(element).clear();
            waitForElement(element).sendKeys(value);
            return true;
        } catch (Exception e) {
            System.out.println("Enter value Exception: " + e.getMessage());
            return false;
        }
    }

    /**
     * Swipes from the bottom to the top of the screen (vertical swipe).
     */
    public void swipeUpToDownUsingDimension() {
        Dimension size = driver.manage().window().getSize();
        int anchor = size.width / 2;
        int startPoint = size.height - 10;
        int endPoint = 10;
        if (strPlatformName.equalsIgnoreCase(Constants.ANDROID)) {
            new TouchAction<>((PerformsTouchActions) driver)
                    .longPress(PointOption.point(anchor, startPoint))
                    .moveTo(PointOption.point(anchor, endPoint))
                    .release()
                    .perform();
        } else if (strPlatformName.equalsIgnoreCase(Constants.IOS)) {
            new TouchAction<>((PerformsTouchActions) driver)
                    .longPress(PointOption.point(anchor, startPoint))
                    .moveTo(PointOption.point(anchor, endPoint))
                    .release()
                    .perform();
        }
    }

    /**
     * Performs a short swipe up gesture.
     */
    public void swipeUpShort() {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.2);
        int startY = (int) (size.height * 0.6);
        int endX = startX;
        int endY = (int) (size.height * 0.2);

        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    /**
     * Performs a swipe up gesture.
     */
    public void swipeUp() {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int startY = (int) (size.height * 0.8);
        int endX = (int) (size.width * 0.2);
        int endY = (int) (size.height * 0.2);

        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    /**
     * Performs a swipe down gesture.
     */
    public void swipeDown() {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.2);
        int startY = (int) (size.height * 0.2);
        int endX = (int) (size.width * 0.5);
        int endY = (int) (size.height * 0.8);

        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    /**
     * Uses JavaScript to swipe down (mobile scroll).
     */
    public void jsSwipeDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);
    }

    /**
     * Uses JavaScript to swipe up (mobile scroll).
     */
    public void jsSwipeUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "up");
        js.executeScript("mobile: scroll", scrollObject);
    }

    /**
     * Performs an iOS swipe gesture using JavaScript.
     */
    public void mobileSwipeScreenIOS() {
        final int ANIMATION_TIME = 200; // ms
        Map<String, String> scrollObject = new HashMap<>();
        scrollObject.put("direction", "left");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            js.executeScript("mobile: swipe", scrollObject);
            Thread.sleep(ANIMATION_TIME); // Allow swipe action to complete
        } catch (Exception e) {
            System.err.println("mobileSwipeScreenIOS() FAILED: " + e.getMessage());
        }
    }

    /**
     * Uses a swipe left gesture via TouchAction (iOS).
     */
    public void jsSwipeLeft() {
        waitForSecond(2);
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.9);
        int endX = (int) (size.width * 0.1);
        int startY = size.height / 2;
        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
    }

    /**
     * Scrolls the screen relative to a given element.
     * <p>
     * Note: The TouchActions class is deprecated in Selenium 4.
     * Consider using TouchAction or the W3C Actions API for new implementations.
     * </p>
     *
     * @param element the element to scroll relative to
     */


    /**
     * For iOS: advances the picker wheel to the next value.
     *
     * @param element the picker wheel element
     */

    /**
     * Takes a screenshot and attaches it to the test scenario.
     *
     * @param driver the WebDriver instance
     */
    public void takeScreenshot(WebDriver driver) {
        try {
            // Assumes that pageContainer.myScenario.attach supports attaching a screenshot as bytes.
            pageContainer.myScenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Attaches a key-value pair to the step log.
     *
     * @param key the key
     * @param value the value
     */
    public void attachStepLog(String key, String value) {
        try {
            pageContainer.printTestDataMap.put(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Taps the screen at the specified coordinates.
     *
     * @param startX the x-coordinate
     * @param startY the y-coordinate
     */
    public void tapByCoordinates(int startX, int startY) {
        try {
            waitForSecond(1);
            new TouchAction<>((PerformsTouchActions) driver)
                    .tap(PointOption.point(startX, startY))
                    .perform();
        } catch (Exception e) {
            System.out.println("Exception in tapByCoordinates: " + e.getMessage());
        }
    }

    /**
     * Enters text using the device keyboard.
     *



    /**
     * Checks if the loop should continue based on the elapsed time.
     *
     * @param milliSec  the maximum duration in milliseconds
     * @param startTime the start time in milliseconds
     * @return true if the elapsed time is less than milliSec, false otherwise
     */
    public boolean exitLoop(int milliSec, long startTime) {
        return (System.currentTimeMillis() - startTime) < milliSec;
    }

    /**
     * Waits for an element to be visible, ignoring stale element exceptions.
     *
     * @param element the WebElement to wait for
     * @return the refreshed, visible WebElement
     */
    public WebElement waitForElementIgnoreStale(WebElement element) {
        return wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
    }

    /**
     * Navigates back. For iOS, performs a swipe-left gesture.
     */
    public void navigateToBack() {
        try {
            String platform = System.getProperty("PLATFORM");
            if (platform != null && platform.equalsIgnoreCase("android")) {
                driver.navigate().back();
            } else if (platform != null && platform.equalsIgnoreCase("ios")) {
                swipeLeftIOS();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Performs a left swipe gesture for iOS.
     */
    public void swipeLeftIOS() {
        waitForSecond(1);
        Dimension size = driver.manage().window().getSize();
        int startY = size.height / 2;
        int startX = (int) (size.width * 0.05);
        int endX = (int) (size.width * 0.90);
        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endX, startY))
                .release()
                .perform();
    }

    /**
     * Waits for an element using FluentWait.
     *
     * @param elementLocator the By locator of the element
     * @return the found WebElement
     */
    public WebElement fluentWaitForElement(By elementLocator) {
        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(80))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        return fluentWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return driver.findElement(elementLocator);
            }
        });
    }

    /**
     * Pushes a file from the local machine to the device.
     *
     * @param strImageName the name of the image file
     */
//    public void pushFileToDevice(String strImageName) {
//        try {
//            File fileToPush = new File(strImageDirectory, strImageName);
//            if (!fileToPush.exists()) {
//                System.err.println("File not found: " + fileToPush.getAbsolutePath());
//                return;
//            }
//            ((AndroidDriver<WebElement>) driver).pushFile("/sdcard/Download/" + strImageName, fileToPush);
//            System.out.println("File pushed to device: " + strImageName);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * Relaunches the iOS app by closing and reactivating it.
     */
//    public void reLaunchAppIOS() {
//        ((AppiumDriver<WebElement>) driver).closeApp();
//        System.out.println("App terminated.");
//        waitForSecond(3);
//        ((AppiumDriver<WebElement>) driver).activateApp("managemyhealth.co.nz");
//        System.out.println("App relaunched.");
//    }

    public void reLaunchAppIOS() {
        ((AndroidDriver) driver).closeApp();
        System.out.println("App terminated.");
        waitForSecond(3);
        ((AndroidDriver) driver).activateApp("managemyhealth.co.nz");
        System.out.println("App relaunched.");
    }
}

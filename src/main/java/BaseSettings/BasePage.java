//package BaseSettings;
//
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class BasePage {
//    public static MobileElement mobileElement;
//
//    public static boolean waitForPresence(AndroidDriver driver, int timeLimitInSeconds, String targetResourceId) {
//
//        try {
//            mobileElement = (MobileElement) driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"" + targetResourceId + "\")");
//            WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);
//            wait.until(ExpectedConditions.visibilityOf(mobileElement));
//            isElementPresent = mobileElement.isDisplayed();
//            return isElementPresent;
//        } catch (Exception e) {
//            isElementPresent = false;
//            System.out.println(e.getMessage());
//            return isElementPresent;
//        }
//    }
//}

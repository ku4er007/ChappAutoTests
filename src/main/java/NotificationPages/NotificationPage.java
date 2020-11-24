package NotificationPages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class NotificationPage extends BaseTestClass {
    public NotificationPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean checkMuteIconOnWorkTab() {
        WebElement muteIconOnWorkInNotificationPage = appiumDriver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Work\"]/android.widget.ImageView\n"));
        return muteIconOnWorkInNotificationPage.isDisplayed();
    }

    public boolean checkMuteIconOnPersonalTab() {
        WebElement muteIconOnPersonalInNotificationPage = appiumDriver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Work\"]/android.widget.ImageView\n"));
        return muteIconOnPersonalInNotificationPage.isDisplayed();
    }
}

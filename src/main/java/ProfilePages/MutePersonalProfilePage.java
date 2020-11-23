package ProfilePages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MutePersonalProfilePage extends BaseTestClass {
    public MutePersonalProfilePage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean checkPageTitle() {
        WebElement mutePageTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Mute Profile')]"));
        return mutePageTitle.isDisplayed();
    }

    public MutePersonalProfilePage clickOnActivationMuteSwitcher() {
        WebElement muteProfileSwitcher = appiumDriver.findElement(By.xpath("//android.widget.Switch[contains(@resource-id,'muteProfileSwitch')]"));
        muteProfileSwitcher.click();
        return this;

    }

    public MutePersonalProfilePage clickOnDoneButton() {
        WebElement doneButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'DONE')]"));
        doneButton.click();
        return this;

    }

    public boolean checkSuccessAlert() {
        WebElement successAlert = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Mute settings updated')]"));
        return successAlert.isDisplayed();

    }

    public MutePersonalProfilePage clickOnBackButton() {
        WebElement backButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
        backButton.click();
        return this;

    }
}

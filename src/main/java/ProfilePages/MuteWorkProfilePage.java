package ProfilePages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MuteWorkProfilePage extends BaseTestClass {
    public MuteWorkProfilePage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public boolean checkPageTitle() {
        WebElement muteWorkPageTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Mute Profile')]"));
        return muteWorkPageTitle.isDisplayed();
    }

    public MuteWorkProfilePage clickOnActivationMuteSwitcher() {
        WebElement muteProfileSwitcher = appiumDriver.findElement(By.xpath("//android.widget.Switch[contains(@resource-id,'muteProfileSwitch')]"));
        muteProfileSwitcher.click();
        return this;

    }

    public MuteWorkProfilePage clickOnDoneButton() {
        WebElement doneButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'DONE')]"));
        doneButton.click();
        return this;

    }

    public boolean checkSuccessAlert() {
        WebElement successAlert = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Mute settings updated')]"));
        return successAlert.isDisplayed();

    }

    public MuteWorkProfilePage clickOnBackButton() {
        WebElement backButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
        backButton.click();
        return this;

    }
}

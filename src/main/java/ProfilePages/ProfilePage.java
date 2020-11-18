package ProfilePages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ProfilePage extends BaseTestClass {
    public ProfilePage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public ProfilePage clickOnAccountManagementButton() {
        WebElement accountManagementButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'profileAccountSection')]"));
        accountManagementButton.click();
        return this;
    }
}

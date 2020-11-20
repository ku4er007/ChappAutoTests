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

    public ProfilePage goToEditPersonalProfileForm() {
        WebElement editPersonalProfileButton = appiumDriver.findElement(By.xpath("//android.widget.LinearLayout[contains(@resource-id,'profileTopContainer')]"));
        editPersonalProfileButton.click();
        return this;
    }

    public boolean checkNewProfileName() {
        WebElement newProfileName = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Константин Дорошенко')]"));
        return newProfileName.isDisplayed();
    }

    public boolean checkNewProfileNameWithoutLastName() {
        WebElement newProfileNameWithoutLastName = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Константин')]"));
        return newProfileNameWithoutLastName.isDisplayed();
    }
}

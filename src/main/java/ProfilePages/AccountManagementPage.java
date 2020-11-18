package ProfilePages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AccountManagementPage {

    public AccountManagementPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public AccountManagementPage clickOnDeleteAccountButton() {
        WebElement deleteAccountButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'deleteAccountBtn')]"));
        deleteAccountButton.click();
        return this;
    }

    public AccountManagementPage clickOnConfirmDeleteAccountButton() {
        WebElement confirmDeleteAccount = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]"));
        confirmDeleteAccount.click();
        return this;
    }
}

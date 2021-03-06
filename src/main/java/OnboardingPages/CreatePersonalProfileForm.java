package OnboardingPages;

import BaseSettingsPages.BaseTestClass;
import BaseSettingsPages.BaseTestClassForCreateNewAccount;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CreatePersonalProfileForm extends BaseTestClassForCreateNewAccount {

    public CreatePersonalProfileForm(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public CreatePersonalProfileForm enterFirstName() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createPersonalEtFirstName')]")).sendKeys(firstPersonalName);
        return this;
    }

    public CreatePersonalProfileForm enterLastName() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createPersonalEtLastName')]")).sendKeys(lastPersonalName);
        return this;
    }

    public CreatePersonalProfileForm clickOnCreateButton() {
        WebElement createButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'createPersonalBtnCreate')]"));
        createButton.click();
        return this;
    }
}

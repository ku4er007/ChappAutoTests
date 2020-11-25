package OnboardingPages;

import BaseSettingsPages.BaseTestClass;
import BaseSettingsPages.BaseTestClassForCreateNewAccount;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CreateWorkProfileForm extends BaseTestClassForCreateNewAccount {

    public CreateWorkProfileForm(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public CreateWorkProfileForm enterFirstName() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtFirstName')]")).sendKeys(firstWorkName);
        return this;
    }

    public CreateWorkProfileForm enterLastName() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtLastName')]")).sendKeys(lastWorkName);
        return this;
    }

    public CreateWorkProfileForm enterCompany() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtCompany')]")).sendKeys(companyWorkName);
        return this;
    }

    public CreateWorkProfileForm enterTitle() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtTitle')]")).sendKeys(titleWorkName);
        return this;
    }

    public CreateWorkProfileForm enterCorrectEmail() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtEmail')]")).sendKeys(emailWork);
        return this;
    }

    public CreateWorkProfileForm clickOnCreateButton() {
        WebElement createButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'createWorkBtnCreate')]"));
        createButton.click();
        return this;
    }

    public CreateWorkProfileForm clickOnSkipButton() {
        WebElement skipButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'createWorkBtnSkip')]"));
        skipButton.click();
        return this;
    }
}

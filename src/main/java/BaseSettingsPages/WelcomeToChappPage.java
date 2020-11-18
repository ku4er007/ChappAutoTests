package BaseSettingsPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WelcomeToChappPage extends BaseTestClass {
    public WelcomeToChappPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WelcomeToChappPage findPageTitle() {
        WebElement pageTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'welcomeTitle')]"));
        pageTitle.isDisplayed();
        return this;
    }

    public WelcomeToChappPage clickOnStartChappingButton() {
        WebElement startChappingButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'welcomeBtnStartChapp')]"));
        startChappingButton.click();
        return this;


    }

    public WelcomeToChappPage clickOnCreateWorkProfile() {
        WebElement startChappingButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'welcomeBtnCreateWorkProfile')]"));
        startChappingButton.click();
        return this;
    }
}

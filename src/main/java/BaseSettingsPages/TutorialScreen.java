package BaseSettingsPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TutorialScreen extends BaseTestClass  {
    public TutorialScreen(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public TutorialScreen waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public TutorialScreen clickOnOKButtonOnAlert() {
        WebElement okButtonOnAlert = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]"));
        okButtonOnAlert.click();
        return this;
    }

    public TutorialScreen clickAllowContactButton() {
        WebElement allowContactButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_button')]"));
        allowContactButton.click();
        return this;
    }

    public TutorialScreen closedTutorialButton() {
        WebElement closedTutorialButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'newChat')]"));
        closedTutorialButton.click();
        return this;
    }
}

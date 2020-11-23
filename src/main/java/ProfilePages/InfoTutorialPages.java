package ProfilePages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class InfoTutorialPages extends BaseTestClass {

    public InfoTutorialPages(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public boolean checkFirstInfoScreenTitle() {
        WebElement firstInfoScreenTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Personal Profile')]"));
        return firstInfoScreenTitle.isDisplayed();
    }

    public InfoTutorialPages clickOnNextButton() {
        WebElement nextButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'infoBtnNext')]"));
        nextButton.click();
        return this;
    }

    public boolean checkSecondInfoScreenTitle() {
        WebElement secondInfoScreenTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Work Profile')]"));
        return secondInfoScreenTitle.isDisplayed();
    }

    public boolean checkThirdInfoScreenTitle() {
        WebElement thirdInfoScreenTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Adding Contacts to each profile')]"));
        return thirdInfoScreenTitle.isDisplayed();
    }

    public InfoTutorialPages clickOnGoItButton() {
        WebElement goItButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'infoGoItTv')]"));
        goItButton.click();
        return this;

    }
}

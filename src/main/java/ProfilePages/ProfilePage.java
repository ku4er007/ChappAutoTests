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

    public ProfilePage goToEditProfileForm() {
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

    public ProfilePage clickOnWorkTab() {
        WebElement workTab = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'WORK')]"));
        workTab.click();
        return this;
    }

    public boolean checkNewWorkProfileName() {
        WebElement newWorkProfileName = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Constantine Doroshenko WORK')]"));
        return newWorkProfileName.isDisplayed();
    }

    public boolean checkNewCompanyAndTitle() {
        WebElement newCompanyAndTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Good specialist at The MindStudios')]"));
        return newCompanyAndTitle.isDisplayed();
    }

    public boolean checkNewEmail() {
        WebElement newEmail = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'k.doroshenko@themindstudios.com')]"));
        return newEmail.isDisplayed();
    }

    public ProfilePage clickOnTermsButton() {
        WebElement termsAndPolicyButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'profileTermsSection')]"));
        termsAndPolicyButton.click();
        return this;

    }

    public boolean checkTermsOfServiceText() {
        WebElement termsOfServiceText = appiumDriver.findElement(By.xpath("//android.view.View[contains(@text,'Terms of Service')]"));
        return termsOfServiceText.isDisplayed();
    }

    public ProfilePage clickOnCloseTermsBrowser() {
        WebElement closedTermsButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'close_button')]"));
        closedTermsButton.click();
        return this;


    }

    public boolean checkPersonalPageTitle() {
        WebElement profilePageTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'PERSONAL')]"));
        return profilePageTitle.isDisplayed();

    }

    public boolean checkWorkPageTitle() {
        WebElement profilePageTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'WORK')]"));
        return profilePageTitle.isDisplayed();

    }
}

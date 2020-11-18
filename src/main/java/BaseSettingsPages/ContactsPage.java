package BaseSettingsPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ContactsPage extends BaseTestClass  {
    public ContactsPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public ContactsPage clickOnShareAppHyperlink() {
        WebElement shareAppHyperlink = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'contactsPagerShareApp')]"));
        shareAppHyperlink.click();
        return this;
    }

    public ContactsPage waitShareMenuTitle() {
        WebElement shareMenuTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'title')]"));
        shareMenuTitle.isDisplayed();
        return this;
    }

    public ContactsPage clickOnInviteContactButton() {
        WebElement inviteButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'contactTvInvite')]"));
        inviteButton.click();
        return this;
    }

    public ContactsPage checkMessageText() {
        WebElement messageText = appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'compose_message_text')]"));
        messageText.isDisplayed();
        return this;
    }

    public ContactsPage clickOnSearchButton() {
        WebElement searchButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'searchContacts')]"));
        searchButton.click();
        return this;
    }

    public ContactsPage enterSearchQuery() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'searchContactsEt')]")).sendKeys("Const");
        return this;
    }

    public ContactsPage checkContactDisplayedaAndClickOnIt() {
        WebElement chappContactName = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'contactNameTv')]"));
        chappContactName.isDisplayed();
        chappContactName.click();
        return this;
    }

    public ContactsPage clickOnBackFromSearchButton() {
        WebElement backFromSearchButton = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'searchContactsIvBack')]"));
        backFromSearchButton.click();
        return this;

    }
}

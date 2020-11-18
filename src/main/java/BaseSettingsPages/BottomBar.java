package BaseSettingsPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class BottomBar extends BaseTestClass  {
    public BottomBar(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public BottomBar clickOnProfileButton() {
        WebElement profileButton = appiumDriver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'mainBottomNavProfile')]"));
        profileButton.click();
        return this;
    }
    public BottomBar clickOnChatsButton() {
        WebElement chatsButton = appiumDriver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'mainBottomNavChats')]"));
        chatsButton.click();
        return this;
    }
    public BottomBar clickOnContactsButton() {
        WebElement contactsButton = appiumDriver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'mainBottomNavContacts')]"));
        contactsButton.click();
        return this;
    }
    public BottomBar clickOnNotificationsButton() {
        WebElement notificationsButton = appiumDriver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'mainBottomNavNotifications')]"));
        notificationsButton.click();
        return this;
    }
}

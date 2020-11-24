package ChatListPages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ChatListPage extends BaseTestClass {
    public ChatListPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;

    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public ChatListPage clickOnCreateNewChatButton() {
        WebElement createNewChatButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'placeholderActionButton')]"));
        createNewChatButton.click();
        return this;
    }

    public ChatListPage clickOnChappFilter() {
        WebElement contactFilter = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'pickContactFilter')]"));
        contactFilter.click();
        return this;
    }

    public ChatListPage clickOnChappContactFilter() {
        WebElement chappContactItem = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'filterTvChappContacts')]"));
        chappContactItem.click();
        return this;
    }

    public ChatListPage findAndClickOnContactName() {
        WebElement chappContactName = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Constantine')]"));
        chappContactName.click();
        return this;
    }

    public ChatListPage checkCreatedChat() {
        WebElement createdChatEntity = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Artem5')]"));
        createdChatEntity.isDisplayed();
        return this;
    }

    public boolean checkIsPageLoad() {
        WebElement chatPagePlaceHolder = appiumDriver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'chatsPlaceHolder')]"));
        return chatPagePlaceHolder.isDisplayed();
    }

    public boolean checkChatsPageTitle(){
        WebElement chatPageTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Chats')]"));
        return chatPageTitle.isDisplayed();
    }

    public boolean checkMuteIconOnWorkTab() {
        WebElement muteIconOnWorkInChatsPage = appiumDriver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Work\"]/android.widget.ImageView\n"));
        return muteIconOnWorkInChatsPage.isDisplayed();
    }

    public boolean checkMuteOnStatusOnChatsPage() {
        WebElement muteIconOnWorkInChatsPage = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'ON')]"));
        return muteIconOnWorkInChatsPage.isDisplayed();
    }

    public ChatListPage clickOnMuteProfileButton() {
        WebElement muteProfileButtonOnChatsPage = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Mute Profile')]"));
        muteProfileButtonOnChatsPage.click();
        return this;

    }

    public boolean checkMuteIconOnPersonalTab() {
        WebElement muteIconOnPersonalInChatsPage = appiumDriver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Work\"]/android.widget.ImageView\n"));
        return muteIconOnPersonalInChatsPage.isDisplayed();
    }

    public ChatListPage clickOnCreateNewChatInHeader() {
        WebElement createNewChatButtonInHeader = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'newChat')]"));
        createNewChatButtonInHeader.click();
        return this;
    }

    public ChatListPage clickOnChappContactForChatting() {
        WebElement firstChappContact = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Artem5')]"));
        firstChappContact.click();
        return this;

    }

    public ChatListPage clickOnWorkTab() {
        WebElement workTab = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'WORK')]"));
        workTab.click();
        return this;
    }

    public ChatListPage clickOnChappWorkContactForChatting() {
        WebElement workChappContact = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Artem5')]"));
        workChappContact.click();
        return this;
    }

    public ChatListPage clickOnNewGroupButton() {
        WebElement newGroupButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'pickContactNewGroupTv')]"));
        newGroupButton.click();
        return this;
    }

    public boolean checkCreatedNewGroup() {
        WebElement createdGroup = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'groupPreviewName')]"));
        return createdGroup.isDisplayed();

    }

//    public ChatListPage navigate() {
//        ((AndroidDriver) appiumDriver).startActivity(new Activity("o.chappme.chapp.android", "o.chappme.chapp.android.ui.main.chats.list.ChatlistFragment"));
//        return this;
//
//    }
}

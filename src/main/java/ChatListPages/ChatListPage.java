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
        WebElement createNewChatButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'newChat')]"));
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
        WebElement createdChatEntity = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout"));
        createdChatEntity.isDisplayed();
        return this;
    }

    public boolean checkIsPageLoad() {
        WebElement chatPagePlaceHolder = appiumDriver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'chatsPlaceHolder')]"));
        return chatPagePlaceHolder.isDisplayed();
    }

//    public ChatListPage navigate() {
//        ((AndroidDriver) appiumDriver).startActivity(new Activity("o.chappme.chapp.android", "o.chappme.chapp.android.ui.main.chats.list.ChatlistFragment"));
//        return this;
//
//    }
}

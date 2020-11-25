package ChatListPages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ChatDetailsPage extends BaseTestClass {
    public ChatDetailsPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public ChatDetailsPage findAndClickOnMessageInputField() {
        WebElement messageInputField = appiumDriver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'chatDetailsInputRl')]"));
        messageInputField.click();
        return this;
    }

    public ChatDetailsPage enterMessage() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'chatDetailsEditText')]")).sendKeys(personalTextMessage);
        return this;
    }

    public ChatDetailsPage clickOnSendMessageButton() {
        WebElement sendMessageButton = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'chatDetailsCancelIv')]"));
        sendMessageButton.click();
        return this;
    }

    public ChatDetailsPage clickOnBackButton() {
        WebElement backButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
        backButton.click();
        return this;
    }

    public ChatDetailsPage checkEmptyChatDetailsIsDisplayed() {
        WebElement emptyChatImage = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'chatDetailsEmptyChatImg')]"));
        emptyChatImage.isDisplayed();
        return this;


    }

    public boolean checkSystemMessageInChat() {
        WebElement systemMessageInChatDetails = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'chatNotificationItemText')]"));
        return systemMessageInChatDetails.isDisplayed();

    }

    public boolean checkSendedMessageIsDisplayed() {
        WebElement sendMessageInChatDetails = appiumDriver.findElement(checkPersonalTextMessage);
        return sendMessageInChatDetails.isDisplayed();
    }

    public ChatDetailsPage enterWorkMessage() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'chatDetailsEditText')]")).sendKeys(workTextMessage);
        return this;
    }

    public boolean checkSendedWorkMessageIsDisplayed() {
        WebElement sendWorkMessageInChatDetails = appiumDriver.findElement(checkWorkTextMessage);
        return sendWorkMessageInChatDetails.isDisplayed();

    }
}

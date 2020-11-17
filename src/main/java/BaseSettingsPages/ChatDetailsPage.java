package BaseSettingsPages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ChatDetailsPage {
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
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'chatDetailsEditText')]")).sendKeys("first Message text");
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
}

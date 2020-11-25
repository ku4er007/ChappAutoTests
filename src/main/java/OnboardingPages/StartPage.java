package OnboardingPages;

import BaseSettingsPages.BaseTestClassForCreateNewAccount;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class StartPage extends BaseTestClassForCreateNewAccount {
    public StartPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;

    }

    AppiumDriver appiumDriver;

    public StartPage clickOnStartMessagingButton() {
        WebElement startMessagingButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'slidesStartMessagingBtn')]"));
        startMessagingButton.click();
        return this;
    }

    public StartPage clickOnSelectCountryButton() {
        WebElement selectCountryButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'enterPhoneTvCountry')]"));
        selectCountryButton.click();
        return this;
    }

    public StartPage waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public StartPage enterPhoneNumber() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'inputPhoneEtInput')]")).sendKeys(testPhoneNumber);
        return this;
    }

    public StartPage clickOnAcceptCheckBox() {
        WebElement acceptCheckBox = appiumDriver.findElement(By.xpath("//android.widget.CheckBox[contains(@resource-id,'enterPhoneCbAgree')]"));
        acceptCheckBox.click();
        return this;
    }

    public StartPage clickOnSendMeTheCodeButton() {
        WebElement sendMeTheCodeButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'enterPhoneTvSendCode')]"));
        sendMeTheCodeButton.click();
        return this;
    }

    public void hideKeyBoard() {
        try {
            appiumDriver.hideKeyboard();
        } catch (Exception e) {
        }
    }

    public boolean findTutorialTitle() {
        WebElement chatPagePlaceHolder = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'tvSlideTitle')]"));
        return chatPagePlaceHolder.isDisplayed();
    }
}




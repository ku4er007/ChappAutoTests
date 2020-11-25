package OnboardingPages;

import BaseSettingsPages.BaseTestClassForCreateNewAccount;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class EnterCodePage extends BaseTestClassForCreateNewAccount {
    public EnterCodePage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;

    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void enterSmsCode() {
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText")).sendKeys(firstInputSmsCode);
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")).sendKeys(secondInputSmsCode);
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText")).sendKeys(thirdInputSmsCode);
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.EditText")).sendKeys(fourInputSmsCode);
    }

    public void clickOnConfirmButton() {
        WebElement confirmButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'confirmCodeBtnSubmit')]"));
        confirmButton.click();
    }

    public void hideKeyBoard() {
        try {
            appiumDriver.hideKeyboard();
        } catch (Exception e) {
        }
    }
}

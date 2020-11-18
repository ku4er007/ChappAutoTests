package BaseSettingsPages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$x;

public class EnterCodePage extends BaseTestClass  {
    public EnterCodePage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;

    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void enterSmsCode() {
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText")).sendKeys("10");
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")).sendKeys("10");
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText")).sendKeys("10");
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.EditText")).sendKeys("10");
    }

    public void clickOnConfirmButton() {
        WebElement confirmButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'confirmCodeBtnSubmit')]"));
        confirmButton.click();
    }

    public void hideKeyBoard()
    {
        try{appiumDriver.hideKeyboard();}
        catch(Exception e){}
    }
}

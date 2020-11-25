package OnboardingPages;

import BaseSettingsPages.BaseTestClass;
import BaseSettingsPages.BaseTestClassForCreateNewAccount;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SelectCountryPage extends BaseTestClassForCreateNewAccount {

    public SelectCountryPage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;

    }

    AppiumDriver appiumDriver;

    public void clickOnSearchInputField() {
        WebElement countrySearchButton = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'search_button')]"));
        countrySearchButton.click();
    }

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void findAndSendCountry() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'search_src_text')]")).sendKeys(countrySearch);
    }

    public void clickOnAmericaButtonFromList() {
        WebElement americaCountryButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'countryNameTv')]"));
        americaCountryButton.click();
    }
}

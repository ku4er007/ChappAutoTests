package ProfilePages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class EditWorkProfile extends BaseTestClass {

    public EditWorkProfile(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public EditWorkProfile changeFirstName() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtFirstName')]")).sendKeys(editFirstWorkName);
        return this;
    }

    public EditWorkProfile changeLastName() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtLastName')]")).sendKeys(editLastWorkName);
        return this;
    }

    public EditWorkProfile changeCompanyName() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtCompany')]")).sendKeys(editCompanyWorkName);
        return this;
    }

    public EditWorkProfile changeTitle() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtTitle')]")).sendKeys(editTitleWorkName);
        return this;

    }

    public EditWorkProfile changeEmail() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtEmail')]")).sendKeys(editEmailWorkName);
        return this;
    }

    public EditWorkProfile addWorkProfilePhoto() {
        WebElement addWorkProfilePhotoButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'createWorkTvAddPhoto')]"));
        addWorkProfilePhotoButton.click();
        return this;


    }

    public EditWorkProfile clickOnSaveButton() {
        WebElement saveButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'createWorkBtnCreate')]"));
        saveButton.click();
        return this;
    }

    public EditWorkProfile clearFirstName() {
        WebElement firstNameWorkProfile = appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtFirstName')]"));
        firstNameWorkProfile.clear();
        return this;
    }

    public boolean checkValidationMessage() {
        WebElement validationErrorMessage = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'textinput_error')]"));
        return validationErrorMessage.isDisplayed();
    }

    public EditWorkProfile clickOnBackButton() {
        WebElement backButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
        backButton.click();
        return this;
    }

    public EditWorkProfile enterInvalidEmail1() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtEmail')]")).sendKeys(editInvalidEmailWorkName1);
        return this;

    }

    public boolean checkErrorAlert() {
        WebElement hasInvalidFormatAlert = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'has invalid format')]"));
        return hasInvalidFormatAlert.isDisplayed();
    }

    public EditWorkProfile enterInvalidEmail2() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtEmail')]")).sendKeys(editInvalidEmailWorkName2);
        return this;

    }

    public EditWorkProfile enterInvalidEmail3() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createWorkEtEmail')]")).sendKeys(editInvalidEmailWorkName3);
        return this;

    }

    public EditWorkProfile clickOnTakeNewPhotoButton() {
        WebElement takeNewPhotoButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'pickPhotoTvTakePhoto')]"));
        takeNewPhotoButton.click();
        return this;

    }

    public EditWorkProfile clickOnShutterButton() {
        WebElement shutterButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'shutter_button')]"));
        shutterButton.click();
        return this;

    }

    public EditWorkProfile clickOnChooseButtonOnCropForm() {
        WebElement chooseButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'cropTvChoosePhoto')]"));
        chooseButton.click();
        return this;
    }
}

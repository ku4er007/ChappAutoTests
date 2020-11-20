package ProfilePages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class EditPersonalProfile {
    public EditPersonalProfile(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean checkEditPageTitle() {
        WebElement editPersonalProfilePageTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Edit personal profile')]"));
        return editPersonalProfilePageTitle.isDisplayed();
    }

    public EditPersonalProfile changeFirstName() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createPersonalEtFirstName')]")).clear();
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createPersonalEtFirstName')]")).sendKeys("Константин");
        return this;
    }

    public EditPersonalProfile changeLastName() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createPersonalEtLastName')]")).clear();
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createPersonalEtLastName')]")).sendKeys("Дорошенко");
        return this;
    }

    public EditPersonalProfile addProfilePhoto() {
        WebElement addProfilePhotoButton = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'createPersonalIvPhoto')]"));
        addProfilePhotoButton.click();
        return this;
    }

    public EditPersonalProfile clickOnAllowPermissionPhotoButton() {
        WebElement allowPermissionPhotoButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_foreground_only_button')]"));
        allowPermissionPhotoButton.click();
        return this;
    }

    public EditPersonalProfile clickOnAccessPhotoButton() {
        WebElement accessPermissionPhotoButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_button')]"));
        accessPermissionPhotoButton.click();
        return this;
    }

    public EditPersonalProfile clickOnSelectFromGalleryButton() {
        WebElement selectFromGalleryButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'pickPhotoTvGallery')]"));
        selectFromGalleryButton.click();
        return this;


    }

    public EditPersonalProfile clickOnScreenshotFolder() {
        WebElement screenshotFolderInGallery = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Screenshots')]"));
        screenshotFolderInGallery.click();
        return this;


    }

    public EditPersonalProfile clickOnPhoto() {
        WebElement selectPhoto = appiumDriver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Фото снят(о) 16 нояб. 2020 г. 13:02:53\"]"));
        selectPhoto.click();
        return this;


    }

    public EditPersonalProfile clickOnChooseButtonInCropForm() {
        WebElement chooseButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'cropTvChoosePhoto')]"));
        chooseButton.click();
        return this;
    }

    public EditPersonalProfile clickOnSaveButton() {
        WebElement saveButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'createPersonalBtnCreate')]"));
        saveButton.click();
        return this;
    }

    public EditPersonalProfile clearFirstNameInputField() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createPersonalEtFirstName')]")).clear();
        return this;
    }

    public boolean checkValidationMessage() {
        WebElement validationMessage = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'textinput_error')]"));
        return validationMessage.isDisplayed();

    }

    public EditPersonalProfile clickOnBackButton() {
        WebElement backButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
        backButton.click();
        return this;
    }

    public EditPersonalProfile clearLastNameInputField() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createPersonalEtLastName')]")).clear();
        return this;
    }

    public EditPersonalProfile clickOnTakeNewPhotoButton() {
        WebElement takeNewPhotoButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'pickPhotoTvTakePhoto')]"));
        takeNewPhotoButton.click();
        return this;
    }

    public EditPersonalProfile clickOnShutterButton() {
        WebElement shutterButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'shutter_button')]"));
        shutterButton.click();
        return this;


    }
}

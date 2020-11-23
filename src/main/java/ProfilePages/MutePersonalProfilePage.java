package ProfilePages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MutePersonalProfilePage extends BaseTestClass {
    public MutePersonalProfilePage(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean checkPageTitle() {
        WebElement mutePageTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Mute Profile')]"));
        return mutePageTitle.isDisplayed();
    }

    public MutePersonalProfilePage clickOnActivationMuteSwitcher() {
        WebElement muteProfileSwitcher = appiumDriver.findElement(By.xpath("//android.widget.Switch[contains(@resource-id,'muteProfileSwitch')]"));
        muteProfileSwitcher.click();
        return this;

    }

    public MutePersonalProfilePage clickOnDoneButton() {
        WebElement doneButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'DONE')]"));
        doneButton.click();
        return this;

    }

    public boolean checkSuccessAlert() {
        WebElement successAlert = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Mute settings updated')]"));
        return successAlert.isDisplayed();

    }

    public MutePersonalProfilePage clickOnBackButton() {
        WebElement backButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
        backButton.click();
        return this;

    }

    public MutePersonalProfilePage clickOnSetMuteScheduleSwitcher() {
        WebElement setMuteScheduleSwitcher = appiumDriver.findElement(By.xpath("//android.widget.Switch[contains(@resource-id,'muteProfileScheduleSwitch')]"));
        setMuteScheduleSwitcher.click();
        return this;
    }

    public MutePersonalProfilePage clickOnStartTimeSection() {
        WebElement startTimeSection = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'muteProfileScheduleStartButton')]"));
        startTimeSection.click();
        return this;
    }

    public MutePersonalProfilePage clickOnKeyboardTimeButton() {
        WebElement keyboardTimeButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'toggle_mode')]"));
        keyboardTimeButton.click();
        return this;
    }

    public MutePersonalProfilePage enterStartHourData() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'input_hour')]")).sendKeys("12");
        return this;
    }

    public MutePersonalProfilePage enterStartMinuteData() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'input_minute')]")).sendKeys("30");
        return this;
    }

    public MutePersonalProfilePage clickOnOkButton() {
        WebElement okButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]"));
        okButton.click();
        return this;
    }

    public MutePersonalProfilePage clickOnEndTimeSection() {
        WebElement endTimeSection = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'muteProfileScheduleEndButton')]"));
        endTimeSection.click();
        return this;
    }

    public MutePersonalProfilePage enterEndHourData() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'input_hour')]")).sendKeys("17");
        return this;
    }

    public MutePersonalProfilePage enterEndMinuteData() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'input_minute')]")).sendKeys("00");
        return this;
    }

    public MutePersonalProfilePage clickOnRepeatButton() {
        WebElement repeatButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'muteProfileScheduleRepeatButton')]"));
        repeatButton.click();
        return this;
    }

    public MutePersonalProfilePage selectMonday() {
        WebElement mondayCheckbox = appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Monday')]"));
        mondayCheckbox.click();
        return this;

    }

    public MutePersonalProfilePage selectTuesday() {
        WebElement tuesdayCheckbox = appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Tuesday')]"));
        tuesdayCheckbox.click();
        return this;
    }

    public MutePersonalProfilePage selectFriday() {
        WebElement fridayCheckbox = appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Friday')]"));
        fridayCheckbox.click();
        return this;
    }

    public MutePersonalProfilePage selectSunday() {
        WebElement sundayCheckbox = appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Sunday')]"));
        sundayCheckbox.click();
        return this;
    }

    public boolean checkSelectedRepeatsDays() {
        WebElement selectedRepeatsDays = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'MON, TUE, FRI, SUN')]"));
        return selectedRepeatsDays.isDisplayed();

    }
}

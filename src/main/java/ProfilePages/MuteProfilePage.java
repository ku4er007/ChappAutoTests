package ProfilePages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MuteProfilePage extends BaseTestClass {
    public MuteProfilePage(AppiumDriver appiumDriver) {
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

    public MuteProfilePage clickOnActivationMuteSwitcher() {
        WebElement muteProfileSwitcher = appiumDriver.findElement(By.xpath("//android.widget.Switch[contains(@resource-id,'muteProfileSwitch')]"));
        muteProfileSwitcher.click();
        return this;

    }

    public MuteProfilePage clickOnDoneButton() {
        WebElement doneButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'DONE')]"));
        doneButton.click();
        return this;

    }

    public boolean checkSuccessAlert() {
        WebElement successAlert = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Mute settings updated')]"));
        return successAlert.isDisplayed();

    }

    public MuteProfilePage clickOnBackButton() {
        WebElement backButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
        backButton.click();
        return this;

    }

    public MuteProfilePage clickOnSetMuteScheduleSwitcher() {
        WebElement setMuteScheduleSwitcher = appiumDriver.findElement(By.xpath("//android.widget.Switch[contains(@resource-id,'muteProfileScheduleSwitch')]"));
        setMuteScheduleSwitcher.click();
        return this;
    }

    public MuteProfilePage clickOnStartTimeSection() {
        WebElement startTimeSection = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'muteProfileScheduleStartButton')]"));
        startTimeSection.click();
        return this;
    }

    public MuteProfilePage clickOnKeyboardTimeButton() {
        WebElement keyboardTimeButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'toggle_mode')]"));
        keyboardTimeButton.click();
        return this;
    }

    public MuteProfilePage enterStartHourData() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'input_hour')]")).sendKeys("12");
        return this;
    }

    public MuteProfilePage enterStartMinuteData() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'input_minute')]")).sendKeys("30");
        return this;
    }

    public MuteProfilePage clickOnOkButton() {
        WebElement okButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]"));
        okButton.click();
        return this;
    }

    public MuteProfilePage clickOnEndTimeSection() {
        WebElement endTimeSection = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'muteProfileScheduleEndButton')]"));
        endTimeSection.click();
        return this;
    }

    public MuteProfilePage enterEndHourData() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'input_hour')]")).sendKeys("17");
        return this;
    }

    public MuteProfilePage enterEndMinuteData() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'input_minute')]")).sendKeys("00");
        return this;
    }

    public MuteProfilePage clickOnRepeatButton() {
        WebElement repeatButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'muteProfileScheduleRepeatButton')]"));
        repeatButton.click();
        return this;
    }

    public MuteProfilePage selectMonday() {
        WebElement mondayCheckbox = appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Monday')]"));
        mondayCheckbox.click();
        return this;

    }

    public MuteProfilePage selectTuesday() {
        WebElement tuesdayCheckbox = appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Tuesday')]"));
        tuesdayCheckbox.click();
        return this;
    }

    public MuteProfilePage selectFriday() {
        WebElement fridayCheckbox = appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Friday')]"));
        fridayCheckbox.click();
        return this;
    }

    public MuteProfilePage selectSunday() {
        WebElement sundayCheckbox = appiumDriver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'Sunday')]"));
        sundayCheckbox.click();
        return this;
    }

    public boolean checkSelectedRepeatsDays() {
        WebElement selectedRepeatsDays = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'MON, TUE, FRI, SUN')]"));
        return selectedRepeatsDays.isDisplayed();

    }

    public boolean checkNeverDays() {
        WebElement neverDays = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'NEVER')]"));
        return neverDays.isDisplayed();
    }
}

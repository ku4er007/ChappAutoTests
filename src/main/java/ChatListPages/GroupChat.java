package ChatListPages;

import BaseSettingsPages.BaseTestClass;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class GroupChat extends BaseTestClass {

    public GroupChat(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

    AppiumDriver appiumDriver;

    public void waitForPageLoad() {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean checkPersonalContactTitle() {
        WebElement personalContactListTitle = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Personal Contacts')]"));
        return personalContactListTitle.isDisplayed();
    }

    public GroupChat selectPersonalContact1() {
        WebElement firstPerson = appiumDriver.findElement(firstGroupMember);
        firstPerson.click();
        return this;

    }

    public GroupChat selectPersonalContact2() {
        WebElement secondPerson = appiumDriver.findElement(secondGroupMember);
        secondPerson.click();
        return this;
    }

    public GroupChat selectPersonalContact3() {
        WebElement thirdPerson = appiumDriver.findElement(thirdGroupMember);
        thirdPerson.click();
        return this;
    }

    public GroupChat selectPersonalContact4() {
        WebElement fourPerson = appiumDriver.findElement(fourGroupMember);
        fourPerson.click();
        return this;
    }

    public GroupChat clickOnNextButton() {
        WebElement fourPerson = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'pickContactNextBtn')]"));
        fourPerson.click();
        return this;
    }

    public boolean checkNumberOfSelectedMembers() {
        WebElement numberOfSelectedMembers = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Personal group members(4)')]"));
        return numberOfSelectedMembers.isDisplayed();

    }

    public boolean checkPersonalGroupCreateFormTitle() {
        WebElement personalGroupCreateFormTitle = appiumDriver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'createGroupToolbar')]"));
        return personalGroupCreateFormTitle.isDisplayed();
    }

    public GroupChat clickOnAddPhotoButton() {
        WebElement addPhotoButton = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'createGroupIvPhoto')]"));
        addPhotoButton.click();
        return this;

    }

    public GroupChat enterGroupName() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createGroupNameEt')]")).sendKeys(personalGroupName);
        return this;
    }

    public GroupChat enterGroupDescription() {
        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'createGroupDescriptionEt')]")).sendKeys(personalGroupDescription);
        return this;
    }

    public GroupChat clickOnCreateGroupButton() {
        WebElement createGroupButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[contains(@resource-id,'createGroupNextBtn')]"));
        createGroupButton.click();
        return this;
    }

    public GroupChat addPhotoUsingGallery() {
        WebElement selectFromGalleryButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'pickPhotoTvGallery')]"));
        selectFromGalleryButton.click();
        WebElement screenshotsFolder = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Screenshots')]"));
        screenshotsFolder.click();
        WebElement screenshot = appiumDriver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Фото снят(о) 16 нояб. 2020 г. 14:00:15\"]\n"));
        screenshot.click();
        WebElement chooseButtonInCropForm = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'cropTvChoosePhoto')]"));
        chooseButtonInCropForm.click();
        return this;
    }

    public GroupChat accessToCameraAndGallery() {
        WebElement cameraAccessButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_foreground_only_button')]"));
        cameraAccessButton.click();
        WebElement galleryAccessButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_button')]"));
        galleryAccessButton.click();
        return this;
    }

    public boolean checkDisplayEditButton() {
        WebElement editButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Edit')]"));
        return editButton.isDisplayed();
    }

    public boolean checkEmptyGroupChatDetails() {
        WebElement editButton = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'groupDetailsEmptyChatImg')]"));
        return editButton.isDisplayed();
    }

    public GroupChat clickOnBackButton() {
        WebElement backButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
        backButton.click();
        return this;
    }
}

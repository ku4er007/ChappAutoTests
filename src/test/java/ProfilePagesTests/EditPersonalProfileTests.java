package ProfilePagesTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class EditPersonalProfileTests extends BaseTestClass {

    @Test(priority=1)
    public void editPersonalProfileWithEditAllFieldsTest(){
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.goToEditProfileForm();
        editPersonalProfile.checkEditPageTitle();
        editPersonalProfile.changeFirstName();
        editPersonalProfile.changeLastName();
        editPersonalProfile.addProfilePhoto();
        editPersonalProfile.clickOnAllowPermissionPhotoButton();
        editPersonalProfile.clickOnAccessPhotoButton();
        editPersonalProfile.clickOnSelectFromGalleryButton();
        editPersonalProfile.clickOnScreenshotFolder();
        editPersonalProfile.clickOnPhoto();
        editPersonalProfile.clickOnChooseButtonInCropForm();
        editPersonalProfile.waitForPageLoad();
        editPersonalProfile.clickOnSaveButton();
        profilePage.checkNewProfileName();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
    @Test(priority=2)
    public void editPersonalProfileWithEmptyFirstName(){
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.goToEditProfileForm();
        editPersonalProfile.checkEditPageTitle();
        editPersonalProfile.clearFirstNameInputField();
        editPersonalProfile.checkValidationMessage();
        editPersonalProfile.clickOnBackButton();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());

    }
    @Test(priority=3)
    public void editPersonalProfileWithEmptyLastName(){
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.goToEditProfileForm();
        editPersonalProfile.checkEditPageTitle();
        editPersonalProfile.clearLastNameInputField();
        editPersonalProfile.clickOnSaveButton();
        profilePage.checkNewProfileNameWithoutLastName();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());

    }
    @Test(priority=4)
    public void editPersonalProfileWithAddPhotoUsingCamera() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.waitForPageLoad();
        profilePage.goToEditProfileForm();
        editPersonalProfile.checkEditPageTitle();
        editPersonalProfile.addProfilePhoto();
        editPersonalProfile.clickOnAllowPermissionPhotoButton();
        editPersonalProfile.clickOnAccessPhotoButton();
        editPersonalProfile.clickOnTakeNewPhotoButton();
        editPersonalProfile.clickOnShutterButton();
        editPersonalProfile.clickOnShutterButton();
        editPersonalProfile.clickOnChooseButtonInCropForm();
        editPersonalProfile.clickOnSaveButton();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
}

package ProfilePagesTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class EditWorkProfileTests extends BaseTestClass {
    @Test(priority=1)
    public void editWorkProfileWithEditAllFieldsTest() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnWorkTab();
        profilePage.goToEditProfileForm();
        editWorkProfile.changeFirstName();
        editWorkProfile.changeLastName();
        editWorkProfile.changeCompanyName();
        editWorkProfile.changeTitle();
        editWorkProfile.changeEmail();
        editWorkProfile.addWorkProfilePhoto();
        editPersonalProfile.clickOnAllowPermissionPhotoButton();
        editPersonalProfile.clickOnAccessPhotoButton();
        editPersonalProfile.clickOnSelectFromGalleryButton();
        editPersonalProfile.clickOnScreenshotFolder();
        editPersonalProfile.clickOnPhoto();
        editPersonalProfile.clickOnChooseButtonInCropForm();
        editPersonalProfile.waitForPageLoad();
        editWorkProfile.clickOnSaveButton();
        profilePage.checkNewWorkProfileName();
        profilePage.checkNewCompanyAndTitle();
        profilePage.checkNewEmail();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
    @Test(priority=2)
    public void editWorkProfileWithEmptyInputFields() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnWorkTab();
        profilePage.goToEditProfileForm();
        editWorkProfile.clearFirstName();
        editWorkProfile.checkValidationMessage();
        editWorkProfile.clickOnBackButton();
        profilePage.checkNewWorkProfileName();
        profilePage.checkNewCompanyAndTitle();
        profilePage.checkNewEmail();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
    @Test(priority=3)
    public void editWorkProfileWithIncorrectEmail() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnWorkTab();
        profilePage.goToEditProfileForm();
        editWorkProfile.enterInvalidEmail1(); // - first validation
        editWorkProfile.clickOnSaveButton();
        editWorkProfile.checkErrorAlert();
        editWorkProfile.enterInvalidEmail2();  // - second validation
        editWorkProfile.clickOnSaveButton();
        editWorkProfile.checkErrorAlert();
        editWorkProfile.enterInvalidEmail3();  // - third validation
        editWorkProfile.clickOnSaveButton();
        editWorkProfile.checkErrorAlert();
        editWorkProfile.clickOnBackButton();
        profilePage.checkNewEmail();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
    @Test(priority=4)
    public void editWorkProfileWithAddPhotoUsingCamera() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnWorkTab();
        profilePage.goToEditProfileForm();
        editWorkProfile.addWorkProfilePhoto();
        editPersonalProfile.clickOnAllowPermissionPhotoButton();
        editPersonalProfile.clickOnAccessPhotoButton();
        editWorkProfile.clickOnTakeNewPhotoButton();
        editWorkProfile.clickOnShutterButton();
        editWorkProfile.clickOnShutterButton();
        editWorkProfile.clickOnChooseButtonOnCropForm();
        editWorkProfile.waitForPageLoad();
        editWorkProfile.clickOnSaveButton();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());

    }
}

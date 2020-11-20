import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class EditPersonalProfileTests extends BaseTestClass {

    @Test
    public void editPersonalProfileWithEditAllFieldsTest(){
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.goToEditPersonalProfileForm();
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
    @Test
    public void editPersonalProfileWithEmptyFirstName(){
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.goToEditPersonalProfileForm();
        editPersonalProfile.checkEditPageTitle();
        editPersonalProfile.clearFirstNameInputField();
        editPersonalProfile.checkValidationMessage();
        editPersonalProfile.clickOnBackButton();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());

    }
    @Test
    public void editPersonalProfileWithEmptyLastName(){
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.goToEditPersonalProfileForm();
        editPersonalProfile.checkEditPageTitle();
        editPersonalProfile.clearLastNameInputField();
        editPersonalProfile.clickOnSaveButton();
        profilePage.checkNewProfileNameWithoutLastName();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());

    }
    @Test
    public void editPersonalProfileWithAddPhotoUsingCamera() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.waitForPageLoad();
        profilePage.goToEditPersonalProfileForm();
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

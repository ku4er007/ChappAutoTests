package ChatsPageTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CreateNewPersonalGroup extends BaseTestClass {

    @Test(priority = 1)
    public void createNewPersonalChatUsingButtonInHeader() {
        assertTrue(chatListPage.checkIsPageLoad());
        chatListPage.clickOnCreateNewChatButton();
        chatListPage.clickOnNewGroupButton();
        groupChat.checkPersonalContactTitle();
        groupChat.selectPersonalContact1();
        groupChat.selectPersonalContact2();
        groupChat.selectPersonalContact3();
        groupChat.selectPersonalContact4();
        groupChat.checkNumberOfSelectedMembers();
        groupChat.clickOnNextButton();
        groupChat.checkPersonalGroupCreateFormTitle();
        groupChat.clickOnAddPhotoButton();
        groupChat.accessToCameraAndGallery();
        groupChat.addPhotoUsingGallery();
        groupChat.checkDisplayEditButton();
        groupChat.enterGroupName();
        groupChat.enterGroupDescription();
        groupChat.clickOnCreateGroupButton();
        groupChat.checkEmptyGroupChatDetails();
        groupChat.clickOnBackButton();
        chatListPage.checkCreatedNewGroup();
        assertTrue(chatListPage.checkChatsPageTitle());












    }
}

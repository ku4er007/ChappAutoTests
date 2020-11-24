package ChatsPageTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CreateNewWorkOneToOneChat extends BaseTestClass {

    @Test(priority = 1)
    public void createNewPersonalChatUsingButtonInHeader() {
        assertTrue(chatListPage.checkIsPageLoad());
        chatListPage.clickOnWorkTab();
        chatListPage.clickOnCreateNewChatInHeader();
        chatListPage.waitForPageLoad();
        chatListPage.clickOnChappFilter();
        chatListPage.waitForPageLoad();
        chatListPage.clickOnChappContactFilter();
        chatListPage.clickOnChappWorkContactForChatting();
        chatDetailsPage.waitForPageLoad();
        chatDetailsPage.checkEmptyChatDetailsIsDisplayed();
        chatDetailsPage.findAndClickOnMessageInputField();
        chatDetailsPage.enterWorkMessage();
        chatDetailsPage.clickOnSendMessageButton();
        chatDetailsPage.checkSystemMessageInChat();
        chatDetailsPage.checkSendedWorkMessageIsDisplayed();
        chatDetailsPage.clickOnBackButton();
        assertTrue(chatListPage.checkIsPageLoad());
        chatListPage.checkCreatedChat();
    }
}
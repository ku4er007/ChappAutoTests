package ChatsPageTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CreateNewPersonalOneToOneChat extends BaseTestClass {

    @Test(priority = 1)
    public void createNewPersonalChatUsingButtonInHeader() {
        assertTrue(chatListPage.checkIsPageLoad());
        chatListPage.clickOnCreateNewChatInHeader();
        chatListPage.waitForPageLoad();
        chatListPage.clickOnChappFilter();
        chatListPage.waitForPageLoad();
        chatListPage.clickOnChappContactFilter();
        chatListPage.clickOnChappContactForChatting();
        chatDetailsPage.waitForPageLoad();
        chatDetailsPage.checkEmptyChatDetailsIsDisplayed();
        chatDetailsPage.findAndClickOnMessageInputField();
        chatDetailsPage.enterMessage();
        chatDetailsPage.clickOnSendMessageButton();
        chatDetailsPage.checkSystemMessageInChat();
        chatDetailsPage.checkSendedMessageIsDisplayed();
        chatDetailsPage.clickOnBackButton();
        assertTrue(chatListPage.checkIsPageLoad());
        chatListPage.checkCreatedChat();











    }
}

package ProfilePagesTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class FeedbackPageTest extends BaseTestClass {
    @Test(priority = 1)
    public void sendFeedbackMessagePersonalProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnFeedbackButton();
        profilePage.checkMailTitle();
        profilePage.enterMessageTheme();
        profilePage.enterTextMessage();
        profilePage.clickOnSendButton();
        profilePage.checkPersonalPageTitle();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }

    @Test(priority = 2)
    public void sendFeedbackMessageWorkProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnWorkTab();
        profilePage.clickOnFeedbackButton();
        profilePage.checkMailTitle();
        profilePage.enterMessageTheme();
        profilePage.enterTextMessage();
        profilePage.clickOnSendButton();
        profilePage.checkWorkPageTitle();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
}

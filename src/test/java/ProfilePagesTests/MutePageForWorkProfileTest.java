package ProfilePagesTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class MutePageForWorkProfileTest extends BaseTestClass {
    @Test(priority = 1)
    public void goToMutePageForWorkProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        chatListPage.waitForPageLoad();
        bottomBar.clickOnProfileButton();
        profilePage.clickOnWorkTab();
        profilePage.checkOffMuteStatus();
        profilePage.clickOnMuteProfileButton();
        muteWorkProfilePage.checkPageTitle();
        muteWorkProfilePage.clickOnActivationMuteSwitcher();
        muteWorkProfilePage.clickOnDoneButton();
        muteWorkProfilePage.checkSuccessAlert();
        muteWorkProfilePage.clickOnBackButton();
        profilePage.checkOnMuteStatus();
        profilePage.checkMuteIconOnWorkTab();
        profilePage.clickOnMuteProfileButton();
        muteWorkProfilePage.clickOnActivationMuteSwitcher();
        muteWorkProfilePage.clickOnDoneButton();
        muteWorkProfilePage.checkSuccessAlert();
        muteWorkProfilePage.clickOnBackButton();
        profilePage.checkOffMuteStatus();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
}

package ProfilePagesTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class MutePageForPersonalProfileTest extends BaseTestClass {

    @Test(priority = 1)
    public void goToMutePageForPersonalProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.checkOffMuteStatus();
        profilePage.clickOnMuteProfileButton();
        mutePersonalProfilePage.checkPageTitle();
        mutePersonalProfilePage.clickOnActivationMuteSwitcher();
        mutePersonalProfilePage.clickOnDoneButton();
        mutePersonalProfilePage.checkSuccessAlert();
        mutePersonalProfilePage.clickOnBackButton();
        profilePage.checkOnMuteStatus();
        profilePage.checkMuteIconOnPersonalTab();
        profilePage.clickOnMuteProfileButton();
        mutePersonalProfilePage.clickOnActivationMuteSwitcher();
        mutePersonalProfilePage.clickOnDoneButton();
        mutePersonalProfilePage.checkSuccessAlert();
        mutePersonalProfilePage.clickOnBackButton();
        profilePage.checkOffMuteStatus();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
}

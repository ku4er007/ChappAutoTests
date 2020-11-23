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

    @Test(priority = 2)
    public void setMuteSchedulePageForWorkProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnWorkTab();
        profilePage.checkOffMuteStatus();
        profilePage.clickOnMuteProfileButton();
        muteProfilePage.checkPageTitle();
        muteProfilePage.clickOnSetMuteScheduleSwitcher();
        muteProfilePage.clickOnStartTimeSection();
        muteProfilePage.clickOnKeyboardTimeButton();
        muteProfilePage.enterStartHourData();
        muteProfilePage.enterStartMinuteData();
        muteProfilePage.clickOnOkButton();
        muteProfilePage.clickOnEndTimeSection();
        muteProfilePage.clickOnKeyboardTimeButton();
        muteProfilePage.enterEndHourData();
        muteProfilePage.enterEndMinuteData();
        muteProfilePage.clickOnOkButton();
        muteProfilePage.clickOnActivationMuteSwitcher();
        muteProfilePage.clickOnRepeatButton();
        muteProfilePage.selectMonday();
        muteProfilePage.selectTuesday();
        muteProfilePage.selectFriday();
        muteProfilePage.selectSunday();
        muteProfilePage.clickOnOkButton();
        muteProfilePage.checkSelectedRepeatsDays();
        muteProfilePage.clickOnDoneButton();
        muteProfilePage.checkSuccessAlert();
        muteProfilePage.clickOnBackButton();
        profilePage.checkOffMuteStatus();
        profilePage.checkScheduleIcon();
        profilePage.clickOnMuteProfileButton();
        muteProfilePage.clickOnRepeatButton();
        muteProfilePage.selectMonday();
        muteProfilePage.selectTuesday();
        muteProfilePage.selectFriday();
        muteProfilePage.selectSunday();
        muteProfilePage.clickOnOkButton();
        muteProfilePage.clickOnSetMuteScheduleSwitcher();
        muteProfilePage.clickOnDoneButton();
        muteProfilePage.clickOnBackButton();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());

    }
}
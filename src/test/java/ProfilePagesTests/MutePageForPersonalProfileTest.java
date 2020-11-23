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
        muteProfilePage.checkPageTitle();
        muteProfilePage.clickOnActivationMuteSwitcher();
        muteProfilePage.clickOnDoneButton();
        muteProfilePage.checkSuccessAlert();
        muteProfilePage.clickOnBackButton();
        profilePage.checkOnMuteStatus();
        profilePage.checkMuteIconOnPersonalTab();
        profilePage.clickOnMuteProfileButton();
        muteProfilePage.clickOnActivationMuteSwitcher();
        muteProfilePage.clickOnDoneButton();
        muteProfilePage.checkSuccessAlert();
        muteProfilePage.clickOnBackButton();
        profilePage.checkOffMuteStatus();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }

    @Test(priority = 2)
    public void setMuteSchedulePageForPersonalProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
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
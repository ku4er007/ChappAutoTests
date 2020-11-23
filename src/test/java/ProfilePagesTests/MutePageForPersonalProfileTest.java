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

    @Test(priority = 1)
    public void setMuteSchedulePageForPersonalProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.checkOffMuteStatus();
        profilePage.clickOnMuteProfileButton();
        mutePersonalProfilePage.checkPageTitle();
        mutePersonalProfilePage.clickOnSetMuteScheduleSwitcher();
        mutePersonalProfilePage.clickOnStartTimeSection();
        mutePersonalProfilePage.clickOnKeyboardTimeButton();
        mutePersonalProfilePage.enterStartHourData();
        mutePersonalProfilePage.enterStartMinuteData();
        mutePersonalProfilePage.clickOnOkButton();
        mutePersonalProfilePage.clickOnEndTimeSection();
        mutePersonalProfilePage.clickOnKeyboardTimeButton();
        mutePersonalProfilePage.enterEndHourData();
        mutePersonalProfilePage.enterEndMinuteData();
        mutePersonalProfilePage.clickOnOkButton();
        mutePersonalProfilePage.clickOnActivationMuteSwitcher();
        mutePersonalProfilePage.clickOnRepeatButton();
        mutePersonalProfilePage.selectMonday();
        mutePersonalProfilePage.selectTuesday();
        mutePersonalProfilePage.selectFriday();
        mutePersonalProfilePage.selectSunday();
        mutePersonalProfilePage.clickOnOkButton();
        mutePersonalProfilePage.checkSelectedRepeatsDays();
        mutePersonalProfilePage.clickOnDoneButton();
        mutePersonalProfilePage.checkSuccessAlert();
        mutePersonalProfilePage.clickOnBackButton();
        profilePage.checkOffMuteStatus();
        profilePage.checkScheduleIcon();
        profilePage.clickOnMuteProfileButton();
        mutePersonalProfilePage.clickOnRepeatButton();
        mutePersonalProfilePage.selectMonday();
        mutePersonalProfilePage.selectTuesday();
        mutePersonalProfilePage.selectFriday();
        mutePersonalProfilePage.selectSunday();
        mutePersonalProfilePage.clickOnOkButton();
        mutePersonalProfilePage.clickOnSetMuteScheduleSwitcher();
        mutePersonalProfilePage.clickOnDoneButton();
        mutePersonalProfilePage.clickOnBackButton();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());















    }
}
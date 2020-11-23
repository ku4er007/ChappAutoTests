package ProfilePagesTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class InfoPageTest extends BaseTestClass {

    @Test(priority = 1)
    public void infoScreenPersonalProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnInfoButton();
        infoTutorialPages.checkFirstInfoScreenTitle();
        infoTutorialPages.clickOnNextButton();
        infoTutorialPages.checkSecondInfoScreenTitle();
        infoTutorialPages.clickOnNextButton();
        infoTutorialPages.checkThirdInfoScreenTitle();
        infoTutorialPages.clickOnGoItButton();
        profilePage.checkPersonalPageTitle();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
    @Test(priority = 2)
    public void infoScreenWorkProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnWorkTab();
        profilePage.clickOnInfoButton();
        infoTutorialPages.checkFirstInfoScreenTitle();
        infoTutorialPages.clickOnNextButton();
        infoTutorialPages.checkSecondInfoScreenTitle();
        infoTutorialPages.clickOnNextButton();
        infoTutorialPages.checkThirdInfoScreenTitle();
        infoTutorialPages.clickOnGoItButton();
        profilePage.checkWorkPageTitle();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
}

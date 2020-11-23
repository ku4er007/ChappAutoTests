package ProfilePagesTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class BaseUIProfileTests extends BaseTestClass {
    @Test(priority = 1)
    public void mainScreenElementsPersonalProfileUiTest() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.checkPersonalPageTitle();
        profilePage.checkPersonalProfileInfo();
        profilePage.checkPhoneManagementSection();
        profilePage.checkMuteProfileSection();
        profilePage.checkAccountManagementSection();
        profilePage.checkFeedbackSection();
        profilePage.checkTermsAndPolicySection();
        profilePage.checkInfoSection();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }

    @Test(priority = 2)
    public void mainScreenElementsWorkProfileUiTest() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnWorkTab();
        profilePage.checkPersonalPageTitle();
        profilePage.checkPersonalProfileInfo();
        profilePage.checkPhoneManagementSection();
        profilePage.checkMuteProfileSection();
        profilePage.checkAccountManagementSection();
        profilePage.checkFeedbackSection();
        profilePage.checkTermsAndPolicySection();
        profilePage.checkInfoSection();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
}
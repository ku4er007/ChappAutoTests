package ProfilePagesTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TermAndPolicyPageTest extends BaseTestClass {
    @Test(priority = 1)
    public void goToTermAndPolicyPageForPersonalProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnTermsButton();
        profilePage.checkTermsOfServiceText();
        profilePage.clickOnCloseTermsBrowser();
        profilePage.checkPersonalPageTitle();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }

    @Test(priority = 2)
    public void goToTermAndPolicyPageForWorkProfile() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnWorkTab();
        profilePage.clickOnTermsButton();
        profilePage.checkTermsOfServiceText();
        profilePage.clickOnCloseTermsBrowser();
        profilePage.checkWorkPageTitle();
        bottomBar.clickOnChatsButton();
        assertTrue(chatListPage.checkIsPageLoad());
    }
}

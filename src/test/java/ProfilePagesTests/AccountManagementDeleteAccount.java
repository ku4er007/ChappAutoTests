package ProfilePagesTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class AccountManagementDeleteAccount extends BaseTestClass {

    @Test
    public void deleteAccountTest() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnProfileButton();
        profilePage.clickOnAccountManagementButton();
        accountManagementPage.clickOnDeleteAccountButton();
        accountManagementPage.clickOnConfirmDeleteAccountButton();
        assertTrue(startPage.findTutorialTitle());
    }
}

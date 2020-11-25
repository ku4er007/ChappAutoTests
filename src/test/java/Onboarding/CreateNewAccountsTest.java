package Onboarding;

import BaseSettingsPages.BaseTestClass;
import BaseSettingsPages.BaseTestClassForCreateNewAccount;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CreateNewAccountsTest extends BaseTestClassForCreateNewAccount {

    @Test
    public void createNewAccountAndDeleteAccount() {
        createPersonalProfileForm.enterFirstName();
        createPersonalProfileForm.enterLastName();
        createPersonalProfileForm.clickOnCreateButton();
        welcomeToChappPage.findPageTitle();
//        welcomeToChappPage.clickOnStartChappingButton();             //click on Start Capping button
        welcomeToChappPage.clickOnCreateWorkProfile();
        createWorkProfileForm.enterFirstName();
        createWorkProfileForm.enterLastName();
        createWorkProfileForm.enterCompany();
        createWorkProfileForm.enterTitle();
        createWorkProfileForm.enterCorrectEmail();
        createWorkProfileForm.clickOnCreateButton();
//        createWorkProfileForm.clickOnSkipButton();
        tutorialScreen.clickOnOKButtonOnAlert();
        tutorialScreen.clickAllowContactButton();
        tutorialScreen.closedTutorialButton();
        tutorialScreen.waitForPageLoad();
        assertTrue(chatListPage.checkIsPageLoad());

    }
}

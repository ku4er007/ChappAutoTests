package ContactsPage;

import BaseSettingsPages.*;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertTrue;

public class ContactsPageTests extends BaseTestClass {

    @Test
    public void clickOnShareAppLinkTest() {
        assertTrue(chatListPage.checkIsPageLoad());
        bottomBar.clickOnContactsButton();
        contactsPage.clickOnShareAppHyperlink();
        contactsPage.waitForPageLoad();
        contactsPage.waitShareMenuTitle();
    }

    @Test
    public void clickOnInviteToChappButtonTest() {
        assertTrue(chatListPage.checkIsPageLoad());
        tutorialScreen.waitForPageLoad();
        bottomBar.clickOnContactsButton();
        contactsPage.clickOnInviteContactButton();
        contactsPage.checkMessageText();
    }

    @Test
    public void searchInContactTest() {
        assertTrue(chatListPage.checkIsPageLoad());
        tutorialScreen.waitForPageLoad();
        bottomBar.clickOnContactsButton();
        contactsPage.clickOnSearchButton();
        contactsPage.enterSearchQuery();
        contactsPage.checkContactDisplayedaAndClickOnIt();
        chatDetailsPage.checkEmptyChatDetailsIsDisplayed();
    }

    @Test
    public void goToProfilePage() {
        chatDetailsPage.clickOnBackButton();
        contactsPage.clickOnBackFromSearchButton();
        bottomBar.clickOnProfileButton();
        profilePage.clickOnAccountManagementButton();


    }
}

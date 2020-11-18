import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

public class CreateNewAccountsTest extends BaseTestClass {

    @Test
    public void createNewAccountAndDeleteAccount() {
        startPage.clickOnStartMessagingButton();
        startPage.clickOnSelectCountryButton();
        startPage.waitForPageLoad();

        selectCountryPage.clickOnSearchInputField();
        selectCountryPage.waitForPageLoad();
        selectCountryPage.findAndSendCountry();
        selectCountryPage.waitForPageLoad();
        selectCountryPage.clickOnAmericaButtonFromList();

        startPage.enterPhoneNumber();
        startPage.clickOnAcceptCheckBox();
        startPage.clickOnSendMeTheCodeButton();
        startPage.waitForPageLoad();

        enterCodePage.enterSmsCode();
        enterCodePage.waitForPageLoad();
        enterCodePage.clickOnConfirmButton();

        //create new account
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

        bottomBar.clickOnProfileButton();
        profilePage.clickOnAccountManagementButton();
        accountManagementPage.clickOnDeleteAccountButton();
        accountManagementPage.clickOnConfirmDeleteAccountButton();
        startPage.findTutorialTitle();

    }
}

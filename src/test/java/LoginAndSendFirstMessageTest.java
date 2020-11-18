import BaseSettingsPages.*;
import org.testng.annotations.Test;

public class LoginAndSendFirstMessageTest extends BaseTestClass  {


    @Test
    public void logInAndSendFirstMessage() {
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

        tutorialScreen.clickOnOKButtonOnAlert();
        tutorialScreen.clickAllowContactButton();
        tutorialScreen.closedTutorialButton();
        tutorialScreen.waitForPageLoad();

        chatListPage.clickOnCreateNewChatButton();
        chatListPage.waitForPageLoad();
        chatListPage.clickOnChappFilter();
        chatListPage.clickOnChappContactFilter();
        chatListPage.findAndClickOnContactName();
        chatListPage.waitForPageLoad();

        chatDetailsPage.findAndClickOnMessageInputField();
        chatDetailsPage.enterMessage();
        chatDetailsPage.clickOnSendMessageButton();
        chatDetailsPage.clickOnBackButton();

        chatListPage.checkCreatedChat();
    }
}

import BaseSettingsPages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class ContactsPageTests {
    AppiumDriver appiumDriver;
    ContactsPage contactsPage;
    BottomBar bottomBar;
    TutorialScreen tutorialScreen;
    EnterCodePage enterCodePage;
    SelectCountryPage selectCountryPage;
    StartPage startPage;
    ChatDetailsPage chatDetailsPage;
    ProfilePage profilePage;



    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy J7 Neo");
        capabilities.setCapability(MobileCapabilityType.UDID, "52000f75b87e947d");
        URL serverAddress = new URL("http://0.0.0.0:4723/wd/hub");

        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200);
        capabilities.setCapability("appPackage", "o.chappme.chapp.android");
        capabilities.setCapability("appActivity", "o.chappme.chapp.android.ui.host.HostActivity");
        capabilities.setCapability("platformName", "Android");

        appiumDriver = new AndroidDriver(serverAddress, capabilities);
        contactsPage = new ContactsPage(appiumDriver);
        bottomBar = new BottomBar(appiumDriver);
        tutorialScreen = new TutorialScreen(appiumDriver);
        enterCodePage = new EnterCodePage(appiumDriver);
        selectCountryPage = new SelectCountryPage(appiumDriver);
        startPage = new StartPage(appiumDriver);
        chatDetailsPage = new ChatDetailsPage(appiumDriver);
        profilePage = new ProfilePage(appiumDriver);
    }

//    @Test
//    public void shareAppMenuTest() {
//        StartPage startPage = new StartPage(appiumDriver);
//        startPage.clickOnStartMessagingButton();
//        startPage.clickOnSelectCountryButton();
//        startPage.waitForPageLoad();
//
//        SelectCountryPage selectCountryPage = new SelectCountryPage(appiumDriver);
//        selectCountryPage.clickOnSearchInputField();
//        selectCountryPage.waitForPageLoad();
//        selectCountryPage.findAndSendCountry();
//        selectCountryPage.waitForPageLoad();
//        selectCountryPage.clickOnAmericaButtonFromList();
//
//        startPage.enterPhoneNumber();
//        startPage.clickOnAcceptCheckBox();
//        startPage.hideKeyBoard();
////        startPage.minimizeKeyboard();
//        startPage.clickOnSendMeTheCodeButton();
//        startPage.waitForPageLoad();
//
//        EnterCodePage enterCodePage = new EnterCodePage(appiumDriver);
//        enterCodePage.enterSmsCode();
//        enterCodePage.waitForPageLoad();
//        enterCodePage.hideKeyBoard();
//        enterCodePage.clickOnConfirmButton();
//
//        TutorialScreen tutorialScreen = new TutorialScreen(appiumDriver);
//        tutorialScreen.clickOnOKButtonOnAlert();
//        tutorialScreen.clickAllowContactButton();
//        tutorialScreen.closedTutorialButton();
//        tutorialScreen.waitForPageLoad();
//
//        BottomBar bottomBar = new BottomBar(appiumDriver);
//        bottomBar.clickOnContactsButton();
//
//        ContactsPage contactsPage = new ContactsPage(appiumDriver);
//        contactsPage.clickOnShareAppHyperlink();
//        contactsPage.waitForPageLoad();
//        contactsPage.waitShareMenuTitle();
//    }
//
//    @Test
//    public void inviteToChappTest() {
//        startPage.clickOnStartMessagingButton();
//        startPage.clickOnSelectCountryButton();
//        startPage.waitForPageLoad();
//
//        selectCountryPage.clickOnSearchInputField();
//        selectCountryPage.waitForPageLoad();
//        selectCountryPage.findAndSendCountry();
//        selectCountryPage.waitForPageLoad();
//        selectCountryPage.clickOnAmericaButtonFromList();
//
//        startPage.enterPhoneNumber();
//        startPage.clickOnAcceptCheckBox();
//        startPage.clickOnSendMeTheCodeButton();
//        startPage.waitForPageLoad();
//
//        enterCodePage.enterSmsCode();
//        enterCodePage.waitForPageLoad();
//        enterCodePage.clickOnConfirmButton();
//
//        tutorialScreen.clickOnOKButtonOnAlert();
//        tutorialScreen.clickAllowContactButton();
//        tutorialScreen.closedTutorialButton();
//        tutorialScreen.waitForPageLoad();
//
//        bottomBar.clickOnContactsButton();
//
//        contactsPage.clickOnInviteContactButton();
//        contactsPage.checkMessageText();
//    }

    @Test
    public void contactSearchTest() {
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
        startPage.hideKeyBoard();
        startPage.clickOnSendMeTheCodeButton();
        startPage.waitForPageLoad();

        enterCodePage.enterSmsCode();
        enterCodePage.waitForPageLoad();
        startPage.hideKeyBoard();
        enterCodePage.clickOnConfirmButton();

        tutorialScreen.clickOnOKButtonOnAlert();
        tutorialScreen.clickAllowContactButton();
        tutorialScreen.closedTutorialButton();
        tutorialScreen.waitForPageLoad();

        bottomBar.clickOnContactsButton();

        contactsPage.clickOnSearchButton();
        contactsPage.enterSearchQuery();
        contactsPage.checkContactDisplayedaAndClickOnIt();
        chatDetailsPage.checkChatDetailsIsDisplayed();
    }

    @Test
    public void goToProfilePage() {
        chatDetailsPage.clickOnBackButton();
        contactsPage.clickOnBackFromSearchButton();
        bottomBar.clickOnProfileButton();
        profilePage.clickOnAccountManagementButton();


    }
}

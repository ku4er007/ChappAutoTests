import BaseSettingsPages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;


public class FirstTest {
    AppiumDriver appiumDriver;


    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S8");
        capabilities.setCapability(MobileCapabilityType.UDID, "ce091829a2601a2201");
        URL serverAddress = new URL("http://0.0.0.0:4723/wd/hub");

        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200);
        capabilities.setCapability("appPackage", "o.chappme.chapp.android");
        capabilities.setCapability("appActivity", "o.chappme.chapp.android.ui.host.HostActivity");
        capabilities.setCapability("platformName", "Android");

        appiumDriver = new AndroidDriver(serverAddress, capabilities);
    }

    @Test
    public void logInAndSendFirstMessage() {
        StartPage startPage = new StartPage(appiumDriver);
        startPage.clickOnStartMessagingButton();
        startPage.clickOnSelectCountryButton();
        startPage.waitForPageLoad();

        SelectCountryPage selectCountryPage = new SelectCountryPage(appiumDriver);
        selectCountryPage.clickOnSearchInputField();
        selectCountryPage.waitForPageLoad();
        selectCountryPage.findAndSendCountry();
        selectCountryPage.waitForPageLoad();
        selectCountryPage.clickOnAmericaButtonFromList();

        startPage.enterPhoneNumber();
        startPage.clickOnAcceptCheckBox();
        startPage.clickOnSendMeTheCodeButton();
        startPage.waitForPageLoad();

        EnterCodePage enterCodePage = new EnterCodePage(appiumDriver);
        enterCodePage.enterSmsCode();
        enterCodePage.waitForPageLoad();
        enterCodePage.clickOnConfirmButton();

        TutorialScreen tutorialScreen = new TutorialScreen(appiumDriver);
        tutorialScreen.clickOnOKButtonOnAlert();
        tutorialScreen.clickAllowContactButton();
        tutorialScreen.closedTutorialButton();
        tutorialScreen.waitForPageLoad();

        ChatListPage chatListPage = new ChatListPage(appiumDriver);
        chatListPage.clickOnCreateNewChatButton();
        chatListPage.waitForPageLoad();
        chatListPage.clickOnChappFilter();
        chatListPage.clickOnChappContactFilter();
        chatListPage.findAndClickOnContactName();
        chatListPage.waitForPageLoad();

        ChatDetailsPage chatDetailsPage = new ChatDetailsPage(appiumDriver);
        chatDetailsPage.findAndClickOnMessageInputField();
        chatDetailsPage.enterMessage();
        chatDetailsPage.clickOnSendMessageButton();
        chatDetailsPage.clickOnBackButton();

        chatListPage.checkCreatedChat();
    }

    @Test
    public void createNewAccountAndDeleteAccount(){
        StartPage startPage = new StartPage(appiumDriver);
        startPage.clickOnStartMessagingButton();
        startPage.clickOnSelectCountryButton();
        startPage.waitForPageLoad();

        SelectCountryPage selectCountryPage = new SelectCountryPage(appiumDriver);
        selectCountryPage.clickOnSearchInputField();
        selectCountryPage.waitForPageLoad();
        selectCountryPage.findAndSendCountry();
        selectCountryPage.waitForPageLoad();
        selectCountryPage.clickOnAmericaButtonFromList();

        startPage.enterPhoneNumber();
        startPage.clickOnAcceptCheckBox();
        startPage.clickOnSendMeTheCodeButton();
        startPage.waitForPageLoad();

        EnterCodePage enterCodePage = new EnterCodePage(appiumDriver);
        enterCodePage.enterSmsCode();
        enterCodePage.waitForPageLoad();
        enterCodePage.clickOnConfirmButton();

        //create new account
        CreatePersonalProfileForm createPersonalProfileForm = new CreatePersonalProfileForm(appiumDriver);
        createPersonalProfileForm.enterFirstName();
        createPersonalProfileForm.enterLastName();
        createPersonalProfileForm.clickOnCreateButton();

        WelcomeToChappPage welcomeToChappPage = new WelcomeToChappPage(appiumDriver);
        welcomeToChappPage.findPageTitle();
//        welcomeToChappPage.clickOnStartChappingButton();             //click on Start Capping button
        welcomeToChappPage.clickOnCreateWorkProfile();

        CreateWorkProfileForm createWorkProfileForm = new CreateWorkProfileForm(appiumDriver);
        createWorkProfileForm.enterFirstName();
        createWorkProfileForm.enterLastName();
        createWorkProfileForm.enterCompany();
        createWorkProfileForm.enterTitle();
        createWorkProfileForm.enterCorrectEmail();
        createWorkProfileForm.clickOnCreateButton();
//        createWorkProfileForm.clickOnSkipButton();

        TutorialScreen tutorialScreen = new TutorialScreen(appiumDriver);
        tutorialScreen.clickOnOKButtonOnAlert();
        tutorialScreen.clickAllowContactButton();
        tutorialScreen.closedTutorialButton();
        tutorialScreen.waitForPageLoad();

        BottomBar bottomBar = new BottomBar(appiumDriver);
        bottomBar.clickOnProfileButton();

        ProfilePage profilePage = new ProfilePage(appiumDriver);
        profilePage.clickOnAccountManagementButton();

        AccountManagementPage accountManagementPage = new AccountManagementPage(appiumDriver);
        accountManagementPage.clickOnDeleteAccountButton();
        accountManagementPage.clickOnConfirmDeleteAccountButton();
        startPage.findTutorialTitle();












    }
}

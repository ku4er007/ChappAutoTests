package BaseSettingsPages;

import ChatListPages.ChatListPage;
import ChatListPages.TutorialScreen;
import OnboardingPages.*;
import ProfilePages.AccountManagementPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class BaseTestClassForCreateNewAccount {
    AppiumDriver appiumDriver;

    //app pages and elements for create new accounts

    public TutorialScreen tutorialScreen;
    public EnterCodePage enterCodePage;
    public SelectCountryPage selectCountryPage;
    public StartPage startPage;


    public ChatListPage chatListPage;
    public CreatePersonalProfileForm createPersonalProfileForm;
    public WelcomeToChappPage welcomeToChappPage;
    public CreateWorkProfileForm createWorkProfileForm;
    public AccountManagementPage accountManagementPage;


    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a XL");
        capabilities.setCapability(MobileCapabilityType.UDID, "92TAX02Z0Z");
        URL serverAddress = new URL("http://0.0.0.0:4723/wd/hub");

        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200);
        capabilities.setCapability("appPackage", "o.chappme.chapp.android");
        capabilities.setCapability("appActivity", "o.chappme.chapp.android.ui.host.HostActivity");
        capabilities.setCapability("platformName", "Android");

        //app pages/elements constructors for create new accounts
        appiumDriver = new AndroidDriver(serverAddress, capabilities);

        tutorialScreen = new TutorialScreen(appiumDriver);
        enterCodePage = new EnterCodePage(appiumDriver);
        selectCountryPage = new SelectCountryPage(appiumDriver);
        startPage = new StartPage(appiumDriver);

        chatListPage = new ChatListPage(appiumDriver);
        createPersonalProfileForm = new CreatePersonalProfileForm(appiumDriver);
        welcomeToChappPage = new WelcomeToChappPage(appiumDriver);
        createWorkProfileForm = new CreateWorkProfileForm(appiumDriver);
        accountManagementPage = new AccountManagementPage(appiumDriver);

        //login app process for create new account
        startPage.clickOnStartMessagingButton();
        startPage.waitForPageLoad();
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
        enterCodePage.hideKeyBoard();
        enterCodePage.clickOnConfirmButton();

    }
}

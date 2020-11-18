package BaseSettingsPages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public abstract class BaseTestClass {
    AppiumDriver appiumDriver;

    //all app pages and elements
    public ContactsPage contactsPage;
    public BottomBar bottomBar;
    public TutorialScreen tutorialScreen;
    public EnterCodePage enterCodePage;
    public SelectCountryPage selectCountryPage;
    public StartPage startPage;
    public ChatDetailsPage chatDetailsPage;
    public ProfilePage profilePage;
    public ChatListPage chatListPage;
    public CreatePersonalProfileForm createPersonalProfileForm;
    public WelcomeToChappPage welcomeToChappPage;
    public CreateWorkProfileForm createWorkProfileForm;
    public AccountManagementPage accountManagementPage;


    @BeforeClass
    public void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        URL serverAddress = new URL("http://0.0.0.0:4723/wd/hub");

        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 200);
        capabilities.setCapability("appPackage", "o.chappme.chapp.android");
        capabilities.setCapability("appActivity", "o.chappme.chapp.android.ui.host.HostActivity");
        capabilities.setCapability("platformName", "Android");

        //all app pages/elements constructors
        appiumDriver = new AndroidDriver(serverAddress, capabilities);
        contactsPage = new ContactsPage(appiumDriver);
        bottomBar = new BottomBar(appiumDriver);
        tutorialScreen = new TutorialScreen(appiumDriver);
        enterCodePage = new EnterCodePage(appiumDriver);
        selectCountryPage = new SelectCountryPage(appiumDriver);
        startPage = new StartPage(appiumDriver);
        chatDetailsPage = new ChatDetailsPage(appiumDriver);
        profilePage = new ProfilePage(appiumDriver);
        chatListPage = new ChatListPage(appiumDriver);
        createPersonalProfileForm = new CreatePersonalProfileForm(appiumDriver);
        welcomeToChappPage = new WelcomeToChappPage(appiumDriver);
        createWorkProfileForm = new CreateWorkProfileForm(appiumDriver);
        accountManagementPage = new AccountManagementPage(appiumDriver);

        //login app process for all tests
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
        enterCodePage.hideKeyBoard();
        enterCodePage.clickOnConfirmButton();
        tutorialScreen.clickOnOKButtonOnAlert();
        tutorialScreen.clickAllowContactButton();
        tutorialScreen.closedTutorialButton();
        tutorialScreen.waitForPageLoad();
    }
}

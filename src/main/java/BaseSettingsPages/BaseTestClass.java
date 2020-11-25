package BaseSettingsPages;

import BottomBarElements.BottomBar;
import ChatListPages.ChatDetailsPage;
import ChatListPages.ChatListPage;
import ChatListPages.GroupChat;
import ChatListPages.TutorialScreen;
import ContactsPages.ContactsPage;
import NotificationPages.NotificationPage;
import OnboardingPages.*;
import ProfilePages.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public abstract class BaseTestClass {
    AppiumDriver appiumDriver;
    //all app pages and elements:***************************************************************************************
    public ContactsPage contactsPage;
    public BottomBar bottomBar;
    public TutorialScreen tutorialScreen;
    public EnterCodePage enterCodePage;
    public SelectCountryPage selectCountryPage;
    public StartPage startPage;
    public ChatDetailsPage chatDetailsPage;
    public ProfilePage profilePage;
    public EditPersonalProfile editPersonalProfile;
    public EditWorkProfile editWorkProfile;
    public ChatListPage chatListPage;
    public CreatePersonalProfileForm createPersonalProfileForm;
    public WelcomeToChappPage welcomeToChappPage;
    public CreateWorkProfileForm createWorkProfileForm;
    public AccountManagementPage accountManagementPage;
    public MuteProfilePage muteProfilePage;
    public MuteWorkProfilePage muteWorkProfilePage;
    public InfoTutorialPages infoTutorialPages;
    public NotificationPage notificationPage;
    public GroupChat groupChat;
    //All Test Data:********************************************************************************************************
    public String personalTextMessage = "first Message text TEST TEST tEST";
    public By checkPersonalTextMessage = By.xpath("//android.widget.TextView[contains(@text,'first Message text TEST TEST tEST')]");
    public String workTextMessage = "Work Work Work Work Work Message";
    public By checkWorkTextMessage = By.xpath("//android.widget.TextView[contains(@text,'Work Work Work Work Work Message')]");
    public By firstGroupMember = By.xpath("//android.widget.TextView[contains(@text,'Pixel 3a XL')]");
    public By secondGroupMember = By.xpath("//android.widget.TextView[contains(@text,'Samsung J7')]");
    public By thirdGroupMember = By.xpath("//android.widget.TextView[contains(@text,'Maks Shvec')]");
    public By fourGroupMember = By.xpath("//android.widget.TextView[contains(@text,'Айфон Х')]");
    public String personalGroupName = "My own Group";
    public String personalGroupDescription = "Description of My Own Test Group chat. Welcome!!!";
    public String searchQuery = "Const";
    public String editFirstPersonalName = "Константин";
    public String editLastPersonalName = "Дорошенко";
    public By newFullPersonalName = By.xpath("//android.widget.TextView[contains(@text,'Константин Дорошенко')]");
    public By newPersonalNameWithoutLastName = By.xpath("//android.widget.TextView[contains(@text,'Константин')]");
    public String editFirstWorkName = "Constantine";
    public String editLastWorkName = "Doroshenko WORK";
    public String editCompanyWorkName = "The MindStudios";
    public String editTitleWorkName = "Good specialist";
    public String editEmailWorkName = "k.doroshenko@themindstudios.com";
    public By newFullWorkName = By.xpath("//android.widget.TextView[contains(@text,'Constantine Doroshenko WORK')]");
    public By newWorkCompanyNameAndNewTitle = By.xpath("//android.widget.TextView[contains(@text,'Good specialist at The MindStudios')]");
    public By newWorkEmail = By.xpath("//android.widget.TextView[contains(@text,'k.doroshenko@themindstudios.com')]");
    public String editInvalidEmailWorkName1 = "k.doro";
    public String editInvalidEmailWorkName2 = "k.doroshenko@the";
    public String editInvalidEmailWorkName3 = "k.doroshenko@themindstudios.c";
    public String startMuteHourData = "12";
    public String startMuteMinuteData = "30";
    public String endMuteHourData = "17";
    public String endMuteMinuteData = "40";
    public By monday = By.xpath("//android.widget.CheckedTextView[contains(@text,'Monday')]");
    public By tuesday = By.xpath("//android.widget.CheckedTextView[contains(@text,'Tuesday')]");
    public By friday = By.xpath("//android.widget.CheckedTextView[contains(@text,'Friday')]");
    public By sunday = By.xpath("//android.widget.CheckedTextView[contains(@text,'Sunday')]");

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

        //all app pages/elements constructors***************************************************************************
        appiumDriver = new AndroidDriver(serverAddress, capabilities);
        contactsPage = new ContactsPage(appiumDriver);
        bottomBar = new BottomBar(appiumDriver);
        tutorialScreen = new TutorialScreen(appiumDriver);
        enterCodePage = new EnterCodePage(appiumDriver);
        selectCountryPage = new SelectCountryPage(appiumDriver);
        startPage = new StartPage(appiumDriver);
        chatDetailsPage = new ChatDetailsPage(appiumDriver);
        profilePage = new ProfilePage(appiumDriver);
        editPersonalProfile = new EditPersonalProfile(appiumDriver);
        editWorkProfile = new EditWorkProfile(appiumDriver);
        chatListPage = new ChatListPage(appiumDriver);
        createPersonalProfileForm = new CreatePersonalProfileForm(appiumDriver);
        welcomeToChappPage = new WelcomeToChappPage(appiumDriver);
        createWorkProfileForm = new CreateWorkProfileForm(appiumDriver);
        accountManagementPage = new AccountManagementPage(appiumDriver);
        muteProfilePage = new MuteProfilePage(appiumDriver);
        muteWorkProfilePage = new MuteWorkProfilePage(appiumDriver);
        infoTutorialPages = new InfoTutorialPages(appiumDriver);
        notificationPage = new NotificationPage(appiumDriver);
        groupChat = new GroupChat(appiumDriver);
        //login app process for all tests*******************************************************************************
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
//      enterCodePage.hideKeyBoard();
        enterCodePage.clickOnConfirmButton();
        tutorialScreen.clickOnOKButtonOnAlert();
        tutorialScreen.clickAllowContactButton();
        tutorialScreen.closedTutorialButton();
        tutorialScreen.waitForPageLoad();
    }
}

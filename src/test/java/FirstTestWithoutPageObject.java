import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FirstTestWithoutPageObject {

    AppiumDriver appiumDriver;


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

        appiumDriver = new AndroidDriver(serverAddress, capabilities);
    }

    @Test
    public void firstTest() {


        WebElement startMessagingButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'slidesStartMessagingBtn')]"));
        startMessagingButton.click();
        WebElement selectCountryButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'enterPhoneTvCountry')]"));
        selectCountryButton.click();
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement countrySearchButton = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'search_button')]"));
        countrySearchButton.click();
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'search_src_text')]")).sendKeys("united states of");
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement americaCountryButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'countryNameTv')]"));
        americaCountryButton.click();

        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'inputPhoneEtInput')]")).sendKeys("010101010");
        WebElement acceptCheckBox = appiumDriver.findElement(By.xpath("//android.widget.CheckBox[contains(@resource-id,'enterPhoneCbAgree')]"));
        acceptCheckBox.click();
        WebElement sendMeTheCodeButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'enterPhoneTvSendCode')]"));
        sendMeTheCodeButton.click();
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.EditText")).sendKeys("10");
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")).sendKeys("10");
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.EditText")).sendKeys("10");
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.EditText")).sendKeys("10");
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement confirmButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'confirmCodeBtnSubmit')]"));
        confirmButton.click();
        WebElement okButtonOnAlert = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'button1')]"));
        okButtonOnAlert.click();

        WebElement allowContactButton = appiumDriver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_button')]"));
        allowContactButton.click();
        WebElement closedTutorialButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'newChat')]"));
        closedTutorialButton.click();
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement createNewChatButton = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'newChat')]"));
        createNewChatButton.click();
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement contactFilter = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'pickContactFilter')]"));
        contactFilter.click();

        WebElement chappContactItem = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'filterTvChappContacts')]"));
        chappContactItem.click();
        WebElement chappContactName = appiumDriver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Constantine')]"));
        chappContactName.click();
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement messageInputField = appiumDriver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'chatDetailsInputRl')]"));
        messageInputField.click();


        appiumDriver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'chatDetailsEditText')]")).sendKeys("first Message text");
        WebElement sendMessageButton = appiumDriver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'chatDetailsCancelIv')]"));
        sendMessageButton.click();

        WebElement backButton = appiumDriver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Перейти вверх\"]"));
        backButton.click();

        WebElement createdChatEntity = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout"));
        createdChatEntity.isDisplayed();


    }
}


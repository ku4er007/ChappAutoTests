package ChatsPageTests;

import BaseSettingsPages.BaseTestClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CreateNewOneToOneChat extends BaseTestClass {

    @Test(priority = 1)
    public void mainScreenElementsPersonalProfileUiTest() {

        assertTrue(chatListPage.checkIsPageLoad());



    }
}

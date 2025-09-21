package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTests extends BaseTests {
    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPressesLink();
        keyPage.enterText("R"+ Keys.BACK_SPACE);
        Assert.assertTrue(keyPage.getResult().contains("You entered: BACK_SPACE"));

    }
    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPressesLink();
        keyPage.enterPi();
        Assert.assertTrue(keyPage.getResult().contains("4"));
    }
}

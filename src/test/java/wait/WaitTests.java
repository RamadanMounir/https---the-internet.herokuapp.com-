package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilHidden(){
       var dynamicLoadingPage =  homePage.clickDynamicLoadingLink();
        var dynamicallyLoadedElementsPage = dynamicLoadingPage.clickexample1();
        dynamicallyLoadedElementsPage.clickStartButton();
        Assert.assertEquals(dynamicallyLoadedElementsPage.getLoadedText(),"Hello World!");
    }
}

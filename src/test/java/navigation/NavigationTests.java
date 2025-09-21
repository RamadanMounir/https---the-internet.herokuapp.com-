package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigation(){
        homePage.clickInfiniteScrollLink().scrollToParagraph(8);
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goTo("https://www.google.com");
    }
}

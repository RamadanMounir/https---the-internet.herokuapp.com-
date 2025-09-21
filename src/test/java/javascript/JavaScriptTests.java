package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScrollToTable(){
       var largeDeepDomPage =  homePage.clickLargeDeepDOMLink();
       largeDeepDomPage.scrollToTable();
    }
    @Test
    public void testScrollToInfiniteParagraph(){
        homePage.clickInfiniteScrollLink().scrollToParagraph(8);
    }
}

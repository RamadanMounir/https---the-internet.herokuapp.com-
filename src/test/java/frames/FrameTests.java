package frames;

import base.BaseTests;
import org.testng.annotations.Test;

public class FrameTests extends BaseTests {
    @Test
    public void testWYSIWYGFrame(){
        var wysiwyg = homePage.clickWYSIWYGEditorLink();
        wysiwyg.switchToEditArea();
        //     wysiwyg.clearTextArea();
        //     wysiwyg.SetTextToTextArea("tfjghjv");

    }
}

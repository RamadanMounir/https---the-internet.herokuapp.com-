package dropdown;

import Pages.DropDownPage;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        String option = "Option 1";
        DropDownPage dropDownPage = homePage.clickDropDownLink();
        dropDownPage.selectFromDropDown(option);
        var SelectedOptions = dropDownPage.getSelectedOptions();
        Assert.assertEquals(
                SelectedOptions.size(),
                1,
                "incorrect number of selections");
        Assert.assertTrue(SelectedOptions.contains(option),
                "option not selected");

    }
}

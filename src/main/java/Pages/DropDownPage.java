package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }
    private By dropdown = By.id("dropdown");

    public void selectFromDropDown(String option){
        findDropDownElement(dropdown).selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        /* selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
         - selectedElements = the elements were selected on a dropdown
         - stream() = function to streaming on selected elements
         - map()=the map() function is a method primarily found within the Stream API ,It is
           an intermediate operation that
           transforms elements of a stream by applying a given function to each element
         - e->e.getText() = it's a lambda expression use e=elements -> action
         - getText() function to get text from element
         - e->e.getText() = get the text from each element
           collect(Collectors.toList() = collect them to a list.
        */
        List<WebElement> selectedElements =
                findDropDownElement(dropdown).getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement(By locator){
        return new Select(driver.findElement(locator));
    }
}

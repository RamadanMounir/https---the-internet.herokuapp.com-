package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }

    private By Example1_Element_Page_That_is_hidden = new By.ByXPath("//a[contains(text(),'Example 1')]");

    public DynamicallyLoadedElementsPage clickexample1(){
        driver.findElement(Example1_Element_Page_That_is_hidden).click();
        return new DynamicallyLoadedElementsPage(driver);
    }
}

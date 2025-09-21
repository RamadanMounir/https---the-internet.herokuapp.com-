package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage clickFormAuthenticationLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

public DropDownPage clickDropDownLink(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
}
public KeyPressesPage clickKeyPressesLink(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
}
public JavaScriptAlertsPage clickJavaScriptAlertsLink(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
}
public WYSIWYGEditorPage clickWYSIWYGEditorLink(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
}
public DynamicLoadingPage clickDynamicLoadingLink(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
}
public LargeAndDeepDomPage clickLargeDeepDOMLink(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);

}
public InfiniteScrollPage clickInfiniteScrollLink(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
}


private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
}

}

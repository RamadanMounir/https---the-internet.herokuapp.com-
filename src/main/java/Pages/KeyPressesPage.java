package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    public KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }

    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public void enterPi(){
        enterText(Keys.chord("P"+"i")+" = 3.14");
    }

    public String getResult(){
       return driver.findElement(resultText).getText();
    }
}

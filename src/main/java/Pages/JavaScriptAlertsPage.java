package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;

    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }
    private By triggerAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath("//button[text()='Click for JS Prompt']");

    private By results = By.id("result");

    public void clickTriggerAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }

    public void alert_click_To_Accept(){
        driver.switchTo().alert().accept();
    }
    public void clickTriggerConfirmButton(){
        driver.findElement(triggerConfirmButton).click();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_click_To_Dismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void clickTriggerPromptButton(){
        driver.findElement(triggerPromptButton).click();
    }
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getAlertResult(){
        return driver.findElement(results).getText();
    }

}

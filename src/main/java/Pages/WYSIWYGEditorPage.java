package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }
    private String editorFrameId ="mce_0_ifr";
    private By textArea = By.id("tinymce");

    public void switchToEditArea(){
        driver.switchTo().frame(editorFrameId);
    }
    public void clearTextArea(){
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void SetTextToTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

}

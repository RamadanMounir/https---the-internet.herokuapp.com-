package base;

import Pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTests {
private WebDriver driver;
protected HomePage homePage;

private String URL="https://the-internet.herokuapp.com/";

@BeforeClass
public void setUp(){
    driver=new ChromeDriver(getChromeOptions());
    homePage = new HomePage(driver);
    driver.manage().window().maximize();
    goHome();
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
    System.out.println("Website Name is "+driver.getTitle());
}
@BeforeMethod
public void goHome(){
    driver.get(URL);
}

@AfterMethod
public void recordFailure(ITestResult result){
    if (ITestResult.FAILURE == result.getStatus()){
        var camera =(TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot,new File("resources/screenshots/"+result.getName()+".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
private ChromeOptions getChromeOptions(){
    ChromeOptions options = new ChromeOptions();
    options.getBrowserName();
    options.getBrowserVersion();
   // options.addArguments("--headless=new");
    return options;
}

@AfterClass
    public void tearDown(){
    driver.quit();
}
public WindowManager getWindowManager(){
    return new WindowManager(driver);
}
}

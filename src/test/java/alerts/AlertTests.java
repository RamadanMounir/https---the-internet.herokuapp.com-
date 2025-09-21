package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlertsLink();
        alertsPage.clickTriggerAlertButton();
        alertsPage.alert_click_To_Accept();
        Assert.assertEquals(alertsPage.getAlertResult(),"You successfully clicked an alert");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlertsLink();
        alertsPage.clickTriggerConfirmButton();
        Assert.assertEquals(alertsPage.alert_getText(),"I am a JS Confirm");
        alertsPage.alert_click_To_Dismiss();
        Assert.assertEquals(alertsPage.getAlertResult(),"You clicked: Cancel");
    }
    @Test
    public void testSetInputToAlert(){
        var alertsPage = homePage.clickJavaScriptAlertsLink();
        alertsPage.clickTriggerPromptButton();
        String text = "Ramadan";
        alertsPage.alert_setInput(text);
        alertsPage.alert_click_To_Accept();
        Assert.assertTrue(alertsPage.getAlertResult().contains(text));
    }
}

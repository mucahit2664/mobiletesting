package Appium;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class Toast extends Base {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = lunchAndroid();

        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();

        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        Thread.sleep(2000);

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Popup Menu\"))");
        driver.findElementByXPath("//*[@text='Popup Menu']").click();
        Thread.sleep(2000);
        driver.findElementByClassName("android.widget.Button").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.TextView[@text='Add']").click();
/*
most of the time Toast messages does have object, so it will like spy element but we know that devs are using as a classname
 "android.widget.Toast" for the toast message. So if there is single toast message we can use findElementByClassName(), if
 there are multiple toast messages we can use index as android.widget.Toast[1]
 */
        Assert.assertTrue(driver.findElementByClassName("android.widget.Toast").isDisplayed());

    }
}

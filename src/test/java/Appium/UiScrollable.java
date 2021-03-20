package Appium;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;

import java.net.MalformedURLException;

public class UiScrollable extends Base{
    @Test
    public void test() throws MalformedURLException {
        AndroidDriver driver = lunchAndroid();

        driver.findElementByXPath("//*[@text='API Demos']").click();

        driver.findElementByXPath("//*[@text='Views']").click();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Visibility\"))");

        driver.findElementByXPath("//*[@text='Visibility']").click();

    }
}

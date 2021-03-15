package Appium;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class TextCheckRadioSwitch extends Base {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
       AndroidDriver driver = lunchAndroid();
        /*
        click API Demos
        click preference
        click preference dependencies
        checked WiFi box
        click Wifi setting
        send text to text box
        click ok
         */
        driver.findElementByXPath("//*[@text='API Demos']").click();
        driver.findElementByXPath("//*[@text='Preference']").click();
        driver.findElementByXPath("//*[@text='3. Preference dependencies']").click();

        WebElement checkBox = driver.findElementById("android:id/checkbox");
        checkBox.click();


        driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
        Thread.sleep(3000);
        driver.findElementById("android:id/edit").sendKeys("Hello World!");
        driver.findElementById("android:id/button1").click();





    }
}

package Appium;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

public class UiSelectorPrac extends Base {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = lunchAndroid();


        /*
        Lunch API Demos =>Preference =>
        Preference  dependencies
        WiFi check box
        verify checkbox checked
        WiFi setting => input a text for Text box
        click OK button
         */

        driver.findElementByXPath("//android.widget.TextView[@text='API Demos']").click();
        Thread.sleep(3000);

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        Thread.sleep(3000);

        List<WebElement> checkBox = driver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"android:id/checkbox\").checked(false)");
        System.out.println(checkBox.size());

        if (checkBox.size()>0){
           checkBox.get(0).click();
        }


//        String unEnabled = driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\").text(\"WiFi settings\").enabled(false)").getAttribute("enabled");
//
//        if (unEnabled.equals("false")) {
//            driver.findElementById("android:id/checkbox").click();
//        }

        driver.findElementByXPath("//*[@text='WiFi settings']").click();

        driver.findElementById("android:id/edit").sendKeys("Hello World!");
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.Button[@text='OK']").click();

    }
}

package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class UiSelector  {
    /*
    UiSelector() is part of Android SDK. When we try to findElement() with any command in appium it goes directly Android SDK
    and execute android command which we send from mobile. Appium and selenium jars are built on on top of Android SDK. So internally
    they use android files only. when you could not find an element or select element. we can try UiSelector() it will reach directly to the element.
     */
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/mehmetaliayyildiz/IdeaProjects/mobileTesting/src/Apps/GestureTool.apk");
        desiredCapabilities.setCapability("appPackage","com.davemac327.gesture.tool");
        desiredCapabilities.setCapability("appActivity","com.davemac327.gesture.tool.GestureBuilderActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,15);
        AndroidDriver<WebElement> driver  = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(5000);



      // driver.findElementByAndroidUIAutomator("text(\"API Demos\")").click();
    //resorceId
    //    driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\")").click();

        //className
       // driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").index(3)").click();
     //className with index
       // driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").index(2)").click();
        Thread.sleep(3000);

        driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\").enabled(true)");


   }
}

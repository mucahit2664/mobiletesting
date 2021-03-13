package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class GestureApp01 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/mehmetaliayyildiz/IdeaProjects/mobileTesting/src/Apps/GestureTool.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,15);
        AndroidDriver<WebElement> driver  = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(5000);

        /*
lunch GestureTool app
click addGesture button
send text to name box "testing"
click done
verify testing gesture is created
 */
        // driver.findElement(By.id("com.davemac327.gesture.tool:id/addButton")).click();
       // driver.findElementById("com.davemac327.gesture.tool:id/addButton").click();
        driver.findElementByXPath("//android.widget.Button[@text='Add gesture']").click();
        Thread.sleep(3000);
        driver.findElementByClassName("android.widget.EditText").sendKeys("testing");
        Thread.sleep(3000);
        driver.findElementById("com.davemac327.gesture.tool:id/gestures_overlay").click();
        Thread.sleep(3000);
        driver.findElementById("done").click();
        Thread.sleep(3000);

        WebElement titleText = driver.findElementById("android:id/title");


        Assert.assertEquals("Gesture Tool",titleText.getText());





    }
}

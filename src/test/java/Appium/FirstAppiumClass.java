package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.bs.A;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAppiumClass {
     @Test
    public void test() throws MalformedURLException, InterruptedException {
         DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        // desiredCapabilities.setCapability("platformName", "Android");
         //desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME ,"Android");
         desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
         desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
         desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
         desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
         desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/mehmetaliayyildiz/IdeaProjects/mobileTesting/src/Apps/GestureTool.apk");
         desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);

         AndroidDriver<WebElement> driver  = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);

         Thread.sleep(5000);

        // driver.findElement(By.id("com.davemac327.gesture.tool:id/addButton")).click();
         driver.findElementById("com.davemac327.gesture.tool:id/addButton").click();


     }
}

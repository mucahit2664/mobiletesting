package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Dialer {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        // desiredCapabilities.setCapability("platformName", "Android");
        //desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME ,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        //desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/mehmetaliayyildiz/IdeaProjects/mobileTesting/src/Apps/GestureTool.apk");
        desiredCapabilities.setCapability("appPackage", "com.google.android.dialer");
        desiredCapabilities.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);

        driver.findElementById("com.google.android.dialer:id/dialpad_fab").click();

        WebElement num1 = driver.findElementById("com.google.android.dialer:id/one");
        WebElement num2 = driver.findElementById("com.google.android.dialer:id/two");
        WebElement num3 = driver.findElementById("com.google.android.dialer:id/three");
        WebElement num4 = driver.findElementById("com.google.android.dialer:id/four");
        WebElement num5 = driver.findElementById("com.google.android.dialer:id/five");
        WebElement num6 = driver.findElementById("com.google.android.dialer:id/six");
        WebElement num7 = driver.findElementById("com.google.android.dialer:id/seven");
        WebElement num8 = driver.findElementById("com.google.android.dialer:id/eight");
        WebElement num9 = driver.findElementById("com.google.android.dialer:id/nine");
        WebElement num0 = driver.findElementById("com.google.android.dialer:id/zero");

        WebElement dial = driver.findElementById("com.google.android.dialer:id/dialpad_voice_call_button");
        
        num9.click();
        num9.click();
        num1.click();
        dial.click();

        Thread.sleep(5000);
        WebElement endCall = driver.findElementById("com.google.android.dialer:id/incall_end_call");
        endCall.click();


        Thread.sleep(5000);

        driver.quit();

    }

    }

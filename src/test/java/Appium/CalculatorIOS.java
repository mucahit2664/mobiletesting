package Appium;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.WatchEvent;

public class CalculatorIOS {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.1");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        desiredCapabilities.setCapability("bundleId","com.SamadiPour.SimpleCalculator");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15);

        IOSDriver<WebElement> driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(5000);

        WebElement num1 = driver.findElementByAccessibilityId("1");
        WebElement num2 = driver.findElementByAccessibilityId("2");
        WebElement num3 = driver.findElementByAccessibilityId("3");
        WebElement num4 = driver.findElementByAccessibilityId("4");
        WebElement num5 = driver.findElementByAccessibilityId("5");
        WebElement num6 = driver.findElementByAccessibilityId("6");
        WebElement num7 = driver.findElementByAccessibilityId("7");
        WebElement num8 = driver.findElementByAccessibilityId("8");
        WebElement num9 = driver.findElementByAccessibilityId("9");
        WebElement num0 = driver.findElementByAccessibilityId("0");
        WebElement plus = driver.findElementByAccessibilityId("+");
        WebElement minus = driver.findElementByAccessibilityId("-");
        WebElement multiply = driver.findElementByAccessibilityId("*");
        WebElement divide = driver.findElementByAccessibilityId("/");
        WebElement equal = driver.findElementByAccessibilityId("=");


        num1.click();
        num3.click();
        plus.click();
        num2.click();
        num9.click();
        Thread.sleep(2000);
        //preresult
        WebElement preResult =driver.findElementByAccessibilityId("42");
        Assert.assertEquals("42",preResult.getText());
        equal.click();
//       xpath from inpector
        //WebElement result = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"SimpleCalculator\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextView");
        WebElement result2 = driver.findElementByXPath("//XCUIElementTypeTextView");

        Thread.sleep(4000);
        System.out.println(result2.getText());
        Assert.assertEquals("42",result2.getText());
        
    }
}

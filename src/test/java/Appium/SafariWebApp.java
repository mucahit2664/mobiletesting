package Appium;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SafariWebApp {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"safari");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15);

        IOSDriver<WebElement> driver = new IOSDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://amazon.com");

        driver.findElementById("nav-logobar-greeting").click();

        WebElement welcomeText = driver.findElementByXPath("//div[@id='outer-accordion-signin-signup-page']/h2");
        Assert.assertEquals("Welcome",welcomeText.getText());






    }

    }

package Appium;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackIOS {
    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "mehmetayyildiz1");
        caps.setCapability("browserstack.key", "yUfM2vRqAPF97nopgPYE");

        // Set URL of the application under test
        caps.setCapability("app", "bs://989d0cdb628c562dfd1f7eddfc4a70c8b9998b5a");

        // Specify device and os_version for testing
        caps.setCapability("device", "iPhone XS");
        caps.setCapability("os_version", "12");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "Java iOS");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
                new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);

        /* Write your Custom code here */
        driver.findElementById("Text Button").click();

       Assert.assertTrue( driver.findElementById("Text Output").isDisplayed());

       driver.findElementByXPath("//XCUIElementTypeTextField[@name='Text Input']").sendKeys("iOS Testing");
//you can hide keyboard with this method
       driver.hideKeyboard();






        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();

    }
}

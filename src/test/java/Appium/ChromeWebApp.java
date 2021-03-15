package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ChromeWebApp {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();


        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        desiredCapabilities.setCapability("chromedriverExecutable","/Users/mehmetaliayyildiz/IdeaProjects/mobileTesting/src/driver/chromedriver");

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println(driver.getContext());
        driver.get("https://amazon.com");

        Set contextName = driver.getContextHandles();
        for (Object context : contextName) {
            System.out.println(context);
        }
        driver.context("CHROMIUM");
        System.out.println(driver.getContext());

        driver.findElementByXPath("//a[@class='nav-a nav-show-sign-in']").click();

        Assert.assertEquals("Welcome",driver.findElementByXPath("//h2").getText());


        }
}

package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class GestureApp02 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/mehmetaliayyildiz/IdeaProjects/mobileTesting/src/Apps/GestureTool.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15);
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(5000);

        /*
        lunch app
        click Test button
        verify title
        use list
         */

        List<WebElement> buttons = driver.findElementsByXPath("//android.widget.Button");
        System.out.println(buttons.size()); //3

       // buttons.get(3).click();
        for (WebElement button : buttons) {
            if (button.getText().equals("Reload")){
                System.out.println("now clicking "+button.getText()+" button");
                button.click();
                break;
            }
        }
       WebElement titleText = driver.findElementById("android:id/title");
        Assert.assertEquals("Test a gesture",titleText.getText());


    }
}

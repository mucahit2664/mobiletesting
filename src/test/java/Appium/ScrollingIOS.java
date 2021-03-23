package Appium;

import io.appium.java_client.ios.IOSDriver;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.HashMap;

public class ScrollingIOS extends Base {
    @Test
    public void test() throws MalformedURLException {
        IOSDriver driver = lunchiOS();


        HashMap<String, Object> scrollObject = new HashMap<>();

        scrollObject.put("direction", "down");
        scrollObject.put("value","Web View");

        driver.executeScript("mobile:scroll",scrollObject);

        driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Web View']").click();

    }



}

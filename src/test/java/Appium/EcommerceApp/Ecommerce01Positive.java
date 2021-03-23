package Appium.EcommerceApp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ecommerce01Positive {

    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"1fd655780409");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/mehmetaliayyildiz/IdeaProjects/mobileTesting/src/Apps/General-Store.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);

        URL url = new URL("http://127.0.0.1:4723/wd/hub"); //http://localhost:4723/wd/hub
        AndroidDriver<WebElement> driver = new AndroidDriver<>(url,desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Positive scenario
        //click on country list
     driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();

     //lets put countries in the list
        List<WebElement> countries = driver.findElementsByClassName("android.widget.TextView");
        System.out.println(countries.size());
        //if you want to see countries which displayed on DOM
//        for (WebElement country : countries) {
//            System.out.println(country.getText());
//        }
    //scroll to find the country by text
     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"France\"))");
   //click on the country
     driver.findElementByXPath("//*[@text='France']").click();
   //provide a name to name box
     driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Tecproed");
   //if you want to hide the keybord use this method
        driver.hideKeyboard();

    //select the gender <in this case we elect male>
        driver.findElementById("com.androidsample.generalstore:id/radioMale").click();
    //click Let's shop button
    driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();




    }
}

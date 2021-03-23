package Appium.EcommerceApp;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.Key;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Ecommerce06ReturnNativeApp {

    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"1fd655780409");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/mehmetaliayyildiz/IdeaProjects/mobileTesting/src/Apps/General-Store.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,true);
      //  desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        desiredCapabilities.setCapability("chromedriverExecutable","/Users/mehmetaliayyildiz/IdeaProjects/mobileTesting/src/driver/chromedriver");

        URL url = new URL("http://127.0.0.1:4723/wd/hub"); //http://localhost:4723/wd/hub
        AndroidDriver<WebElement> driver = new AndroidDriver<>(url,desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*
2-Shop the items in the app by scrolling to specific Product and add to cart
First product = Air Jordan 4 Retro
Second = Jordan Lift Off
 */

        //click on country list
     driver.findElementById("com.androidsample.generalstore:id/spinnerCountry").click();

     //lets put countries in the list
        List<WebElement> countries = driver.findElementsByClassName("android.widget.TextView");
//        //if you want to see countries which displayed on DOM
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

    //2nd page
        //we select first item from list for shopping
        driver.findElementByXPath("(//android.widget.TextView[@text='ADD TO CART'])[1]").click();
        //for the 2nd item i have to scroll and it
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan Lift Off\"))");

        List<WebElement> products =  driver.findElementsById("com.androidsample.generalstore:id/productName");

        for (int i = 0; i<products.size(); i++){
            String productName = driver.findElementsById("com.androidsample.generalstore:id/productName").get(i).getText();
            if (productName.equals("Jordan Lift Off")){
                driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();
                break;
            }
        }

        /*
3-Validate if the items selected in the page 2 are matching with the items displayed in check out page
 */

        //lets check cart
        driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();

       String actualAirJordanText = driver.findElementByXPath("//android.widget.TextView[@text='Air Jordan 4 Retro']").getText();

       String actualJordanLiftText = driver.findElementByXPath("//android.widget.TextView[@text='Jordan Lift Off']").getText();

        Assert.assertEquals("Air Jordan 4 Retro", actualAirJordanText);
        Assert.assertEquals("Jordan Lift Off",actualJordanLiftText);

     /*
4- Validate the total Amount displayed in the checkout page matches with sum of product amounts selected for shopping
      */

        List<WebElement> itemsprices = driver.findElementsById("com.androidsample.generalstore:id/productPrice");
        String firstItemPrice = itemsprices.get(0).getText();
        System.out.println(firstItemPrice);//$160.97
        String secondItemPrice = itemsprices.get(1).getText();
        System.out.println(secondItemPrice);//$150.0

        //i have to remove $ to convert the values to int
        firstItemPrice = firstItemPrice.substring(1);
        System.out.println("now numerical values as String without $  "+firstItemPrice);//160.97
        secondItemPrice =secondItemPrice.substring(1);
        System.out.println("now numerical values as String without $  "+secondItemPrice);//150.0

        // let s cast them to double
        double price1 = Double.parseDouble(firstItemPrice);
        System.out.println("casted to double value: "+price1);
        double price2 = Double.parseDouble(secondItemPrice);
        System.out.println("casted to double value:  "+price2);

        double expectedTotalPrice = price1+price2;
        System.out.println(expectedTotalPrice);

        WebElement actualTotalPrice = driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl");
        String actualTotalPriceText = actualTotalPrice.getText();
        //let s remove $ from the text
        actualTotalPriceText = actualTotalPriceText.substring(1);
        System.out.println(actualTotalPriceText); //275.97

        double actualPriceDouble = Double.parseDouble(actualTotalPriceText);
        System.out.println("String value is converted to double "+actualPriceDouble);//275.97

        Assert.assertEquals(expectedTotalPrice,actualPriceDouble,0.0);

        /*
        5-Validate Mobile gestures working for link (long press) and navigate to WebView
         */

        //driver.findElementByClassName("android.widget.CheckBox").click();
        WebElement checkBox = driver.findElementByClassName("android.widget.CheckBox");
        TouchAction action = new TouchAction(driver);
//tap action
        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(checkBox))).perform();
//long press action
       WebElement termsNConditions = driver.findElementById("com.androidsample.generalstore:id/termsButton");

       action.longPress(ElementOption.element(termsNConditions)).perform();

       WebElement titleTermsNCondtions = driver.findElementById("com.androidsample.generalstore:id/alertTitle");

       Assert.assertTrue(titleTermsNCondtions.isDisplayed());
//tap action
       WebElement closeButton = driver.findElementById("android:id/button1");

       action.tap(TapOptions.tapOptions().withElement(ElementOption.element(closeButton))).perform();
//tap action
       WebElement proceedButton = driver.findElementById("com.androidsample.generalstore:id/btnProceed");

       action.tap(TapOptions.tapOptions().withElement(ElementOption.element(proceedButton))).perform();

       Thread.sleep(5000);
//app view Note: let s see the app is NATIVEAPP view or WEBVIEW
        System.out.println(driver.getContext());// NATIVE_APP

        Set contextName = driver.getContextHandles();
        for (Object context : contextName) {
            //lets see how many app type has this app
            System.out.println(context);
        }
        driver.context("WEBVIEW_com.androidsample.generalstore");

        System.out.println("NOW it switched to "+driver.getContext());
        //verify app is on WEBVIEW
       Assert.assertTrue(driver.getContext().contains("WEBVIEW"));
/*
6-Verify if user can do operations on Web view and navigate back to native app if needed.
(go to google and search “appium” then navigate to NATIVE APP and verify it)
 */

        driver.findElementByXPath("//*[@name='q']").sendKeys("appium"+ Keys.ENTER);
//return to NATIVE_APP to click back
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

        //we need to swtiched back to NATIVE_APP

        driver.context("NATIVE_APP");

        System.out.println("now it is on "+driver.getContext());

    }
}

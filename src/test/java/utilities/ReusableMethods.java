package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReusableMethods {
//uiscrollable
    public static void scrollIntoViewWithUiScrollable(String elementText){
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text("+elementText+"))");

        driver.findElementByXPath("//*[@text="+elementText+"]").click();
    }

    //pages
    public static void goToPage(String pageName) {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
        List<AndroidElement> pages = driver.findElementsByXPath("//android.widget.TextView");
        for (AndroidElement page : pages) {
            if (page.getText().equals(pageName)) {
                System.out.println(page.getText());
                page.click();
            }
            break;
        }
    }

    //ios pages
    public static void clickOnPageIOSDevice(String pageName){
        List<IOSElement> pages = Driver.getAppiumDriver().findElementsByXPath("//XCUIElementTypeStaticText[@name='"+pageName+"']");
          for (IOSElement page : pages){
              if (page.getText().equals(pageName)){
                  page.click();
                  break;
              }
        }
    }

}

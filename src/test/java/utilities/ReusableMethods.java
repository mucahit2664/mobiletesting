package utilities;

import io.appium.java_client.android.AndroidDriver;
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
        List<WebElement> pages = Driver.getAppiumDriver().findElementsByClassName("android.widget.TextView");
        for (WebElement page : pages) {
            if (page.getText().equals(pageName)) {
                page.click();
            }
            break;
        }
    }


}

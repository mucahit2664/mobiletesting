package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import javafx.beans.value.WeakChangeListener;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import pages.AllPages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class ScrollStepDefs {
    AllPages allPages = new AllPages();
    @And("user clicks on Visibility")
    public void userClicksOnVisibility() {
        List<WebElement> items;
        do {
            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();
            //we crate list to check element exit in DOM
            //when element will displayed on screen size() will be 1 and loop will broke
            items = allPages.viewsPage().visibility;
            int start_y = (int) (dimension.height * 0.8);
            int start_x = (int) (dimension.height * 0.5);
            int end_y = (int) (dimension.width * 0.2);
            int end_x = (int) (dimension.width * 0.5);

            TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

            touchAction.press(PointOption.point(start_x, start_y)).
                    waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                    moveTo(PointOption.point(end_x, end_y)).release().perform();
        }while(items.size()==0);
        //click element which i am looking for
        if(items.size()>0){
            items.get(0).click();
        }
    }

    @Given("user click on TextSwitcher")
    public void userClickOnTextSwitcher() {
       // ReusableMethods.scrollIntoViewWithUiScrollable("TextSwitcher");
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"TextSwitcher\"))");

        driver.findElementByXPath("//*[@text='TextSwitcher']").click();
    }

    @And("user clicks on Next button twice")
    public void userClicksOnNextButtonTwice() throws InterruptedException {
      allPages.textSwitcherPage().nextButton.click();
      allPages.textSwitcherPage().nextButton.click();
        Thread.sleep(3000);
    }

    @Then("verify the value is {string}")
    public void verifyTheValueIs(String expectedResult) {
        Assert.assertEquals(expectedResult,allPages.textSwitcherPage().actualDigitValue.getText());
    }
}

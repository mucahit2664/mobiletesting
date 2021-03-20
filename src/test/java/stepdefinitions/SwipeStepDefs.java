package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.AllPages;
import utilities.Driver;

import java.time.Duration;

public class SwipeStepDefs {
    AllPages allPages = new AllPages();
    @Given("user clicks Date Widgets page")
    public void userClicksDateWidgetsPage() {
        allPages.viewsPage().dateWidgets.click();
    }

    @And("user clicks Inline")
    public void userClicksInline() {
      allPages.dateWidgetsPage().inlineButton.click();
    }

    @And("user clicks on {int}")
    public void userClicksOn(int nine) {
        allPages.dateWidgetsPage().nineAsHour.click();
    }

    @And("user swipe element from {int} to {int}")
    public void userSwipeElementFromTo(int arg0, int arg1) {
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

        touchAction.longPress(LongPressOptions.longPressOptions().
                withElement(ElementOption.element(allPages.dateWidgetsPage().fifteen)).withDuration(Duration.ofSeconds(1)))
                .moveTo(ElementOption.element(allPages.dateWidgetsPage().fortyfive)).release().perform();

    }


}

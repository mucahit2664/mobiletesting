package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import pages.AllPages;
import pages.android.HomePage;
import pages.android.PreferencePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class DragDropStepDefs {

    AllPages allPages = new AllPages();
    @Given("user clicks on Views")
    public void user_clicks_on_views() {
        allPages.apiDemosPage().viewsPage.click();
    }

    @Given("user click on Drag and Drop Page")
    public void user_click_on_drag_and_drop_page() {

        allPages.viewsPage().dragDropButton.click();
    }

    @Given("user drag first circle and drop third one")
    public void user_drag_first_circle_and_drop_third_one() {
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());
        touchAction.press(ElementOption.element(allPages.dragDropPage().firstButton)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                moveTo(ElementOption.element(allPages.dragDropPage().thirdButton)).release().perform();
    }

    @Then("verify text is displayed")
    public void verify_text_is_displayed() {

    }

    @Given("user clicks on {string} page")
    public void userClicksOnPage(String pageName) throws InterruptedException {
        ReusableMethods.goToPage(pageName);
        Thread.sleep(3000);
    }

    @Given("user drag first circle and drop it on self")
    public void userDragFirstCircleAndDropItOnSelf() {
        Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();

        int end_y = (int) (dimension.width * 0.2);
        int end_x = (int) (dimension.height * 0.2);

        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

        touchAction.press(ElementOption.element(allPages.dragDropPage().firstButton)).
                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
                moveTo(PointOption.point(end_x, end_y)).release().perform();
    }

    @Then("verify the text contains {string}")
    public void verifyTheTextContains(String expectedText) {
        Assert.assertTrue(allPages.dragDropPage().actualText.getText().contains(expectedText));
    }


}
